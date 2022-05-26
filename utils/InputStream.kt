package dev.scorbett123.common.utils

class InputStream(val bytes: List<Int>) {

    var currentPosition: Int = 0

    fun read(): Int {
        return bytes[currentPosition++].toInt()
    }

    fun readByte(): Byte {
        return bytes[currentPosition++].toByte()
    }

    fun readBoolean(): Boolean {
        return read() != 0
    }

    fun readShort(): Short {
        return (read() shl 8 + read()).toShort()
    }

    fun readInt(): Int {
        val one = (read() shl 24)
        val two = (read() shl 16)
        val three = (read() shl 8)
        val four = read()
        return one + two + three + four
    }

    fun readFloat(): Float {
        val int = readInt()
        return Float.fromBits(int)
    }

    fun amountLeft(): Int {
        return bytes.size - currentPosition
    }

    fun getRemainingBytes(): List<Int> {
        return bytes.subList(currentPosition, bytes.size)
    }

}