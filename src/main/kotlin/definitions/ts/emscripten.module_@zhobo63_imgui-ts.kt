@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.hiperbou.imguits.emscripten

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

external open class EmscriptenClassHandle

external open class EmscriptenRegisteredClass {
    open var baseClass: Any
    open var constructor_body: Any
    open var downcast: Number
    open var getActualType: () -> Any
    open var instancePrototype: EmscriptenClassHandle
    open var name: String
    open var pureVirtualFunctions: Array<(args: Any) -> Any>
    open var rawDestructor: () -> Unit
    open var upcast: Number
}

external open class EmscriptenRegisteredPointer {
    open var destructorFunction: ((ptr: Number) -> Unit)?
    open var isConst: Boolean
    open var isReference: Boolean
    open var isSmartPointer: Boolean
    open var name: String
    open var pointeeType: Any
    open var rawConstructor: Any
    open var rawDestructor: Any
    open var rawGetPointee: Any
    open var rawShare: Any
    open var registeredClass: EmscriptenRegisteredClass
    open var sharingPolicy: Any
    open var fromWireType: (value: Any) -> Any
    open var toWireType: (destructors: Array<Any>, value: Any) -> Number
}

external interface `T$1` {
    var value: Number
}

external open class EmscriptenWireType {
    open var ptr: Number
    open var ptrType: EmscriptenRegisteredPointer
    open var count: `T$1`
}

external open class EmscriptenClassReference {
    open var `$$`: EmscriptenWireType
}

external open class EmscriptenClass : EmscriptenClassReference {
    open fun delete()
}

external interface EmscriptenModule {
    fun <T : EmscriptenModule> then(callback: (value: T) -> Unit)
    var ENVIRONMENT: String? /* "WEB" | "WORKER" | "NODE" | "SHELL" */
        get() = definedExternally
        set(value) = definedExternally
    var arguments: Array<Any>
    var thisProgram: String
    fun quit(status: Number, toThrow: Error)
    var preRun: Array<() -> Unit>
    var postRun: Array<() -> Unit>
    var HEAP8: Int8Array
    var HEAP16: Int16Array
    var HEAP32: Int32Array
    var HEAPU8: Uint8Array
    var HEAPU16: Uint16Array
    var HEAPU32: Uint32Array
    var HEAPF32: Float32Array
    var HEAPF64: Float64Array
    var TOTAL_STACK: Number
    var TOTAL_MEMORY: Number
    fun count_emval_handles(): Number
    var onRuntimeInitialized: () -> Unit
    fun _malloc(size: Number): Number
    fun _free(ptr: Number): Number
    fun _memcpy(dst: Number, src: Number, num: Number): Number
    fun _memset(ptr: Number, param_val: Number, num: Number): Number
}