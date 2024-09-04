package com.hiperbou.imguijs.example

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ImGuiWindowFlags
import com.hiperbou.imguijs.ImGui_Demo.ImGui_Demo

suspend fun example() {
    ImGuiLib(::loop, ::clean, clear_color).initialize()
    initExample()
}

private fun loop(time:Double):Boolean {

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
        ShowSandboxWindow("Sandbox Window", ImAccess(::show_sandbox_window), ImAccess(::source))
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

    return done
}
