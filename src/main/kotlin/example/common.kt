package com.hiperbou.imguijs.example

import com.hiperbou.imguijs.AddFontFromFileTTF
import com.hiperbou.imguijs.ImGui
import com.hiperbou.imguijs.ImGui_Bind.ImGui_Impl
import com.hiperbou.imguijs.clearColor
import kotlinx.browser.document
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.HTMLImageElement


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
var image_element: HTMLImageElement? = null
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

suspend fun initExample() {
    StartUpImage()
    font = AddFontFromFileTTF("imgui/Roboto-Medium.ttf", 16.0)
}

fun clean(time:Double) {
    println("done!")

    val gl = ImGui_Impl.gl
    if (gl!=null) {
        gl.viewport(0, 0, gl.drawingBufferWidth, gl.drawingBufferHeight)
        gl.clearColor(clear_color)
        gl.clear(WebGLRenderingContext.COLOR_BUFFER_BIT)
    }
    val ctx = ImGui_Impl.ctx
    if (ctx!=null) {
        ctx.clearRect(0.0, 0.0, ctx.canvas.width.toDouble(), ctx.canvas.height.toDouble())
    }
    CleanUpImage()
    //CleanUpVideo()
}

fun StartUpImage() {
    val image_element:HTMLImageElement = document.createElement("img").asDynamic()
    image_element.crossOrigin = "anonymous"
    image_element.src = image_url

    val gl = ImGui_Impl.gl
    if (gl!=null) {
        val width = 256
        val height = 256
        val pixels = Uint8Array(4 * width * height)
        image_gl_texture = gl.createTexture()
        gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, image_gl_texture)
        gl.texParameteri(
            WebGLRenderingContext.TEXTURE_2D,
            WebGLRenderingContext.TEXTURE_MIN_FILTER,
            WebGLRenderingContext.LINEAR
        )
        gl.texParameteri(
            WebGLRenderingContext.TEXTURE_2D,
            WebGLRenderingContext.TEXTURE_MAG_FILTER,
            WebGLRenderingContext.LINEAR
        )
        gl.texParameteri(
            WebGLRenderingContext.TEXTURE_2D,
            WebGLRenderingContext.TEXTURE_WRAP_S,
            WebGLRenderingContext.CLAMP_TO_EDGE
        )
        gl.texParameteri(
            WebGLRenderingContext.TEXTURE_2D,
            WebGLRenderingContext.TEXTURE_WRAP_T,
            WebGLRenderingContext.CLAMP_TO_EDGE
        )
        gl.texImage2D(
            WebGLRenderingContext.TEXTURE_2D, 0, WebGLRenderingContext.RGBA, width, height, 0, WebGLRenderingContext.RGBA,
            WebGLRenderingContext.UNSIGNED_BYTE, pixels)

        image_element.addEventListener("load", { event ->
            gl.bindTexture(WebGLRenderingContext.TEXTURE_2D, image_gl_texture)
            gl.texImage2D(
                WebGLRenderingContext.TEXTURE_2D, 0, WebGLRenderingContext.RGBA, WebGLRenderingContext.RGBA,
                WebGLRenderingContext.UNSIGNED_BYTE, image_element)
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
