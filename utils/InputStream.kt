package dev.scorbett123.common.utils

class InputStream(val bytes: ArrayList<Byte>) {

    var currentPosition: Int = 0

    fun read(): Int {
        return bytes[currentPosition++].toInt()
    }

    fun readByte(): Byte {
        return bytes[currentPosition++]
    }

    fun readBoolean(): Boolean {
        return read() != 0
    }

    fun readShort(): Short {
        return (read() shl 8 + read()).toShort()
    }

    fun readInt(): Int {
        val one = (read() shl 24)
        val two = (read() shl 12)
        val three = (read() shl 8)
        return one + two + three + read()
    }

    fun readFloat(): Float {
        val int = readInt()
        return Float.fromBits(int)
    }

    fun amountLeft(): Int {
        return bytes.size - currentPosition
    }

    fun getBytes(): MutableList<Byte> {
        return bytes.subList(currentPosition, bytes.size)
    }

}