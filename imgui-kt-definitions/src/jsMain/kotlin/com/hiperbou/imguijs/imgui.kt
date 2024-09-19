//@file:JsModule("imgui-js")
//@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)
//@file:JsQualifier("ImGui")

package com.hiperbou.imguijs

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui_Bind.*
import com.hiperbou.imguijs.tsstdlib.ArrayLike
import com.hiperbou.imguijs.tsstdlib.Readonly
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

@JsName("ImGui")
external object ImGui {
    interface XY {
        var x: Number
        var y: Number
    }

    interface XYZ : XY {
        var z: Number
    }

    interface XYZW : XYZ {
        var w: Number
    }

    interface RGB {
        var r: Number
        var g: Number
        var b: Number
    }

    interface RGBA : RGB {
        var a: Number
    }

    @JsName("default")
    fun Module(Module: ModulePartial = definedExternally): Promise<Unit>

    var bind: com.hiperbou.imguijs.ImGui_Bind.Module = definedExternally
    var IMGUI_VERSION: String = definedExternally
    var IMGUI_VERSION_NUM: Number = definedExternally
    fun IMGUI_CHECKVERSION(): Boolean = definedExternally
    var IMGUI_HAS_TABLE: Boolean = definedExternally
    fun ASSERT(c: Any): dynamic/*asserts*/ = definedExternally
    fun IM_ASSERT(c: Any): dynamic /*asserts*/ = definedExternally
    fun IM_ARRAYSIZE(_ARR: ArrayLike<Any>): Number = definedExternally
    fun IM_ARRAYSIZE(_ARR: ImStringBuffer): Number = definedExternally
    open class ImStringBuffer(size: Number, buffer: String? = definedExternally /* null */) {
        open var size: Number = definedExternally
        open var buffer: String = definedExternally
    }

    object ImGuiWindowFlags {
        val None :Int = definedExternally /*0 */; val NoTitleBar :Int = definedExternally /*1 */; val NoResize :Int = definedExternally /*2 */; val NoMove :Int = definedExternally /*4 */; val NoScrollbar :Int = definedExternally /*8 */; val NoScrollWithMouse :Int = definedExternally /*16 */; val NoCollapse :Int = definedExternally /*32 */; val AlwaysAutoResize :Int = definedExternally /*64 */; val NoBackground :Int = definedExternally /*128 */; val NoSavedSettings :Int = definedExternally /*256 */; val NoMouseInputs :Int = definedExternally /*512 */; val MenuBar :Int = definedExternally /*1024 */; val HorizontalScrollbar :Int = definedExternally /*2048 */; val NoFocusOnAppearing :Int = definedExternally /*4096 */; val NoBringToFrontOnFocus :Int = definedExternally /*8192 */; val AlwaysVerticalScrollbar :Int = definedExternally /*16384 */; val AlwaysHorizontalScrollbar :Int = definedExternally /*32768 */; val AlwaysUseWindowPadding :Int = definedExternally /*65536 */; val NoNavInputs :Int = definedExternally /*262144 */; val NoNavFocus :Int = definedExternally /*524288 */; val UnsavedDocument :Int = definedExternally /*1048576 */; val NoNav :Int = definedExternally /*786432 */; val NoDecoration :Int = definedExternally /*43 */; val NoInputs :Int = definedExternally /*786944 */; val NavFlattened :Int = definedExternally /*8388608 */; val ChildWindow :Int = definedExternally /*16777216 */; val Tooltip :Int = definedExternally /*33554432 */; val Popup :Int = definedExternally /*67108864 */; val Modal :Int = definedExternally /*134217728 */; val ChildMenu :Int = definedExternally /*268435456 */
    }

    object ImGuiInputTextFlags {
        val None :Int = definedExternally /*0 */; val CharsDecimal :Int = definedExternally /*1 */; val CharsHexadecimal :Int = definedExternally /*2 */; val CharsUppercase :Int = definedExternally /*4 */; val CharsNoBlank :Int = definedExternally /*8 */; val AutoSelectAll :Int = definedExternally /*16 */; val EnterReturnsTrue :Int = definedExternally /*32 */; val CallbackCompletion :Int = definedExternally /*64 */; val CallbackHistory :Int = definedExternally /*128 */; val CallbackAlways :Int = definedExternally /*256 */; val CallbackCharFilter :Int = definedExternally /*512 */; val AllowTabInput :Int = definedExternally /*1024 */; val CtrlEnterForNewLine :Int = definedExternally /*2048 */; val NoHorizontalScroll :Int = definedExternally /*4096 */; val AlwaysOverwrite :Int = definedExternally /*8192 */; val ReadOnly :Int = definedExternally /*16384 */; val Password :Int = definedExternally /*32768 */; val NoUndoRedo :Int = definedExternally /*65536 */; val CharsScientific :Int = definedExternally /*131072 */; val CallbackResize :Int = definedExternally /*262144 */; val CallbackEdit :Int = definedExternally /*524288 */; val Multiline :Int = definedExternally /*1048576 */; val NoMarkEdited :Int = definedExternally /*2097152 */
    }

    object ImGuiTreeNodeFlags {
        val None :Int = definedExternally /*0 */; val Selected :Int = definedExternally /*1 */; val Framed :Int = definedExternally /*2 */; val AllowItemOverlap :Int = definedExternally /*4 */; val NoTreePushOnOpen :Int = definedExternally /*8 */; val NoAutoOpenOnLog :Int = definedExternally /*16 */; val DefaultOpen :Int = definedExternally /*32 */; val OpenOnDoubleClick :Int = definedExternally /*64 */; val OpenOnArrow :Int = definedExternally /*128 */; val Leaf :Int = definedExternally /*256 */; val Bullet :Int = definedExternally /*512 */; val FramePadding :Int = definedExternally /*1024 */; val SpanAvailWidth :Int = definedExternally /*2048 */; val SpanFullWidth :Int = definedExternally /*4096 */; val NavLeftJumpsBackHere :Int = definedExternally /*8192 */; val CollapsingHeader :Int = definedExternally /*26 */
    }

    object ImGuiPopupFlags {
        val None :Int = definedExternally /*0 */; val MouseButtonLeft :Int = definedExternally /*0 */; val MouseButtonRight :Int = definedExternally /*1 */; val MouseButtonMiddle :Int = definedExternally /*2 */; val MouseButtonMask_ :Int = definedExternally /*31 */; val MouseButtonDefault_ :Int = definedExternally /*1 */; val NoOpenOverExistingPopup :Int = definedExternally /*32 */; val NoOpenOverItems :Int = definedExternally /*64 */; val AnyPopupId :Int = definedExternally /*128 */; val AnyPopupLevel :Int = definedExternally /*256 */; val AnyPopup :Int = definedExternally /*384 */
    }

    object ImGuiSelectableFlags {
        val None :Int = definedExternally /*0 */; val DontClosePopups :Int = definedExternally /*1 */; val SpanAllColumns :Int = definedExternally /*2 */; val AllowDoubleClick :Int = definedExternally /*4 */; val Disabled :Int = definedExternally /*8 */; val AllowItemOverlap :Int = definedExternally /*16 */
    }

    object ImGuiComboFlags {
        val None :Int = definedExternally /*0 */; val PopupAlignLeft :Int = definedExternally /*1 */; val HeightSmall :Int = definedExternally /*2 */; val HeightRegular :Int = definedExternally /*4 */; val HeightLarge :Int = definedExternally /*8 */; val HeightLargest :Int = definedExternally /*16 */; val NoArrowButton :Int = definedExternally /*32 */; val NoPreview :Int = definedExternally /*64 */; val HeightMask_ :Int = definedExternally /*30 */
    }

    object ImGuiTabBarFlags {
        val None :Int = definedExternally /*0 */; val Reorderable :Int = definedExternally /*1 */; val AutoSelectNewTabs :Int = definedExternally /*2 */; val TabListPopupButton :Int = definedExternally /*4 */; val NoCloseWithMiddleMouseButton :Int = definedExternally /*8 */; val NoTabListScrollingButtons :Int = definedExternally /*16 */; val NoTooltip :Int = definedExternally /*32 */; val FittingPolicyResizeDown :Int = definedExternally /*64 */; val FittingPolicyScroll :Int = definedExternally /*128 */; val FittingPolicyMask_ :Int = definedExternally /*192 */; val FittingPolicyDefault_ :Int = definedExternally /*64 */
    }

    object ImGuiTabItemFlags {
        val None :Int = definedExternally /*0 */; val UnsavedDocument :Int = definedExternally /*1 */; val SetSelected :Int = definedExternally /*2 */; val NoCloseWithMiddleMouseButton :Int = definedExternally /*4 */; val NoPushId :Int = definedExternally /*8 */; val NoTooltip :Int = definedExternally /*16 */; val NoReorder :Int = definedExternally /*32 */; val Leading :Int = definedExternally /*64 */; val Trailing :Int = definedExternally /*128 */
    }

    object ImGuiTableFlags {
        val None :Int = definedExternally /*0 */; val Resizable :Int = definedExternally /*1 */; val Reorderable :Int = definedExternally /*2 */; val Hideable :Int = definedExternally /*4 */; val Sortable :Int = definedExternally /*8 */; val NoSavedSettings :Int = definedExternally /*16 */; val ContextMenuInBody :Int = definedExternally /*32 */; val RowBg :Int = definedExternally /*64 */; val BordersInnerH :Int = definedExternally /*128 */; val BordersOuterH :Int = definedExternally /*256 */; val BordersInnerV :Int = definedExternally /*512 */; val BordersOuterV :Int = definedExternally /*1024 */; val BordersH :Int = definedExternally /*384 */; val BordersV :Int = definedExternally /*1536 */; val BordersInner :Int = definedExternally /*640 */; val BordersOuter :Int = definedExternally /*1280 */; val Borders :Int = definedExternally /*1920 */; val NoBordersInBody :Int = definedExternally /*2048 */; val NoBordersInBodyUntilResize :Int = definedExternally /*4096 */; val SizingFixedFit :Int = definedExternally /*8192 */; val SizingFixedSame :Int = definedExternally /*16384 */; val SizingStretchProp :Int = definedExternally /*24576 */; val SizingStretchSame :Int = definedExternally /*32768 */; val NoHostExtendX :Int = definedExternally /*65536 */; val NoHostExtendY :Int = definedExternally /*131072 */; val NoKeepColumnsVisible :Int = definedExternally /*262144 */; val PreciseWidths :Int = definedExternally /*524288 */; val NoClip :Int = definedExternally /*1048576 */; val PadOuterX :Int = definedExternally /*2097152 */; val NoPadOuterX :Int = definedExternally /*4194304 */; val NoPadInnerX :Int = definedExternally /*8388608 */; val ScrollX :Int = definedExternally /*16777216 */; val ScrollY :Int = definedExternally /*33554432 */; val SortMulti :Int = definedExternally /*67108864 */; val SortTristate :Int = definedExternally /*134217728 */; val SizingMask_ :Int = definedExternally /*57344 */
    }

    object ImGuiTableColumnFlags {
        val None :Int = definedExternally /*0 */; val Disabled :Int = definedExternally /*1 */; val DefaultHide :Int = definedExternally /*2 */; val DefaultSort :Int = definedExternally /*4 */; val WidthStretch :Int = definedExternally /*8 */; val WidthFixed :Int = definedExternally /*16 */; val NoResize :Int = definedExternally /*32 */; val NoReorder :Int = definedExternally /*64 */; val NoHide :Int = definedExternally /*128 */; val NoClip :Int = definedExternally /*256 */; val NoSort :Int = definedExternally /*512 */; val NoSortAscending :Int = definedExternally /*1024 */; val NoSortDescending :Int = definedExternally /*2048 */; val NoHeaderLabel :Int = definedExternally /*4096 */; val NoHeaderWidth :Int = definedExternally /*8192 */; val PreferSortAscending :Int = definedExternally /*16384 */; val PreferSortDescending :Int = definedExternally /*32768 */; val IndentEnable :Int = definedExternally /*65536 */; val IndentDisable :Int = definedExternally /*131072 */; val IsEnabled :Int = definedExternally /*16777216 */; val IsVisible :Int = definedExternally /*33554432 */; val IsSorted :Int = definedExternally /*67108864 */; val IsHovered :Int = definedExternally /*134217728 */; val WidthMask_ :Int = definedExternally /*24 */; val IndentMask_ :Int = definedExternally /*196608 */; val StatusMask_ :Int = definedExternally /*251658240 */; val NoDirectResize_ :Int = definedExternally /*1073741824 */
    }

    object ImGuiTableRowFlags {
        val None :Int = definedExternally /*0 */; val Headers :Int = definedExternally /*1 */
    }

    object ImGuiTableBgTarget {
        val None :Int = definedExternally /*0 */; val RowBg0 :Int = definedExternally /*1 */; val RowBg1 :Int = definedExternally /*2 */; val CellBg :Int = definedExternally /*3 */
    }

    object ImGuiFocusedFlags {
        val None :Int = definedExternally /*0 */; val ChildWindows :Int = definedExternally /*1 */; val RootWindow :Int = definedExternally /*2 */; val AnyWindow :Int = definedExternally /*4 */; val NoPopupHierarchy :Int = definedExternally /*8 */; val RootAndChildWindows :Int = definedExternally /*3 */
    }

    object ImGuiHoveredFlags {
        val None :Int = definedExternally /*0 */; val ChildWindows :Int = definedExternally /*1 */; val RootWindow :Int = definedExternally /*2 */; val AnyWindow :Int = definedExternally /*4 */; val NoPopupHierarchy :Int = definedExternally /*8 */; val AllowWhenBlockedByPopup :Int = definedExternally /*32 */; val AllowWhenBlockedByActiveItem :Int = definedExternally /*128 */; val AllowWhenOverlapped :Int = definedExternally /*256 */; val AllowWhenDisabled :Int = definedExternally /*512 */; val RectOnly :Int = definedExternally /*416 */; val RootAndChildWindows :Int = definedExternally /*3 */
    }

    object ImGuiDragDropFlags {
        val None :Int = definedExternally /*0 */; val SourceNoPreviewTooltip :Int = definedExternally /*1 */; val SourceNoDisableHover :Int = definedExternally /*2 */; val SourceNoHoldToOpenOthers :Int = definedExternally /*4 */; val SourceAllowNullID :Int = definedExternally /*8 */; val SourceExtern :Int = definedExternally /*16 */; val SourceAutoExpirePayload :Int = definedExternally /*32 */; val AcceptBeforeDelivery :Int = definedExternally /*1024 */; val AcceptNoDrawDefaultRect :Int = definedExternally /*2048 */; val AcceptNoPreviewTooltip :Int = definedExternally /*4096 */; val AcceptPeekOnly :Int = definedExternally /*3072 */
    }

    var IMGUI_PAYLOAD_TYPE_COLOR_3F: String = definedExternally
    var IMGUI_PAYLOAD_TYPE_COLOR_4F: String = definedExternally

    object ImGuiDataType {
        val S8 :Int = definedExternally /*0 */; val U8 :Int = definedExternally /*1 */; val S16 :Int = definedExternally /*2 */; val U16 :Int = definedExternally /*3 */; val S32 :Int = definedExternally /*4 */; val U32 :Int = definedExternally /*5 */; val S64 :Int = definedExternally /*6 */; val U64 :Int = definedExternally /*7 */; val Float :Int = definedExternally /*8 */; val Double :Int = definedExternally /*9 */; val COUNT :Int = definedExternally /*10 */
    }

    object ImGuiDir {
        val None:Int = definedExternally /*-1 */; val Left :Int = definedExternally /*0 */; val Right :Int = definedExternally /*1 */; val Up :Int = definedExternally /*2 */; val Down :Int = definedExternally /*3 */; val COUNT :Int = definedExternally /*4 */
    }

    object ImGuiSortDirection {
        val None :Int = definedExternally /*0 */; val Ascending :Int = definedExternally /*1 */; val Descending :Int = definedExternally /*2 */
    }

    object ImGuiKey {
        val Tab :Int = definedExternally /*0 */; val LeftArrow :Int = definedExternally /*1 */; val RightArrow :Int = definedExternally /*2 */; val UpArrow :Int = definedExternally /*3 */; val DownArrow :Int = definedExternally /*4 */; val PageUp :Int = definedExternally /*5 */; val PageDown :Int = definedExternally /*6 */; val Home :Int = definedExternally /*7 */; val End :Int = definedExternally /*8 */; val Insert :Int = definedExternally /*9 */; val Delete :Int = definedExternally /*10 */; val Backspace :Int = definedExternally /*11 */; val Space :Int = definedExternally /*12 */; val Enter :Int = definedExternally /*13 */; val Escape :Int = definedExternally /*14 */; val KeyPadEnter :Int = definedExternally /*15 */; val A :Int = definedExternally /*16 */; val C :Int = definedExternally /*17 */; val V :Int = definedExternally /*18 */; val X :Int = definedExternally /*19 */; val Y :Int = definedExternally /*20 */; val Z :Int = definedExternally /*21 */; val COUNT :Int = definedExternally /*22 */
    }

    object ImGuiKeyModFlags {
        val None :Int = definedExternally /*0 */; val Ctrl :Int = definedExternally /*1 */; val Shift :Int = definedExternally /*2 */; val Alt :Int = definedExternally /*4 */; val Super :Int = definedExternally /*8 */
    }

    object ImGuiNavInput {
        val Activate :Int = definedExternally /*0 */; val Cancel :Int = definedExternally /*1 */; val Input :Int = definedExternally /*2 */; val Menu :Int = definedExternally /*3 */; val DpadLeft :Int = definedExternally /*4 */; val DpadRight :Int = definedExternally /*5 */; val DpadUp :Int = definedExternally /*6 */; val DpadDown :Int = definedExternally /*7 */; val LStickLeft :Int = definedExternally /*8 */; val LStickRight :Int = definedExternally /*9 */; val LStickUp :Int = definedExternally /*10 */; val LStickDown :Int = definedExternally /*11 */; val FocusPrev :Int = definedExternally /*12 */; val FocusNext :Int = definedExternally /*13 */; val TweakSlow :Int = definedExternally /*14 */; val TweakFast :Int = definedExternally /*15 */; val KeyLeft_ :Int = definedExternally /*16 */; val KeyRight_ :Int = definedExternally /*17 */; val KeyUp_ :Int = definedExternally /*18 */; val KeyDown_ :Int = definedExternally /*19 */; val COUNT :Int = definedExternally /*20 */; val InternalStart_ :Int = definedExternally /*16 */
    }

    object ImGuiConfigFlags {
        val None :Int = definedExternally /*0 */; val NavEnableKeyboard :Int = definedExternally /*1 */; val NavEnableGamepad :Int = definedExternally /*2 */; val NavEnableSetMousePos :Int = definedExternally /*4 */; val NavNoCaptureKeyboard :Int = definedExternally /*8 */; val NoMouse :Int = definedExternally /*16 */; val NoMouseCursorChange :Int = definedExternally /*32 */; val IsSRGB :Int = definedExternally /*1048576 */; val IsTouchScreen :Int = definedExternally /*2097152 */
    }

    object ImGuiCol {
        val Text :Int = definedExternally /*0 */; val TextDisabled :Int = definedExternally /*1 */; val WindowBg :Int = definedExternally /*2 */; val ChildBg :Int = definedExternally /*3 */; val PopupBg :Int = definedExternally /*4 */; val Border :Int = definedExternally /*5 */; val BorderShadow :Int = definedExternally /*6 */; val FrameBg :Int = definedExternally /*7 */; val FrameBgHovered :Int = definedExternally /*8 */; val FrameBgActive :Int = definedExternally /*9 */; val TitleBg :Int = definedExternally /*10 */; val TitleBgActive :Int = definedExternally /*11 */; val TitleBgCollapsed :Int = definedExternally /*12 */; val MenuBarBg :Int = definedExternally /*13 */; val ScrollbarBg :Int = definedExternally /*14 */; val ScrollbarGrab :Int = definedExternally /*15 */; val ScrollbarGrabHovered :Int = definedExternally /*16 */; val ScrollbarGrabActive :Int = definedExternally /*17 */; val CheckMark :Int = definedExternally /*18 */; val SliderGrab :Int = definedExternally /*19 */; val SliderGrabActive :Int = definedExternally /*20 */; val Button :Int = definedExternally /*21 */; val ButtonHovered :Int = definedExternally /*22 */; val ButtonActive :Int = definedExternally /*23 */; val Header :Int = definedExternally /*24 */; val HeaderHovered :Int = definedExternally /*25 */; val HeaderActive :Int = definedExternally /*26 */; val Separator :Int = definedExternally /*27 */; val SeparatorHovered :Int = definedExternally /*28 */; val SeparatorActive :Int = definedExternally /*29 */; val ResizeGrip :Int = definedExternally /*30 */; val ResizeGripHovered :Int = definedExternally /*31 */; val ResizeGripActive :Int = definedExternally /*32 */; val Tab :Int = definedExternally /*33 */; val TabHovered :Int = definedExternally /*34 */; val TabActive :Int = definedExternally /*35 */; val TabUnfocused :Int = definedExternally /*36 */; val TabUnfocusedActive :Int = definedExternally /*37 */; val PlotLines :Int = definedExternally /*38 */; val PlotLinesHovered :Int = definedExternally /*39 */; val PlotHistogram :Int = definedExternally /*40 */; val PlotHistogramHovered :Int = definedExternally /*41 */; val TableHeaderBg :Int = definedExternally /*42 */; val TableBorderStrong :Int = definedExternally /*43 */; val TableBorderLight :Int = definedExternally /*44 */; val TableRowBg :Int = definedExternally /*45 */; val TableRowBgAlt :Int = definedExternally /*46 */; val TextSelectedBg :Int = definedExternally /*47 */; val DragDropTarget :Int = definedExternally /*48 */; val NavHighlight :Int = definedExternally /*49 */; val NavWindowingHighlight :Int = definedExternally /*50 */; val NavWindowingDimBg :Int = definedExternally /*51 */; val ModalWindowDimBg :Int = definedExternally /*52 */; val COUNT :Int = definedExternally /*53 */
    }

    object ImGuiStyleVar {
        val Alpha :Int = definedExternally /*0 */; val DisabledAlpha :Int = definedExternally /*1 */; val WindowPadding :Int = definedExternally /*2 */; val WindowRounding :Int = definedExternally /*3 */; val WindowBorderSize :Int = definedExternally /*4 */; val WindowMinSize :Int = definedExternally /*5 */; val WindowTitleAlign :Int = definedExternally /*6 */; val ChildRounding :Int = definedExternally /*7 */; val ChildBorderSize :Int = definedExternally /*8 */; val PopupRounding :Int = definedExternally /*9 */; val PopupBorderSize :Int = definedExternally /*10 */; val FramePadding :Int = definedExternally /*11 */; val FrameRounding :Int = definedExternally /*12 */; val FrameBorderSize :Int = definedExternally /*13 */; val ItemSpacing :Int = definedExternally /*14 */; val ItemInnerSpacing :Int = definedExternally /*15 */; val IndentSpacing :Int = definedExternally /*16 */; val CellPadding :Int = definedExternally /*17 */; val ScrollbarSize :Int = definedExternally /*18 */; val ScrollbarRounding :Int = definedExternally /*19 */; val GrabMinSize :Int = definedExternally /*20 */; val GrabRounding :Int = definedExternally /*21 */; val TabRounding :Int = definedExternally /*22 */; val ButtonTextAlign :Int = definedExternally /*23 */; val SelectableTextAlign :Int = definedExternally /*24 */; val COUNT :Int = definedExternally /*25 */
    }

    object ImGuiBackendFlags {
        val None :Int = definedExternally /*0 */; val HasGamepad :Int = definedExternally /*1 */; val HasMouseCursors :Int = definedExternally /*2 */; val HasSetMousePos :Int = definedExternally /*4 */; val RendererHasVtxOffset :Int = definedExternally /*8 */
    }

    object ImGuiButtonFlags {
        val None :Int = definedExternally /*0 */; val MouseButtonLeft :Int = definedExternally /*1 */; val MouseButtonRight :Int = definedExternally /*2 */; val MouseButtonMiddle :Int = definedExternally /*4 */; val MouseButtonMask_ :Int = definedExternally /*7 */; val MouseButtonDefault_ :Int = definedExternally /*1 */
    }

    object ImGuiColorEditFlags {
        val None :Int = definedExternally /*0 */; val NoAlpha :Int = definedExternally /*2 */; val NoPicker :Int = definedExternally /*4 */; val NoOptions :Int = definedExternally /*8 */; val NoSmallPreview :Int = definedExternally /*16 */; val NoInputs :Int = definedExternally /*32 */; val NoTooltip :Int = definedExternally /*64 */; val NoLabel :Int = definedExternally /*128 */; val NoSidePreview :Int = definedExternally /*256 */; val NoDragDrop :Int = definedExternally /*512 */; val NoBorder :Int = definedExternally /*1024 */; val AlphaBar :Int = definedExternally /*65536 */; val AlphaPreview :Int = definedExternally /*131072 */; val AlphaPreviewHalf :Int = definedExternally /*262144 */; val HDR :Int = definedExternally /*524288 */; val DisplayRGB :Int = definedExternally /*1048576 */; val DisplayHSV :Int = definedExternally /*2097152 */; val DisplayHex :Int = definedExternally /*4194304 */; val Uint8 :Int = definedExternally /*8388608 */; val Float :Int = definedExternally /*16777216 */; val PickerHueBar :Int = definedExternally /*33554432 */; val PickerHueWheel :Int = definedExternally /*67108864 */; val InputRGB :Int = definedExternally /*134217728 */; val InputHSV :Int = definedExternally /*268435456 */; val DefaultOptions_ :Int = definedExternally /*177209344 */; val DisplayMask_ :Int = definedExternally /*7340032 */; val DataTypeMask_ :Int = definedExternally /*25165824 */; val PickerMask_ :Int = definedExternally /*100663296 */; val InputMask_ :Int = definedExternally /*402653184 */
    }

    object ImGuiSliderFlags {
        val None :Int = definedExternally /*0 */; val AlwaysClamp :Int = definedExternally /*16 */; val Logarithmic :Int = definedExternally /*32 */; val NoRoundToFormat :Int = definedExternally /*64 */; val NoInput :Int = definedExternally /*128 */; val InvalidMask_ :Int = definedExternally /*1879048207 */
    }

    object ImGuiMouseButton {
        val Left :Int = definedExternally /*0 */; val Right :Int = definedExternally /*1 */; val Middle :Int = definedExternally /*2 */; val COUNT :Int = definedExternally /*5 */
    }

    object ImGuiMouseCursor {
        val None :Int /*-1 */; val Arrow :Int = definedExternally /*0 */; val TextInput :Int = definedExternally /*1 */; val ResizeAll :Int = definedExternally /*2 */; val ResizeNS :Int = definedExternally /*3 */; val ResizeEW :Int = definedExternally /*4 */; val ResizeNESW :Int = definedExternally /*5 */; val ResizeNWSE :Int = definedExternally /*6 */; val Hand :Int = definedExternally /*7 */; val NotAllowed :Int = definedExternally /*8 */; val COUNT :Int = definedExternally /*9 */
    }

    object ImGuiCond {
        val None :Int = definedExternally /*0 */; val Always :Int = definedExternally /*1 */; val Once :Int = definedExternally /*2 */; val FirstUseEver :Int = definedExternally /*4 */; val Appearing :Int = definedExternally /*8 */
    }

    object ImDrawFlags {
        val None :Int = definedExternally /*0 */; val Closed :Int = definedExternally /*1 */; val RoundCornersTopLeft :Int = definedExternally /*16 */; val RoundCornersTopRight :Int = definedExternally /*32 */; val RoundCornersBottomLeft :Int = definedExternally /*64 */; val RoundCornersBottomRight :Int = definedExternally /*128 */; val RoundCornersNone :Int = definedExternally /*256 */; val RoundCornersTop :Int = definedExternally /*48 */; val RoundCornersBottom :Int = definedExternally /*192 */; val RoundCornersLeft :Int = definedExternally /*80 */; val RoundCornersRight :Int = definedExternally /*160 */; val RoundCornersAll :Int = definedExternally /*240 */; val RoundCornersDefault_ :Int = definedExternally /*240 */; val RoundCornersMask_ :Int = definedExternally /*496 */
    }

    object ImDrawListFlags {
        val None :Int = definedExternally /*0 */; val AntiAliasedLines :Int = definedExternally /*1 */; val AntiAliasedLinesUseTex :Int = definedExternally /*2 */; val AntiAliasedFill :Int = definedExternally /*4 */; val AllowVtxOffset :Int = definedExternally /*8 */
    }

    open class ImVec2(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) :
        interface_ImVec2 {
        override var x: Number = definedExternally
        override var y: Number = definedExternally
        override fun Set(x: Number, y: Number): ImVec2 /* this */ = definedExternally
        override fun Copy(other: Readonly<interface_ImVec2>): interface_ImVec2 = definedExternally
        override fun Equals(other: Readonly<interface_ImVec2>): Boolean = definedExternally
        open fun Copy(other: Any?): ImVec2 /* this */ = definedExternally
        open fun Equals(other: Any?): Boolean = definedExternally

        companion object {
            var ZERO: Any? = definedExternally
            var UNIT: Any? = definedExternally
            var UNIT_X: Any? = definedExternally
            var UNIT_Y: Any? = definedExternally
        }
    }

    open class ImVec4(
        x: Number? = definedExternally /* null */,
        y: Number? = definedExternally /* null */,
        z: Number? = definedExternally /* null */,
        w: Number? = definedExternally /* null */
    ) : interface_ImVec4 {
        override var x: Number = definedExternally
        override var y: Number = definedExternally
        override var z: Number = definedExternally
        override var w: Number = definedExternally
        override fun Set(x: Number, y: Number, z: Number, w: Number): ImVec4 /* this */ = definedExternally
        override fun Copy(other: Readonly<interface_ImVec4>): interface_ImVec4 = definedExternally
        override fun Equals(other: Readonly<interface_ImVec4>): Boolean = definedExternally
        open fun Copy(other: Any?): ImVec4 /* this */ = definedExternally
        open fun Equals(other: Any?): Boolean = definedExternally

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

    open class ImVector<T> /*: Array<T>*/ {
        open var Data: Array<T> = definedExternally
        open fun empty(): Boolean = definedExternally
        open fun clear(): Unit = definedExternally
        open fun pop_back(): T? = definedExternally
        open fun push_back(value: T): Unit = definedExternally
        open fun front(): T = definedExternally
        open fun back(): T = definedExternally
        open fun size(): Number = definedExternally
        open fun resize(new_size: Number, v: ((index: Number) -> T)? = definedExternally /* null */): Unit =
            definedExternally

        open fun contains(value: T): Boolean = definedExternally
        open fun find_erase_unsorted(value: T): Unit = definedExternally
    }

    var IM_UNICODE_CODEPOINT_MAX: Number = definedExternally

    open class ImGuiTextFilter(default_filter: String? = definedExternally /* null */) {
        open fun Draw(
            label: String? = definedExternally /* null */, width: Number? = definedExternally /* null */
        ): Boolean = definedExternally

        open fun PassFilter(text: String, text_end: Number? = definedExternally /* null */): Boolean = definedExternally
        open fun Build(): Unit = definedExternally
        open fun Clear(): Unit = definedExternally
        open fun IsActive(): Boolean = definedExternally
        open var InputBuf: ImStringBuffer = definedExternally
        open var CountGrep: Number = definedExternally
    }

    open class ImGuiTextBuffer {
        open var Buf: String = definedExternally
        open fun begin(): String = definedExternally
        open fun size(): Number = definedExternally
        open fun clear(): Unit = definedExternally
        open fun append(text: String): Unit = definedExternally
    }

    open class ImGuiStorage
    interface ImGuiPayload<T> {
        var Data: T
    }

    var IM_COL32_R_SHIFT: Number = definedExternally
    var IM_COL32_G_SHIFT: Number = definedExternally
    var IM_COL32_B_SHIFT: Number = definedExternally
    var IM_COL32_A_SHIFT: Number = definedExternally
    var IM_COL32_A_MASK: Number = definedExternally
    fun IM_COL32(R: Number, G: Number, B: Number, A: Number? = definedExternally /* null */): Number = definedExternally

    var IM_COL32_WHITE: Number = definedExternally
    var IM_COL32_BLACK: Number = definedExternally
    var IM_COL32_BLACK_TRANS: Number = definedExternally

    open class ImColor {
        constructor()
        constructor(r: Number, g: Number, b: Number)
        constructor(r: Number, g: Number, b: Number, a: Number)
        constructor(rgba: ImU32)
        constructor(col: Any?)

        open var Value: ImVec4 = definedExternally
        open fun toImU32(): ImU32 = definedExternally
        open fun toImVec4(): ImVec4 = definedExternally
        open fun SetHSV(h: Number, s: Number, v: Number, a: Number? = definedExternally /* null */): Unit =
            definedExternally

        companion object {
            fun HSV(h: Number, s: Number, v: Number, a: Number? = definedExternally /* null */): ImColor =
                definedExternally
        }
    }

    var ImGuiInputTextDefaultSize: Number = definedExternally

    open class ImGuiInputTextCallbackData<T>(
        native: reference_ImGuiInputTextCallbackData, UserData: T? = definedExternally /* null */
    ) : reference_ImGuiInputTextCallbackData {
        open var native: reference_ImGuiInputTextCallbackData = definedExternally
        override var EventFlag: com.hiperbou.imguijs.ImGuiInputTextFlags = definedExternally
        override var Flags: com.hiperbou.imguijs.ImGuiInputTextFlags = definedExternally
        override var UserData: Any/*T*/ = definedExternally
        override var EventChar: ImWchar = definedExternally
        override var EventKey: com.hiperbou.imguijs.ImGuiKey = definedExternally
        override var Buf: String = definedExternally
        override var BufTextLen: Number = definedExternally
        override var BufSize: Number = definedExternally
        override var BufDirty: Boolean = definedExternally
        override var CursorPos: Number = definedExternally
        override var SelectionStart: Number = definedExternally
        override var SelectionEnd: Number = definedExternally

        override fun DeleteChars(pos: Number, bytes_count: Number) = definedExternally
        override fun InsertChars(pos: Number, text: String) = definedExternally
        override fun SelectAll() = definedExternally
        override fun ClearSelection() = definedExternally
        override fun HasSelection(): Boolean = definedExternally

        open fun InsertChars(pos: Number, text: String, text_end: Number? = definedExternally /* null */): Unit =
            definedExternally

    }

    open class ImGuiSizeCallbackData<T>(native: reference_ImGuiSizeCallbackData, UserData: T) :
        reference_ImGuiSizeCallbackData {
        open var native: reference_ImGuiSizeCallbackData = definedExternally
        open var UserData: T = definedExternally
        override var Pos: Readonly<reference_ImVec2> = definedExternally
        override var CurrentSize: Readonly<reference_ImVec2> = definedExternally
        override var DesiredSize: reference_ImVec2 = definedExternally
    }

    open class ImGuiTableColumnSortSpecs(native: reference_ImGuiTableColumnSortSpecs) :
        reference_ImGuiTableColumnSortSpecs {
        open var native: reference_ImGuiTableColumnSortSpecs = definedExternally
        override var ColumnUserID: Number = definedExternally
        override var ColumnIndex: Number = definedExternally
        override var SortOrder: Number = definedExternally
        override var SortDirection: Number = definedExternally
    }

    open class ImGuiTableSortSpecs(native: reference_ImGuiTableSortSpecs) : reference_ImGuiTableSortSpecs {
        open var native: reference_ImGuiTableSortSpecs = definedExternally
        open var _Specs: Any = definedExternally
        override fun GetSpec(idx: Number): reference_ImGuiTableColumnSortSpecs = definedExternally

        override var SpecsCount: Number = definedExternally
        override var SpecsDirty: Boolean = definedExternally
    }

    open class ImGuiListClipper {
        open var _native: Any = definedExternally
        open fun delete(): Unit = definedExternally
        open fun Begin(items_count: Number, items_height: Number? = definedExternally /* null */): Unit =
            definedExternally

        open fun End(): Unit = definedExternally
        open fun Step(): Boolean = definedExternally
    }

    var IM_DRAWLIST_TEX_LINES_WIDTH_MAX: Number = definedExternally
    var ImDrawCallback_ResetRenderState: Any = definedExternally

    open class ImDrawCmd(native: reference_ImDrawCmd) : reference_ImDrawCmd {
        open var native: reference_ImDrawCmd = definedExternally
        open var UserCallback: ((parent_list: Any?, cmd: Any?) -> Unit)? = definedExternally
        open var UserCallbackData: Any = definedExternally
        override var ElemCount: Number = definedExternally
        override var ClipRect: Readonly<reference_ImVec4> = definedExternally
        override var TextureId: ImTextureID = definedExternally
        override var VtxOffset: Number = definedExternally
        override var IdxOffset: Number = definedExternally
    }

    var ImDrawIdxSize: Number = definedExternally
    var ImDrawVertSize: Number = definedExternally
    var ImDrawVertPosOffset: Number = definedExternally
    var ImDrawVertUVOffset: Number = definedExternally
    var ImDrawVertColOffset: Number = definedExternally

    open class ImDrawVert(buffer: ArrayBuffer, byteOffset: Number? = definedExternally /* null */) {
        open var pos: Float32Array = definedExternally
        open var uv: Float32Array = definedExternally
        open var col: Uint32Array = definedExternally
    }

    open class ImDrawCmdHeader
    open class ImDrawChannel
    open class ImDrawListSharedData(native: reference_ImDrawListSharedData) : reference_ImDrawListSharedData {
        open var native: reference_ImDrawListSharedData = definedExternally
    }

    open class ImDrawList(native: reference_ImDrawList) : reference_ImDrawList {
        open var native: reference_ImDrawList = definedExternally
        open fun IterateDrawCmds(callback: (draw_cmd: ImDrawCmd, ElemStart: Number) -> Unit): Unit = definedExternally
        open fun PushClipRect(
            clip_rect_min: Any?,
            clip_rect_max: Any?,
            intersect_with_current_clip_rect: Boolean? = definedExternally /* null */
        ): Unit = definedExternally

        open fun PushTextureID(texture_id: WebGLTexture): Unit = definedExternally
        open fun GetClipRectMin(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
            definedExternally

        open fun GetClipRectMax(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
            definedExternally

        open fun AddLine(a: Any?, b: Any?, col: ImU32, thickness: Number? = definedExternally /* null */): Unit =
            definedExternally

        open fun AddRect(
            a: Any?,
            b: Any?,
            col: ImU32,
            rounding: Number? = definedExternally /* null */,
            flags: com.hiperbou.imguijs.ImDrawFlags  /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */ = definedExternally /* null */,
            thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddRectFilled(
            a: Any?,
            b: Any?,
            col: ImU32,
            rounding: Number? = definedExternally /* null */,
            flags: com.hiperbou.imguijs.ImDrawFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */ = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddRectFilledMultiColor(
            a: Any?, b: Any?, col_upr_left: ImU32, col_upr_right: ImU32, col_bot_right: ImU32, col_bot_left: ImU32
        ): Unit = definedExternally

        open fun AddQuad(
            a: Any?, b: Any?, c: Any?, d: Any?, col: ImU32, thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddQuadFilled(a: Any?, b: Any?, c: Any?, d: Any?, col: ImU32): Unit = definedExternally
        open fun AddTriangle(
            a: Any?, b: Any?, c: Any?, col: ImU32, thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddTriangleFilled(a: Any?, b: Any?, c: Any?, col: ImU32): Unit = definedExternally
        open fun AddCircle(
            centre: Any?,
            radius: Number,
            col: ImU32,
            num_segments: Number? = definedExternally /* null */,
            thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddCircleFilled(
            centre: Any?, radius: Number, col: ImU32, num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddNgon(
            centre: Any?,
            radius: Number,
            col: ImU32,
            num_segments: Number,
            thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddNgonFilled(centre: Any?, radius: Number, col: ImU32, num_segments: Number): Unit = definedExternally
        open fun AddText(
            pos: Any?, col: ImU32, text_begin: String, text_end: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddText(
            font: ImFont,
            font_size: Number,
            pos: Any?,
            col: ImU32,
            text_begin: String,
            text_end: Number? = definedExternally /* null */,
            wrap_width: Number? = definedExternally /* null */,
            cpu_fine_clip_rect: Any? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddPolyline(
            points: Array<Any?>,
            num_points: Number,
            col: ImU32,
            flags: com.hiperbou.imguijs.ImDrawFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */,
            thickness: Number
        ): Unit = definedExternally

        open fun AddConvexPolyFilled(points: Array<Any?>, num_points: Number, col: ImU32): Unit = definedExternally
        open fun AddBezierCubic(
            p1: Any?,
            p2: Any?,
            p3: Any?,
            p4: Any?,
            col: ImU32,
            thickness: Number? = definedExternally /* null */,
            num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddBezierQuadratic(
            p1: Any?,
            p2: Any?,
            p3: Any?,
            col: ImU32,
            thickness: Number? = definedExternally /* null */,
            num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddImage(
            user_texture_id: WebGLTexture?,
            a: Any?,
            b: Any?,
            uv_a: Any? = definedExternally /* null */,
            uv_b: Any? = definedExternally /* null */,
            col: ImU32? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddImageQuad(
            user_texture_id: WebGLTexture?,
            a: Any?,
            b: Any?,
            c: Any?,
            d: Any?,
            uv_a: Any? = definedExternally /* null */,
            uv_b: Any? = definedExternally /* null */,
            uv_c: Any? = definedExternally /* null */,
            uv_d: Any? = definedExternally /* null */,
            col: ImU32? = definedExternally /* null */
        ): Unit = definedExternally

        open fun AddImageRounded(
            user_texture_id: WebGLTexture?,
            a: Any?,
            b: Any?,
            uv_a: Any?,
            uv_b: Any?,
            col: ImU32,
            rounding: Number,
            flags: com.hiperbou.imguijs.ImDrawFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */ = definedExternally /* null */
        ): Unit = definedExternally

        open fun PathLineTo(pos: Any?): Unit = definedExternally
        open fun PathLineToMergeDuplicate(pos: Any?): Unit = definedExternally
        open fun PathStroke(
            col: ImU32,
            flags: com.hiperbou.imguijs.ImDrawFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */,
            thickness: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun PathArcTo(
            centre: Any?,
            radius: Number,
            a_min: Number,
            a_max: Number,
            num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun PathArcToFast(centre: Any?, radius: Number, a_min_of_12: Number, a_max_of_12: Number): Unit =
            definedExternally

        open fun PathBezierCubicCurveTo(
            p2: Any?, p3: Any?, p4: Any?, num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun PathBezierQuadraticCurveTo(
            p2: Any?, p3: Any?, num_segments: Number? = definedExternally /* null */
        ): Unit = definedExternally

        open fun PathRect(
            rect_min: Any?,
            rect_max: Any?,
            rounding: Number? = definedExternally /* null */,
            flags: com.hiperbou.imguijs.ImDrawFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 48 */ | Number /* 192 */ | Number /* 80 */ | Number /* 160 */ | Number /* 240 */ | Number /* 496 */ */ = definedExternally /* null */
        ): Unit = definedExternally

        open fun PrimRect(a: Any?, b: Any?, col: ImU32): Unit = definedExternally
        open fun PrimRectUV(a: Any?, b: Any?, uv_a: Any?, uv_b: Any?, col: ImU32): Unit = definedExternally
        open fun PrimQuadUV(
            a: Any?, b: Any?, c: Any?, d: Any?, uv_a: Any?, uv_b: Any?, uv_c: Any?, uv_d: Any?, col: ImU32
        ): Unit = definedExternally

        open fun PrimWriteVtx(pos: Any?, uv: Any?, col: ImU32): Unit = definedExternally
        open fun PrimVtx(pos: Any?, uv: Any?, col: ImU32): Unit = definedExternally
        override fun IterateDrawCmds(callback: (draw_cmd: reference_ImDrawCmd, ElemStart: Number) -> Unit) =
            definedExternally

        override var IdxBuffer: Uint8Array = definedExternally
        override var VtxBuffer: Uint8Array = definedExternally
        override var Flags: com.hiperbou.imguijs.ImDrawListFlags = definedExternally

        override fun PushClipRect(
            clip_rect_min: Readonly<interface_ImVec2>,
            clip_rect_max: Readonly<interface_ImVec2>,
            intersect_with_current_clip_rect: Boolean
        ) = definedExternally

        override fun PushClipRectFullScreen() = definedExternally

        override fun PopClipRect() = definedExternally

        override fun PushTextureID(texture_id: ImTextureID) = definedExternally

        override fun PopTextureID() = definedExternally

        override fun GetClipRectMin(out: interface_ImVec2): Any = definedExternally

        override fun GetClipRectMax(out: interface_ImVec2): Any = definedExternally

        override fun AddLine(
            a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32, thickness: Number
        ) = definedExternally

        override fun AddRect(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            col: ImU32,
            rounding: Number,
            rounding_corners_flags: com.hiperbou.imguijs.ImDrawFlags,
            thickness: Number
        ) = definedExternally

        override fun AddRectFilled(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            col: ImU32,
            rounding: Number,
            rounding_corners_flags: com.hiperbou.imguijs.ImDrawFlags
        ) = definedExternally

        override fun AddRectFilledMultiColor(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            col_upr_left: ImU32,
            col_upr_right: ImU32,
            col_bot_right: ImU32,
            col_bot_left: ImU32
        ) = definedExternally

        override fun AddQuad(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            c: Readonly<interface_ImVec2>,
            d: Readonly<interface_ImVec2>,
            col: ImU32,
            thickness: Number
        ) = definedExternally

        override fun AddQuadFilled(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            c: Readonly<interface_ImVec2>,
            d: Readonly<interface_ImVec2>,
            col: ImU32
        ) = definedExternally

        override fun AddTriangle(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            c: Readonly<interface_ImVec2>,
            col: ImU32,
            thickness: Number
        ) = definedExternally

        override fun AddTriangleFilled(
            a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, col: ImU32
        ) = definedExternally

        override fun AddCircle(
            centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number, thickness: Number
        ) = definedExternally

        override fun AddCircleFilled(
            centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number
        ) = definedExternally

        override fun AddNgon(
            centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number, thickness: Number
        ) = definedExternally

        override fun AddNgonFilled(
            centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number
        ) = definedExternally

        override fun AddText_A(pos: Readonly<interface_ImVec2>, col: ImU32, text_begin: String) = definedExternally

        override fun AddText_B(
            font: reference_ImFont,
            font_size: Number,
            pos: Readonly<interface_ImVec2>,
            col: ImU32,
            text_begin: String,
            wrap_width: Number,
            cpu_fine_clip_rect: Readonly<interface_ImVec4>?
        ) = definedExternally

        override fun AddImage(
            user_texture_id: ImTextureID,
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            uv_a: Readonly<interface_ImVec2>,
            uv_b: Readonly<interface_ImVec2>,
            col: ImU32
        ) = definedExternally

        override fun AddImageQuad(
            user_texture_id: ImTextureID,
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            c: Readonly<interface_ImVec2>,
            d: Readonly<interface_ImVec2>,
            uv_a: Readonly<interface_ImVec2>,
            uv_b: Readonly<interface_ImVec2>,
            uv_c: Readonly<interface_ImVec2>,
            uv_d: Readonly<interface_ImVec2>,
            col: ImU32
        ) = definedExternally

        override fun AddImageRounded(
            user_texture_id: ImTextureID,
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            uv_a: Readonly<interface_ImVec2>,
            uv_b: Readonly<interface_ImVec2>,
            col: ImU32,
            rounding: Number,
            flags: com.hiperbou.imguijs.ImDrawFlags
        ) = definedExternally

        override fun AddPolyline(
            points: Array<Readonly<interface_ImVec2>>,
            num_points: Number,
            col: ImU32,
            flags: com.hiperbou.imguijs.ImDrawFlags,
            thickness: Number
        ) = definedExternally

        override fun AddConvexPolyFilled(points: Array<Readonly<interface_ImVec2>>, num_points: Number, col: ImU32) =
            definedExternally

        override fun AddBezierCubic(
            pos0: Readonly<interface_ImVec2>,
            cp0: Readonly<interface_ImVec2>,
            cp1: Readonly<interface_ImVec2>,
            pos1: Readonly<interface_ImVec2>,
            col: ImU32,
            thickness: Number,
            num_segments: Number
        ) = definedExternally

        override fun AddBezierQuadratic(
            pos0: Readonly<interface_ImVec2>,
            cp0: Readonly<interface_ImVec2>,
            cp1: Readonly<interface_ImVec2>,
            col: ImU32,
            thickness: Number,
            num_segments: Number
        ) = definedExternally

        override fun PathClear() = definedExternally

        override fun PathLineTo(pos: Readonly<interface_ImVec2>) = definedExternally

        override fun PathLineToMergeDuplicate(pos: Readonly<interface_ImVec2>) = definedExternally

        override fun PathFillConvex(col: ImU32) = definedExternally

        override fun PathStroke(col: ImU32, flags: com.hiperbou.imguijs.ImDrawFlags, thickness: Number) =
            definedExternally

        override fun PathArcTo(
            centre: Readonly<interface_ImVec2>, radius: Number, a_min: Number, a_max: Number, num_segments: Number
        ) = definedExternally

        override fun PathArcToFast(
            centre: Readonly<interface_ImVec2>, radius: Number, a_min_of_12: Number, a_max_of_12: Number
        ) = definedExternally

        override fun PathBezierCubicCurveTo(
            p1: Readonly<interface_ImVec2>,
            p2: Readonly<interface_ImVec2>,
            p3: Readonly<interface_ImVec2>,
            num_segments: Number
        ) = definedExternally

        override fun PathBezierQuadraticCurveTo(
            p2: Readonly<interface_ImVec2>, p3: Readonly<interface_ImVec2>, num_segments: Number
        ) = definedExternally

        override fun PathRect(
            rect_min: Readonly<interface_ImVec2>,
            rect_max: Readonly<interface_ImVec2>,
            rounding: Number,
            flags: com.hiperbou.imguijs.ImDrawFlags
        ) = definedExternally

        override fun ChannelsSplit(channels_count: Number) = definedExternally

        override fun ChannelsMerge() = definedExternally

        override fun ChannelsSetCurrent(channel_index: Number) = definedExternally

        override fun AddCallback(callback: ImDrawCallback, callback_data: Any) = definedExternally

        override fun AddDrawCmd() = definedExternally

        override fun Clear() = definedExternally

        override fun ClearFreeMemory() = definedExternally

        override fun PrimReserve(idx_count: Number, vtx_count: Number) = definedExternally

        override fun PrimUnreserve(idx_count: Number, vtx_count: Number) = definedExternally

        override fun PrimRect(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32) =
            definedExternally

        override fun PrimRectUV(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            uv_a: Readonly<interface_ImVec2>,
            uv_b: Readonly<interface_ImVec2>,
            col: ImU32
        ) = definedExternally

        override fun PrimQuadUV(
            a: Readonly<interface_ImVec2>,
            b: Readonly<interface_ImVec2>,
            c: Readonly<interface_ImVec2>,
            d: Readonly<interface_ImVec2>,
            uv_a: Readonly<interface_ImVec2>,
            uv_b: Readonly<interface_ImVec2>,
            uv_c: Readonly<interface_ImVec2>,
            uv_d: Readonly<interface_ImVec2>,
            col: ImU32
        ) = definedExternally

        override fun PrimWriteVtx(pos: Readonly<interface_ImVec2>, us: Readonly<interface_ImVec2>, col: ImU32) =
            definedExternally

        override fun PrimWriteIdx(idx: Number) = definedExternally

        override fun PrimVtx(pos: Readonly<interface_ImVec2>, uv: Readonly<interface_ImVec2>, col: ImU32) =
            definedExternally

        override fun UpdateClipRect() = definedExternally

        override fun UpdateTextureID() = definedExternally

        override fun _CalcCircleAutoSegmentCount(radius: Number): Number = definedExternally
    }

    open class ImDrawData(native: reference_ImDrawData) : reference_ImDrawData {
        open var native: reference_ImDrawData = definedExternally
        open fun IterateDrawLists(callback: (draw_list: ImDrawList) -> Unit): Unit = definedExternally
        open fun ScaleClipRects(fb_scale: Any?): Unit = definedExternally
        override fun IterateDrawLists(callback: (draw_list: reference_ImDrawList) -> Unit) = definedExternally
        override var Valid: Boolean = definedExternally
        override var CmdListsCount: Number = definedExternally
        override var TotalVtxCount: Number = definedExternally
        override var TotalIdxCount: Number = definedExternally
        override var DisplayPos: Readonly<reference_ImVec2> = definedExternally
        override var DisplaySize: Readonly<reference_ImVec2> = definedExternally
        override var FramebufferScale: Readonly<reference_ImVec2> = definedExternally
        override fun DeIndexAllBuffers() = definedExternally
        override fun ScaleClipRects(fb_scale: Readonly<interface_ImVec2>) = definedExternally
    }

    open class script_ImFontConfig : interface_ImFontConfig {
        override var FontData: DataView? = definedExternally
        override var FontDataOwnedByAtlas: Boolean = definedExternally
        override var FontNo: Number = definedExternally
        override var SizePixels: Number = definedExternally
        override var OversampleH: Number = definedExternally
        override var OversampleV: Number = definedExternally
        override var PixelSnapH: Boolean = definedExternally
        override var GlyphExtraSpacing: ImVec2 = definedExternally
        override var GlyphOffset: ImVec2 = definedExternally
        override var GlyphRanges: Number? = definedExternally
        override var GlyphMinAdvanceX: Number = definedExternally
        override var GlyphMaxAdvanceX: Number = definedExternally
        override var MergeMode: Boolean = definedExternally
        override var FontBuilderFlags: Number = definedExternally
        override var RasterizerMultiply: Number = definedExternally
        open var EllipsisChar: Number = definedExternally
        open var DotChar: Number = definedExternally
        override var Name: String = definedExternally
        override var DstFont: reference_ImFont? = definedExternally
    }

    open class ImFontConfig(internal: interface_ImFontConfig? = definedExternally /* null */) : interface_ImFontConfig {
        open var internal: interface_ImFontConfig = definedExternally
        override var FontData: DataView? = definedExternally
        override var FontDataOwnedByAtlas: Boolean = definedExternally
        override var FontNo: Number = definedExternally
        override var SizePixels: Number = definedExternally
        override var OversampleH: Number = definedExternally
        override var OversampleV: Number = definedExternally
        override var PixelSnapH: Boolean = definedExternally
        override var GlyphExtraSpacing: ImVec2 = definedExternally
        override var GlyphOffset: ImVec2 = definedExternally
        override var GlyphRanges: Number? = definedExternally
        override var GlyphMinAdvanceX: Number = definedExternally
        override var GlyphMaxAdvanceX: Number = definedExternally
        override var MergeMode: Boolean = definedExternally
        override var FontBuilderFlags: Number = definedExternally
        override var RasterizerMultiply: Number = definedExternally
        override var Name: String = definedExternally
        override var DstFont: reference_ImFont? = definedExternally
    }

    open class script_ImFontGlyph : interface_ImFontGlyph {
        override var Colored: Boolean = definedExternally
        override var Visible: Boolean = definedExternally
        override var Codepoint: Number = definedExternally
        override var AdvanceX: Number = definedExternally
        override var X0: Number = definedExternally
        override var Y0: Number = definedExternally
        override var X1: Number = definedExternally
        override var Y1: Number = definedExternally
        override var U0: Number = definedExternally
        override var V0: Number = definedExternally
        override var U1: Number = definedExternally
        override var V1: Number = definedExternally
    }

    open class ImFontGlyph(internal: interface_ImFontGlyph? = definedExternally /* null */) : interface_ImFontGlyph {
        open var internal: interface_ImFontGlyph = definedExternally
        override var Colored: Boolean
        override var Visible: Boolean
        override var Codepoint: Number
        override var AdvanceX: Number
        override var X0: Number
        override var Y0: Number
        override var X1: Number
        override var Y1: Number
        override var U0: Number
        override var V0: Number
        override var U1: Number
        override var V1: Number
    }

    open class ImFontAtlasCustomRect
    object ImFontAtlasFlags {
        val None :Int = definedExternally /*0 */; val NoPowerOfTwoHeight :Int = definedExternally /*1 */; val NoMouseCursors :Int = definedExternally /*2 */; val NoBakedLines :Int = definedExternally /*4 */
    }

    interface `T$0` {
        var pixels: Uint8ClampedArray
        var width: Number
        var height: Number
        var bytes_per_pixel: Number
    }

    open class ImFontAtlas(native: reference_ImFontAtlas) : reference_ImFontAtlas {
        open var native: reference_ImFontAtlas = definedExternally

        open fun AddFontFromMemoryTTF(
            data: ArrayBuffer,
            size_pixels: Number,
            font_cfg: ImFontConfig? = definedExternally /* null */,
            glyph_ranges: Number? = definedExternally /* null */
        ): ImFont = definedExternally

        open fun SetTexID(id: WebGLTexture?): Unit = definedExternally
        override fun AddFontDefault(font_cfg: interface_ImFontConfig?): reference_ImFont = definedExternally

        override fun AddFontFromMemoryTTF(
            data: Uint8Array, size_pixels: Number, font_cfg: interface_ImFontConfig?, glyph_ranges: Number?
        ): reference_ImFont = definedExternally

        override fun ClearTexData() = definedExternally

        override fun ClearInputData() = definedExternally

        override fun ClearFonts() = definedExternally

        override fun Clear() = definedExternally

        override fun Build(): Boolean = definedExternally

        override fun IsBuilt(): Boolean = definedExternally

        override fun GetTexDataAsAlpha8(): com.hiperbou.imguijs.ImGui_Bind.`T$0` = definedExternally

        override fun GetTexDataAsRGBA32(): com.hiperbou.imguijs.ImGui_Bind.`T$0` = definedExternally

        override fun GetGlyphRangesDefault(): Number = definedExternally

        override fun GetGlyphRangesKorean(): Number = definedExternally

        override fun GetGlyphRangesJapanese(): Number = definedExternally

        override fun GetGlyphRangesChineseFull(): Number = definedExternally

        override fun GetGlyphRangesChineseSimplifiedCommon(): Number = definedExternally

        override fun GetGlyphRangesCyrillic(): Number = definedExternally

        override fun GetGlyphRangesThai(): Number = definedExternally

        override fun GetGlyphRangesVietnamese(): Number = definedExternally

        override var Locked: Boolean = definedExternally
        override var Flags: com.hiperbou.imguijs.ImFontAtlasFlags = definedExternally
        override var TexID: ImTextureID = definedExternally
        override var TexDesiredWidth: Number = definedExternally
        override var TexGlyphPadding: Number = definedExternally
        override var TexWidth: Number = definedExternally
        override var TexHeight: Number = definedExternally
        override var TexUvScale: Readonly<reference_ImVec2> = definedExternally
        override var TexUvWhitePixel: Readonly<reference_ImVec2> = definedExternally

        override fun IterateFonts(callback: (font: reference_ImFont) -> Unit) = definedExternally
    }

    open class ImFont(native: reference_ImFont) : reference_ImFont {
        open var native: reference_ImFont = definedExternally

        open fun CalcTextSizeA(
            size: Number,
            max_width: Number,
            wrap_width: Number,
            text_begin: String,
            text_end: Number? = definedExternally /* null */,
            remaining: ImScalar<Number>? = definedExternally /* null */
        ): interface_ImVec2 = definedExternally

        open fun CalcWordWrapPositionA(scale: Number, text: String, text_end: Number?, wrap_width: Number): Number =
            definedExternally

        open fun RenderChar(draw_list: ImDrawList, size: Number, pos: Any?, col: ImU32, c: ImWchar): Unit =
            definedExternally

        open fun RenderText(
            draw_list: ImDrawList,
            size: Number,
            pos: Any?,
            col: ImU32,
            clip_rect: Any?,
            text_begin: String,
            text_end: Number? = definedExternally /* null */,
            wrap_width: Number? = definedExternally /* null */,
            cpu_fine_clip: Boolean? = definedExternally /* null */
        ): Unit = definedExternally

        open fun IsGlyphRangeUnused(c_begin: Number, c_last: Number): Boolean = definedExternally
        override var FontSize: Number = definedExternally
        override var Scale: Number = definedExternally
        override var DisplayOffset: reference_ImVec2 = definedExternally

        override fun IterateGlyphs(callback: (cfg: reference_ImFontGlyph) -> Unit) = definedExternally

        override var FallbackGlyph: Readonly<reference_ImFontGlyph>? = definedExternally
        override var FallbackAdvanceX: Number = definedExternally
        override var FallbackChar: Number = definedExternally
        override var EllipsisChar: Number = definedExternally
        override var DotChar: Number = definedExternally
        override var ConfigDataCount: Number = definedExternally

        override fun IterateConfigData(callback: (cfg: interface_ImFontConfig) -> Unit) = definedExternally

        override var Ascent: Number = definedExternally
        override var Descent: Number = definedExternally
        override var MetricsTotalSurface: Number = definedExternally

        override fun ClearOutputData() = definedExternally

        override fun BuildLookupTable() = definedExternally

        override fun FindGlyph(c: Number): Readonly<reference_ImFontGlyph>? = definedExternally

        override fun FindGlyphNoFallback(c: Number): Readonly<reference_ImFontGlyph>? = definedExternally

        override fun GetCharAdvance(c: Number): Number = definedExternally

        override fun IsLoaded(): Boolean = definedExternally

        override fun GetDebugName(): String = definedExternally

        override fun CalcTextSizeA(
            size: Number,
            max_width: Number,
            wrap_width: Number,
            text_begin: String,
            remaining: Any,
            out: interface_ImVec2
        ): interface_ImVec2 = definedExternally

        override fun CalcWordWrapPositionA(scale: Number, text: String, wrap_width: Number): Number = definedExternally

        override fun RenderChar(
            draw_list: reference_ImDrawList, size: Number, pos: Readonly<interface_ImVec2>, col: ImU32, c: ImWchar
        ) = definedExternally
    }

    object ImGuiViewportFlags {
        val None :Int = definedExternally /*0 */; val IsPlatformWindow :Int = definedExternally /*1 */; val IsPlatformMonitor :Int = definedExternally /*2 */; val OwnedByApp :Int = definedExternally /*4 */
    }

    open class ImGuiViewport(native: reference_ImGuiViewport) : reference_ImGuiViewport {
        open var native: reference_ImGuiViewport = definedExternally
        open fun GetCenter(): ImVec2 = definedExternally
        open fun GetWorkCenter(): ImVec2 = definedExternally
        override var Flags: com.hiperbou.imguijs.ImGuiViewportFlags = definedExternally
        override var Pos: interface_ImVec2 = definedExternally
        override var Size: interface_ImVec2 = definedExternally
        override var WorkPos: interface_ImVec2 = definedExternally
        override var WorkSize: interface_ImVec2 = definedExternally
    }

    open class ImGuiStyle(internal: interface_ImGuiStyle? = definedExternally /* null */) : interface_ImGuiStyle {
        open var internal: interface_ImGuiStyle = definedExternally
        open var Colors: Array<interface_ImVec4> = definedExternally
        open fun Copy(other: Any?): ImGuiStyle /* this */ = definedExternally
        override var Alpha: Number = definedExternally
        override var DisabledAlpha: Number = definedExternally
        override var WindowPadding: reference_ImVec2 = definedExternally
        override var WindowRounding: Number = definedExternally
        override var WindowBorderSize: Number = definedExternally
        override var WindowMinSize: reference_ImVec2 = definedExternally
        override var WindowTitleAlign: reference_ImVec2 = definedExternally
        override var WindowMenuButtonPosition: com.hiperbou.imguijs.ImGuiDir = definedExternally
        override var ChildRounding: Number = definedExternally
        override var ChildBorderSize: Number = definedExternally
        override var PopupRounding: Number = definedExternally
        override var PopupBorderSize: Number = definedExternally
        override var FramePadding: reference_ImVec2 = definedExternally
        override var FrameRounding: Number = definedExternally
        override var FrameBorderSize: Number = definedExternally
        override var ItemSpacing: reference_ImVec2 = definedExternally
        override var ItemInnerSpacing: reference_ImVec2 = definedExternally
        override var TouchExtraPadding: reference_ImVec2 = definedExternally
        override var CellPadding: reference_ImVec2 = definedExternally
        override var IndentSpacing: Number = definedExternally
        override var ColumnsMinSpacing: Number = definedExternally
        override var ScrollbarSize: Number = definedExternally
        override var ScrollbarRounding: Number = definedExternally
        override var GrabMinSize: Number = definedExternally
        override var GrabRounding: Number = definedExternally
        override var LogSliderDeadzone: Number = definedExternally
        override var TabRounding: Number = definedExternally
        override var TabBorderSize: Number = definedExternally
        override var TabMinWidthForCloseButton: Number = definedExternally
        override var ColorButtonPosition: Number = definedExternally
        override var ButtonTextAlign: reference_ImVec2 = definedExternally
        override var SelectableTextAlign: reference_ImVec2 = definedExternally
        override var DisplayWindowPadding: reference_ImVec2 = definedExternally
        override var DisplaySafeAreaPadding: reference_ImVec2 = definedExternally
        override var MouseCursorScale: Number = definedExternally
        override var AntiAliasedLines: Boolean = definedExternally
        override var AntiAliasedLinesUseTex: Boolean = definedExternally
        override var AntiAliasedFill: Boolean = definedExternally
        override var CurveTessellationTol: Number = definedExternally
        override var CircleTessellationMaxError: Number = definedExternally
        override fun _getAt_Colors(idx: Number): interface_ImVec4 = definedExternally
        override fun _setAt_Colors(idx: Number, value: Readonly<interface_ImVec4>): Boolean = definedExternally
        override fun ScaleAllSizes(scale_factor: Number): Unit = definedExternally
    }

    open class ImGuiIO(native: reference_ImGuiIO) : reference_ImGuiIO {
        open var native: reference_ImGuiIO = definedExternally
        open var KeyMap: Array<Number> = definedExternally
        open var MouseDown: Array<Boolean> = definedExternally
        open var KeysDown: Array<Boolean> = definedExternally
        open var NavInputs: Array<Number> = definedExternally

        //open fun AddInputCharacter(c: Number): Unit = definedExternally
        //open fun AddInputCharacterUTF16(c: Number): Unit = definedExternally
        //open fun AddInputCharactersUTF8(utf8_chars: String): Unit = definedExternally
        //open fun ClearInputCharacters(): Unit = definedExternally
        open var MouseClickedPos: Array<Any?> = definedExternally
        open var MouseDownDuration: Array<Number> = definedExternally
        open var KeysDownDuration: Array<Number> = definedExternally
        open var NavInputsDownDuration: Array<Number> = definedExternally
        override var ConfigFlags: com.hiperbou.imguijs.ImGuiConfigFlags = definedExternally
        override var BackendFlags: com.hiperbou.imguijs.ImGuiBackendFlags = definedExternally
        override var DisplaySize: reference_ImVec2 = definedExternally
        override var DeltaTime: Number = definedExternally
        override var IniSavingRate: Number = definedExternally
        override var IniFilename: String = definedExternally
        override var LogFilename: String = definedExternally
        override var MouseDoubleClickTime: Number = definedExternally
        override var MouseDoubleClickMaxDist: Number = definedExternally
        override var MouseDragThreshold: Number = definedExternally

        override fun _getAt_KeyMap(index: com.hiperbou.imguijs.ImGuiKey): Number = definedExternally
        override fun _setAt_KeyMap(index: com.hiperbou.imguijs.ImGuiKey, value: Number): Boolean = definedExternally
        override var KeyRepeatDelay: Number = definedExternally
        override var KeyRepeatRate: Number = definedExternally
        override var UserData: Any = definedExternally
        override var Fonts: reference_ImFontAtlas = definedExternally
        override var FontGlobalScale: Number = definedExternally
        override var FontAllowUserScaling: Boolean = definedExternally
        override var FontDefault: reference_ImFont? = definedExternally
        override var DisplayFramebufferScale: reference_ImVec2 = definedExternally
        override var MouseDrawCursor: Boolean = definedExternally
        override var ConfigMacOSXBehaviors: Boolean = definedExternally
        override var ConfigInputTextCursorBlink: Boolean = definedExternally
        override var ConfigDragClickToInputText: Boolean = definedExternally
        override var ConfigWindowsResizeFromEdges: Boolean = definedExternally
        override var ConfigWindowsMoveFromTitleBarOnly: Boolean = definedExternally
        override var ConfigMemoryCompactTimer: Number = definedExternally
        override var BackendPlatformName: String? = definedExternally
        override var BackendRendererName: String? = definedExternally
        override var BackendPlatformUserData: String? = definedExternally
        override var BackendRendererUserData: String? = definedExternally
        override var BackendLanguageUserData: String? = definedExternally
        override var GetClipboardTextFn: ((user_data: Any) -> String)? = definedExternally
        override var SetClipboardTextFn: ((user_data: Any, text: String) -> Unit)? = definedExternally
        override var ClipboardUserData: Any = definedExternally
        override var MousePos: reference_ImVec2 = definedExternally

        override fun _getAt_MouseDown(index: Number): Boolean = definedExternally
        override fun _setAt_MouseDown(index: Number, value: Boolean): Boolean = definedExternally
        override var MouseWheel: Number = definedExternally
        override var MouseWheelH: Number = definedExternally
        override var KeyCtrl: Boolean = definedExternally
        override var KeyShift: Boolean = definedExternally
        override var KeyAlt: Boolean = definedExternally
        override var KeySuper: Boolean = definedExternally

        override fun _getAt_KeysDown(index: Number): Boolean = definedExternally
        override fun _setAt_KeysDown(index: Number, value: Boolean): Boolean = definedExternally
        override fun _getAt_NavInputs(index: Number): Number = definedExternally
        override fun _setAt_NavInputs(index: Number, value: Number): Boolean = definedExternally
        override fun AddInputCharacter(c: Number) = definedExternally
        override fun AddInputCharacterUTF16(c: ImWchar16) = definedExternally
        override fun AddInputCharactersUTF8(utf8_chars: String) = definedExternally
        override fun ClearInputCharacters() = definedExternally
        override var WantCaptureMouse: Boolean = definedExternally
        override var WantCaptureKeyboard: Boolean = definedExternally
        override var WantTextInput: Boolean = definedExternally
        override var WantSetMousePos: Boolean = definedExternally
        override var WantSaveIniSettings: Boolean = definedExternally
        override var NavActive: Boolean = definedExternally
        override var NavVisible: Boolean = definedExternally
        override var Framerate: Double = definedExternally
        override var MetricsRenderVertices: Number = definedExternally
        override var MetricsRenderIndices: Number = definedExternally
        override var MetricsRenderWindows: Number = definedExternally
        override var MetricsActiveWindows: Number = definedExternally
        override var MetricsActiveAllocations: Number = definedExternally
        override var MouseDelta: Readonly<reference_ImVec2> = definedExternally
        override var WantCaptureMouseUnlessPopupClose: Boolean = definedExternally

        override fun _getAt_MouseClickedPos(index: Number): Readonly<reference_ImVec2> = definedExternally
        override fun _getAt_MouseDownDuration(index: Number): Number = definedExternally
        override fun _getAt_KeysDownDuration(index: Number): Number = definedExternally
        override fun _getAt_NavInputsDownDuration(index: Number): Number = definedExternally
    }

    open class ImGuiContext(native: WrapImGuiContext) : WrapImGuiContext {
        open var native: WrapImGuiContext = definedExternally
        open var _getTexture: Any = definedExternally
        open var _setTexture: Any = definedExternally

        companion object {
            var current_ctx: ImGuiContext? = definedExternally
            fun getTexture(index: Number): WebGLTexture? = definedExternally
            fun setTexture(texture: WebGLTexture?): Number = definedExternally
            var textures: Any = definedExternally
        }
    }

    fun CreateContext(shared_font_atlas: ImFontAtlas? = definedExternally /* null */): ImGuiContext? = definedExternally

    fun DestroyContext(ctx: ImGuiContext? = definedExternally /* null */): Unit = definedExternally
    fun GetCurrentContext(): ImGuiContext? = definedExternally
    fun SetCurrentContext(ctx: ImGuiContext?): Unit = definedExternally
    fun GetIO(): ImGuiIO = definedExternally
    fun GetStyle(): ImGuiStyle = definedExternally
    fun NewFrame(): Unit = definedExternally
    fun EndFrame(): Unit = definedExternally
    fun Render(): Unit = definedExternally
    fun GetDrawData(): ImDrawData? = definedExternally
    fun ShowDemoWindow(p_open: ImScalar<Boolean>? = definedExternally /* null */): Unit = definedExternally
    fun ShowMetricsWindow(p_open: ImScalar<Boolean>? = definedExternally /* null */): Unit = definedExternally
    fun ShowMetricsWindow(p_open: ImAccess<Boolean>? = definedExternally /* null */): Unit = definedExternally
    fun ShowMetricsWindow(p_open: Nothing? = definedExternally /* null */): Unit = definedExternally
    fun ShowStackToolWindow(p_open: ImScalar<Boolean>? = definedExternally /* null */): Unit = definedExternally

    fun ShowStackToolWindow(p_open: ImAccess<Boolean>? = definedExternally /* null */): Unit = definedExternally

    fun ShowStackToolWindow(p_open: Nothing? = definedExternally /* null */): Unit = definedExternally
    fun ShowAboutWindow(p_open: ImScalar<Boolean>? = definedExternally /* null */): Unit = definedExternally
    fun ShowAboutWindow(p_open: ImAccess<Boolean>? = definedExternally /* null */): Unit = definedExternally
    fun ShowAboutWindow(p_open: Nothing? = definedExternally /* null */): Unit = definedExternally
    fun ShowStyleEditor(ref: ImGuiStyle? = definedExternally /* null */): Unit = definedExternally
    fun ShowStyleSelector(label: String): Boolean = definedExternally
    fun ShowFontSelector(label: String): Unit = definedExternally
    fun ShowUserGuide(): Unit = definedExternally
    fun GetVersion(): String = definedExternally
    fun StyleColorsDark(dst: ImGuiStyle? = definedExternally /* null */): Unit = definedExternally
    fun StyleColorsLight(dst: ImGuiStyle? = definedExternally /* null */): Unit = definedExternally
    fun StyleColorsClassic(dst: ImGuiStyle? = definedExternally /* null */): Unit = definedExternally
    fun Begin(
        name: String,
        open: ImScalar<Boolean>? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiWindowFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun Begin(
        name: String,
        open: ImAccess<Boolean>? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiWindowFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun Begin(
        name: String,
        open: Nothing? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiWindowFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun End(): Unit = definedExternally
    fun BeginChild(
        id: String,
        size: Any? = definedExternally /* null */,
        border: Boolean? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiWindowFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginChild(
        id: ImGuiID,
        size: Any? = definedExternally /* null */,
        border: Boolean? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiWindowFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndChild(): Unit = definedExternally
    fun IsWindowAppearing(): Boolean = definedExternally
    fun IsWindowCollapsed(): Boolean = definedExternally
    fun IsWindowFocused(flags: com.hiperbou.imguijs.ImGuiFocusedFlags? /* 0 */ = definedExternally /* null */): Boolean = definedExternally
    //fun IsWindowFocused(flags: Number? /* 1 */ = definedExternally /* null */): Boolean = definedExternally
    //fun IsWindowFocused(flags: Number? /* 2 */ = definedExternally /* null */): Boolean = definedExternally
    //fun IsWindowFocused(flags: Number? /* 4 */ = definedExternally /* null */): Boolean = definedExternally
    //fun IsWindowFocused(flags: Number? /* 8 */ = definedExternally /* null */): Boolean = definedExternally
    //fun IsWindowFocused(flags: Number? /* 3 */ = definedExternally /* null */): Boolean = definedExternally
    fun IsWindowHovered(flags: com.hiperbou.imguijs.ImGuiHoveredFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 32 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 416 */ | Number /* 3 */ */ = definedExternally /* null */): Boolean =
        definedExternally

    fun GetWindowDrawList(): ImDrawList = definedExternally
    fun GetWindowPos(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetWindowSize(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetWindowWidth(): Number = definedExternally
    fun GetWindowHeight(): Number = definedExternally
    fun SetNextWindowPos(
        pos: Any?, cond: Number? /* 0 */ = definedExternally /* null */, pivot: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowPos(
        pos: Any?, cond: Number? /* 1 */ = definedExternally /* null */, pivot: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowPos(
        pos: Any?, cond: Number? /* 2 */ = definedExternally /* null */, pivot: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowPos(
        pos: Any?, cond: Number? /* 4 */ = definedExternally /* null */, pivot: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowPos(
        pos: Any?, cond: Number? /* 8 */ = definedExternally /* null */, pivot: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowSize(pos: Any?, cond: com.hiperbou.imguijs.ImGuiCond? /* 0 */ = definedExternally /* null */): Unit = definedExternally

    /*fun SetNextWindowSize(pos: Any?, cond: Number? /* 1 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextWindowSize(pos: Any?, cond: Number? /* 2 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextWindowSize(pos: Any?, cond: Number? /* 4 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextWindowSize(pos: Any?, cond: Number? /* 8 */ = definedExternally /* null */): Unit =
        definedExternally*/

    fun SetNextWindowSizeConstraints(size_min: Any?, size_max: Any?): Unit = definedExternally
    fun <T> SetNextWindowSizeConstraints(
        size_min: Any?,
        size_max: Any?,
        custom_callback: (data: ImGuiSizeCallbackData<T>) -> Unit,
        custom_callback_data: T? = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowContentSize(size: Any?): Unit = definedExternally
    fun SetNextWindowCollapsed(
        collapsed: Boolean, cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowCollapsed(
        collapsed: Boolean, cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowCollapsed(
        collapsed: Boolean, cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowCollapsed(
        collapsed: Boolean, cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowCollapsed(
        collapsed: Boolean, cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetNextWindowFocus(): Unit = definedExternally
    fun SetNextWindowBgAlpha(alpha: Number): Unit = definedExternally
    fun SetWindowPos(
        name_or_pos: String,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: String,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: String,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: String,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: String,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: Any?,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: Any?,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: Any?,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: Any?,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowPos(
        name_or_pos: Any?,
        pos_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: String,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: String,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: String,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: String,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: String,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: Any?,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: Any?,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: Any?,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: Any?,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowSize(
        name_or_size: Any?,
        size_or_cond: dynamic /* Any? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: String,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: String,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: String,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: String,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: String,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: Boolean,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: Boolean,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: Boolean,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: Boolean,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 4 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowCollapsed(
        name_or_collapsed: Boolean,
        collapsed_or_cond: dynamic /* Boolean? | Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ */ = definedExternally /* null */,
        cond: Number? /* 8 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun SetWindowFocus(name: String? = definedExternally /* null */): Unit = definedExternally
    fun SetWindowFontScale(scale: Number): Unit = definedExternally
    fun GetContentRegionAvail(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
        definedExternally

    fun GetContentRegionMax(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetWindowContentRegionMin(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
        definedExternally

    fun GetWindowContentRegionMax(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
        definedExternally

    fun GetScrollX(): Number = definedExternally
    fun GetScrollY(): Number = definedExternally
    fun SetScrollX(scroll_x: Number): Unit = definedExternally
    fun SetScrollY(scroll_y: Number): Unit = definedExternally
    fun GetScrollMaxX(): Number = definedExternally
    fun GetScrollMaxY(): Number = definedExternally
    fun SetScrollHereX(center_x_ratio: Number? = definedExternally /* null */): Unit = definedExternally
    fun SetScrollHereY(center_y_ratio: Number? = definedExternally /* null */): Unit = definedExternally
    fun SetScrollFromPosX(pos_x: Number, center_x_ratio: Number? = definedExternally /* null */): Unit =
        definedExternally

    fun SetScrollFromPosY(pos_y: Number, center_y_ratio: Number? = definedExternally /* null */): Unit =
        definedExternally

    fun PushFont(font: ImFont?): Unit = definedExternally
    fun PopFont(): Unit = definedExternally
    fun PushStyleColor(
        idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ | Number /* 26 */ | Number /* 27 */ | Number /* 28 */ | Number /* 29 */ | Number /* 30 */ | Number /* 31 */ | Number /* 32 */ | Number /* 33 */ | Number /* 34 */ | Number /* 35 */ | Number /* 36 */ | Number /* 37 */ | Number /* 38 */ | Number /* 39 */ | Number /* 40 */ | Number /* 41 */ | Number /* 42 */ | Number /* 43 */ | Number /* 44 */ | Number /* 45 */ | Number /* 46 */ | Number /* 47 */ | Number /* 48 */ | Number /* 49 */ | Number /* 50 */ | Number /* 51 */ | Number /* 52 */ | Number /* 53 */ */,
        col: ImU32
    ): Unit = definedExternally

    fun PushStyleColor(
        idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ | Number /* 26 */ | Number /* 27 */ | Number /* 28 */ | Number /* 29 */ | Number /* 30 */ | Number /* 31 */ | Number /* 32 */ | Number /* 33 */ | Number /* 34 */ | Number /* 35 */ | Number /* 36 */ | Number /* 37 */ | Number /* 38 */ | Number /* 39 */ | Number /* 40 */ | Number /* 41 */ | Number /* 42 */ | Number /* 43 */ | Number /* 44 */ | Number /* 45 */ | Number /* 46 */ | Number /* 47 */ | Number /* 48 */ | Number /* 49 */ | Number /* 50 */ | Number /* 51 */ | Number /* 52 */ | Number /* 53 */ */,
        col: ImVec4?
    ): Unit = definedExternally

    fun PopStyleColor(count: Number? = definedExternally /* null */): Unit = definedExternally
    fun PushStyleVar(
        idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ */,
        `val`: Number
    ): Unit = definedExternally

    fun PushStyleVar(
        idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ */,
        `val`: Any?
    ): Unit = definedExternally

    fun PopStyleVar(count: Number? = definedExternally /* null */): Unit = definedExternally
    fun PushAllowKeyboardFocus(allow_keyboard_focus: Boolean): Unit = definedExternally
    fun PopAllowKeyboardFocus(): Unit = definedExternally
    fun PushButtonRepeat(repeat: Boolean): Unit = definedExternally
    fun PopButtonRepeat(): Unit = definedExternally
    fun PushItemWidth(item_width: Number): Unit = definedExternally
    fun PopItemWidth(): Unit = definedExternally
    fun SetNextItemWidth(item_width: Number): Unit = definedExternally
    fun CalcItemWidth(): Number = definedExternally
    fun PushTextWrapPos(wrap_pos_x: Number? = definedExternally /* null */): Unit = definedExternally
    fun PopTextWrapPos(): Unit = definedExternally
    fun GetFont(): ImFont = definedExternally
    fun GetFontSize(): Double = definedExternally
    fun GetFontTexUvWhitePixel(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
        definedExternally

    fun GetColorU32(
        idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ | Number /* 26 */ | Number /* 27 */ | Number /* 28 */ | Number /* 29 */ | Number /* 30 */ | Number /* 31 */ | Number /* 32 */ | Number /* 33 */ | Number /* 34 */ | Number /* 35 */ | Number /* 36 */ | Number /* 37 */ | Number /* 38 */ | Number /* 39 */ | Number /* 40 */ | Number /* 41 */ | Number /* 42 */ | Number /* 43 */ | Number /* 44 */ | Number /* 45 */ | Number /* 46 */ | Number /* 47 */ | Number /* 48 */ | Number /* 49 */ | Number /* 50 */ | Number /* 51 */ | Number /* 52 */ | Number /* 53 */ */,
        alpha_mul: Number? = definedExternally /* null */
    ): ImU32 = definedExternally

    fun GetColorU32(col: Any?): ImU32 = definedExternally
    fun GetColorU32(col: ImU32): ImU32 = definedExternally
    fun GetStyleColorVec4(idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ | Number /* 26 */ | Number /* 27 */ | Number /* 28 */ | Number /* 29 */ | Number /* 30 */ | Number /* 31 */ | Number /* 32 */ | Number /* 33 */ | Number /* 34 */ | Number /* 35 */ | Number /* 36 */ | Number /* 37 */ | Number /* 38 */ | Number /* 39 */ | Number /* 40 */ | Number /* 41 */ | Number /* 42 */ | Number /* 43 */ | Number /* 44 */ | Number /* 45 */ | Number /* 46 */ | Number /* 47 */ | Number /* 48 */ | Number /* 49 */ | Number /* 50 */ | Number /* 51 */ | Number /* 52 */ | Number /* 53 */ */): Any? =
        definedExternally

    fun Separator(): Unit = definedExternally
    fun SameLine(
        pos_x: Number? = definedExternally /* null */, spacing_w: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun NewLine(): Unit = definedExternally
    fun Spacing(): Unit = definedExternally
    fun Dummy(size: Any?): Unit = definedExternally
    fun Indent(indent_w: Number? = definedExternally /* null */): Unit = definedExternally
    fun Unindent(indent_w: Number? = definedExternally /* null */): Unit = definedExternally
    fun BeginGroup(): Unit = definedExternally
    fun EndGroup(): Unit = definedExternally
    fun GetCursorPos(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetCursorPosX(): Number = definedExternally
    fun GetCursorPosY(): Number = definedExternally
    fun SetCursorPos(local_pos: Any?): Unit = definedExternally
    fun SetCursorPosX(x: Number): Unit = definedExternally
    fun SetCursorPosY(y: Number): Unit = definedExternally
    fun GetCursorStartPos(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetCursorScreenPos(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun SetCursorScreenPos(pos: Any?): Unit = definedExternally
    fun AlignTextToFramePadding(): Unit = definedExternally
    fun GetTextLineHeight(): Number = definedExternally
    fun GetTextLineHeightWithSpacing(): Number = definedExternally
    fun GetFrameHeight(): Number = definedExternally
    fun GetFrameHeightWithSpacing(): Number = definedExternally
    fun PushID(id: String): Unit = definedExternally
    fun PushID(id: Number): Unit = definedExternally
    fun PopID(): Unit = definedExternally
    fun GetID(id: String): ImGuiID = definedExternally
    fun GetID(id: Number): ImGuiID = definedExternally
    fun TextUnformatted(text: String, text_end: Number? = definedExternally /* null */): Unit = definedExternally

    fun Text(text: String): Unit = definedExternally
    fun TextColored(col: Any?, text: String): Unit = definedExternally
    fun TextDisabled(text: String): Unit = definedExternally
    fun TextWrapped(text: String): Unit = definedExternally
    fun LabelText(label: String, text: String): Unit = definedExternally
    fun BulletText(text: String): Unit = definedExternally
    fun Button(label: String, size: Any? = definedExternally /* null */): Boolean = definedExternally
    fun SmallButton(label: String): Boolean = definedExternally
    fun ArrowButton(str_id: String, dir: Number /* -1 */): Boolean = definedExternally
    /*fun ArrowButton(str_id: String, dir: Number /* 0 */): Boolean = definedExternally
    fun ArrowButton(str_id: String, dir: Number /* 1 */): Boolean = definedExternally
    fun ArrowButton(str_id: String, dir: Number /* 2 */): Boolean = definedExternally
    fun ArrowButton(str_id: String, dir: Number /* 3 */): Boolean = definedExternally
    fun ArrowButton(str_id: String, dir: Number /* 4 */): Boolean = definedExternally*/
    fun InvisibleButton(
        str_id: String, size: Any?, flags: com.hiperbou.imguijs.ImGuiButtonFlags ? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun InvisibleButton(
        str_id: String, size: Any?, flags: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InvisibleButton(
        str_id: String, size: Any?, flags: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InvisibleButton(
        str_id: String, size: Any?, flags: Number? /* 4 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InvisibleButton(
        str_id: String, size: Any?, flags: Number? /* 7 */ = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun Image(
        user_texture_id: WebGLTexture?,
        size: Any?,
        uv0: Any? = definedExternally /* null */,
        uv1: Any? = definedExternally /* null */,
        tint_col: Any? = definedExternally /* null */,
        border_col: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun ImageButton(
        user_texture_id: WebGLTexture?,
        size: ImVec2? = definedExternally /* null */,
        uv0: ImVec2? = definedExternally /* null */,
        uv1: ImVec2? = definedExternally /* null */,
        frame_padding: Number? = definedExternally /* null */,
        bg_col: ImVec4? = definedExternally /* null */,
        tint_col: ImVec4? = definedExternally /* null */
    ): Boolean = definedExternally

    //fun Checkbox(label: String, v: ImScalar<Boolean>): Boolean = definedExternally
    fun Checkbox(label: String, v: ImAccess<Boolean>): Boolean = definedExternally
    fun CheckboxFlags(label: String, flags: ImAccess<Number>, flags_value: Number): Boolean = definedExternally
    //fun CheckboxFlags(label: String, flags: ImScalar<Number>, flags_value: Number): Boolean = definedExternally
    fun RadioButton(label: String, active: Boolean): Boolean = definedExternally
    fun RadioButton(label: String, v: ImAccess<Int>, v_button: Number): Boolean = definedExternally
    //fun RadioButton(label: String, v: ImScalar<Number>, v_button: Number): Boolean = definedExternally
    fun ProgressBar(
        fraction: Number, size_arg: Any? = definedExternally /* null */, overlay: String? = definedExternally /* null */
    ): Unit = definedExternally

    fun Bullet(): Unit = definedExternally
    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiComboFlags ? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 4 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 8 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 16 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 32 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 64 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginCombo(
        label: String,
        preview_value: String? = definedExternally /* null */,
        flags: Number? /* 30 */ = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun EndCombo(): Unit = definedExternally
    @JsName("Combo")
    fun Combo_Items_Array(
        label: String,
        current_item: ImAccess<Int>,
        items: Array<String>,
        items_count: Int? = definedExternally /* null */,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("Combo")
    fun Combo_Scalar(
        label: String,
        current_item: ImScalar<Int>,
        items: Array<String>,
        items_count: Int? = definedExternally /* null */,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Combo(
        label: String,
        current_item: ImAccess<Int>,
        items_separated_by_zeros: String,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("Combo")
    fun <T>Combo_Scalar(
        label: String,
        current_item: ImScalar<Int>,
        items_separated_by_zeros: String,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> Combo(
        label: String,
        current_item: ImAccess<Int>,
        items_getter: (data: T, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean,
        data: T,
        items_count: Int,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("Combo")
    fun <T>Combo_Scalar(
        label: String,
        current_item: ImScalar<Int>,
        items_getter: (data: T, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean,
        data: T,
        items_count: Number,
        popup_max_height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: ImAccess<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags  /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: ImScalar<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: XY,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: ImTuple2<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: XY,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: ImTuple2<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: dynamic /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat2(
        label: String,
        v: ImVec2,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat3(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat3(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat3(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat3(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat4(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat4(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloat4(
        label: String,
        v: ImVec4,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: ImAccess<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: ImScalar<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: XY,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: XYZ,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: XYZW,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: ImTuple2<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: ImTuple3<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragFloatRange2(
        label: String,
        v_current_min: ImTuple4<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        display_format: String? = definedExternally /* null */,
        display_format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: ImAccess<Int>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: ImScalar<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: XY,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: ImTuple2<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: XY,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: ImTuple2<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt2(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt3(
        label: String,
        v: XYZ,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt3(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt3(
        label: String,
        v: ImTuple3<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt3(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt4(
        label: String,
        v: XYZW,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragInt4(
        label: String,
        v: ImTuple4<Number>,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: ImAccess<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: ImScalar<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: XY,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: XYZ,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: XYZW,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: ImTuple2<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: ImTuple3<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragIntRange2(
        label: String,
        v_current_min: ImTuple4<Number>,
        v_current_max: dynamic /*ImAccess<Number> |ImScalar<Number> | XY | XYZ | XYZW |ImTuple2<Number> |ImTuple3<Number> |ImTuple4<Number> */,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        format_max: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Float32Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Uint32Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Int8Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Uint8Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Int16Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Uint16Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Int32Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun DragScalar(
        label: String,
        v: Float64Array,
        v_speed: Number? = definedExternally /* null */,
        v_min: Number? = definedExternally /* null */,
        v_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat(
        label: String,
        v: ImAccess<Double>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat2(
        label: String,
        v: ImScalar<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat3(
        label: String,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat4(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat5(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat6(
        label: String,
        v: ImTuple2<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat7(
        label: String,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    @JsName("SliderFloat")
    fun SliderFloat8(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: ImTuple2<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat2(
        label: String,
        v: interface_ImVec2,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat3(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat3(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat3(
        label: String,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat3(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat4(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderFloat4(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: ImAccess<Double>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: ImScalar<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: XY,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: XYZ,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: XYZW,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: ImTuple2<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: ImTuple3<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle(
        label: String,
        v_rad: ImTuple4<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle3(
        label: String,
        v_rad: XYZ,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle3(
        label: String,
        v_rad: XYZW,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle3(
        label: String,
        v_rad: ImTuple3<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderAngle3(
        label: String,
        v_rad: ImTuple4<Number>,
        v_degrees_min: Number? = definedExternally /* null */,
        v_degrees_max: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: ImAccess<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: ImScalar<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: ImTuple2<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: ImTuple3<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt(
        label: String,
        v: ImTuple4<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: ImTuple2<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt2(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt3(
        label: String,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt3(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt3(
        label: String,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt3(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt4(
        label: String,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderInt4(
        label: String,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Float32Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Uint32Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Int8Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Uint8Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Int16Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Uint16Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Int32Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SliderScalar(
        label: String,
        v: Float64Array,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: ImAccess<Float>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: ImScalar<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: ImTuple2<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderFloat(
        label: String,
        size: Any?,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: ImAccess<Int>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: ImScalar<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: XY,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: XYZ,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: XYZW,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: ImTuple2<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: ImTuple3<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderInt(
        label: String,
        size: Any?,
        v: ImTuple4<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderScalar(
        label: String,
        size: Any?,
        data_type: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        v: ImAccess<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun VSliderScalar(
        label: String,
        size: Any?,
        data_type: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        v: ImScalar<Number>,
        v_min: Number,
        v_max: Number,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSliderFlags /* Number? /* 0 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ | Number? /* 1879048207 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputText(
        label: String,
        buf: ImStringBuffer,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputText(
        label: String,
        buf: ImAccess<String>,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputText(
        label: String,
        buf: ImScalar<String>,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputTextMultiline(
        label: String,
        buf: ImStringBuffer,
        buf_size: Number? = definedExternally /* null */,
        size: Any? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun /*<T> */InputTextMultiline(
        label: String,
        buf: ImAccess<String>,
        buf_size: Number? = definedExternally /* null */,
        size: Any? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<Any/*T*/>) -> Number)? = definedExternally /* null */,
        user_data: /*T*/Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputTextMultiline(
        label: String,
        buf: ImScalar<String>,
        buf_size: Number? = definedExternally /* null */,
        size: Any? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputTextWithHint(
        label: String,
        hint: String,
        buf: ImStringBuffer,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputTextWithHint(
        label: String,
        hint: String,
        buf: ImAccess<String>,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> InputTextWithHint(
        label: String,
        hint: String,
        buf: ImScalar<String>,
        buf_size: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */,
        callback: ((data: ImGuiInputTextCallbackData<T>) -> Number)? = definedExternally /* null */,
        user_data: T? = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: ImAccess<Float>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: ImScalar<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: XY,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: XYZ,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: XYZW,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: ImTuple2<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: ImTuple3<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat(
        label: String,
        v: ImTuple4<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: XY,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: XYZ,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: XYZW,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: ImTuple2<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: ImTuple3<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat2(
        label: String,
        v: ImTuple4<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat3(
        label: String,
        v: XYZ,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat3(
        label: String,
        v: XYZW,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat3(
        label: String,
        v: ImTuple3<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat3(
        label: String,
        v: ImTuple4<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat4(
        label: String,
        v: XYZW,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputFloat4(
        label: String,
        v: ImTuple4<Number>,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: ImAccess<Int>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: ImScalar<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: XY,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: XYZ,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: XYZW,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: ImTuple2<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: ImTuple3<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt(
        label: String,
        v: ImTuple4<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: XY,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: XYZ,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: XYZW,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: ImTuple2<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: ImTuple3<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt2(
        label: String,
        v: ImTuple4<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt3(
        label: String,
        v: XYZ,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt3(
        label: String,
        v: XYZW,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt3(
        label: String,
        v: ImTuple3<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt3(
        label: String,
        v: ImTuple4<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt4(
        label: String,
        v: XYZW,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputInt4(
        label: String,
        v: ImTuple4<Number>,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: ImAccess<Double>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: ImScalar<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: XY,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: XYZ,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: XYZW,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: ImTuple2<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: ImTuple3<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputDouble(
        label: String,
        v: ImTuple4<Number>,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Float32Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Uint32Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Int8Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Uint8Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Int16Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Uint16Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Int32Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun InputScalar(
        label: String,
        v: Float64Array,
        step: Number? = definedExternally /* null */,
        step_fast: Number? = definedExternally /* null */,
        format: String? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiInputTextFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit3(
        label: String,
        col: RGB,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit3(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit3(
        label: String,
        col: ImTuple3<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit3(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit3(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit4(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit4(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorEdit4(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker3(
        label: String,
        col: RGB,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker3(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker3(
        label: String,
        col: ImTuple3<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker3(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker3(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: ImTuple4<Number>? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: interface_ImVec4? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: RGBA,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: Nothing? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: ImTuple4<Number>? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: interface_ImVec4? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: ImTuple4<Number>,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: Nothing? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: ImTuple4<Number>? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: interface_ImVec4? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorPicker4(
        label: String,
        col: interface_ImVec4,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        ref_col: Nothing? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ColorButton(
        desc_id: String,
        col: Any?,
        flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun SetColorEditOptions(flags: dynamic /* Number /* 0 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ | Number /* 177209344 */ | Number /* 7340032 */ | Number /* 25165824 */ | Number /* 100663296 */ | Number /* 402653184 */ */): Unit =
        definedExternally

    fun TreeNode(label: String): Boolean = definedExternally
    fun TreeNode(label: String, fmt: String): Boolean = definedExternally
    fun TreeNode(label: Number, fmt: String): Boolean = definedExternally
    fun TreeNodeEx(
        label: String,
        flags: com.hiperbou.imguijs.ImGuiTreeNodeFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun TreeNodeEx(
        str_id: String,
        flags: com.hiperbou.imguijs.ImGuiTreeNodeFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */,
        fmt: String
    ): Boolean = definedExternally

    fun TreeNodeEx(
        ptr_id: Number,
        flags: com.hiperbou.imguijs.ImGuiTreeNodeFlags /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */,
        fmt: String
    ): Boolean = definedExternally

    fun TreePush(str_id: String): Unit = definedExternally
    fun TreePush(ptr_id: Number): Unit = definedExternally
    fun TreePop(): Unit = definedExternally
    fun GetTreeNodeToLabelSpacing(): Number = definedExternally
    fun CollapsingHeader(
        label: String,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun CollapsingHeader(
        label: String,
        p_open: ImScalar<Boolean>,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun CollapsingHeader(
        label: String,
        p_open: ImAccess<Boolean>,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 26 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun SetNextItemOpen(is_open: Boolean, cond: Number? /* 0 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextItemOpen(is_open: Boolean, cond: Number? /* 1 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextItemOpen(is_open: Boolean, cond: Number? /* 2 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextItemOpen(is_open: Boolean, cond: Number? /* 4 */ = definedExternally /* null */): Unit =
        definedExternally

    fun SetNextItemOpen(is_open: Boolean, cond: Number? /* 8 */ = definedExternally /* null */): Unit =
        definedExternally

    fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: com.hiperbou.imguijs.ImGuiSelectableFlags? /* 0 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: Number? /* 1 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: Number? /* 2 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: Number? /* 4 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: Number? /* 8 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Selectable(
        label: String,
        selected: Boolean? = definedExternally /* null */,
        flags: Number? /* 16 */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun Selectable(
        label: String,
        p_selected: ImScalar<Boolean>,
        flags: dynamic /* Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ | Number? /* 16 */ */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun Selectable(
        label: String,
        p_selected: ImAccess<Boolean>,
        flags: dynamic /* Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ | Number? /* 16 */ */ = definedExternally /* null */,
        size: Any? = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginListBox(label: String, size: Any? = definedExternally /* null */): Boolean = definedExternally
    fun EndListBox(): Unit = definedExternally
    fun ListBox(
        label: String,
        current_item: ImAccess<Int>,
        items: Array<String>,
        items_count: Int? = definedExternally /* null */,
        height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun ListBox(
        label: String,
        current_item: ImScalar<Int>,
        items: Array<String>,
        items_count: Int? = definedExternally /* null */,
        height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> ListBox(
        label: String,
        current_item: ImAccess<Int>,
        items_getter: (data: T, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean,
        data: T,
        items_count: Int,
        height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> ListBox(
        label: String,
        current_item: ImScalar<Int>,
        items_getter: (data: T, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean,
        data: T,
        items_count: Int,
        height_in_items: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun PlotLines(
        label: String,
        values: ArrayLike<Number>,
        values_count: Number? = definedExternally /* null */,
        value_offset: Number? = definedExternally /* null */,
        overlay_text: String? = definedExternally /* null */,
        scale_min: Number? = definedExternally /* null */,
        scale_max: Number? = definedExternally /* null */,
        graph_size: Any? = definedExternally /* null */,
        stride: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun <T> PlotLines(
        label: String,
        values_getter: (data: T, idx: Number) -> Number,
        data: T,
        values_count: Number? = definedExternally /* null */,
        value_offset: Number? = definedExternally /* null */,
        overlay_text: String? = definedExternally /* null */,
        scale_min: Number? = definedExternally /* null */,
        scale_max: Number? = definedExternally /* null */,
        graph_size: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun PlotHistogram(
        label: String,
        values: ArrayLike<Number>,
        values_count: Number? = definedExternally /* null */,
        value_offset: Number? = definedExternally /* null */,
        overlay_text: String? = definedExternally /* null */,
        scale_min: Number? = definedExternally /* null */,
        scale_max: Number? = definedExternally /* null */,
        graph_size: Any? = definedExternally /* null */,
        stride: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun <T> PlotHistogram(
        label: String,
        values_getter: (data: T, idx: Number) -> Number,
        data: T,
        values_count: Number? = definedExternally /* null */,
        value_offset: Number? = definedExternally /* null */,
        overlay_text: String? = definedExternally /* null */,
        scale_min: Number? = definedExternally /* null */,
        scale_max: Number? = definedExternally /* null */,
        graph_size: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun Value(prefix: String, b: Boolean): Unit = definedExternally
    fun Value(prefix: String, v: Number): Unit = definedExternally
    fun Value(prefix: String, v: Number, float_format: String? = definedExternally /* null */): Unit = definedExternally

    fun Value(prefix: String, v: Any): Unit = definedExternally
    fun BeginMenuBar(): Boolean = definedExternally
    fun EndMenuBar(): Unit = definedExternally
    fun BeginMainMenuBar(): Boolean = definedExternally
    fun EndMainMenuBar(): Unit = definedExternally
    fun BeginMenu(label: String, enabled: Boolean? = definedExternally /* null */): Boolean = definedExternally
    fun EndMenu(): Unit = definedExternally
    fun MenuItem(
        label: String,
        shortcut: String? = definedExternally /* null */,
        selected: Boolean? = definedExternally /* null */,
        enabled: Boolean? = definedExternally /* null */
    ): Boolean = definedExternally

    fun MenuItem(
        label: String,
        shortcut: String?,
        p_selected: ImScalar<Boolean>,
        enabled: Boolean? = definedExternally /* null */
    ): Boolean = definedExternally

    fun MenuItem(
        label: String,
        shortcut: String?,
        p_selected: ImAccess<Boolean>,
        enabled: Boolean? = definedExternally /* null */
    ): Boolean = definedExternally

    fun MenuItem(
        label: String, shortcut: String?, p_selected: Nothing?, enabled: Boolean? = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginTooltip(): Unit = definedExternally
    fun EndTooltip(): Unit = definedExternally
    fun SetTooltip(fmt: String): Unit = definedExternally
    fun BeginPopup(
        str_id: String,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupModal(
        str_id: String,
        p_open: ImScalar<Boolean>? = definedExternally /* null */,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupModal(
        str_id: String,
        p_open: ImAccess<Boolean>? = definedExternally /* null */,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupModal(
        str_id: String,
        p_open: Nothing? = definedExternally /* null */,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndPopup(): Unit = definedExternally
    fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */): Unit = definedExternally

    /*fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 1 */ = definedExternally /* null */): Unit = definedExternally

    fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 2 */ = definedExternally /* null */): Unit = definedExternally

    fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 31 */ = definedExternally /* null */): Unit =
        definedExternally

    fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 32 */ = definedExternally /* null */): Unit =
        definedExternally

    fun OpenPopup(str_id: String, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 64 */ = definedExternally /* null */): Unit =
        definedExternally

    fun OpenPopup(str_id: String, popup_flags: Number? /* 128 */ = definedExternally /* null */): Unit =
        definedExternally

    fun OpenPopup(str_id: String, popup_flags: Number? /* 256 */ = definedExternally /* null */): Unit =
        definedExternally

    fun OpenPopup(str_id: String, popup_flags: Number? /* 384 */ = definedExternally /* null */): Unit =
        definedExternally*/

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */
    ): Unit = definedExternally

    /*fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 1 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 2 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 31 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 32 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 64 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 128 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 256 */ = definedExternally /* null */
    ): Unit = definedExternally

    fun OpenPopupOnItemClick(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 384 */ = definedExternally /* null */
    ): Unit = definedExternally*/

    fun CloseCurrentPopup(): Unit = definedExternally
    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 31 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 32 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 64 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 128 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 256 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextItem(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 384 */ = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 31 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 32 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 64 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 128 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 256 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextWindow(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 384 */ = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    /*fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 31 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 32 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 64 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 128 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 256 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginPopupContextVoid(
        str_id: String? = definedExternally /* null */, popup_flags: Number? /* 384 */ = definedExternally /* null */
    ): Boolean = definedExternally*/

    fun IsPopupOpen(str_id: String, flags: com.hiperbou.imguijs.ImGuiPopupFlags? /* 0 */ = definedExternally /* null */): Boolean = definedExternally

    /*fun IsPopupOpen(str_id: String, flags: Number? /* 1 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 2 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 31 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 32 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 64 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 128 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 256 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun IsPopupOpen(str_id: String, flags: Number? /* 384 */ = definedExternally /* null */): Boolean =
        definedExternally*/

    fun BeginTable(
        str_id: String,
        column: Number,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 384 */ | Number /* 1536 */ | Number /* 640 */ | Number /* 1280 */ | Number /* 1920 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 24576 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 2097152 */ | Number /* 4194304 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 57344 */ */ = definedExternally /* null */,
        outer_size: interface_ImVec2? = definedExternally /* null */,
        inner_width: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndTable(): Unit = definedExternally
    fun TableNextRow(
        row_flags: com.hiperbou.imguijs.ImGuiTableRowFlags? /* 0 */ = definedExternally /* null */,
        min_row_height: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableNextRow(
        row_flags: com.hiperbou.imguijs.ImGuiTableRowFlags? /* 1 */ = definedExternally /* null */,
        min_row_height: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableNextColumn(): Boolean = definedExternally
    fun TableSetColumnIndex(column_n: Number): Boolean = definedExternally
    fun TableSetupColumn(
        label: String,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 24 */ | Number /* 196608 */ | Number /* 251658240 */ | Number /* 1073741824 */ */ = definedExternally /* null */,
        init_width_or_weight: Number? = definedExternally /* null */,
        user_id: ImGuiID? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableSetupScrollFreeze(cols: Number, rows: Number): Unit = definedExternally
    fun TableHeadersRow(): Unit = definedExternally
    fun TableHeader(label: String): Unit = definedExternally
    fun TableGetSortSpecs(): ImGuiTableSortSpecs? = definedExternally
    fun TableGetColumnCount(): Number = definedExternally
    fun TableGetColumnIndex(): Number = definedExternally
    fun TableGetRowIndex(): Number = definedExternally
    fun TableGetColumnName(column_n: Number? = definedExternally /* null */): String = definedExternally
    fun TableGetColumnFlags(column_n: Number? = definedExternally /* null */): dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 131072 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 24 */ | Number /* 196608 */ | Number /* 251658240 */ | Number /* 1073741824 */ */ =
        definedExternally

    fun TableSetColumnEnabled(column_n: Number, v: Boolean): Unit = definedExternally
    fun TableSetBgColor(
        target: Number /* 0 */, color: ImU32, column_n: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableSetBgColor(
        target: Number /* 1 */, color: ImU32, column_n: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableSetBgColor(
        target: Number /* 2 */, color: ImU32, column_n: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun TableSetBgColor(
        target: Number /* 3 */, color: ImU32, column_n: Number? = definedExternally /* null */
    ): Unit = definedExternally

    fun Columns(
        count: Number? = definedExternally /* null */,
        id: String? = definedExternally /* null */,
        border: Boolean? = definedExternally /* null */
    ): Unit = definedExternally

    fun NextColumn(): Unit = definedExternally
    fun GetColumnIndex(): Number = definedExternally
    fun GetColumnWidth(column_index: Number? = definedExternally /* null */): Number = definedExternally
    fun SetColumnWidth(column_index: Number, width: Number): Unit = definedExternally
    fun GetColumnOffset(column_index: Number? = definedExternally /* null */): Number = definedExternally
    fun SetColumnOffset(column_index: Number, offset_x: Number): Unit = definedExternally
    fun GetColumnsCount(): Number = definedExternally
    fun BeginTabBar(str_id: String, flags: com.hiperbou.imguijs.ImGuiTabBarFlags? /* 0 */ = definedExternally /* null */): Boolean = definedExternally

    /*fun BeginTabBar(str_id: String, flags: Number? /* 1 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 2 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 4 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 8 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 16 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 32 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 64 */ = definedExternally /* null */): Boolean = definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 128 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun BeginTabBar(str_id: String, flags: Number? /* 192 */ = definedExternally /* null */): Boolean =
        definedExternally*/

    fun EndTabBar(): Unit = definedExternally
    fun BeginTabItem(
        label: String,
        p_open: ImScalar<Boolean>? = definedExternally /* null */,
        flags: dynamic /* Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginTabItem(
        label: String,
        p_open: ImAccess<Boolean>? = definedExternally /* null */,
        flags: dynamic /* Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun BeginTabItem(
        label: String,
        p_open: Nothing? = definedExternally /* null */,
        flags: dynamic /* Number? /* 0 */ | Number? /* 1 */ | Number? /* 2 */ | Number? /* 4 */ | Number? /* 8 */ | Number? /* 16 */ | Number? /* 32 */ | Number? /* 64 */ | Number? /* 128 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndTabItem(): Unit = definedExternally
    fun TabItemButton(label: String, flags: com.hiperbou.imguijs.ImGuiTabItemFlags? /* 0 */ = definedExternally /* null */): Boolean = definedExternally

    /*fun TabItemButton(label: String, flags: Number? /* 1 */ = definedExternally /* null */): Boolean = definedExternally

    fun TabItemButton(label: String, flags: Number? /* 2 */ = definedExternally /* null */): Boolean = definedExternally

    fun TabItemButton(label: String, flags: Number? /* 4 */ = definedExternally /* null */): Boolean = definedExternally

    fun TabItemButton(label: String, flags: Number? /* 8 */ = definedExternally /* null */): Boolean = definedExternally

    fun TabItemButton(label: String, flags: Number? /* 16 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun TabItemButton(label: String, flags: Number? /* 32 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun TabItemButton(label: String, flags: Number? /* 64 */ = definedExternally /* null */): Boolean =
        definedExternally

    fun TabItemButton(label: String, flags: Number? /* 128 */ = definedExternally /* null */): Boolean =
        definedExternally*/

    fun SetTabItemClosed(tab_or_docked_window_label: String): Unit = definedExternally
    fun LogToTTY(max_depth: Number? = definedExternally /* null */): Unit = definedExternally
    fun LogToFile(
        max_depth: Number? = definedExternally /* null */, filename: String? = definedExternally /* null */
    ): Unit = definedExternally

    fun LogToClipboard(max_depth: Number? = definedExternally /* null */): Unit = definedExternally
    fun LogFinish(): Unit = definedExternally
    fun LogButtons(): Unit = definedExternally
    fun LogText(fmt: String): Unit = definedExternally
    fun BeginDragDropSource(flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 3072 */ */ = definedExternally /* null */): Boolean =
        definedExternally

    fun <T> SetDragDropPayload(
        type: String, data: T, cond: Number? /* 0 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> SetDragDropPayload(
        type: String, data: T, cond: Number? /* 1 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> SetDragDropPayload(
        type: String, data: T, cond: Number? /* 2 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> SetDragDropPayload(
        type: String, data: T, cond: Number? /* 4 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun <T> SetDragDropPayload(
        type: String, data: T, cond: Number? /* 8 */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndDragDropSource(): Unit = definedExternally
    fun BeginDragDropTarget(): Boolean = definedExternally
    fun <T> AcceptDragDropPayload(
        type: String,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 3072 */ */ = definedExternally /* null */
    ): ImGuiPayload<T>? = definedExternally

    fun EndDragDropTarget(): Unit = definedExternally
    fun <T> GetDragDropPayload(): ImGuiPayload<T>? = definedExternally
    fun BeginDisabled(disabled: Boolean? = definedExternally /* null */): Unit = definedExternally
    fun EndDisabled(): Unit = definedExternally
    fun PushClipRect(
        clip_rect_min: Any?, clip_rect_max: Any?, intersect_with_current_clip_rect: Boolean
    ): Unit = definedExternally

    fun PopClipRect(): Unit = definedExternally
    fun SetItemDefaultFocus(): Unit = definedExternally
    fun SetKeyboardFocusHere(offset: Number? = definedExternally /* null */): Unit = definedExternally
    fun IsItemHovered(flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 32 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 416 */ | Number /* 3 */ */ = definedExternally /* null */): Boolean =
        definedExternally

    fun IsItemActive(): Boolean = definedExternally
    fun IsItemFocused(): Boolean = definedExternally
    fun IsItemClicked(mouse_button: Number? /* 0 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsItemClicked(mouse_button: Number? /* 1 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsItemClicked(mouse_button: Number? /* 2 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsItemClicked(mouse_button: Number? /* 5 */ = definedExternally /* null */): Boolean = definedExternally

    fun IsItemVisible(): Boolean = definedExternally
    fun IsItemEdited(): Boolean = definedExternally
    fun IsItemActivated(): Boolean = definedExternally
    fun IsItemDeactivated(): Boolean = definedExternally
    fun IsItemDeactivatedAfterEdit(): Boolean = definedExternally
    fun IsItemToggledOpen(): Boolean = definedExternally
    fun IsAnyItemHovered(): Boolean = definedExternally
    fun IsAnyItemActive(): Boolean = definedExternally
    fun IsAnyItemFocused(): Boolean = definedExternally
    fun GetItemRectMin(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetItemRectMax(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetItemRectSize(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun SetItemAllowOverlap(): Unit = definedExternally
    fun GetMainViewport(): ImGuiViewport = definedExternally
    fun IsRectVisible(size: Any?): Boolean = definedExternally
    fun IsRectVisible(rect_min: Any?, rect_max: Any?): Boolean = definedExternally
    fun GetTime(): Number = definedExternally
    fun GetFrameCount(): Number = definedExternally
    fun GetBackgroundDrawList(): ImDrawList = definedExternally
    fun GetForegroundDrawList(): ImDrawList = definedExternally
    fun GetDrawListSharedData(): ImDrawListSharedData = definedExternally
    fun GetStyleColorName(idx: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ | Number /* 23 */ | Number /* 24 */ | Number /* 25 */ | Number /* 26 */ | Number /* 27 */ | Number /* 28 */ | Number /* 29 */ | Number /* 30 */ | Number /* 31 */ | Number /* 32 */ | Number /* 33 */ | Number /* 34 */ | Number /* 35 */ | Number /* 36 */ | Number /* 37 */ | Number /* 38 */ | Number /* 39 */ | Number /* 40 */ | Number /* 41 */ | Number /* 42 */ | Number /* 43 */ | Number /* 44 */ | Number /* 45 */ | Number /* 46 */ | Number /* 47 */ | Number /* 48 */ | Number /* 49 */ | Number /* 50 */ | Number /* 51 */ | Number /* 52 */ | Number /* 53 */ */): String =
        definedExternally

    fun BeginChildFrame(
        id: ImGuiID,
        size: Any?,
        flags: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 4 */ | Number /* 8 */ | Number /* 16 */ | Number /* 32 */ | Number /* 64 */ | Number /* 128 */ | Number /* 256 */ | Number /* 512 */ | Number /* 1024 */ | Number /* 2048 */ | Number /* 4096 */ | Number /* 8192 */ | Number /* 16384 */ | Number /* 32768 */ | Number /* 65536 */ | Number /* 262144 */ | Number /* 524288 */ | Number /* 1048576 */ | Number /* 786432 */ | Number /* 43 */ | Number /* 786944 */ | Number /* 8388608 */ | Number /* 16777216 */ | Number /* 33554432 */ | Number /* 67108864 */ | Number /* 134217728 */ | Number /* 268435456 */ */ = definedExternally /* null */
    ): Boolean = definedExternally

    fun EndChildFrame(): Unit = definedExternally
    fun CalcTextSize(
        text: String,
        text_end: Number? = definedExternally /* null */,
        hide_text_after_double_hash: Boolean? = definedExternally /* null */,
        wrap_width: Number? = definedExternally /* null */,
        out: interface_ImVec2? = definedExternally /* null */
    ): interface_ImVec2 = definedExternally

    fun ColorConvertU32ToFloat4(
        in_: ImU32, out: interface_ImVec4? = definedExternally /* null */
    ): interface_ImVec4 = definedExternally

    fun ColorConvertFloat4ToU32(in_: Any?): ImU32 = definedExternally
    fun ColorConvertRGBtoHSV(
        r: Number, g: Number, b: Number, out_h: ImScalar<Number>, out_s: ImScalar<Number>, out_v: ImScalar<Number>
    ): Unit = definedExternally

    fun ColorConvertHSVtoRGB(
        h: Number, s: Number, v: Number, out_r: ImScalar<Number>, out_g: ImScalar<Number>, out_b: ImScalar<Number>
    ): Unit = definedExternally

    fun GetKeyIndex(imgui_key: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number /* 21 */ | Number /* 22 */ */): Number =
        definedExternally

    fun IsKeyDown(user_key_index: Number): Boolean = definedExternally
    fun IsKeyPressed(user_key_index: Number, repeat: Boolean? = definedExternally /* null */): Boolean =
        definedExternally

    fun IsKeyReleased(user_key_index: Number): Boolean = definedExternally
    fun GetKeyPressedAmount(user_key_index: Number, repeat_delay: Number, rate: Number): Number = definedExternally

    fun CaptureKeyboardFromApp(capture: Boolean? = definedExternally /* null */): Unit = definedExternally
    fun IsMouseDown(button: Number): Boolean = definedExternally
    fun IsMouseClicked(button: Number, repeat: Boolean? = definedExternally /* null */): Boolean = definedExternally

    fun IsMouseDoubleClicked(button: Number): Boolean = definedExternally
    fun GetMouseClickedCount(button: Number): Number = definedExternally
    fun IsMouseReleased(button: Number): Boolean = definedExternally
    fun IsMouseHoveringRect(r_min: Any?, r_max: Any?, clip: Boolean? = definedExternally /* null */): Boolean =
        definedExternally

    fun IsMousePosValid(mouse_pos: Any? = definedExternally /* null */): Boolean = definedExternally
    fun IsAnyMouseDown(): Boolean = definedExternally
    fun GetMousePos(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 = definedExternally

    fun GetMousePosOnOpeningCurrentPopup(out: interface_ImVec2? = definedExternally /* null */): interface_ImVec2 =
        definedExternally

    fun IsMouseDragging(
        button: Number? = definedExternally /* null */, lock_threshold: Number? = definedExternally /* null */
    ): Boolean = definedExternally

    fun GetMouseDragDelta(
        button: Number? = definedExternally /* null */,
        lock_threshold: Number? = definedExternally /* null */,
        out: interface_ImVec2? = definedExternally /* null */
    ): interface_ImVec2 = definedExternally

    fun ResetMouseDragDelta(button: Number? = definedExternally /* null */): Unit = definedExternally
    fun GetMouseCursor(): dynamic /* Number /* -1 */ | Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ */ =
        definedExternally

    fun SetMouseCursor(type: dynamic /* Number /* -1 */ | Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ */): Unit =
        definedExternally

    fun CaptureMouseFromApp(capture: Boolean? = definedExternally /* null */): Unit = definedExternally
    fun GetClipboardText(): String = definedExternally
    fun SetClipboardText(text: String): Unit = definedExternally
    fun LoadIniSettingsFromDisk(ini_filename: String): Unit = definedExternally
    fun LoadIniSettingsFromMemory(ini_data: String, ini_size: Number? = definedExternally /* null */): Unit =
        definedExternally

    fun SaveIniSettingsToDisk(ini_filename: String): Unit = definedExternally
    fun SaveIniSettingsToMemory(out_ini_size: ImScalar<Number>? = definedExternally /* null */): String =
        definedExternally

    fun DebugCheckVersionAndDataLayout(
        version_str: String,
        sz_io: Number,
        sz_style: Number,
        sz_vec2: Number,
        sz_vec4: Number,
        sz_draw_vert: Number,
        sz_draw_idx: Number
    ): Boolean = definedExternally

    fun SetAllocatorFunctions(
        alloc_func: (sz: Number, user_data: Any) -> Number,
        free_func: (ptr: Number, user_data: Any) -> Unit,
        user_data: Any? = definedExternally /* null */
    ): Unit = definedExternally

    fun MemAlloc(sz: Number): Unit = definedExternally
    fun MemFree(ptr: Any): Unit = definedExternally
    fun ShowMetricsWindow(): Unit = definedExternally
    fun ShowStackToolWindow(): Unit = definedExternally
    fun ShowAboutWindow(): Unit = definedExternally
    fun Begin(name: String): Boolean = definedExternally
    fun IsWindowFocused(): Boolean = definedExternally
    fun SetNextWindowPos(pos: Any?): Unit = definedExternally
    fun SetNextWindowSize(pos: Any?): Unit = definedExternally
    fun SetNextWindowCollapsed(collapsed: Boolean): Unit = definedExternally
    fun SetWindowPos(name_or_pos: String): Unit = definedExternally
    fun SetWindowPos(name_or_pos: Any?): Unit = definedExternally
    fun SetWindowSize(name_or_size: String): Unit = definedExternally
    fun SetWindowSize(name_or_size: Any?): Unit = definedExternally
    fun SetWindowCollapsed(name_or_collapsed: String): Unit = definedExternally
    fun SetWindowCollapsed(name_or_collapsed: Boolean): Unit = definedExternally
    fun InvisibleButton(str_id: String, size: Any?): Boolean = definedExternally
    fun BeginCombo(label: String): Boolean = definedExternally
    fun ColorPicker4(label: String, col: RGBA): Boolean = definedExternally
    fun ColorPicker4(label: String, col: ImTuple4<Number>): Boolean = definedExternally
    fun ColorPicker4(label: String, col: interface_ImVec4): Boolean = definedExternally
    fun SetNextItemOpen(is_open: Boolean): Unit = definedExternally
    fun Selectable(label: String): Boolean = definedExternally
    fun BeginPopupModal(str_id: String): Boolean = definedExternally
    fun OpenPopup(str_id: String): Unit = definedExternally
    fun OpenPopupOnItemClick(): Unit = definedExternally
    fun BeginPopupContextItem(): Boolean = definedExternally
    fun BeginPopupContextWindow(): Boolean = definedExternally
    fun BeginPopupContextVoid(): Boolean = definedExternally
    fun IsPopupOpen(str_id: String): Boolean = definedExternally
    fun TableNextRow(): Unit = definedExternally
    fun BeginTabBar(str_id: String): Boolean = definedExternally
    fun BeginTabItem(label: String): Boolean = definedExternally
    fun TabItemButton(label: String): Boolean = definedExternally
    fun <T> SetDragDropPayload(type: String, data: T): Boolean = definedExternally
    fun IsItemClicked(): Boolean = definedExternally
}