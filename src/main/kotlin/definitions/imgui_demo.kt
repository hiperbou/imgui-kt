package com.hiperbou.imguijs.ImGui_Demo

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ImVec2
import com.hiperbou.imguijs.emscripten.*
import com.hiperbou.imguijs.tsstdlib.Readonly
import com.hiperbou.imguits.ImGuiGlobal
import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*


@JsName("ImGui_Demo")
external val ImGui_Demo:ImGui_Demo_Interface

external interface ImGui_Demo_Interface {
    fun ShowDemoWindow(show:ImAccess<Boolean>):Boolean
}

