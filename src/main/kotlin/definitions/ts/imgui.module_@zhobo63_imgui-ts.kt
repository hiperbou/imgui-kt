//@file:JsModule("@zhobo63/imgui-ts/src/bind-imgui")
//@file:JsNonModule
//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
//@file:JsQualifier("ImGui")
package com.hiperbou.imguits

import com.hiperbou.imguits.ImGui_Bind.*
import com.hiperbou.imguits.emscripten.*
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
import com.hiperbou.imguits.tsstdlib.Readonly



@JsName("default")
external fun default(Module: ModulePartial = definedExternally): Promise<Unit>

@JsName("ImGui")
external val ImGui_ts:Module

@JsName("ImGui")
external object ImGuiGlobal {
    fun default(Module: ModulePartial = definedExternally): Promise<Unit>


    open class StringBuffer(size: Number, buffer: String? = definedExternally /* null */) {
        open var size: Number = definedExternally
        open var buffer: String = definedExternally
    }
    open class ImVec4(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */) : interface_ImVec4 {
        override var x: Number = definedExternally
        override var y: Number = definedExternally
        override var z: Number = definedExternally
        override var w: Number = definedExternally
        override fun Set(x: Number, y: Number, z: Number, w: Number): ImVec4 /* this */ = definedExternally
        override fun Copy(other: Readonly<interface_ImVec4>): interface_ImVec4 = definedExternally
        override fun Equals(other: Readonly<interface_ImVec4>): Boolean = definedExternally
        //override fun Copy(other: Any?): ImVec4 /* this */ = definedExternally
        //override fun Equals(other: Any?): Boolean = definedExternally
        companion object {
            var ZERO: Any? = definedExternally
            var UNIT: Any? = definedExternally
            var UNIT_X: Any? = definedExternally
            var UNIT_Y: Any? = definedExternally
            var UNIT_Z: Any? = definedExternally
            var UNIT_W: Any? = definedExternally
            var BLACK: Any? = definedExternally
            var WHITE: Any? = definedExternally
        }
    }

}

@JsName("ImGui_Impl")
external val ImGui_Impl_ts:ImGui_Impl_Interface

external interface ImGui_Impl_Interface {
    fun Init(value: dynamic /*HTMLCanvasElement | WebGL2RenderingContext | WebGLRenderingContext | CanvasRenderingContext2D | null*/)
    fun CreateDeviceObjects()
    fun CreateFontsTexture()
    fun DestroyDeviceObjects()
    fun DestroyFontsTexture()
    fun NewFrame(time:Double)
    fun RenderDrawData(draw_data:reference_ImDrawData?)
    fun Shutdown()
    var ClearBuffer:((color: ImGuiGlobal.ImVec4, bufferBit:Int?)->Unit)?
}
