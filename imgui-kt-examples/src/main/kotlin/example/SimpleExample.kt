package com.hiperbou.imguijs.example

import com.hiperbou.imguijs.ImGuiLib
import com.hiperbou.imguijs.dsl.button
import com.hiperbou.imguijs.dsl.text
import com.hiperbou.imguijs.dsl.window

class SimpleExample {
    private var counter = 0

    suspend fun init() {
        ImGuiLib(::loop).initialize()
    }

    private fun loop(time:Double):Boolean{
        window("Window Title") {
            text("This is some useful counter: $counter")
            button("Button") {
                counter++
            }
            text("milliseconds since the application started $time")
        }
        return false
    }
}