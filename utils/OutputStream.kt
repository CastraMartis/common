package dev.scorbett123.common.utils


class OutputStream {

    val bytes = ArrayList<Int>()

    fun write(byte: Int) {
        bytes.add(byte)
    }

    fun writeBoolean(v: Boolean) {
        write(if (v) 1 else 0)
    }

    fun writeShort(short: Short) {
        val asInt = short.toInt()
        write(asInt shr 8)
        write(asInt and 0xFF)
    }

    fun writeInt(int: Int) {
        write((int shr 24) and 0xFF)
        write((int shr 16) and 0xFF)
        write((int shr 8) and 0xFF)
        write(int and 0xFF)
    }

    fun writeFloat(float: Float) {
        println(float.toBits())
       writeInt(float.toBits())
    }
}