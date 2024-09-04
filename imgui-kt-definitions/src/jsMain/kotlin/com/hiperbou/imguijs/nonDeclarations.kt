@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.hiperbou.imguijs

import com.hiperbou.imguijs.ImGui_Bind.*
import com.hiperbou.imguijs.tsstdlib.Readonly
import kotlin.reflect.KMutableProperty0

typealias ImAccess<T> = (value: T) -> T
/*class ImAccess<T>(var currentValue: KMutableProperty0<T>)/*:ImAccess<dynamic>*/ {
    fun invoke(value: T): T {
        if(value == undefined) return currentValue.get()
        currentValue.set(value)
        return currentValue.get()
    }
}*/

fun <T>ImAccess(currentValue: KMutableProperty0<T>):ImAccess<T>/*:ImAccess<dynamic>*/ {
    return { value ->
        if(value == undefined)
            currentValue.get()
        else {
            currentValue.set(value)
            currentValue.get()
        }
    }
}

fun <T>ImAccess<T>.value():T = this.asDynamic()()

typealias ImScalar<T> = Array<T>//[ T ];
typealias ImTuple2<T> = Array<T>//[ T, T ];
typealias ImTuple3<T> = Array<T>//[ T, T, T ];
typealias ImTuple4<T> = Array<T>//[ T, T, T, T ];

typealias ImGuiCol = Number

typealias ImGuiCond = Number

typealias ImGuiDataType = Number

typealias ImGuiDir = Number

typealias ImGuiKey = Number

typealias ImGuiNavInput = Number

typealias ImGuiMouseButton = Number

typealias ImGuiMouseCursor = Number

typealias ImGuiSortDirection = Number

typealias ImGuiStyleVar = Number

typealias ImGuiTableBgTarget = Number

typealias ImDrawFlags = Number

typealias ImDrawListFlags = Number

typealias ImFontAtlasFlags = Number

typealias ImGuiBackendFlags = Number

typealias ImGuiButtonFlags = Number

typealias ImGuiColorEditFlags = Number

typealias ImGuiConfigFlags = Number

typealias ImGuiComboFlags = Number

typealias ImGuiDragDropFlags = Number

typealias ImGuiFocusedFlags = Number

typealias ImGuiHoveredFlags = Number

typealias ImGuiInputTextFlags = Number

typealias ImGuiKeyModFlags = Number

typealias ImGuiPopupFlags = Number

typealias ImGuiSelectableFlags = Number

typealias ImGuiSliderFlags = Number

typealias ImGuiTabBarFlags = Number

typealias ImGuiTabItemFlags = Number

typealias ImGuiTableFlags = Number

typealias ImGuiTableColumnFlags = Number

typealias ImGuiTableRowFlags = Number

typealias ImGuiTreeNodeFlags = Number

typealias ImGuiViewportFlags = Number

typealias ImGuiWindowFlags = Number

typealias ImTextureID = Number

typealias ImGuiID = Number

typealias ImGuiInputTextCallback = (data: reference_ImGuiInputTextCallbackData) -> Number

typealias ImGuiSizeCallback = (data: reference_ImGuiSizeCallbackData) -> Unit

typealias ImWchar16 = Number

typealias ImWchar32 = Number

typealias ImWchar = Number

typealias ImS16 = Number

typealias ImU32 = Number

typealias ImDrawCallback = (parent_list: Readonly<reference_ImDrawList>, cmd: Readonly<reference_ImDrawCmd>) -> Unit