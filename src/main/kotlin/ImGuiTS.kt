
package com.hiperbou.imguits

import com.hiperbou.imguits.*
import com.hiperbou.imguits.ImGui_ts as ImGui
import com.hiperbou.imguits.ImGui_Impl_ts as ImGui_Impl
import com.hiperbou.imguits.ImGuiGlobal.StringBuffer
import com.hiperbou.imguits.ImGuiGlobal.ImVec4
import kotlinx.browser.document
import kotlinx.browser.window
import kotlin.js.Promise

fun mainTs() {
    console.log("Hello main Typescript")

    ImGuiLoad().then {
        println("ImGui Loaded! :)")
        imgui_Init()
    }
}

fun ImGuiLoad(): Promise<Unit> {
    return ImGuiGlobal.default()
}

fun imgui_Init() {
    console.log(ImGui)
    ImGui.IMGUI_CHECKVERSION()
    ImGui.CreateContext()
    val io=ImGui.GetIO()
    ImGui.StyleColorsDark()
    io.Fonts.AddFontDefault()
    val canvas = document.getElementById("canvas")
    ImGui_Impl.Init(canvas)
    window.requestAnimationFrame(::_loop)
}

val text = StringBuffer(128, "input text")
val text_area = StringBuffer(128, "edit multiline")

fun _loop(time:Double) {
    ImGui_Impl.NewFrame(time)

    with(ImGui) {
        NewFrame()

        Begin("Hello")
        Text("Version " + IMGUI_VERSION)
        InputText("Input", text)
        InputTextMultiline("Text", text_area)
        End()

        Begin("Another Window")
        Text("This is a random text")
        if(Button("push me")) {
            println("Pressed!")
        }
        End()

        EndFrame()
        Render()
    }

    ImGui_Impl.ClearBuffer?.invoke( ImVec4(0.25,0.25,0.25,1), null)
    ImGui_Impl.RenderDrawData(ImGui.GetDrawData())
    window.requestAnimationFrame(::_loop)
}

