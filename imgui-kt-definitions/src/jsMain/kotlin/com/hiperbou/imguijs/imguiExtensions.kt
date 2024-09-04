package com.hiperbou.imguijs

import kotlinx.browser.window
import org.khronos.webgl.WebGLRenderingContextBase
import org.w3c.fetch.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

inline fun WebGLRenderingContextBase.clearColor(imVec4:ImGui.ImVec4) {
    return clearColor(imVec4.x.toFloat(), imVec4.y.toFloat(), imVec4.z.toFloat(), imVec4.w.toFloat(),)
}

inline fun Number.toFixed(i: Int): String {
    return this.asDynamic().toFixed(i)
}

suspend fun fetch(url:String) = suspendCoroutine {cont ->
    window.fetch(url).then {
        cont.resume(it)
    }.catch {
        cont.resumeWithException(it)
    }
}

suspend fun fetchArrayBuffer(url:String) = suspendCoroutine {cont ->
    window.fetch(url).then {
        it.arrayBuffer()
    }.then {
        cont.resume(it)
    }.catch {
        cont.resumeWithException(it)
    }
}