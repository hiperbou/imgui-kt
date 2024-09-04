package com.hiperbou.imguijs.example

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ImGuiWindowFlags
import com.hiperbou.imguijs.ImGui_Demo.ImGui_Demo
import com.hiperbou.imguijs.dsl.*

suspend fun exampleDSL() {
    ImGuiLib(::dslLoop, ::clean, clear_color).initialize()
    initExample()
}

fun dslLoop(time:Double):Boolean = with(ImGui) {
    // 1. Show the big demo window (Most of the sample code is in ImGui::ShowDemoWindow()! You can browse its code to learn more about Dear ImGui!).
    if (!done && show_demo_window) {
        done = ImGui_Demo.ShowDemoWindow(ImAccess(::show_demo_window))
    }
    // 2. Show a simple window that we create ourselves. We use a Begin/End pair to created a named window.
        // static float f = 0.0f
        // static int counter = 0

    window("Hello, world!") { // Create a window called "Hello, world!" and append into it.
        text("This is some useful text.") // Display some text (you can use a format strings too)
        checkbox("Demo Window", ImAccess(::show_demo_window)) // Edit bools storing our windows open/close state
        checkbox("Another Window", ImAccess(::show_another_window))
        SliderFloat("speed", ImAccess(::speed), 0.0, 10.0) // Edit 1 float using a slider from 0.0f to 1.0f
        SliderFloat("float", ImAccess(::f), 0.0, 1.0) // Edit 1 float using a slider from 0.0f to 1.0f
        ColorEdit4("clear color", clear_color) // Edit 3 floats representing a color
        button("Button") { // Buttons return true when clicked (NB: most widgets return true when edited/activated)
            counter++
        }
        SameLine()
        text("counter = $counter")
        text("Application average ${(1000.0 / ImGui.GetIO().Framerate).toFixed(3)} ms/frame (${ImGui.GetIO().Framerate.toFixed(1)} FPS)")
        //Checkbox("Memory Editor", ImAccess(::memory_editor.Open))
        // if (memory_editor.Open)
        //    memory_editor.DrawWindow("Memory Editor", ImGui.bind.HEAP8.buffer)
        val mi = ImGui.bind.mallinfo()
        // text("Total non-mmapped bytes (arena):       ${mi.arena}")
        // text("# of free chunks (ordblks):            ${mi.ordblks}")
        // text("# of free fastbin blocks (smblks):     ${mi.smblks}")
        // text("# of mapped regions (hblks):           ${mi.hblks}")
        // text("Bytes in mapped regions (hblkhd):      ${mi.hblkhd}")
        text("Max. total allocated space (usmblks):  ${mi.usmblks}")
        // text("Free bytes held in fastbins (fsmblks): ${mi.fsmblks}")
        text("Total allocated space (uordblks):      ${mi.uordblks}")
        text("Total free space (fordblks):           ${mi.fordblks}")
        // text("Topmost releasable block (keepcost):   ${mi.keepcost}")
        if (ImageButton(image_gl_texture, ImGui.ImVec2(48, 48))) {
            // TODO: does not work in opengl
            // show_demo_window = !show_demo_window
            image_url = image_urls[(image_urls.indexOf(image_url) + 1) % image_urls.size]
            if (image_element != null) {
                image_element!!.src = image_url
            }
        }

        //if (ImGui.IsItemHovered()) {
        onItemHovered {
            tooltip {
              text(image_url)
            }
        }

        button("Sandbox Window") {
            show_sandbox_window = true
        }
        if (show_sandbox_window)
            dslShowSandboxWindow("Sandbox Window", ImAccess(::show_sandbox_window))
        SameLine()
        button("Gamepad Window") {
            show_gamepad_window = true
        }
        //if (show_gamepad_window)
        //    ShowGamepadWindow("Gamepad Window", (value = show_gamepad_window) => show_gamepad_window = value)
        SameLine()
        button("Movie Window") {
            show_movie_window = true
        }
        //if (show_movie_window)
        //    ShowMovieWindow("Movie Window", (value = show_movie_window) => show_movie_window = value)
        if (font != null) {
            text("This is the default font")
            withFont(font!!) {
                text("This is the loaded font")
                text(font!!.GetDebugName())

                if (font!!.FindGlyphNoFallback(0x5929) != null) {
                    text("U+5929: \u5929")
                }
            }

        }
    }

    // 3. Show another simple window.
    if (show_another_window) {
        window("Another Window", ImAccess(::show_another_window), ImGuiWindowFlags.AlwaysAutoResize.ordinal) {
            text("Hello from another window!")
            button("Close Me") {
                show_another_window = false
            }
        }
    }

    return@with done
}

fun dslShowSandboxWindow(title:String, p_open:ImAccess<Boolean>? = null) = with(ImGui) {
    fun showHelpMarker(desc:String) {
        textDisabled("(?)")
        onItemHovered {
            tooltip {
                withTextWrapPos(GetFontSize() * 35.0) {
                    TextUnformatted(desc)
                }
            }
        }
    }

    SetNextWindowSize(ImGui.ImVec2(320, 240), ImGui.ImGuiCond.FirstUseEver)
    window(title, p_open) {
        text("Source")
        SameLine()
        showHelpMarker("Contents evaluated and appended to the window.")
        withItemWidth(-1) {
            InputTextMultiline("##source", ImAccess(::source),1024, ImGui.ImVec2.ZERO, ImGui.ImGuiInputTextFlags.AllowTabInput)
        }
        try {
            eval(source)
        }
        catch (e:Throwable) {
            textColored(ImGui.ImVec4(1.0, 0.0, 0.0, 1.0), "error: ")
            SameLine()
            text(e.message ?: e.toString())
        }
    }
}