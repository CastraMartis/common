package dev.scorbett123.common.packets

import dev.scorbett123.common.utils.InputStream
import dev.scorbett123.common.utils.OutputStream

abstract class Packet {

    abstract val id: Byte

    abstract fun write(outputStream: OutputStream)
}