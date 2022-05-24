package dev.scorbett123.common.utils


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
        write((asInt shr 8).toByte())
        write(asInt.toByte())
    }

    fun writeInt(int: Int) {
        write((int shr 24).toByte())
        write((int shr 16).toByte())
        write((int shr 8).toByte())
        write(int.toByte())
    }

    fun writeFloat(float: Float) {
        println(float.toBits())
       writeInt(float.toBits())
    }
}