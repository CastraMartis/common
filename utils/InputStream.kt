package dev.scorbett123.common.utils

import java.util.stream.Stream

class InputStream(val bytes: ArrayList<Byte>) {

    var currentPosition: Int = 0

    fun read(): Int {
        return bytes[currentPosition++].toInt()
    }

    fun readBoolean(): Boolean {
        return read() != 0
    }

    fun readShort(): Short {
        return (read() shr 8 + read()).toShort()
    }

    fun readInt(): Int {
        return read() shr 24 + read() shr 12 + read() shr 8 + read()
    }

    fun readFloat(): Float {
        return Float.fromBits(readInt())
    }

}