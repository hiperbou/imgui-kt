package com.hiperbou.imguijs

import com.hiperbou.imguijs.ImGui_Bind.ImGui_Impl
import kotlinx.browser.document
import kotlinx.browser.window
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.WebGLRenderingContext.Companion.COLOR_BUFFER_BIT
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class ImGuiLib(
    val loopCallback: (Double) -> Boolean,
    val doneCallback: (Double) -> Unit = {},
    var clear_color:ImGui.ImVec4 = ImGui.ImVec4(0.0f, 0.0f, 0.0f, 0.00f)
) {

    suspend fun initialize() {
        load()
        println("ImGui Loaded! :)")
        init()
    }

    private fun loop(time:Double) {
        newFrame(time)

        val done = loopCallback(time)

        endFrame()

        window.requestAnimationFrame(if (done) ::done else ::loop)
    }

    private fun done(time:Double) {
        doneCallback(time)

        ImGui_Impl.Shutdown()
        ImGui.DestroyContext()
        console.log("Total allocated space (uordblks) @ _done:", ImGui.bind.mallinfo().uordblks)
    }

    private suspend fun load() = suspendCoroutine { cont ->
        ImGui.Module().then {
            cont.resume(Unit)
        }.catch {
            cont.resumeWithException(it)
        }
    }

    private fun newFrame(time: Double) {
// Poll and handle events (inputs, window resize, etc.)
// You can read the io.WantCaptureMouse, io.WantCaptureKeyboard flags to tell if dear imgui wants to use your inputs.
// - When io.WantCaptureMouse is true, do not dispatch mouse input data to your main application.
// - When io.WantCaptureKeyboard is true, do not dispatch keyboard input data to your main application.
// Generally you may always pass all inputs to dear imgui, and hide them from your application based on those two flags.
// Start the Dear ImGui frame
        ImGui_Impl.NewFrame(time)
        ImGui.NewFrame()
    }

    private fun endFrame() {
        ImGui.EndFrame()
        // Rendering
        ImGui.Render()
        //Clear screen
        val gl = ImGui_Impl.gl
        if (gl != null) {
            gl.viewport(0, 0, gl.drawingBufferWidth, gl.drawingBufferHeight)
            gl.clearColor(clear_color)
            gl.clear(COLOR_BUFFER_BIT)
            //gl.useProgram(0) // You may want this if using this code in an OpenGL 3+ context where shaders may be bound
        }
        //Draw background color
        val ctx = ImGui_Impl.ctx
        if (ctx != null) {
            // ctx.clearRect(0, 0, ctx.canvas.width, ctx.canvas.height)
            ctx.fillStyle =
                "rgba(${clear_color.x.toFloat() * 0xff}, ${clear_color.y.toFloat() * 0xff}, ${clear_color.z.toFloat() * 0xff}, ${clear_color.w.toFloat() * 0xff})"
            ctx.fillRect(0.0, 0.0, ctx.canvas.width.toDouble(), ctx.canvas.height.toDouble())
        }
        //UpdateVideo()
        //ImGui_Impl.ClearBuffer(ImGui.ImVec4(0.25, 0.25, 0.25, 1), null)
        ImGui_Impl.RenderDrawData(ImGui.GetDrawData())
    }

    private suspend fun init() {
        //val EMSCRIPTEN_VERSION = "${ImGui.bind.__EMSCRIPTEN_major__}.${ImGui.bind.__EMSCRIPTEN_minor__}.${ImGui.bind.__EMSCRIPTEN_tiny__}"
        //console.log("Emscripten Version", EMSCRIPTEN_VERSION)
        console.log("Total allocated space (uordblks) @ _init:", ImGui.bind.mallinfo().uordblks)
        // Setup Dear ImGui context
        ImGui.IMGUI_CHECKVERSION()
        ImGui.CreateContext()
        val io = ImGui.GetIO()

        // Setup Dear ImGui style
        ImGui.StyleColorsDark()
        io.Fonts.AddFontDefault()
        //ASSERT(font !== null)
        console.log("ImGui_Impl")
        console.log(ImGui_Impl)
        console.log(ImGui.bind)
        if (window !== undefined) {
            val output = document.getElementById("output") ?: document.body!!
            val canvas: HTMLCanvasElement =
                (document.getElementById("imguicanvas") ?: document.createElement("canvas")).asDynamic()
            output.appendChild(canvas)
            canvas.id = "imguicanvas"
            canvas.tabIndex = 1
            canvas.style.position = "absolute"
            canvas.style.left = "0px"
            canvas.style.right = "0px"
            canvas.style.top = "0px"
            canvas.style.bottom = "0px"
            canvas.style.width = "100%"
            canvas.style.height = "100%"
            canvas.style.asDynamic().userSelect = "none"
            canvas.style.opacity = "1.0"
            canvas.getContext("webgl", object {
                val premultipliedAlpha = false
            })
            ImGui_Impl.Init(canvas)

            document.getElementById("canvas")?.let { redirectCanvasInputEvents(io, canvas, it.asDynamic()) }
        } else {
            ImGui_Impl.Init(null)
        }

        if (window !== undefined) {
            window.requestAnimationFrame(::loop)
        }
    }

    private fun redirectCanvasInputEvents(io: ImGui.ImGuiIO, canvas: HTMLCanvasElement, destination: HTMLCanvasElement) {
        fun canvasOnMouseEvent(event: Event) {
            if (io.WantCaptureMouse) return
            event.stopPropagation()
            destination.dispatchEvent(MouseEvent(event.type, event.asDynamic()))
        }
        canvas.addEventListener("mousedown", ::canvasOnMouseEvent)
        canvas.addEventListener("mouseup", ::canvasOnMouseEvent)
        canvas.addEventListener("mouseover", ::canvasOnMouseEvent)
        canvas.addEventListener("mouseout", ::canvasOnMouseEvent)
        canvas.addEventListener("mousemove", ::canvasOnMouseEvent)
        //canvas.addEventListener("click", canvas_on_pointerevent_redirect);
        //canvas.addEventListener("dbclick", canvas_on_pointerevent_redirect);

        //ImGui_impl init adds those listeners
        /*
    canvas.addEventListener("blur", canvas_on_blur);
    canvas.addEventListener("keydown", canvas_on_keydown);
    canvas.addEventListener("keyup", canvas_on_keyup);
    canvas.addEventListener("keypress", canvas_on_keypress);
    canvas.addEventListener("pointermove", canvas_on_pointermove);
    canvas.addEventListener("pointerdown", canvas_on_pointerdown);
    canvas.addEventListener("pointerup", canvas_on_pointerup);
    canvas.addEventListener("contextmenu", canvas_on_contextmenu);
    canvas.addEventListener("wheel", canvas_on_wheel);
    */

        //EaselJS
        //iOS???
        /*
    canvas.addEventListener("touchstart", ::canvasOnTouch)
    canvas.addEventListener("touchmove", ::canvasOnTouch)
    canvas.addEventListener("touchend", ::canvasOnTouch)
    canvas.addEventListener("touchcancel", ::canvasOnTouch)
    */

        //EaselJS Internet Explorer??
        /*
    if (PointerEvent === undefined) {
        canvas.addEventListener("MSPointerDown", ::canvasOnPointer)
        window.addEventListener("MSPointerMove", ::canvasOnPointer)
        window.addEventListener("MSPointerUp", ::canvasOnPointer)
        window.addEventListener("MSPointerCancel", ::canvasOnPointer)
    } else {
        canvas.addEventListener("pointerdown", ::canvasOnPointer)
        window.addEventListener("pointermove", ::canvasOnPointer)
        window.addEventListener("pointerup", ::canvasOnPointer)
        window.addEventListener("pointercancel", ::canvasOnPointer)
    }
    */
    }
}

suspend fun LoadArrayBuffer(url: String): Uint8Array {
    return fetchArrayBuffer(url).asDynamic()
}

suspend fun AddFontFromFileTTF(
    url: String,
    size_pixels: Double,
    font_cfg: ImGui.ImFontConfig? = null,
    glyph_ranges: Number? = null
): ImGui.ImFont {
    val font_cfg = font_cfg ?: ImGui.ImFontConfig()
    font_cfg.Name = if (!font_cfg.Name.isNullOrEmpty()) font_cfg.Name else "${
        url.split("/[\\\\\\/]/".toRegex()).first()
    }, ${size_pixels.toFixed(0)}px"
    return ImGui.GetIO().Fonts.AddFontFromMemoryTTF(LoadArrayBuffer(url), size_pixels, font_cfg, glyph_ranges)
        .asDynamic()
}

fun ShowSandboxWindow(title: String, p_open: ImAccess<Boolean>? = null, source:ImAccess<String>) {
    fun ShowHelpMarker(desc: String) {
        ImGui.TextDisabled("(?)")
        if (ImGui.IsItemHovered()) {
            ImGui.BeginTooltip()
            ImGui.PushTextWrapPos(ImGui.GetFontSize() * 35.0)
            ImGui.TextUnformatted(desc)
            ImGui.PopTextWrapPos()
            ImGui.EndTooltip()
        }
    }

    ImGui.SetNextWindowSize(ImGui.ImVec2(320, 240), ImGui.ImGuiCond.FirstUseEver)
    ImGui.Begin(title, p_open)
    ImGui.Text("Source")
    ImGui.SameLine()
    ShowHelpMarker("Contents evaluated and appended to the window.")
    ImGui.PushItemWidth(-1)

    ImGui.InputTextMultiline(
        "##source",
        source,
        1024,
        ImGui.ImVec2.ZERO,
        ImGui.ImGuiInputTextFlags.AllowTabInput
    )
    ImGui.PopItemWidth()

    try {
        eval(source.value())
    } catch (e: Throwable) {
        ImGui.TextColored(ImGui.ImVec4(1.0, 0.0, 0.0, 1.0), "error: ")
        ImGui.SameLine()
        ImGui.Text(e.message ?: e.toString())
    }
    ImGui.End()
}