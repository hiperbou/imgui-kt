//@file:JsModule("imgui-js")
//@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("ImGui_Impl")
package com.hiperbou.imguijs.ImGui_Bind

import com.hiperbou.imguijs.*
import com.hiperbou.imguijs.ImGui.ImVec2
import com.hiperbou.imguijs.emscripten.*
import com.hiperbou.imguijs.tsstdlib.Readonly
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

@JsName("default")
external fun Module(Module: ModulePartial = definedExternally): Module

external interface mallinfo {
    var arena: Number
    var ordblks: Number
    var smblks: Number
    var hblks: Number
    var hblkhd: Number
    var usmblks: Number
    var fsmblks: Number
    var uordblks: Number
    var fordblks: Number
    var keepcost: Number
}

external open class WrapImGuiContext : EmscriptenClass

external interface interface_ImVec2 {
    var x: Number
    var y: Number
    fun Set(x: Number, y: Number): interface_ImVec2 /* this */
    fun Copy(other: Readonly<interface_ImVec2>): interface_ImVec2 /* this */
    fun Equals(other: Readonly<interface_ImVec2>): Boolean
}

external interface reference_ImVec2 : EmscriptenClassReference, interface_ImVec2

external interface interface_ImVec4 {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    fun Set(x: Number, y: Number, z: Number, w: Number): interface_ImVec4 /* this */
    fun Copy(other: Readonly<interface_ImVec4>): interface_ImVec4 /* this */
    fun Equals(other: Readonly<interface_ImVec4>): Boolean
}

external interface reference_ImVec4 : EmscriptenClassReference, interface_ImVec4

external interface reference_ImGuiInputTextCallbackData : EmscriptenClassReference {
    var EventFlag: ImGuiInputTextFlags
    var Flags: ImGuiInputTextFlags
    var UserData: Any
    var EventChar: ImWchar
    var EventKey: ImGuiKey
    var Buf: String
    var BufTextLen: Number
    var BufSize: Number
    var BufDirty: Boolean
    var CursorPos: Number
    var SelectionStart: Number
    var SelectionEnd: Number
    fun DeleteChars(pos: Number, bytes_count: Number)
    fun InsertChars(pos: Number, text: String)
    fun SelectAll()
    fun ClearSelection()
    fun HasSelection(): Boolean
}

external interface reference_ImGuiSizeCallbackData : EmscriptenClassReference {
    var Pos: Readonly<reference_ImVec2>
    var CurrentSize: Readonly<reference_ImVec2>
    var DesiredSize: reference_ImVec2
}

external open class ImGuiListClipper : EmscriptenClass {
    open var DisplayStart: Number
    open var DisplayEnd: Number
    open var ItemsCount: Number
    open var ItemsHeight: Number
    open var StartPosY: Number
    open fun Begin(items_count: Number, items_height: Number)
    open fun End()
    open fun Step(): Boolean
}

external interface reference_ImGuiTableColumnSortSpecs : EmscriptenClassReference {
    var ColumnUserID: Number
    var ColumnIndex: Number
    var SortOrder: Number
    var SortDirection: Number
}

external interface reference_ImGuiTableSortSpecs : EmscriptenClassReference {
    fun GetSpec(idx: Number): reference_ImGuiTableColumnSortSpecs
    var SpecsCount: Number
    var SpecsDirty: Boolean
}

external interface interface_ImGuiStyle {
    var Alpha: Number
    var DisabledAlpha: Number
    var WindowPadding: reference_ImVec2
    var WindowRounding: Number
    var WindowBorderSize: Number
    var WindowMinSize: reference_ImVec2
    var WindowTitleAlign: reference_ImVec2
    var WindowMenuButtonPosition: ImGuiDir
    var ChildRounding: Number
    var ChildBorderSize: Number
    var PopupRounding: Number
    var PopupBorderSize: Number
    var FramePadding: reference_ImVec2
    var FrameRounding: Number
    var FrameBorderSize: Number
    var ItemSpacing: reference_ImVec2
    var ItemInnerSpacing: reference_ImVec2
    var TouchExtraPadding: reference_ImVec2
    var CellPadding: reference_ImVec2
    var IndentSpacing: Number
    var ColumnsMinSpacing: Number
    var ScrollbarSize: Number
    var ScrollbarRounding: Number
    var GrabMinSize: Number
    var GrabRounding: Number
    var LogSliderDeadzone: Number
    var TabRounding: Number
    var TabBorderSize: Number
    var TabMinWidthForCloseButton: Number
    var ColorButtonPosition: Number
    var ButtonTextAlign: reference_ImVec2
    var SelectableTextAlign: reference_ImVec2
    var DisplayWindowPadding: reference_ImVec2
    var DisplaySafeAreaPadding: reference_ImVec2
    var MouseCursorScale: Number
    var AntiAliasedLines: Boolean
    var AntiAliasedLinesUseTex: Boolean
    var AntiAliasedFill: Boolean
    var CurveTessellationTol: Number
    var CircleTessellationMaxError: Number
    fun _getAt_Colors(idx: Number): interface_ImVec4
    fun _setAt_Colors(idx: Number, value: Readonly<interface_ImVec4>): Boolean
    fun ScaleAllSizes(scale_factor: Number)
}

external open class ImGuiStyle : EmscriptenClass, interface_ImGuiStyle {
    override var Alpha: Number
    override var DisabledAlpha: Number
    override var WindowPadding: reference_ImVec2
    override var WindowRounding: Number
    override var WindowBorderSize: Number
    override var WindowMinSize: reference_ImVec2
    override var WindowTitleAlign: reference_ImVec2
    override var WindowMenuButtonPosition: ImGuiDir
    override var ChildRounding: Number
    override var ChildBorderSize: Number
    override var PopupRounding: Number
    override var PopupBorderSize: Number
    override var FramePadding: reference_ImVec2
    override var FrameRounding: Number
    override var FrameBorderSize: Number
    override var ItemSpacing: reference_ImVec2
    override var ItemInnerSpacing: reference_ImVec2
    override var TouchExtraPadding: reference_ImVec2
    override var CellPadding: reference_ImVec2
    override var IndentSpacing: Number
    override var ColumnsMinSpacing: Number
    override var ScrollbarSize: Number
    override var ScrollbarRounding: Number
    override var GrabMinSize: Number
    override var GrabRounding: Number
    override var LogSliderDeadzone: Number
    override var TabRounding: Number
    override var TabBorderSize: Number
    override var TabMinWidthForCloseButton: Number
    override var ColorButtonPosition: ImGuiDir
    override var ButtonTextAlign: reference_ImVec2
    override var SelectableTextAlign: reference_ImVec2
    override var DisplayWindowPadding: reference_ImVec2
    override var DisplaySafeAreaPadding: reference_ImVec2
    override var MouseCursorScale: Number
    override var AntiAliasedLines: Boolean
    override var AntiAliasedLinesUseTex: Boolean
    override var AntiAliasedFill: Boolean
    override var CurveTessellationTol: Number
    override var CircleTessellationMaxError: Number
    override fun _getAt_Colors(idx: Number): reference_ImVec4
    override fun _setAt_Colors(idx: Number, value: Readonly<interface_ImVec4>): Boolean
    override fun ScaleAllSizes(scale_factor: Number)
}

external interface reference_DragDropPayload : EmscriptenClassReference

external interface reference_ImDrawCmd : EmscriptenClassReference {
    var ElemCount: Number
    var ClipRect: Readonly<reference_ImVec4>
    var TextureId: ImTextureID
    var VtxOffset: Number
    var IdxOffset: Number
}

external interface reference_ImDrawListSharedData : EmscriptenClassReference

external interface reference_ImDrawList : EmscriptenClassReference {
    fun IterateDrawCmds(callback: (draw_cmd: reference_ImDrawCmd, ElemStart: Number) -> Unit)
    var IdxBuffer: Uint8Array
    var VtxBuffer: Uint8Array
    var Flags: ImDrawListFlags
    fun PushClipRect(clip_rect_min: Readonly<interface_ImVec2>, clip_rect_max: Readonly<interface_ImVec2>, intersect_with_current_clip_rect: Boolean)
    fun PushClipRectFullScreen()
    fun PopClipRect()
    fun PushTextureID(texture_id: ImTextureID)
    fun PopTextureID()
    fun GetClipRectMin(out: interface_ImVec2): Any
    fun GetClipRectMax(out: interface_ImVec2): Any
    fun AddLine(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32, thickness: Number)
    fun AddRect(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32, rounding: Number, rounding_corners_flags: ImDrawFlags, thickness: Number)
    fun AddRectFilled(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32, rounding: Number, rounding_corners_flags: ImDrawFlags)
    fun AddRectFilledMultiColor(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col_upr_left: ImU32, col_upr_right: ImU32, col_bot_right: ImU32, col_bot_left: ImU32)
    fun AddQuad(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, d: Readonly<interface_ImVec2>, col: ImU32, thickness: Number)
    fun AddQuadFilled(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, d: Readonly<interface_ImVec2>, col: ImU32)
    fun AddTriangle(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, col: ImU32, thickness: Number)
    fun AddTriangleFilled(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, col: ImU32)
    fun AddCircle(centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number, thickness: Number)
    fun AddCircleFilled(centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number)
    fun AddNgon(centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number, thickness: Number)
    fun AddNgonFilled(centre: Readonly<interface_ImVec2>, radius: Number, col: ImU32, num_segments: Number)
    fun AddText_A(pos: Readonly<interface_ImVec2>, col: ImU32, text_begin: String)
    fun AddText_B(font: reference_ImFont, font_size: Number, pos: Readonly<interface_ImVec2>, col: ImU32, text_begin: String, wrap_width: Number, cpu_fine_clip_rect: Readonly<interface_ImVec4>?)
    fun AddImage(user_texture_id: ImTextureID, a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, uv_a: Readonly<interface_ImVec2>, uv_b: Readonly<interface_ImVec2>, col: ImU32)
    fun AddImageQuad(user_texture_id: ImTextureID, a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, d: Readonly<interface_ImVec2>, uv_a: Readonly<interface_ImVec2>, uv_b: Readonly<interface_ImVec2>, uv_c: Readonly<interface_ImVec2>, uv_d: Readonly<interface_ImVec2>, col: ImU32)
    fun AddImageRounded(user_texture_id: ImTextureID, a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, uv_a: Readonly<interface_ImVec2>, uv_b: Readonly<interface_ImVec2>, col: ImU32, rounding: Number, flags: ImDrawFlags)
    fun AddPolyline(points: Array<Readonly<interface_ImVec2>>, num_points: Number, col: ImU32, flags: ImDrawFlags, thickness: Number)
    fun AddConvexPolyFilled(points: Array<Readonly<interface_ImVec2>>, num_points: Number, col: ImU32)
    fun AddBezierCubic(pos0: Readonly<interface_ImVec2>, cp0: Readonly<interface_ImVec2>, cp1: Readonly<interface_ImVec2>, pos1: Readonly<interface_ImVec2>, col: ImU32, thickness: Number, num_segments: Number)
    fun AddBezierQuadratic(pos0: Readonly<interface_ImVec2>, cp0: Readonly<interface_ImVec2>, cp1: Readonly<interface_ImVec2>, col: ImU32, thickness: Number, num_segments: Number)
    fun PathClear()
    fun PathLineTo(pos: Readonly<interface_ImVec2>)
    fun PathLineToMergeDuplicate(pos: Readonly<interface_ImVec2>)
    fun PathFillConvex(col: ImU32)
    fun PathStroke(col: ImU32, flags: ImDrawFlags, thickness: Number)
    fun PathArcTo(centre: Readonly<interface_ImVec2>, radius: Number, a_min: Number, a_max: Number, num_segments: Number)
    fun PathArcToFast(centre: Readonly<interface_ImVec2>, radius: Number, a_min_of_12: Number, a_max_of_12: Number)
    fun PathBezierCubicCurveTo(p1: Readonly<interface_ImVec2>, p2: Readonly<interface_ImVec2>, p3: Readonly<interface_ImVec2>, num_segments: Number)
    fun PathBezierQuadraticCurveTo(p2: Readonly<interface_ImVec2>, p3: Readonly<interface_ImVec2>, num_segments: Number)
    fun PathRect(rect_min: Readonly<interface_ImVec2>, rect_max: Readonly<interface_ImVec2>, rounding: Number, flags: ImDrawFlags)
    fun ChannelsSplit(channels_count: Number)
    fun ChannelsMerge()
    fun ChannelsSetCurrent(channel_index: Number)
    fun AddCallback(callback: ImDrawCallback, callback_data: Any)
    fun AddDrawCmd()
    fun Clear()
    fun ClearFreeMemory()
    fun PrimReserve(idx_count: Number, vtx_count: Number)
    fun PrimUnreserve(idx_count: Number, vtx_count: Number)
    fun PrimRect(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, col: ImU32)
    fun PrimRectUV(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, uv_a: Readonly<interface_ImVec2>, uv_b: Readonly<interface_ImVec2>, col: ImU32)
    fun PrimQuadUV(a: Readonly<interface_ImVec2>, b: Readonly<interface_ImVec2>, c: Readonly<interface_ImVec2>, d: Readonly<interface_ImVec2>, uv_a: Readonly<interface_ImVec2>, uv_b: Readonly<interface_ImVec2>, uv_c: Readonly<interface_ImVec2>, uv_d: Readonly<interface_ImVec2>, col: ImU32)
    fun PrimWriteVtx(pos: Readonly<interface_ImVec2>, us: Readonly<interface_ImVec2>, col: ImU32)
    fun PrimWriteIdx(idx: Number)
    fun PrimVtx(pos: Readonly<interface_ImVec2>, uv: Readonly<interface_ImVec2>, col: ImU32)
    fun UpdateClipRect()
    fun UpdateTextureID()
    fun _CalcCircleAutoSegmentCount(radius: Number): Number
}

external interface reference_ImDrawData : EmscriptenClassReference {
    fun IterateDrawLists(callback: (draw_list: reference_ImDrawList) -> Unit)
    var Valid: Boolean
    var CmdListsCount: Number
    var TotalVtxCount: Number
    var TotalIdxCount: Number
    var DisplayPos: Readonly<reference_ImVec2>
    var DisplaySize: Readonly<reference_ImVec2>
    var FramebufferScale: Readonly<reference_ImVec2>
    fun DeIndexAllBuffers()
    fun ScaleClipRects(fb_scale: Readonly<interface_ImVec2>)
}

external interface reference_ImFont : EmscriptenClassReference {
    var FontSize: Number
    var Scale: Number
    var DisplayOffset: reference_ImVec2
    fun IterateGlyphs(callback: (cfg: reference_ImFontGlyph) -> Unit)
    var FallbackGlyph: Readonly<reference_ImFontGlyph>?
    var FallbackAdvanceX: Number
    var FallbackChar: Number
    var EllipsisChar: Number
    var DotChar: Number
    var ConfigDataCount: Number
    fun IterateConfigData(callback: (cfg: interface_ImFontConfig) -> Unit)
    var Ascent: Number
    var Descent: Number
    var MetricsTotalSurface: Number
    fun ClearOutputData()
    fun BuildLookupTable()
    fun FindGlyph(c: Number): Readonly<reference_ImFontGlyph>?
    fun FindGlyphNoFallback(c: Number): Readonly<reference_ImFontGlyph>?
    fun GetCharAdvance(c: Number): Number
    fun IsLoaded(): Boolean
    fun GetDebugName(): String
    fun CalcTextSizeA(size: Number, max_width: Number, wrap_width: Number, text_begin: String, remaining: Any /* JsTuple<Number> */, out: interface_ImVec2): interface_ImVec2
    fun CalcWordWrapPositionA(scale: Number, text: String, wrap_width: Number): Number
    fun RenderChar(draw_list: reference_ImDrawList, size: Number, pos: Readonly<interface_ImVec2>, col: ImU32, c: ImWchar)
}

external interface interface_ImFontConfig {
    var FontData: DataView?
    var FontDataOwnedByAtlas: Boolean
    var FontNo: Number
    var SizePixels: Number
    var OversampleH: Number
    var OversampleV: Number
    var PixelSnapH: Boolean
    var GlyphExtraSpacing: ImVec2
    var GlyphOffset: ImVec2
    var GlyphRanges: Number?
    var GlyphMinAdvanceX: Number
    var GlyphMaxAdvanceX: Number
    var MergeMode: Boolean
    var FontBuilderFlags: Number
    var RasterizerMultiply: Number
    var Name: String
    var DstFont: reference_ImFont?
}

external interface reference_ImFontConfig : EmscriptenClassReference, interface_ImFontConfig

external interface interface_ImFontGlyph {
    var Colored: Boolean
    var Visible: Boolean
    var Codepoint: Number
    var AdvanceX: Number
    var X0: Number
    var Y0: Number
    var X1: Number
    var Y1: Number
    var U0: Number
    var V0: Number
    var U1: Number
    var V1: Number
}

external interface reference_ImFontGlyph : EmscriptenClassReference, interface_ImFontGlyph

external interface `T$0` {
    var pixels: Uint8ClampedArray
    var width: Number
    var height: Number
    var bytes_per_pixel: Number
}

external interface reference_ImFontAtlas : EmscriptenClassReference {
    fun AddFontDefault(font_cfg: interface_ImFontConfig? = definedExternally): reference_ImFont
    fun AddFontFromMemoryTTF(data: Uint8Array, size_pixels: Number, font_cfg: interface_ImFontConfig?, glyph_ranges: Number?): reference_ImFont
    fun ClearTexData()
    fun ClearInputData()
    fun ClearFonts()
    fun Clear()
    fun Build(): Boolean
    fun IsBuilt(): Boolean
    fun GetTexDataAsAlpha8(): `T$0`
    fun GetTexDataAsRGBA32(): `T$0`
    fun GetGlyphRangesDefault(): Number
    fun GetGlyphRangesKorean(): Number
    fun GetGlyphRangesJapanese(): Number
    fun GetGlyphRangesChineseFull(): Number
    fun GetGlyphRangesChineseSimplifiedCommon(): Number
    fun GetGlyphRangesCyrillic(): Number
    fun GetGlyphRangesThai(): Number
    fun GetGlyphRangesVietnamese(): Number
    var Locked: Boolean
    var Flags: ImFontAtlasFlags
    var TexID: ImTextureID
    var TexDesiredWidth: Number
    var TexGlyphPadding: Number
    var TexWidth: Number
    var TexHeight: Number
    var TexUvScale: Readonly<reference_ImVec2>
    var TexUvWhitePixel: Readonly<reference_ImVec2>
    fun IterateFonts(callback: (font: reference_ImFont) -> Unit)
}

external interface reference_ImGuiViewport : EmscriptenClassReference {
    var Flags: ImGuiViewportFlags
    var Pos: interface_ImVec2
    var Size: interface_ImVec2
    var WorkPos: interface_ImVec2
    var WorkSize: interface_ImVec2
}

external interface reference_ImGuiIO : EmscriptenClassReference {
    var ConfigFlags: ImGuiConfigFlags
    var BackendFlags: ImGuiBackendFlags
    var DisplaySize: reference_ImVec2
    var DeltaTime: Number
    var IniSavingRate: Number
    var IniFilename: String
    var LogFilename: String
    var MouseDoubleClickTime: Number
    var MouseDoubleClickMaxDist: Number
    var MouseDragThreshold: Number
    fun _getAt_KeyMap(index: ImGuiKey): Number
    fun _setAt_KeyMap(index: ImGuiKey, value: Number): Boolean
    var KeyRepeatDelay: Number
    var KeyRepeatRate: Number
    var UserData: Any
    var Fonts: reference_ImFontAtlas
    var FontGlobalScale: Number
    var FontAllowUserScaling: Boolean
    var FontDefault: reference_ImFont?
    var DisplayFramebufferScale: reference_ImVec2
    var MouseDrawCursor: Boolean
    var ConfigMacOSXBehaviors: Boolean
    var ConfigInputTextCursorBlink: Boolean
    var ConfigDragClickToInputText: Boolean
    var ConfigWindowsResizeFromEdges: Boolean
    var ConfigWindowsMoveFromTitleBarOnly: Boolean
    var ConfigMemoryCompactTimer: Number
    var BackendPlatformName: String?
    var BackendRendererName: String?
    var BackendPlatformUserData: String?
    var BackendRendererUserData: String?
    var BackendLanguageUserData: String?
    var GetClipboardTextFn: ((user_data: Any) -> String)?
    var SetClipboardTextFn: ((user_data: Any, text: String) -> Unit)?
    var ClipboardUserData: Any
    var MousePos: reference_ImVec2
    fun _getAt_MouseDown(index: Number): Boolean
    fun _setAt_MouseDown(index: Number, value: Boolean): Boolean
    var MouseWheel: Number
    var MouseWheelH: Number
    var KeyCtrl: Boolean
    var KeyShift: Boolean
    var KeyAlt: Boolean
    var KeySuper: Boolean
    fun _getAt_KeysDown(index: Number): Boolean
    fun _setAt_KeysDown(index: Number, value: Boolean): Boolean
    fun _getAt_NavInputs(index: Number): Number
    fun _setAt_NavInputs(index: Number, value: Number): Boolean
    fun AddInputCharacter(c: Number)
    fun AddInputCharacterUTF16(c: ImWchar16)
    fun AddInputCharactersUTF8(utf8_chars: String)
    fun ClearInputCharacters()
    var WantCaptureMouse: Boolean
    var WantCaptureKeyboard: Boolean
    var WantTextInput: Boolean
    var WantSetMousePos: Boolean
    var WantSaveIniSettings: Boolean
    var NavActive: Boolean
    var NavVisible: Boolean
    var Framerate: Double
    var MetricsRenderVertices: Number
    var MetricsRenderIndices: Number
    var MetricsRenderWindows: Number
    var MetricsActiveWindows: Number
    var MetricsActiveAllocations: Number
    var MouseDelta: Readonly<reference_ImVec2>
    var WantCaptureMouseUnlessPopupClose: Boolean
    fun _getAt_MouseClickedPos(index: Number): Readonly<reference_ImVec2>
    fun _getAt_MouseDownDuration(index: Number): Number
    fun _getAt_KeysDownDuration(index: Number): Number
    fun _getAt_NavInputsDownDuration(index: Number): Number
}

external interface Module : EmscriptenModule {
    var __EMSCRIPTEN_major__: Number
    var __EMSCRIPTEN_minor__: Number
    var __EMSCRIPTEN_tiny__: Number
    fun mallinfo(): mallinfo
    var IMGUI_VERSION: String
    fun IMGUI_CHECKVERSION(): Boolean
    var ImGuiIOSize: Number
    var ImGuiStyleSize: Number
    var ImVec2Size: Number
    var ImVec4Size: Number
    var ImDrawVertSize: Number
    var ImDrawIdxSize: Number
    var ImDrawVertPosOffset: Number
    var ImDrawVertUVOffset: Number
    var ImDrawVertColOffset: Number
    var ImGuiListClipper: Any
    var ImGuiStyle: Any
    fun CreateContext(shared_font_atlas: reference_ImFontAtlas?): WrapImGuiContext
    fun DestroyContext(ctx: WrapImGuiContext?)
    fun GetCurrentContext(): WrapImGuiContext?
    fun SetCurrentContext(ctx: WrapImGuiContext?)
    fun GetIO(): reference_ImGuiIO
    fun GetStyle(): ImGuiStyle
    fun NewFrame()
    fun EndFrame()
    fun Render()
    fun GetDrawData(): reference_ImDrawData?
    fun ShowDemoWindow(p_open: Any /* JsTuple<Boolean> */)
    fun ShowMetricsWindow(p_open: Any /* JsTuple<Boolean> */)
    fun ShowStackToolWindow(p_open: Any /* JsTuple<Boolean> */)
    fun ShowAboutWindow(p_open: Any /* JsTuple<Boolean> */)
    fun ShowStyleEditor(ref: ImGuiStyle?)
    fun ShowStyleSelector(label: String): Boolean
    fun ShowFontSelector(label: String)
    fun ShowUserGuide()
    fun GetVersion(): String
    fun StyleColorsDark(dst: ImGuiStyle?)
    fun StyleColorsLight(dst: ImGuiStyle?)
    fun StyleColorsClassic(dst: ImGuiStyle?)
    fun Begin(name: String, p_open: Any /* JsTuple<Boolean> */, flags: ImGuiWindowFlags): Boolean
    fun End()
    fun BeginChild(id: String, size: Readonly<interface_ImVec2>, border: Boolean, flags: ImGuiWindowFlags): Boolean
    fun BeginChild(id: ImGuiID, size: Readonly<interface_ImVec2>, border: Boolean, flags: ImGuiWindowFlags): Boolean
    fun EndChild()
    fun IsWindowAppearing(): Boolean
    fun IsWindowCollapsed(): Boolean
    fun IsWindowFocused(flags: ImGuiFocusedFlags): Boolean
    fun IsWindowHovered(flags: ImGuiHoveredFlags): Boolean
    fun GetWindowDrawList(): reference_ImDrawList
    fun GetWindowPos(out: interface_ImVec2): Any
    fun GetWindowSize(out: interface_ImVec2): Any
    fun GetWindowWidth(): Number
    fun GetWindowHeight(): Number
    fun SetNextWindowPos(pos: Readonly<interface_ImVec2>, cond: ImGuiCond, pivot: Readonly<interface_ImVec2>)
    fun SetNextWindowSize(size: Readonly<interface_ImVec2>, cond: ImGuiCond)
    fun SetNextWindowSizeConstraints(size_min: Readonly<interface_ImVec2>, size_max: Readonly<interface_ImVec2>, custom_callback: ImGuiSizeCallback?, data: Any)
    fun SetNextWindowContentSize(size: Readonly<interface_ImVec2>)
    fun SetNextWindowCollapsed(collapsed: Boolean, cond: ImGuiCond)
    fun SetNextWindowFocus()
    fun SetNextWindowBgAlpha(alpha: Number)
    fun SetWindowPos(pos: Readonly<interface_ImVec2>, cond: ImGuiCond)
    fun SetWindowSize(size: Readonly<interface_ImVec2>, cond: ImGuiCond)
    fun SetWindowCollapsed(collapsed: Boolean, cond: ImGuiCond)
    fun SetWindowFocus()
    fun SetWindowFontScale(scale: Number)
    fun SetWindowNamePos(name: String, pos: Readonly<interface_ImVec2>, cond: ImGuiCond)
    fun SetWindowNameSize(name: String, size: Readonly<interface_ImVec2>, cond: ImGuiCond)
    fun SetWindowNameCollapsed(name: String, collapsed: Boolean, cond: ImGuiCond)
    fun SetWindowNameFocus(name: String)
    fun GetContentRegionAvail(out: interface_ImVec2): Any
    fun GetContentRegionMax(out: interface_ImVec2): Any
    fun GetWindowContentRegionMin(out: interface_ImVec2): Any
    fun GetWindowContentRegionMax(out: interface_ImVec2): Any
    fun GetScrollX(): Number
    fun GetScrollY(): Number
    fun SetScrollX(scroll_x: Number)
    fun SetScrollY(scroll_y: Number)
    fun GetScrollMaxX(): Number
    fun GetScrollMaxY(): Number
    fun SetScrollHereX(center_x_ratio: Number)
    fun SetScrollHereY(center_y_ratio: Number)
    fun SetScrollFromPosX(pos_x: Number, center_x_ratio: Number)
    fun SetScrollFromPosY(pos_y: Number, center_y_ratio: Number)
    fun PushFont(font: reference_ImFont?)
    fun PopFont()
    fun PushStyleColor(idx: ImGuiCol, col: ImU32)
    fun PushStyleColor(idx: ImGuiCol, col: Readonly<interface_ImVec4>)
    fun PopStyleColor(count: Number)
    fun PushStyleVar(idx: ImGuiStyleVar, param_val: Number)
    fun PushStyleVar(idx: ImGuiStyleVar, param_val: Readonly<interface_ImVec2>)
    fun PopStyleVar(count: Number)
    fun PushAllowKeyboardFocus(allow_keyboard_focus: Boolean)
    fun PopAllowKeyboardFocus()
    fun PushButtonRepeat(repeat: Boolean)
    fun PopButtonRepeat()
    fun PushItemWidth(item_width: Number)
    fun PopItemWidth()
    fun SetNextItemWidth(item_width: Number)
    fun CalcItemWidth(): Number
    fun PushTextWrapPos(wrap_pos_x: Number)
    fun PopTextWrapPos()
    fun GetFont(): reference_ImFont
    fun GetFontSize(): Number
    fun GetFontTexUvWhitePixel(out: interface_ImVec2): Any
    fun GetColorU32_A(idx: ImGuiCol, alpha_mul: Number): ImU32
    fun GetColorU32_B(col: Readonly<interface_ImVec4>): ImU32
    fun GetColorU32_C(col: ImU32): ImU32
    fun GetStyleColorVec4(idx: ImGuiCol): Readonly<reference_ImVec4>
    fun Separator()
    fun SameLine(pos_x: Number, spacing_w: Number)
    fun NewLine()
    fun Spacing()
    fun Dummy(size: Readonly<interface_ImVec2>)
    fun Indent(indent_w: Number)
    fun Unindent(indent_w: Number)
    fun BeginGroup()
    fun EndGroup()
    fun GetCursorPos(out: interface_ImVec2): Any
    fun GetCursorPosX(): Number
    fun GetCursorPosY(): Number
    fun SetCursorPos(local_pos: Readonly<interface_ImVec2>)
    fun SetCursorPosX(x: Number)
    fun SetCursorPosY(y: Number)
    fun GetCursorStartPos(out: interface_ImVec2): Any
    fun GetCursorScreenPos(out: interface_ImVec2): Any
    fun SetCursorScreenPos(pos: interface_ImVec2)
    fun AlignTextToFramePadding()
    fun GetTextLineHeight(): Number
    fun GetTextLineHeightWithSpacing(): Number
    fun GetFrameHeight(): Number
    fun GetFrameHeightWithSpacing(): Number
    fun PushID(id: String)
    fun PushID(id: Number)
    fun PopID()
    fun GetID(id: String): ImGuiID
    fun GetID(id: Number): ImGuiID
    fun TextUnformatted(text: String)
    fun Text(fmt: String)
    fun TextColored(col: Readonly<interface_ImVec4>, fmt: String)
    fun TextDisabled(fmt: String)
    fun TextWrapped(fmt: String)
    fun LabelText(label: String, fmt: String)
    fun BulletText(fmt: String)
    fun Button(label: String, size: Readonly<interface_ImVec2>): Boolean
    fun SmallButton(label: String): Boolean
    fun InvisibleButton(str_id: String, size: Readonly<interface_ImVec2>, flags: ImGuiButtonFlags): Boolean
    fun ArrowButton(label: String, dir: ImGuiDir): Boolean
    fun Image(user_texture_id: Any, size: Readonly<interface_ImVec2>, uv0: Readonly<interface_ImVec2>, uv1: Readonly<interface_ImVec2>, tint_col: Readonly<interface_ImVec4>, border_col: Readonly<interface_ImVec4>)
    fun ImageButton(user_texture_id: Any, size: Readonly<interface_ImVec2>, uv0: Readonly<interface_ImVec2>, uv1: Readonly<interface_ImVec2>, frame_padding: Number, bg_col: Readonly<interface_ImVec4>, tint_col: Readonly<interface_ImVec4>): Boolean
    fun Checkbox(label: String, v: Any /* JsTuple<Boolean> */): Boolean
    fun CheckboxFlags(label: String, flags: Any /* JsTuple<Number> */, flags_value: Number): Boolean
    fun RadioButton_A(label: String, active: Boolean): Boolean
    fun RadioButton_B(label: String, v: Any /* JsTuple<Number> */, v_button: Number): Boolean
    fun ProgressBar(fraction: Number, size_arg: Readonly<interface_ImVec2>, overlay: String?)
    fun Bullet()
    fun BeginCombo(label: String, preview_value: String?, flags: ImGuiComboFlags): Boolean
    fun EndCombo()
    fun <T> Combo(label: String, current_item: Any /* JsTuple<Number> */, items_getter: (data: T, idx: Number, out_text: Any /* JsTuple<String> */) -> Boolean, data: T, items_count: Number, popup_max_height_in_items: Number): Boolean
    fun DragFloat(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragFloat2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragFloat3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragFloat4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragFloatRange2(label: String, v_current_min: Any /* JsTuple<Number> */, v_current_max: Any /* JsTuple<Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, format_max: String?, flags: ImGuiSliderFlags): Boolean
    fun DragInt(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragInt2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragInt3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragInt4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun DragIntRange2(label: String, v_current_min: Any /* JsTuple<Number> */, v_current_max: Any /* JsTuple<Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, format_max: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Int8Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Uint8Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Int16Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Uint16Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Int32Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Uint32Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Float32Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun DragScalar(label: String, data_type: ImGuiDataType, v: Float64Array, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderFloat(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderFloat2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderFloat3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderFloat4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderAngle(label: String, v_rad: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_degrees_min: Number, v_degrees_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderInt(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderInt2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderInt3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderInt4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Int8Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Uint8Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Int16Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Uint16Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Int32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Uint32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Float32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun SliderScalar(label: String, data_type: ImGuiDataType, v: Float64Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderFloat(label: String, size: Readonly<interface_ImVec2>, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun VSliderInt(label: String, size: Readonly<interface_ImVec2>, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Int8Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Uint8Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Int16Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Uint16Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Int32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Uint32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Float32Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun VSliderScalar(label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: Float64Array, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags): Boolean
    fun InputText(label: String, buf: Any /* JsTuple<String> */, buf_size: Number, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any): Boolean
    fun InputTextMultiline(label: String, buf: Any /* JsTuple<String> */, buf_size: Number, size: Readonly<interface_ImVec2>, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any): Boolean
    fun InputTextWithHint(label: String, hint: String, buf: Any /* JsTuple<String> */, buf_size: Number, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any): Boolean
    fun InputFloat(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, format: String, flags: ImGuiInputTextFlags): Boolean
    fun InputFloat2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags): Boolean
    fun InputFloat3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags): Boolean
    fun InputFloat4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags): Boolean
    fun InputInt(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, flags: ImGuiInputTextFlags): Boolean
    fun InputInt2(label: String, v: Any /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags): Boolean
    fun InputInt3(label: String, v: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags): Boolean
    fun InputInt4(label: String, v: Any /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags): Boolean
    fun InputDouble(label: String, v: Any /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, format: String, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Int8Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Uint8Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Int16Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Uint16Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Int32Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Uint32Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Float32Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun InputScalar(label: String, data_type: ImGuiDataType, v: Float64Array, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags): Boolean
    fun ColorEdit3(label: String, col: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags): Boolean
    fun ColorEdit4(label: String, col: Any /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags): Boolean
    fun ColorPicker3(label: String, col: Any /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags): Boolean
    fun ColorPicker4(label: String, col: Any /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags, ref_col: Any /* JsTuple<Number, Number, Number, Number> */): Boolean
    fun ColorButton(desc_id: String, col: Readonly<interface_ImVec4>, flags: ImGuiColorEditFlags, size: Readonly<interface_ImVec2>): Boolean
    fun SetColorEditOptions(flags: ImGuiColorEditFlags)
    fun TreeNode_A(label: String): Boolean
    fun TreeNode_B(str_id: String, fmt: String): Boolean
    fun TreeNode_C(ptr_id: Number, fmt: String): Boolean
    fun TreeNodeEx_A(label: String, flags: ImGuiTreeNodeFlags): Boolean
    fun TreeNodeEx_B(str_id: String, flags: ImGuiTreeNodeFlags, fmt: String): Boolean
    fun TreeNodeEx_C(ptr_id: Number, flags: ImGuiTreeNodeFlags, fmt: String): Boolean
    fun TreePush_A(str_id: String)
    fun TreePush_B(ptr_id: Number)
    fun TreePop()
    fun GetTreeNodeToLabelSpacing(): Number
    fun CollapsingHeader_A(label: String, flags: ImGuiTreeNodeFlags): Boolean
    fun CollapsingHeader_B(label: String, p_open: Any /* JsTuple<Boolean> */, flags: ImGuiTreeNodeFlags): Boolean
    fun SetNextItemOpen(is_open: Boolean, cond: ImGuiCond)
    fun Selectable_A(label: String, selected: Boolean, flags: ImGuiSelectableFlags, size: interface_ImVec2): Boolean
    fun Selectable_B(label: String, p_selected: Any /* JsTuple<Boolean> */, flags: ImGuiSelectableFlags, size: interface_ImVec2): Boolean
    fun BeginListBox(label: String, size: Readonly<interface_ImVec2>): Boolean
    fun EndListBox()
    fun ListBox_A(label: String, current_item: Any /* JsTuple<Number> */, items: Array<String>, items_count: Number, height_in_items: Number): Boolean
    fun <T> ListBox_B(label: String, current_item: Any /* JsTuple<Number> */, items_getter: (data: T, idx: Number, out_text: Any /* JsTuple<String> */) -> Boolean, data: T, items_count: Number, height_in_items: Number): Boolean
    fun <T> PlotLines(label: String, values_getter: (data: T, idx: Number) -> Number, data: T, values_count: Number, value_offset: Number, overlay_text: String?, scale_min: Number, scale_max: Number, graph_size: Readonly<interface_ImVec2>)
    fun <T> PlotHistogram(label: String, values_getter: (data: T, idx: Number) -> Number, data: T, values_count: Number, value_offset: Number, overlay_text: String?, scale_min: Number, scale_max: Number, graph_size: Readonly<interface_ImVec2>)
    fun Value_A(prefix: String, b: Boolean)
    fun Value_B(prefix: String, v: Number)
    fun Value_C(prefix: String, v: Number)
    fun Value_D(prefix: String, v: Number, float_format: String?)
    fun BeginMenuBar(): Boolean
    fun EndMenuBar()
    fun BeginMainMenuBar(): Boolean
    fun EndMainMenuBar()
    fun BeginMenu(label: String, enabled: Boolean): Boolean
    fun EndMenu()
    fun MenuItem_A(label: String, shortcut: String?, selected: Boolean, enabled: Boolean): Boolean
    fun MenuItem_B(label: String, shortcut: String?, p_selected: Any /* JsTuple<Boolean> */, enabled: Boolean): Boolean
    fun BeginTooltip()
    fun EndTooltip()
    fun SetTooltip(fmt: String)
    fun BeginPopup(str_id: String, flags: ImGuiWindowFlags): Boolean
    fun BeginPopupModal(name: String, p_open: Any /* JsTuple<Boolean> */, flags: ImGuiWindowFlags): Boolean
    fun EndPopup()
    fun OpenPopup(str_id: String, popup_flags: ImGuiPopupFlags)
    fun OpenPopupOnItemClick(str_id: String?, popup_flags: ImGuiPopupFlags)
    fun CloseCurrentPopup()
    fun BeginPopupContextItem(str_id: String?, popup_flags: ImGuiPopupFlags): Boolean
    fun BeginPopupContextWindow(str_id: String?, popup_flags: ImGuiPopupFlags): Boolean
    fun BeginPopupContextVoid(str_id: String?, popup_flags: ImGuiPopupFlags): Boolean
    fun IsPopupOpen(str_id: String, flags: ImGuiPopupFlags): Boolean
    fun BeginTable(str_id: String, column: Number, flags: ImGuiTableFlags, outer_size: interface_ImVec2, inner_width: Number): Boolean
    fun EndTable()
    fun TableNextRow(row_flags: ImGuiTableRowFlags, min_row_height: Number)
    fun TableNextColumn(): Boolean
    fun TableSetColumnIndex(column_n: Number): Boolean
    fun TableSetupColumn(label: String, flags: ImGuiTableColumnFlags, init_width_or_weight: Number, user_id: ImU32)
    fun TableSetupScrollFreeze(cols: Number, rows: Number)
    fun TableHeadersRow()
    fun TableHeader(label: String)
    fun TableGetSortSpecs(): reference_ImGuiTableSortSpecs?
    fun TableGetColumnCount(): Number
    fun TableGetColumnIndex(): Number
    fun TableGetRowIndex(): Number
    fun TableGetColumnName(column_n: Number): String
    fun TableGetColumnFlags(column_n: Number): ImGuiTableColumnFlags
    fun TableSetColumnEnabled(column_n: Number, v: Boolean)
    fun TableSetBgColor(target: ImGuiTableBgTarget, color: ImU32, column_n: Number)
    fun Columns(count: Number, id: String?, border: Boolean)
    fun NextColumn()
    fun GetColumnIndex(): Number
    fun GetColumnWidth(column_index: Number): Number
    fun SetColumnWidth(column_index: Number, width: Number)
    fun GetColumnOffset(column_index: Number): Number
    fun SetColumnOffset(column_index: Number, offset_x: Number)
    fun GetColumnsCount(): Number
    fun BeginTabBar(str_id: String, flags: ImGuiTabBarFlags): Boolean
    fun EndTabBar()
    fun BeginTabItem(label: String, p_open: Any /* JsTuple<Boolean> */, flags: ImGuiTabBarFlags): Boolean
    fun EndTabItem()
    fun TabItemButton(label: String, flags: ImGuiTabItemFlags): Boolean
    fun SetTabItemClosed(tab_or_docked_window_label: String)
    fun LogToTTY(max_depth: Number)
    fun LogToFile(max_depth: Number, filename: String?)
    fun LogToClipboard(max_depth: Number)
    fun LogFinish()
    fun LogButtons()
    fun LogText(fmt: String)
    fun BeginDragDropSource(flags: ImGuiDragDropFlags): Boolean
    fun SetDragDropPayload(type: String, data: Any, size: Number, cond: ImGuiCond): Boolean
    fun EndDragDropSource()
    fun BeginDragDropTarget(): Boolean
    fun AcceptDragDropPayload(type: String, flags: ImGuiDragDropFlags): Boolean
    fun EndDragDropTarget()
    fun GetDragDropPayload(): Nothing?
    fun BeginDisabled(disabled: Boolean)
    fun EndDisabled()
    fun PushClipRect(clip_rect_min: Readonly<interface_ImVec2>, clip_rect_max: Readonly<interface_ImVec2>, intersect_with_current_clip_rect: Boolean)
    fun PopClipRect()
    fun SetItemDefaultFocus()
    fun SetKeyboardFocusHere(offset: Number)
    fun IsItemHovered(flags: ImGuiHoveredFlags): Boolean
    fun IsItemActive(): Boolean
    fun IsItemFocused(): Boolean
    fun IsItemClicked(mouse_button: ImGuiMouseButton): Boolean
    fun IsItemVisible(): Boolean
    fun IsItemEdited(): Boolean
    fun IsItemActivated(): Boolean
    fun IsItemDeactivated(): Boolean
    fun IsItemDeactivatedAfterEdit(): Boolean
    fun IsItemToggledOpen(): Boolean
    fun IsAnyItemHovered(): Boolean
    fun IsAnyItemActive(): Boolean
    fun IsAnyItemFocused(): Boolean
    fun GetItemRectMin(out: interface_ImVec2): Any
    fun GetItemRectMax(out: interface_ImVec2): Any
    fun GetItemRectSize(out: interface_ImVec2): Any
    fun SetItemAllowOverlap()
    fun GetMainViewport(): reference_ImGuiViewport
    fun IsRectVisible_A(size: Readonly<interface_ImVec2>): Boolean
    fun IsRectVisible_B(rect_min: Readonly<interface_ImVec2>, rect_max: Readonly<interface_ImVec2>): Boolean
    fun GetTime(): Number
    fun GetFrameCount(): Number
    fun GetBackgroundDrawList(): reference_ImDrawList
    fun GetForegroundDrawList(): reference_ImDrawList
    fun GetDrawListSharedData(): reference_ImDrawListSharedData
    fun GetStyleColorName(idx: ImGuiCol): String
    fun BeginChildFrame(id: ImGuiID, size: Readonly<interface_ImVec2>, flags: ImGuiWindowFlags): Boolean
    fun EndChildFrame()
    fun CalcTextSize(text: String, hide_text_after_double_hash: Boolean, wrap_width: Number, out: interface_ImVec2): Any
    fun ColorConvertU32ToFloat4(in_: ImU32, out: interface_ImVec4): Any
    fun ColorConvertFloat4ToU32(in_: Readonly<interface_ImVec4>): ImU32
    fun ColorConvertRGBtoHSV(r: Number, g: Number, b: Number, out_h: Any /* JsTuple<Number> */, out_s: Any /* JsTuple<Number> */, out_v: Any /* JsTuple<Number> */)
    fun ColorConvertHSVtoRGB(h: Number, s: Number, v: Number, out_r: Any /* JsTuple<Number> */, out_g: Any /* JsTuple<Number> */, out_b: Any /* JsTuple<Number> */)
    fun GetKeyIndex(imgui_key: ImGuiKey): Number
    fun IsKeyDown(user_key_index: Number): Boolean
    fun IsKeyPressed(user_key_index: Number, repeat: Boolean): Boolean
    fun IsKeyReleased(user_key_index: Number): Boolean
    fun GetKeyPressedAmount(key_index: Number, repeat_delay: Number, rate: Number): Number
    fun CaptureKeyboardFromApp(capture: Boolean)
    fun IsMouseDown(button: ImGuiMouseButton): Boolean
    fun IsMouseClicked(button: ImGuiMouseButton, repeat: Boolean): Boolean
    fun IsMouseReleased(button: ImGuiMouseButton): Boolean
    fun IsMouseDoubleClicked(button: ImGuiMouseButton): Boolean
    fun GetMouseClickedCount(button: ImGuiMouseButton): Number
    fun IsMouseHoveringRect(r_min: Readonly<interface_ImVec2>, r_max: Readonly<interface_ImVec2>, clip: Boolean): Boolean
    fun IsMousePosValid(mouse_pos: Readonly<interface_ImVec2>?): Boolean
    fun IsAnyMouseDown(): Boolean
    fun GetMousePos(out: interface_ImVec2): Any
    fun GetMousePosOnOpeningCurrentPopup(out: interface_ImVec2): Any
    fun IsMouseDragging(button: ImGuiMouseButton, lock_threshold: Number): Boolean
    fun GetMouseDragDelta(button: ImGuiMouseButton, lock_threshold: Number, out: interface_ImVec2): Any
    fun ResetMouseDragDelta(button: ImGuiMouseButton)
    fun GetMouseCursor(): ImGuiMouseCursor
    fun SetMouseCursor(type: ImGuiMouseCursor)
    fun CaptureMouseFromApp(capture: Boolean)
    fun GetClipboardText(): String
    fun SetClipboardText(text: String)
    fun LoadIniSettingsFromMemory(ini_data: String)
    fun SaveIniSettingsToMemory(): String
    fun DebugCheckVersionAndDataLayout(version_str: String, sz_io: Number, sz_style: Number, sz_vec2: Number, sz_vec4: Number, sz_draw_vert: Number, sz_draw_idx: Number): Boolean
    fun SetAllocatorFunctions(alloc_func: (sz: Number, user_data: Any) -> Number, free_func: (ptr: Number, user_data: Any) -> Unit, user_data: Any)
    fun MemAlloc(sz: Number): Any
    fun MemFree(ptr: Any)
}

external interface ModulePartial /*: Emscripten.EmscriptenModulePartial */{
    var __EMSCRIPTEN_major__: Number?
        get() = definedExternally
        set(value) = definedExternally
    var __EMSCRIPTEN_minor__: Number?
        get() = definedExternally
        set(value) = definedExternally
    var __EMSCRIPTEN_tiny__: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mallinfo: (() -> mallinfo)?
        get() = definedExternally
        set(value) = definedExternally
    var IMGUI_VERSION: String?
        get() = definedExternally
        set(value) = definedExternally
    var IMGUI_CHECKVERSION: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ImGuiIOSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImGuiStyleSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImVec2Size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImVec4Size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImDrawVertSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImDrawIdxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImDrawVertPosOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImDrawVertUVOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImDrawVertColOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ImGuiListClipper: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ImGuiStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var CreateContext: ((shared_font_atlas: reference_ImFontAtlas?) -> WrapImGuiContext)?
        get() = definedExternally
        set(value) = definedExternally
    var DestroyContext: ((ctx: WrapImGuiContext?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCurrentContext: (() -> WrapImGuiContext?)?
        get() = definedExternally
        set(value) = definedExternally
    var SetCurrentContext: ((ctx: WrapImGuiContext?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetIO: (() -> reference_ImGuiIO)?
        get() = definedExternally
        set(value) = definedExternally
    var GetStyle: (() -> ImGuiStyle)?
        get() = definedExternally
        set(value) = definedExternally
    var NewFrame: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var EndFrame: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Render: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetDrawData: (() -> reference_ImDrawData?)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowDemoWindow: ((p_open: dynamic /* JsTuple<Boolean> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowMetricsWindow: ((p_open: dynamic /* JsTuple<Boolean> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowStackToolWindow: ((p_open: dynamic /* JsTuple<Boolean> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowAboutWindow: ((p_open: dynamic /* JsTuple<Boolean> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowStyleEditor: ((ref: ImGuiStyle?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowStyleSelector: ((label: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowFontSelector: ((label: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ShowUserGuide: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetVersion: (() -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var StyleColorsDark: ((dst: ImGuiStyle?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var StyleColorsLight: ((dst: ImGuiStyle?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var StyleColorsClassic: ((dst: ImGuiStyle?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Begin: ((name: String, p_open: dynamic /* JsTuple<Boolean> */, flags: ImGuiWindowFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var End: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginChild: ((id: dynamic /* String | ImGuiID */, size: Readonly<interface_ImVec2>, border: Boolean, flags: ImGuiWindowFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndChild: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var IsWindowAppearing: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsWindowCollapsed: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsWindowFocused: ((flags: ImGuiFocusedFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsWindowHovered: ((flags: ImGuiHoveredFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowDrawList: (() -> reference_ImDrawList)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowPos: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowSize: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowWidth: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowHeight: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowPos: ((pos: Readonly<interface_ImVec2>, cond: ImGuiCond, pivot: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowSize: ((size: Readonly<interface_ImVec2>, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowSizeConstraints: ((size_min: Readonly<interface_ImVec2>, size_max: Readonly<interface_ImVec2>, custom_callback: ImGuiSizeCallback?, data: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowContentSize: ((size: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowCollapsed: ((collapsed: Boolean, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowFocus: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextWindowBgAlpha: ((alpha: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowPos: ((pos: Readonly<interface_ImVec2>, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowSize: ((size: Readonly<interface_ImVec2>, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowCollapsed: ((collapsed: Boolean, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowFocus: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowFontScale: ((scale: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowNamePos: ((name: String, pos: Readonly<interface_ImVec2>, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowNameSize: ((name: String, size: Readonly<interface_ImVec2>, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowNameCollapsed: ((name: String, collapsed: Boolean, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetWindowNameFocus: ((name: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetContentRegionAvail: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetContentRegionMax: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowContentRegionMin: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetWindowContentRegionMax: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetScrollX: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetScrollY: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollX: ((scroll_x: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollY: ((scroll_y: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetScrollMaxX: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetScrollMaxY: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollHereX: ((center_x_ratio: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollHereY: ((center_y_ratio: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollFromPosX: ((pos_x: Number, center_x_ratio: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetScrollFromPosY: ((pos_y: Number, center_y_ratio: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushFont: ((font: reference_ImFont?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopFont: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushStyleColor: ((idx: ImGuiCol, col: dynamic /* ImU32 | Readonly<interface_ImVec4> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopStyleColor: ((count: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushStyleVar: ((idx: ImGuiStyleVar, param_val: dynamic /* Number | Readonly<interface_ImVec2> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopStyleVar: ((count: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushAllowKeyboardFocus: ((allow_keyboard_focus: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopAllowKeyboardFocus: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushButtonRepeat: ((repeat: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopButtonRepeat: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushItemWidth: ((item_width: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopItemWidth: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextItemWidth: ((item_width: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var CalcItemWidth: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var PushTextWrapPos: ((wrap_pos_x: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopTextWrapPos: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFont: (() -> reference_ImFont)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFontSize: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFontTexUvWhitePixel: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColorU32_A: ((idx: ImGuiCol, alpha_mul: Number) -> ImU32)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColorU32_B: ((col: Readonly<interface_ImVec4>) -> ImU32)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColorU32_C: ((col: ImU32) -> ImU32)?
        get() = definedExternally
        set(value) = definedExternally
    var GetStyleColorVec4: ((idx: ImGuiCol) -> Readonly<reference_ImVec4>)?
        get() = definedExternally
        set(value) = definedExternally
    var Separator: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SameLine: ((pos_x: Number, spacing_w: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var NewLine: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Spacing: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Dummy: ((size: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Indent: ((indent_w: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Unindent: ((indent_w: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginGroup: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var EndGroup: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCursorPos: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCursorPosX: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCursorPosY: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetCursorPos: ((local_pos: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetCursorPosX: ((x: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetCursorPosY: ((y: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCursorStartPos: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetCursorScreenPos: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var SetCursorScreenPos: ((pos: interface_ImVec2) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var AlignTextToFramePadding: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetTextLineHeight: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetTextLineHeightWithSpacing: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFrameHeight: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFrameHeightWithSpacing: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var PushID: ((id: dynamic /* String | Number */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopID: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetID: ((id: dynamic /* String | Number */) -> ImGuiID)?
        get() = definedExternally
        set(value) = definedExternally
    var TextUnformatted: ((text: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Text: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TextColored: ((col: Readonly<interface_ImVec4>, fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TextDisabled: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TextWrapped: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LabelText: ((label: String, fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BulletText: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Button: ((label: String, size: Readonly<interface_ImVec2>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SmallButton: ((label: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InvisibleButton: ((str_id: String, size: Readonly<interface_ImVec2>, flags: ImGuiButtonFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ArrowButton: ((label: String, dir: ImGuiDir) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var Image: ((user_texture_id: Any, size: Readonly<interface_ImVec2>, uv0: Readonly<interface_ImVec2>, uv1: Readonly<interface_ImVec2>, tint_col: Readonly<interface_ImVec4>, border_col: Readonly<interface_ImVec4>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ImageButton: ((user_texture_id: Any, size: Readonly<interface_ImVec2>, uv0: Readonly<interface_ImVec2>, uv1: Readonly<interface_ImVec2>, frame_padding: Number, bg_col: Readonly<interface_ImVec4>, tint_col: Readonly<interface_ImVec4>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var Checkbox: ((label: String, v: dynamic /* JsTuple<Boolean> */) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var CheckboxFlags: ((label: String, flags: dynamic /* JsTuple<Number> */, flags_value: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var RadioButton_A: ((label: String, active: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var RadioButton_B: ((label: String, v: dynamic /* JsTuple<Number> */, v_button: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ProgressBar: ((fraction: Number, size_arg: Readonly<interface_ImVec2>, overlay: String?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Bullet: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginCombo: ((label: String, preview_value: String?, flags: ImGuiComboFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndCombo: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var /*<T>*/ Combo: ((label: String, current_item: dynamic /* JsTuple<Number> */, items_getter: (data: dynamic, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean, data: dynamic, items_count: Number, popup_max_height_in_items: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragFloat: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragFloat2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragFloat3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragFloat4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragFloatRange2: ((label: String, v_current_min: dynamic /* JsTuple<Number> */, v_current_max: dynamic /* JsTuple<Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, format_max: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragInt: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragInt2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragInt3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragInt4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragIntRange2: ((label: String, v_current_min: dynamic /* JsTuple<Number> */, v_current_max: dynamic /* JsTuple<Number> */, v_speed: Number, v_min: Number, v_max: Number, format: String, format_max: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var DragScalar: ((label: String, data_type: ImGuiDataType, v: dynamic /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array */, v_speed: Number, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderFloat: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderFloat2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderFloat3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderFloat4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderAngle: ((label: String, v_rad: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_degrees_min: Number, v_degrees_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderInt: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderInt2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderInt3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderInt4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SliderScalar: ((label: String, data_type: ImGuiDataType, v: dynamic /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array */, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var VSliderFloat: ((label: String, size: Readonly<interface_ImVec2>, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var VSliderInt: ((label: String, size: Readonly<interface_ImVec2>, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, v_min: Number, v_max: Number, format: String, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var VSliderScalar: ((label: String, size: Readonly<interface_ImVec2>, data_type: ImGuiDataType, v: dynamic /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array */, v_min: Number?, v_max: Number?, format: String?, flags: ImGuiSliderFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputText: ((label: String, buf: dynamic /* JsTuple<String> */, buf_size: Number, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputTextMultiline: ((label: String, buf: dynamic /* JsTuple<String> */, buf_size: Number, size: Readonly<interface_ImVec2>, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputTextWithHint: ((label: String, hint: String, buf: dynamic /* JsTuple<String> */, buf_size: Number, flags: ImGuiInputTextFlags, callback: ImGuiInputTextCallback?, user_data: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputFloat: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, format: String, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputFloat2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputFloat3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputFloat4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, format: String, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputInt: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputInt2: ((label: String, v: dynamic /* JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputInt3: ((label: String, v: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputInt4: ((label: String, v: dynamic /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputDouble: ((label: String, v: dynamic /* JsTuple<Number> | JsTuple<Number, Number> | JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, step: Number, step_fast: Number, format: String, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var InputScalar: ((label: String, data_type: ImGuiDataType, v: dynamic /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array */, step: Number?, step_fast: Number?, format: String?, flags: ImGuiInputTextFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorEdit3: ((label: String, col: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorEdit4: ((label: String, col: dynamic /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorPicker3: ((label: String, col: dynamic /* JsTuple<Number, Number, Number> | JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorPicker4: ((label: String, col: dynamic /* JsTuple<Number, Number, Number, Number> */, flags: ImGuiColorEditFlags, ref_col: dynamic /* JsTuple<Number, Number, Number, Number> */) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorButton: ((desc_id: String, col: Readonly<interface_ImVec4>, flags: ImGuiColorEditFlags, size: Readonly<interface_ImVec2>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SetColorEditOptions: ((flags: ImGuiColorEditFlags) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNode_A: ((label: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNode_B: ((str_id: String, fmt: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNode_C: ((ptr_id: Number, fmt: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNodeEx_A: ((label: String, flags: ImGuiTreeNodeFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNodeEx_B: ((str_id: String, flags: ImGuiTreeNodeFlags, fmt: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreeNodeEx_C: ((ptr_id: Number, flags: ImGuiTreeNodeFlags, fmt: String) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TreePush_A: ((str_id: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TreePush_B: ((ptr_id: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TreePop: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetTreeNodeToLabelSpacing: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var CollapsingHeader_A: ((label: String, flags: ImGuiTreeNodeFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var CollapsingHeader_B: ((label: String, p_open: dynamic /* JsTuple<Boolean> */, flags: ImGuiTreeNodeFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SetNextItemOpen: ((is_open: Boolean, cond: ImGuiCond) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Selectable_A: ((label: String, selected: Boolean, flags: ImGuiSelectableFlags, size: interface_ImVec2) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var Selectable_B: ((label: String, p_selected: dynamic /* JsTuple<Boolean> */, flags: ImGuiSelectableFlags, size: interface_ImVec2) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginListBox: ((label: String, size: Readonly<interface_ImVec2>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndListBox: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ListBox_A: ((label: String, current_item: dynamic /* JsTuple<Number> */, items: Array<String>, items_count: Number, height_in_items: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var /*<T>*/ ListBox_B: ((label: String, current_item: dynamic /* JsTuple<Number> */, items_getter: (data: dynamic, idx: Number, out_text: dynamic /* JsTuple<String> */) -> Boolean, data: dynamic, items_count: Number, height_in_items: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var /*<T>*/ PlotLines: ((label: String, values_getter: (data: dynamic, idx: Number) -> Number, data: dynamic, values_count: Number, value_offset: Number, overlay_text: String?, scale_min: Number, scale_max: Number, graph_size: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var /*<T>*/ PlotHistogram: ((label: String, values_getter: (data: dynamic, idx: Number) -> Number, data: dynamic, values_count: Number, value_offset: Number, overlay_text: String?, scale_min: Number, scale_max: Number, graph_size: Readonly<interface_ImVec2>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Value_A: ((prefix: String, b: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Value_B: ((prefix: String, v: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Value_C: ((prefix: String, v: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Value_D: ((prefix: String, v: Number, float_format: String?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginMenuBar: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndMenuBar: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginMainMenuBar: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndMainMenuBar: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginMenu: ((label: String, enabled: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndMenu: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var MenuItem_A: ((label: String, shortcut: String?, selected: Boolean, enabled: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var MenuItem_B: ((label: String, shortcut: String?, p_selected: dynamic /* JsTuple<Boolean> */, enabled: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginTooltip: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var EndTooltip: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetTooltip: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginPopup: ((str_id: String, flags: ImGuiWindowFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginPopupModal: ((name: String, p_open: dynamic /* JsTuple<Boolean> */, flags: ImGuiWindowFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndPopup: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var OpenPopup: ((str_id: String, popup_flags: ImGuiPopupFlags) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var OpenPopupOnItemClick: ((str_id: String?, popup_flags: ImGuiPopupFlags) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var CloseCurrentPopup: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginPopupContextItem: ((str_id: String?, popup_flags: ImGuiPopupFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginPopupContextWindow: ((str_id: String?, popup_flags: ImGuiPopupFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginPopupContextVoid: ((str_id: String?, popup_flags: ImGuiPopupFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsPopupOpen: ((str_id: String, flags: ImGuiPopupFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginTable: ((str_id: String, column: Number, flags: ImGuiTableFlags, outer_size: interface_ImVec2, inner_width: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndTable: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableNextRow: ((row_flags: ImGuiTableRowFlags, min_row_height: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableNextColumn: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TableSetColumnIndex: ((column_n: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var TableSetupColumn: ((label: String, flags: ImGuiTableColumnFlags, init_width_or_weight: Number, user_id: ImU32) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableSetupScrollFreeze: ((cols: Number, rows: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableHeadersRow: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableHeader: ((label: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetSortSpecs: (() -> reference_ImGuiTableSortSpecs?)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetColumnCount: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetColumnIndex: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetRowIndex: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetColumnName: ((column_n: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var TableGetColumnFlags: ((column_n: Number) -> ImGuiTableColumnFlags)?
        get() = definedExternally
        set(value) = definedExternally
    var TableSetColumnEnabled: ((column_n: Number, v: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TableSetBgColor: ((target: ImGuiTableBgTarget, color: ImU32, column_n: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var Columns: ((count: Number, id: String?, border: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var NextColumn: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColumnIndex: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColumnWidth: ((column_index: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetColumnWidth: ((column_index: Number, width: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColumnOffset: ((column_index: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var SetColumnOffset: ((column_index: Number, offset_x: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetColumnsCount: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginTabBar: ((str_id: String, flags: ImGuiTabBarFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndTabBar: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginTabItem: ((label: String, p_open: dynamic /* JsTuple<Boolean> */, flags: ImGuiTabBarFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndTabItem: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var TabItemButton: ((label: String, flags: ImGuiTabItemFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SetTabItemClosed: ((tab_or_docked_window_label: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogToTTY: ((max_depth: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogToFile: ((max_depth: Number, filename: String?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogToClipboard: ((max_depth: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogFinish: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogButtons: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LogText: ((fmt: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginDragDropSource: ((flags: ImGuiDragDropFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SetDragDropPayload: ((type: String, data: Any, size: Number, cond: ImGuiCond) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndDragDropSource: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginDragDropTarget: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var AcceptDragDropPayload: ((type: String, flags: ImGuiDragDropFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndDragDropTarget: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetDragDropPayload: (() -> Nothing?)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginDisabled: ((disabled: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var EndDisabled: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PushClipRect: ((clip_rect_min: Readonly<interface_ImVec2>, clip_rect_max: Readonly<interface_ImVec2>, intersect_with_current_clip_rect: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var PopClipRect: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetItemDefaultFocus: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SetKeyboardFocusHere: ((offset: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemHovered: ((flags: ImGuiHoveredFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemActive: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemFocused: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemClicked: ((mouse_button: ImGuiMouseButton) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemVisible: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemEdited: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemActivated: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemDeactivated: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemDeactivatedAfterEdit: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsItemToggledOpen: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsAnyItemHovered: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsAnyItemActive: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsAnyItemFocused: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetItemRectMin: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetItemRectMax: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetItemRectSize: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var SetItemAllowOverlap: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMainViewport: (() -> reference_ImGuiViewport)?
        get() = definedExternally
        set(value) = definedExternally
    var IsRectVisible_A: ((size: Readonly<interface_ImVec2>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsRectVisible_B: ((rect_min: Readonly<interface_ImVec2>, rect_max: Readonly<interface_ImVec2>) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetTime: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetFrameCount: (() -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var GetBackgroundDrawList: (() -> reference_ImDrawList)?
        get() = definedExternally
        set(value) = definedExternally
    var GetForegroundDrawList: (() -> reference_ImDrawList)?
        get() = definedExternally
        set(value) = definedExternally
    var GetDrawListSharedData: (() -> reference_ImDrawListSharedData)?
        get() = definedExternally
        set(value) = definedExternally
    var GetStyleColorName: ((idx: ImGuiCol) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var BeginChildFrame: ((id: ImGuiID, size: Readonly<interface_ImVec2>, flags: ImGuiWindowFlags) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var EndChildFrame: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var CalcTextSize: ((text: String, hide_text_after_double_hash: Boolean, wrap_width: Number, out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorConvertU32ToFloat4: ((in_: ImU32, out: interface_ImVec4) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorConvertFloat4ToU32: ((in_: Readonly<interface_ImVec4>) -> ImU32)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorConvertRGBtoHSV: ((r: Number, g: Number, b: Number, out_h: dynamic /* JsTuple<Number> */, out_s: dynamic /* JsTuple<Number> */, out_v: dynamic /* JsTuple<Number> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var ColorConvertHSVtoRGB: ((h: Number, s: Number, v: Number, out_r: dynamic /* JsTuple<Number> */, out_g: dynamic /* JsTuple<Number> */, out_b: dynamic /* JsTuple<Number> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetKeyIndex: ((imgui_key: ImGuiKey) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var IsKeyDown: ((user_key_index: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsKeyPressed: ((user_key_index: Number, repeat: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsKeyReleased: ((user_key_index: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetKeyPressedAmount: ((key_index: Number, repeat_delay: Number, rate: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var CaptureKeyboardFromApp: ((capture: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseDown: ((button: ImGuiMouseButton) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseClicked: ((button: ImGuiMouseButton, repeat: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseReleased: ((button: ImGuiMouseButton) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseDoubleClicked: ((button: ImGuiMouseButton) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMouseClickedCount: ((button: ImGuiMouseButton) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseHoveringRect: ((r_min: Readonly<interface_ImVec2>, r_max: Readonly<interface_ImVec2>, clip: Boolean) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMousePosValid: ((mouse_pos: Readonly<interface_ImVec2>?) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var IsAnyMouseDown: (() -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMousePos: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMousePosOnOpeningCurrentPopup: ((out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var IsMouseDragging: ((button: ImGuiMouseButton, lock_threshold: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMouseDragDelta: ((button: ImGuiMouseButton, lock_threshold: Number, out: interface_ImVec2) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var ResetMouseDragDelta: ((button: ImGuiMouseButton) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetMouseCursor: (() -> ImGuiMouseCursor)?
        get() = definedExternally
        set(value) = definedExternally
    var SetMouseCursor: ((type: ImGuiMouseCursor) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var CaptureMouseFromApp: ((capture: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var GetClipboardText: (() -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var SetClipboardText: ((text: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var LoadIniSettingsFromMemory: ((ini_data: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var SaveIniSettingsToMemory: (() -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var DebugCheckVersionAndDataLayout: ((version_str: String, sz_io: Number, sz_style: Number, sz_vec2: Number, sz_vec4: Number, sz_draw_vert: Number, sz_draw_idx: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var SetAllocatorFunctions: ((alloc_func: (sz: Number, user_data: Any) -> Number, free_func: (ptr: Number, user_data: Any) -> Unit, user_data: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var MemAlloc: ((sz: Number) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var MemFree: ((ptr: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}