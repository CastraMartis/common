package dev.scorbett123.common.packets

abstract class Packet {

    abstract val id: Byte

    fun write()
}