package com.hiperbou.imguijs.example

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ImGuiWindowFlags
import com.hiperbou.imguijs.ImGui_Demo.ImGui_Demo
import com.hiperbou.imguijs.dsl.*

class DslExample: ExampleBase() {

    override fun loop(time: Double): Boolean = with(ImGui) {
        if (!done && show_demo_window) {
            done = ImGui_Demo.ShowDemoWindow(ImAccess(::show_demo_window))
        }

        window("Hello, world!") {
            text("This is some useful text.")
            checkbox("Demo Window", ImAccess(::show_demo_window))
            checkbox("Another Window", ImAccess(::show_another_window))
            SliderFloat("speed", ImAccess(::speed), 0.0, 10.0)
            SliderFloat("float", ImAccess(::f), 0.0, 1.0)
            ColorEdit4("clear color", clear_color)
            button("Button") {
                counter++
            }
            SameLine()
            text("counter = $counter")
            text(
                "Application average ${(1000.0 / GetIO().Framerate).toFixed(3)} ms/frame (${
                    GetIO().Framerate.toFixed(1)
                } FPS)"
            )
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

            onItemHovered {
                tooltip {
                    text(image_url)
                }
            }

            button("Sandbox Window") {
                show_sandbox_window = true
            }
            if (show_sandbox_window)
                showSandboxWindow("Sandbox Window", ImAccess(::show_sandbox_window))
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

    fun showSandboxWindow(title: String, p_open: ImAccess<Boolean>? = null) = with(ImGui) {
        fun showHelpMarker(desc: String) {
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
                InputTextMultiline(
                    "##source",
                    ImAccess(::source),
                    1024,
                    ImGui.ImVec2.ZERO,
                    ImGui.ImGuiInputTextFlags.AllowTabInput
                )
            }
            try {
                eval(source)
            } catch (e: Throwable) {
                textColored(ImGui.ImVec4(1.0, 0.0, 0.0, 1.0), "error: ")
                SameLine()
                text(e.message ?: e.toString())
            }
        }
    }

}