package dev.scorbett123.common.utils

import java.util.stream.Stream

class OutputStream {

    val bytes = ArrayList<Byte>()

    fun write(byte: Byte) {
        bytes.add(byte)
    }

    fun writeBoolean(v: Boolean) {
        write(if (v) 1 else 0)
    }

    fun writeShort(short: Short) {
        val asInt = short.toInt()
        write((asInt shl 8).toByte())
        write(asInt.toByte())
    }

    fun writeInt(int: Int) {
        write((int shl 24).toByte())
        write((int shl 16).toByte())
        write((int shl 8).toByte())
        write(int.toByte())
    }

    fun writeFloat(float: Float) {
       writeInt(float.toBits())
    }
}