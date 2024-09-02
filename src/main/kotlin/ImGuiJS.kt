package com.hiperbou.imguijs

import kotlinx.browser.document
import kotlinx.browser.window

import com.hiperbou.imguijs.ImGui.ImGuiWindowFlags
import com.hiperbou.imguijs.ImGui_Bind.ImGui_Impl
import com.hiperbou.imguijs.ImGui_Demo.ImGui_Demo
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.WebGLRenderingContext.*
import org.khronos.webgl.WebGLRenderingContext.Companion.CLAMP_TO_EDGE
import org.khronos.webgl.WebGLRenderingContext.Companion.COLOR_BUFFER_BIT
import org.khronos.webgl.WebGLRenderingContext.Companion.LINEAR
import org.khronos.webgl.WebGLRenderingContext.Companion.TEXTURE_2D
import org.khronos.webgl.WebGLRenderingContext.Companion.TEXTURE_MAG_FILTER
import org.khronos.webgl.WebGLRenderingContext.Companion.TEXTURE_MIN_FILTER
import org.khronos.webgl.WebGLRenderingContext.Companion.TEXTURE_WRAP_S
import org.khronos.webgl.WebGLRenderingContext.Companion.TEXTURE_WRAP_T
import org.khronos.webgl.WebGLRenderingContext.Companion.UNSIGNED_BYTE
import org.khronos.webgl.WebGLRenderingContext.Companion as wgl
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

suspend fun mainJs() {
    console.log("Hello main JS")
    ImGuiLoad()
    println("ImGui Loaded! :)")
    imgui_Init(::_loop)
}

suspend fun ImGuiLoad() = suspendCoroutine {cont ->
    ImGui.Module().then {
        cont.resume(Unit)
    }.catch {
        cont.resumeWithException(it)
    }
}

fun ImGuiNewFrame(time:Double) {
// Poll and handle events (inputs, window resize, etc.)
// You can read the io.WantCaptureMouse, io.WantCaptureKeyboard flags to tell if dear imgui wants to use your inputs.
// - When io.WantCaptureMouse is true, do not dispatch mouse input data to your main application.
// - When io.WantCaptureKeyboard is true, do not dispatch keyboard input data to your main application.
// Generally you may always pass all inputs to dear imgui, and hide them from your application based on those two flags.
// Start the Dear ImGui frame
    ImGui_Impl.NewFrame(time)
    ImGui.NewFrame()
}

fun ImGuiEndFrame() {
    ImGui.EndFrame()
    // Rendering
    ImGui.Render()
    //Clear screen
    val gl = ImGui_Impl.gl
    if (gl!=null) {
        gl.viewport(0, 0, gl.drawingBufferWidth, gl.drawingBufferHeight)
        gl.clearColor(clear_color)
        gl.clear(COLOR_BUFFER_BIT)
        //gl.useProgram(0) // You may want this if using this code in an OpenGL 3+ context where shaders may be bound
    }
    //Draw background color
    val ctx = ImGui_Impl.ctx
    if (ctx!=null) {
        // ctx.clearRect(0, 0, ctx.canvas.width, ctx.canvas.height)
        ctx.fillStyle = "rgba(${clear_color.x.toFloat() * 0xff}, ${clear_color.y.toFloat() * 0xff}, ${clear_color.z.toFloat() * 0xff}, ${clear_color.w.toFloat() * 0xff})"
        ctx.fillRect(0.0, 0.0, ctx.canvas.width.toDouble(), ctx.canvas.height.toDouble())
    }
    //UpdateVideo()
    //ImGui_Impl.ClearBuffer(ImGui.ImVec4(0.25, 0.25, 0.25, 1), null)
    ImGui_Impl.RenderDrawData(ImGui.GetDrawData())
}

suspend fun imgui_Init(loopCallback: (Double) -> Unit) {
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
    font = AddFontFromFileTTF("imgui/Roboto-Medium.ttf", 16.0)
    //ASSERT(font !== null)
    console.log("ImGui_Impl")
    console.log(ImGui_Impl)
    console.log(ImGui.bind)
    if (window !== undefined) {
        val output = document.getElementById("output") ?: document.body!!
        val canvas: HTMLCanvasElement = (document.getElementById("imguicanvas") ?: document.createElement("canvas")).asDynamic()
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
        canvas.getContext("webgl", object{ val premultipliedAlpha = false })
        ImGui_Impl.Init(canvas)

        document.getElementById("canvas")?.let { redirectCanvasInputEvents(io, canvas, it.asDynamic()) }
    }
    else {
        ImGui_Impl.Init(null)
    }


    //execute()

    StartUpImage()
    //StartUpVideo()
    if (window !== undefined) {
        window.requestAnimationFrame(loopCallback)
    }

}

fun redirectCanvasInputEvents(io:ImGui.ImGuiIO, canvas:HTMLCanvasElement, destination:HTMLCanvasElement) {
    fun canvasOnMouseEvent(event:Event) {
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

//fun execute() {
var font: ImGui.ImFont? = null
// Our state
var show_demo_window = true
var show_another_window = false
var clear_color = ImGui.ImVec4(0.45f, 0.55f, 0.60f, 0.10f)
//var memory_editor = ImGui_Memory_Editor.MemoryEditor()
//var memory_editor.Open = false
var show_sandbox_window = false
var show_gamepad_window = false
var show_movie_window = false
var/* static */ f = 0.0
var speed = 1.0
var/* static */ counter = 0
var done = false
var source =
    """ImGui.Text("Hello, world!");
ImGui.SliderFloat("float",
	(value = f) => f = value,
	0.0, 1.0);
"""

val image_urls = arrayOf(
"https://threejs.org/examples/textures/crate.gif",
"https://threejs.org/examples/textures/sprite.png",
"https://threejs.org/examples/textures/uv_grid_opengl.jpg",
)
var image_url = image_urls[0]
var image_element:HTMLImageElement? = null
var image_gl_texture:dynamic /*WebGL Texture | CanvasImage*/ = null
val video_urls = arrayOf(
"https://threejs.org/examples/textures/sintel.ogv",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4",
"https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WhatCarCanYouGetForAGrand.mp4"
)
val video_url = video_urls[0]
var video_element = null
var video_gl_texture = null
val video_w = 640
val video_h = 360
var video_time_active = false
var video_time = 0
var video_duration = 0
//}


suspend fun LoadArrayBuffer(url:String):Uint8Array {
    return fetchArrayBuffer(url).asDynamic()
}

suspend fun AddFontFromFileTTF(url:String, size_pixels:Double, font_cfg: ImGui.ImFontConfig? = null, glyph_ranges:Number? = null): ImGui.ImFont {
    val font_cfg = font_cfg ?: ImGui.ImFontConfig()
    val r = url.split("/[\\\\\\/]/".toRegex()).last()
    font_cfg.Name = if(!font_cfg.Name.isNullOrEmpty()) font_cfg.Name else "${url.split("/[\\\\\\/]/".toRegex()).first()}, ${size_pixels.toFixed(0)}px"
    console.log(font_cfg)
    console.log("font_cfg.Name ${font_cfg.Name}")
    return ImGui.GetIO().Fonts.AddFontFromMemoryTTF(LoadArrayBuffer(url), size_pixels, font_cfg, glyph_ranges).asDynamic()
}

fun _loop(time:Double) {

    ImGuiNewFrame(time)

    // 1. Show the big demo window (Most of the sample code is in ImGui::ShowDemoWindow()! You can browse its code to learn more about Dear ImGui!).
    if (!done && show_demo_window) {
        done = /*ImGui.*/ ImGui_Demo.ShowDemoWindow(ImAccess(::show_demo_window))
    }
    // 2. Show a simple window that we create ourselves. We use a Begin/End pair to created a named window.
  /////////////////
        // static float f = 0.0f
        // static int counter = 0
    ImGui.Begin("Hello, world!") // Create a window called "Hello, world!" and append into it.
    ImGui.Text("This is some useful text.") // Display some text (you can use a format strings too)
    ImGui.Checkbox("Demo Window", ImAccess(::show_demo_window)) // Edit bools storing our windows open/close state
    ImGui.Checkbox("Another Window", ImAccess(::show_another_window))
    ImGui.SliderFloat("speed", ImAccess(::speed), 0.0, 10.0) // Edit 1 float using a slider from 0.0f to 1.0f
    ImGui.SliderFloat("float", ImAccess(::f), 0.0, 1.0) // Edit 1 float using a slider from 0.0f to 1.0f
    ImGui.ColorEdit4("clear color", clear_color) // Edit 3 floats representing a color
    if (ImGui.Button("Button")) // Buttons return true when clicked (NB: most widgets return true when edited/activated)
        counter++
    ImGui.SameLine()
    ImGui.Text("counter = ${counter}")
    ImGui.Text("Application average ${(1000.0 / ImGui.GetIO().Framerate).toFixed(3)} ms/frame (${ImGui.GetIO().Framerate.toFixed(1)} FPS)")
    //Checkbox("Memory Editor", ImAccess(::memory_editor.Open))
   // if (memory_editor.Open)
    //    memory_editor.DrawWindow("Memory Editor", ImGui.bind.HEAP8.buffer)
    val mi = ImGui.bind.mallinfo()
    // ImGui.Text("Total non-mmapped bytes (arena):       ${mi.arena}")
    // ImGui.Text("# of free chunks (ordblks):            ${mi.ordblks}")
    // ImGui.Text("# of free fastbin blocks (smblks):     ${mi.smblks}")
    // ImGui.Text("# of mapped regions (hblks):           ${mi.hblks}")
    // ImGui.Text("Bytes in mapped regions (hblkhd):      ${mi.hblkhd}")
    ImGui.Text("Max. total allocated space (usmblks):  ${mi.usmblks}")
    // ImGui.Text("Free bytes held in fastbins (fsmblks): ${mi.fsmblks}")
    ImGui.Text("Total allocated space (uordblks):      ${mi.uordblks}")
    ImGui.Text("Total free space (fordblks):           ${mi.fordblks}")
        // ImGui.Text("Topmost releasable block (keepcost):   ${mi.keepcost}")
    if (ImGui.ImageButton(image_gl_texture, ImGui.ImVec2(48, 48))) {
        // TODO: does not work in opengl
        // show_demo_window = !show_demo_window
        image_url = image_urls[(image_urls.indexOf(image_url) + 1) % image_urls.size]
        if (image_element != null) {
            image_element!!.src = image_url
        }

    }

    if (ImGui.IsItemHovered()) {
        ImGui.BeginTooltip()
        ImGui.Text(image_url)
        ImGui.EndTooltip()
    }
    if (ImGui.Button("Sandbox Window")) {
        show_sandbox_window = true
    }
    if (show_sandbox_window)
        ShowSandboxWindow("Sandbox Window", ImAccess(::show_sandbox_window))
    ImGui.SameLine()
    if (ImGui.Button("Gamepad Window")) {
        show_gamepad_window = true
    }
    //if (show_gamepad_window)
    //    ShowGamepadWindow("Gamepad Window", (value = show_gamepad_window) => show_gamepad_window = value)
        ImGui.SameLine()
    if (ImGui.Button("Movie Window")) {
        show_movie_window = true
    }
    //if (show_movie_window)
    //    ShowMovieWindow("Movie Window", (value = show_movie_window) => show_movie_window = value)
    if (font != null) {
        ImGui.Text("This is the default font")
        ImGui.PushFont(font)
        ImGui.Text("This is the loaded font")
        ImGui.Text(font!!.GetDebugName())

        if (font!!.FindGlyphNoFallback(0x5929) != null) {
            ImGui.Text("U+5929: \u5929")
        }
        ImGui.PopFont()
    }
    ImGui.End()
  /////////////////

    // 3. Show another simple window.
    if (show_another_window) {
        ImGui.Begin("Another Window", ImAccess(::show_another_window), ImGuiWindowFlags.AlwaysAutoResize)
        ImGui.Text("Hello from another window!")
        if (ImGui.Button("Close Me"))
            show_another_window = false
        ImGui.End()
    }

    ImGuiEndFrame()

    if (window !== undefined) {
        window.requestAnimationFrame(if (done) ::_done else ::_loop)
    }

}

fun _done(n:Double) {
    println("done!")

    val gl = ImGui_Impl.gl
    if (gl!=null) {
        gl.viewport(0, 0, gl.drawingBufferWidth, gl.drawingBufferHeight)
        gl.clearColor(clear_color)
        gl.clear(wgl.COLOR_BUFFER_BIT)
    }
    val ctx = ImGui_Impl.ctx
    if (ctx!=null) {
        ctx.clearRect(0.0, 0.0, ctx.canvas.width.toDouble(), ctx.canvas.height.toDouble())
    }
    CleanUpImage()
    //CleanUpVideo()
    // Cleanup
    ImGui_Impl.Shutdown()
    ImGui.DestroyContext()
    console.log("Total allocated space (uordblks) @ _done:", ImGui.bind.mallinfo().uordblks)

}

fun StartUpImage() {
    if (document == undefined) return

    val image_element:HTMLImageElement = document.createElement("img").asDynamic()
    image_element.crossOrigin = "anonymous"
    image_element.src = image_url

    val gl = ImGui_Impl.gl
    if (gl!=null) {
        val width = 256
        val height = 256
        val pixels = Uint8Array(4 * width * height)
        image_gl_texture = gl.createTexture()
        gl.bindTexture(TEXTURE_2D, image_gl_texture)
        gl.texParameteri(TEXTURE_2D, TEXTURE_MIN_FILTER, LINEAR)
        gl.texParameteri(TEXTURE_2D, TEXTURE_MAG_FILTER, LINEAR)
        gl.texParameteri(TEXTURE_2D, TEXTURE_WRAP_S, CLAMP_TO_EDGE)
        gl.texParameteri(TEXTURE_2D, TEXTURE_WRAP_T, CLAMP_TO_EDGE)
        gl.texImage2D(TEXTURE_2D, 0, wgl.RGBA, width, height, 0, wgl.RGBA, UNSIGNED_BYTE, pixels)

        image_element.addEventListener("load", { event ->
            gl.bindTexture(TEXTURE_2D, image_gl_texture)
            gl.texImage2D(TEXTURE_2D, 0, wgl.RGBA, wgl.RGBA, UNSIGNED_BYTE, image_element)
        })
    }
    val ctx = ImGui_Impl.ctx
    if (ctx!=null) {
        image_gl_texture = image_element // HACK
    }
}

fun CleanUpImage() {
    val gl = ImGui_Impl.gl
    if (gl!=null) {
        gl.deleteTexture(image_gl_texture)
        image_gl_texture = null
    }
    val ctx = ImGui_Impl.ctx
    if (ctx!=null) {
        image_gl_texture = null
    }
    image_element = null
}

fun ShowSandboxWindow(title:String, p_open:ImAccess<Boolean>? = null) {
    fun ShowHelpMarker(desc:String) {
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
    val source = source
    ImGui.InputTextMultiline("##source", ImAccess(::source), 1024, ImGui.ImVec2.ZERO, ImGui.ImGuiInputTextFlags.AllowTabInput)
    ImGui.PopItemWidth()
    try {
        eval(source)
    }
    catch (e:Throwable) {
        ImGui.TextColored(ImGui.ImVec4(1.0, 0.0, 0.0, 1.0), "error: ")
        ImGui.SameLine()
        ImGui.Text(e.message ?: e.toString())
    }
    ImGui.End()
}