package com.hiperbou.imguijs.ImGui_Bind

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.emscripten.*
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
import kotlin.js.*


@JsName("ImGui_Impl")
external val ImGui_Impl:ImGui_Impl_Interface

external interface ImGui_Impl_Interface {
    fun Init(value: dynamic /*HTMLCanvasElement | WebGL2RenderingContext | WebGLRenderingContext | CanvasRenderingContext2D | null*/)
    fun CreateDeviceObjects()
    fun CreateFontsTexture()
    fun DestroyDeviceObjects()
    fun DestroyFontsTexture()
    fun NewFrame(time:Double)
    fun RenderDrawData(draw_data: reference_ImDrawData?)
    fun Shutdown()
    //fun ClearBuffer(color: ImGuiGlobal.ImVec4, bufferBit:Int?)

    var gl:WebGLRenderingContext? //WebGL Context
    var ctx:CanvasRenderingContext2D? //Canvas Context
}

