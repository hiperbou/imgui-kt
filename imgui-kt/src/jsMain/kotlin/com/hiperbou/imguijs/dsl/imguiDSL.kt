package com.hiperbou.imguijs.dsl

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ArrowButton
import com.hiperbou.imguijs.ImGui.Begin
import com.hiperbou.imguijs.ImGui.BeginChild
import com.hiperbou.imguijs.ImGui.BeginChildFrame
import com.hiperbou.imguijs.ImGui.BeginCombo
import com.hiperbou.imguijs.ImGui.BeginDragDropSource
import com.hiperbou.imguijs.ImGui.BeginDragDropTarget
import com.hiperbou.imguijs.ImGui.BeginGroup
import com.hiperbou.imguijs.ImGui.BeginListBox
import com.hiperbou.imguijs.ImGui.BeginMainMenuBar
import com.hiperbou.imguijs.ImGui.BeginMenu
import com.hiperbou.imguijs.ImGui.BeginMenuBar
import com.hiperbou.imguijs.ImGui.BeginPopup
import com.hiperbou.imguijs.ImGui.BeginPopupContextItem
import com.hiperbou.imguijs.ImGui.BeginPopupContextVoid
import com.hiperbou.imguijs.ImGui.BeginPopupContextWindow
import com.hiperbou.imguijs.ImGui.BeginPopupModal
import com.hiperbou.imguijs.ImGui.BeginTabBar
import com.hiperbou.imguijs.ImGui.BeginTabItem
import kotlin.reflect.KMutableProperty0
import com.hiperbou.imguijs.ImGui.BeginTable
import com.hiperbou.imguijs.ImGui.BeginTooltip
import com.hiperbou.imguijs.ImGui.Button
import com.hiperbou.imguijs.ImGui.Checkbox
import com.hiperbou.imguijs.ImGui.CheckboxFlags
import com.hiperbou.imguijs.ImGui.CollapsingHeader
import com.hiperbou.imguijs.ImGui.Combo
import com.hiperbou.imguijs.ImGui.Combo_Items_Array
import com.hiperbou.imguijs.ImGui.End
import com.hiperbou.imguijs.ImGui.EndChild
import com.hiperbou.imguijs.ImGui.EndChildFrame
import com.hiperbou.imguijs.ImGui.EndCombo
import com.hiperbou.imguijs.ImGui.EndDragDropSource
import com.hiperbou.imguijs.ImGui.EndDragDropTarget
import com.hiperbou.imguijs.ImGui.EndGroup
import com.hiperbou.imguijs.ImGui.EndListBox
import com.hiperbou.imguijs.ImGui.EndMainMenuBar
import com.hiperbou.imguijs.ImGui.EndMenu
import com.hiperbou.imguijs.ImGui.EndMenuBar
import com.hiperbou.imguijs.ImGui.EndPopup
import com.hiperbou.imguijs.ImGui.EndTabBar
import com.hiperbou.imguijs.ImGui.EndTabItem
import com.hiperbou.imguijs.ImGui.EndTable
import com.hiperbou.imguijs.ImGui.EndTooltip
import com.hiperbou.imguijs.ImGui.ImVec2
import com.hiperbou.imguijs.ImGui.ImageButton
import com.hiperbou.imguijs.ImGui.Indent
import com.hiperbou.imguijs.ImGui.InvisibleButton
import com.hiperbou.imguijs.ImGui.MenuItem
import com.hiperbou.imguijs.ImGui.PopButtonRepeat
import com.hiperbou.imguijs.ImGui.PopClipRect
import com.hiperbou.imguijs.ImGui.PopFont
import com.hiperbou.imguijs.ImGui.PopID
import com.hiperbou.imguijs.ImGui.PopItemWidth
import com.hiperbou.imguijs.ImGui.PopStyleColor
import com.hiperbou.imguijs.ImGui.PopStyleVar
import com.hiperbou.imguijs.ImGui.PopTextWrapPos
import com.hiperbou.imguijs.ImGui.PushButtonRepeat
import com.hiperbou.imguijs.ImGui.PushClipRect
import com.hiperbou.imguijs.ImGui.PushFont
import com.hiperbou.imguijs.ImGui.PushID
import com.hiperbou.imguijs.ImGui.PushItemWidth
import com.hiperbou.imguijs.ImGui.PushStyleColor
import com.hiperbou.imguijs.ImGui.PushStyleVar
import com.hiperbou.imguijs.ImGui.PushTextWrapPos
import com.hiperbou.imguijs.ImGui.RadioButton
import com.hiperbou.imguijs.ImGui.Selectable
import com.hiperbou.imguijs.ImGui.SmallButton
import com.hiperbou.imguijs.ImGui.Text
import com.hiperbou.imguijs.ImGui.TextColored
import com.hiperbou.imguijs.ImGui.TextDisabled
import com.hiperbou.imguijs.ImGui.TreeNode
import com.hiperbou.imguijs.ImGui.TreeNodeEx
import com.hiperbou.imguijs.ImGui.TreePop
import com.hiperbou.imguijs.ImGui.Unindent
import org.khronos.webgl.WebGLTexture


//object dsl {

    // Tables

    inline fun table(strId: String, columns: Int, flags: ImGuiTableFlags = ImGui.ImGuiTableFlags.None.ordinal,
                     outerSize: ImVec2 = ImVec2(), innerWidth: Float = 0f, block: () -> Unit = {}) {
        if (BeginTable(strId, columns, flags, outerSize, innerWidth)) { // ~open
            block()
            EndTable()
        }
    }

    // Windows

    inline fun window(name: String, noinline open: ImAccess<Boolean>? = null, flags: ImGuiWindowFlags = ImGui.ImGuiWindowFlags.None.ordinal, block: () -> Unit = {}) {
        if (Begin(name, open, flags)) // ~open
            block()
        End()
    }

    // Child Windows

    inline fun child(strId: String, size: ImVec2 = ImVec2(), border: Boolean = false, extraFlags: ImGuiWindowFlags = ImGui.ImGuiWindowFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginChild(strId, size, border, extraFlags)) // ~open
            block()
        EndChild()
    }

    // Parameters stacks (shared)

    inline fun withFont(font: ImGui.ImFont, block: () -> Unit = {}) {
        PushFont(font)
        block()
        PopFont()
    }

    // ~private
    fun _push(idx: ImGuiCol, col: Any) {
        if (col is Int)
            PushStyleColor(idx, col)
        else
            PushStyleColor(idx, col as ImGui.ImVec4)
    }

    inline fun withStyleColor(idx: ImGuiCol, col: Any, block: () -> Unit = {}) {
        _push(idx, col)
        block()
        PopStyleColor()
    }

    inline fun withStyleColor(idx0: ImGuiCol, col0: Any,
                              idx1: ImGuiCol, col1: Any, block: () -> Unit = {}) {
        _push(idx0, col0)
        _push(idx1, col1)
        block()
        PopStyleColor(2)
    }

    inline fun withStyleColor(idx0: ImGuiCol, col0: Any,
                              idx1: ImGuiCol, col1: Any,
                              idx2: ImGuiCol, col2: Any, block: () -> Unit = {}) {
        _push(idx0, col0)
        _push(idx1, col1)
        _push(idx2, col2)
        block()
        PopStyleColor(3)
    }

    inline fun withStyleColor(idx0: ImGuiCol, col0: Any,
                              idx1: ImGuiCol, col1: Any,
                              idx2: ImGuiCol, col2: Any,
                              idx3: ImGuiCol, col3: Any,
                              block: () -> Unit) {
        _push(idx0, col0)
        _push(idx1, col1)
        _push(idx2, col2)
        _push(idx3, col3)
        block()
        PopStyleColor(4)
    }

    inline fun withStyleColor(idx0: ImGuiCol, col0: Any,
                              idx1: ImGuiCol, col1: Any,
                              idx2: ImGuiCol, col2: Any,
                              idx3: ImGuiCol, col3: Any,
                              idx4: ImGuiCol, col4: Any, block: () -> Unit = {}) {
        _push(idx0, col0)
        _push(idx1, col1)
        _push(idx2, col2)
        _push(idx3, col3)
        _push(idx4, col4)
        block()
        PopStyleColor(5)
    }

    inline fun withStyleVar(idx: ImGuiStyleVar, value: Any, block: () -> Unit = {}) {
        PushStyleVar(idx, value)
        block()
        PopStyleVar()
    }

    // Parameters stacks (current window)

    inline fun withItemWidth(itemWidth: Number, block: () -> Unit = {}) {
        PushItemWidth(itemWidth)
        block()
        PopItemWidth()
    }

    inline fun withTextWrapPos(wrapPosX: Number = 0f, block: () -> Unit = {}) {
        PushTextWrapPos(wrapPosX)
        block()
        PopTextWrapPos()
    }

    /*inline fun withAllowKeyboardFocus(allowKeyboardFocus: Boolean, block: () -> Unit = {}) {
        PushTabStop(allowKeyboardFocus)
        block()
        PopTabStop()
    }*/

    inline fun <R> withButtonRepeat(repeat: Boolean, block: () -> R): R {
        PushButtonRepeat(repeat)
        return block().also { PopButtonRepeat() }
    }


    // Cursor / Layout

    inline fun indent(indentW: Float = 0f, block: () -> Unit = {}) { // TODO indented?
        Indent(indentW)
        block()
        Unindent(indentW)
    }

    inline fun group(block: () -> Unit) {
        BeginGroup()
        block()
        EndGroup()
    }


    // ID stack/scopes

    inline fun withID(id: Int, block: () -> Unit = {}) {
        PushID(id)
        block()
        PopID()
    }

    inline fun withID(id: String, block: () -> Unit = {}) {
        PushID(id)
        block()
        PopID()
    }

    /*inline fun withID(id: Any, block: () -> Unit = {}) {
        PushID(id)
        block()
        PopID()
    }*/


    // Widgets: Main

    inline fun button(label: String, sizeArg: ImVec2 = ImVec2(), block: () -> Unit = {}) {
        if (Button(label, sizeArg))
            block()
    }

    inline fun smallButton(label: String, block: () -> Unit = {}) {
        if (SmallButton(label))
            block()
    }

    inline fun invisibleButton(strId: String, sizeArg: ImVec2, block: () -> Unit = {}) {
        if (InvisibleButton(strId, sizeArg))
            block()
    }

    inline fun arrowButton(id: String, dir: ImGuiDir, block: () -> Unit = {}) {
        if (ArrowButton(id, dir))
            block()
    }

    inline fun imageButton(userTextureId: WebGLTexture, size: ImVec2, uv0: ImVec2 = ImVec2(), uv1: ImVec2 = ImVec2(),
                           frame_padding:Number? = null,
                           bgCol: ImGui.ImVec4 = ImGui.ImVec4(), tintCol: ImGui.ImVec4 = ImGui.ImVec4(1), block: () -> Unit = {}) {


        if (ImageButton(userTextureId, size, uv0, uv1, frame_padding, bgCol, tintCol))
            block()
    }

    inline fun checkbox(label: String, noinline vPtr: ImAccess<Boolean>, block: () -> Unit = {}) {
        if (Checkbox(label, vPtr))
            block()
    }

    /*inline fun <F : ImGui.Flag<F>> checkboxFlags(label: String, vPtr: ImAccess<Flag<F>>, flagsValue: Flag<F>, block: () -> Unit = {}) {
        if (CheckboxFlags(label, vPtr, flagsValue))
            block()
    }*/

    inline fun radioButton(label: String, active: Boolean, block: () -> Unit = {}) {
        if (RadioButton(label, active))
            block()
    }

    inline fun radioButton(label: String, noinline v: ImAccess<Int>, vButton: Int, block: () -> Unit = {}) {
        if (RadioButton(label, v, vButton))
            block()
    }


    // Widgets: Combo Box


    inline fun useCombo(label: String, previewValue: String?, flags: ImGuiComboFlags = ImGui.ImGuiComboFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginCombo(label, previewValue, flags)) {
            block()
            EndCombo()
        }
    }

    inline fun combo(label: String, noinline currentItem: ImAccess<Int>, items: Array<String>,
                     heightInItems: Int = -1, block: () -> Unit = {}) {
        if (Combo_Items_Array(label, currentItem, items, items.size, heightInItems))
            block()
    }

    fun <T:Enum<T>>comboEnum(label:String, enumValues:Array<T>, selectedIndex: ImAccess<Int>,
                             heightInItems: Int = -1, block: () -> Unit = {}) {
        val enumComboItems = enumValues.map{ it.name }.toTypedArray()
        if (Combo_Items_Array(label, selectedIndex, enumComboItems, enumComboItems.size, heightInItems))
            block()
    }


    // Widgets: Trees

    inline fun treeNode(label: String, block: () -> Unit = {}) {
        if (TreeNode(label)) {
            block()
            TreePop()
        }
    }

    inline fun treeNode(strId: String, fmt: String, block: () -> Unit = {}) {
        if (TreeNode(strId, fmt)) {
            block()
            TreePop()
        }
    }

    inline fun treeNode(intPtr: Long, fmt: String, block: () -> Unit = {}) {
        if (TreeNode(intPtr, fmt)) {
            block()
            TreePop()
        }
    }

    inline fun treeNodeEx(strID: String, flags: ImGuiTreeNodeFlags = ImGui.ImGuiTreeNodeFlags.None.ordinal, block: () -> Unit = {}) {
        if (TreeNodeEx(strID, flags)) {
            block()
            TreePop()
        }
    }

    inline fun treeNodeEx(strID: String, flags: ImGuiTreeNodeFlags, fmt: String, vararg args: Any, block: () -> Unit = {}) {
        if (TreeNodeEx(strID, flags, fmt/*, args*/)) {
            block()
            TreePop()
        }
    }

    /*inline fun treeNodeEx(ptrID: Any, flags: ImGuiTreeNodeFlags, fmt: String, vararg args: Any, block: () -> Unit = {}) {
        if (TreeNodeEx(ptrID, flags, fmt/*, args*/)) {
            block()
            TreePop()
        }
    }*/

    inline fun treeNodeEx(intPtr: Long, flags: ImGuiTreeNodeFlags, fmt: String, vararg args: Any, block: () -> Unit = {}) {
        if (TreeNodeEx(intPtr, flags, fmt/*, args*/)) {
            block()
            TreePop()
        }
    }

    //    inline fun treePushed(intPtr: Long?, block: () -> Unit = {}) { TODO check me
    //        treePush(intPtr)
    //        try { block() } finally { TreePop() }
    //    }

    inline fun collapsingHeader(label: String, flags: ImGuiTreeNodeFlags = ImGui.ImGuiTreeNodeFlags.None.ordinal, block: () -> Unit = {}) {
        if (CollapsingHeader(label, flags))
            block()
    }

    inline fun collapsingHeader(label: String, noinline open: ImAccess<Boolean>, flags: ImGuiTreeNodeFlags = ImGui.ImGuiTreeNodeFlags.None.ordinal, block: () -> Unit = {}) {
        if (CollapsingHeader(label, open, flags))
            block()
    }


    // Widgets: Selectables

    inline fun selectable(label: String, selected: Boolean = false, flags: ImGuiSelectableFlags = ImGui.ImGuiSelectableFlags.None.ordinal, sizeArg: ImVec2 = ImVec2(), block: () -> Unit = {}) {
        if (Selectable(label, selected, flags, sizeArg))
            block()
    }

    inline fun selectable(label: String, noinline selected: ImAccess<Boolean>, flags: ImGuiSelectableFlags = ImGui.ImGuiSelectableFlags.None.ordinal, sizeArg: ImVec2 = ImVec2(), block: () -> Unit = {}) {
        if (Selectable(label, selected, flags, sizeArg))
            block()
    }


    // Widgets: Menus

    inline fun mainMenuBar(block: () -> Unit) {
        if (BeginMainMenuBar()) {
            block()
            EndMainMenuBar()
        }
    }

    inline fun menuBar(block: () -> Unit) {
        if (BeginMenuBar()) {
            block()
            EndMenuBar()
        }
    }

    inline fun menu(label: String, enabled: Boolean = true, block: () -> Unit = {}) {
        if (BeginMenu(label, enabled)) {
            block()
            EndMenu()
        }
    }

    inline fun menuItem(label: String, shortcut: String = "", selected: Boolean = false, enabled: Boolean = true, block: () -> Unit = {}) {
        if (MenuItem(label, shortcut, selected, enabled))
            block()
    }

    inline fun menuItem(label: String, shortcut: String = "", noinline selected: ImAccess<Boolean>, enabled: Boolean = true, block: () -> Unit = {}) {
        if (MenuItem(label, shortcut, selected, enabled))
            block()
    }


    // Tooltips

    inline fun tooltip(block: () -> Unit) {
        BeginTooltip()
        block()
        EndTooltip()
    }


    // Popups, Modals

    inline fun popup(strId: String, flags: ImGuiWindowFlags = ImGui.ImGuiWindowFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginPopup(strId, flags)) {
            block()
            EndPopup()
        }
    }

    inline fun popupContextItem(strId: String = "", popupFlags: ImGuiPopupFlags = ImGui.ImGuiPopupFlags.MouseButtonRight.ordinal, block: () -> Unit = {}) {
        if (BeginPopupContextItem(strId, popupFlags)) {
            block()
            EndPopup()
        }
    }

    inline fun popupContextWindow(strId: String = "", popupFlags: ImGuiPopupFlags = ImGui.ImGuiPopupFlags.MouseButtonRight.ordinal, block: () -> Unit = {}) {
        if (BeginPopupContextWindow(strId, popupFlags)) {
            block()
            EndPopup()
        }
    }

    inline fun popupContextVoid(strId: String = "", popupFlags: ImGuiPopupFlags = ImGui.ImGuiPopupFlags.MouseButtonRight.ordinal, block: () -> Unit = {}) {
        if (BeginPopupContextVoid(strId, popupFlags)) {
            block()
            EndPopup()
        }
    }

    inline fun popupModal(name: String, noinline pOpen: ImAccess<Boolean>? = null, extraFlags: ImGuiWindowFlags = ImGui.ImGuiWindowFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginPopupModal(name, pOpen, extraFlags)) {
            block()
            EndPopup()
        }
    }


    // Tab Bars, Tabs

    inline fun tabBar(strId: String, flags: ImGuiTabBarFlags = ImGui.ImGuiTabBarFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginTabBar(strId, flags)) {
            block()
            EndTabBar()
        }
    }

    inline fun tabItem(label: String, noinline pOpen: ImAccess<Boolean>? = null, flags: ImGuiTabItemFlags = ImGui.ImGuiTabItemFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginTabItem(label, pOpen, flags)) {
            block()
            EndTabItem()
        }
    }


    // Drag and Drop

    inline fun dragDropSource(flags: ImGuiDragDropFlags = ImGui.ImGuiDragDropFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginDragDropSource(flags)) {
            block()
            EndDragDropSource()
        }
    }

    inline fun dragDropTarget(block: () -> Unit) {
        if (BeginDragDropTarget()) {
            block()
            EndDragDropTarget()
        }
    }


    // Clipping

    inline fun withClipRect(clipRectMin: ImVec2, clipRectMax: ImVec2, intersectWithCurrentClipRect: Boolean, block: () -> Unit = {}) {
        PushClipRect(clipRectMin, clipRectMax, intersectWithCurrentClipRect)
        block()
        PopClipRect()
    }


    // Miscellaneous Utilities

    inline fun childFrame(id: ImGuiID, size: ImVec2, extraFlags: ImGuiWindowFlags = ImGui.ImGuiWindowFlags.None.ordinal, block: () -> Unit = {}) {
        if (BeginChildFrame(id, size, extraFlags))
            block()
        EndChildFrame()
    }

    // Columns

    /*inline fun columns(strId: String = "", columnsCount: Int, flags: ImGuiOldColumnFlags = ImGui.OldColumnFlags.None.ordinal, block: () -> Unit = {}) {
        BeginColumns(strId, columnsCount, flags)
        block()
        EndColumns()
    }*/

    // listBox

    inline fun listBox(label: String, sizeArg: ImVec2 = ImVec2(), block: () -> Unit = {}) {
        if (BeginListBox(label, sizeArg)) {
            block()
            EndListBox()
        }
    }

    // focusScope TODO*/


    inline fun text(text:String) = Text(text)

    inline fun textDisabled(text:String) = TextDisabled(text)

    inline fun textColored(col: Any?, text: String)=  TextColored(col, text)

    inline fun onItemHovered(block:()->Unit) {
        if(ImGui.IsItemHovered())
            block()
    }
//}