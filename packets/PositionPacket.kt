package dev.scorbett123.common.packets

import dev.scorbett123.common.utils.InputStream
import dev.scorbett123.common.utils.OutputStream
import dev.scorbett123.common.math.Vec3

class PositionPacket(val x: Float, val y: Float, val z: Float): Packet() {

    constructor(pos: Vec3): this(pos.x, pos.y, pos.z)

    override val id: Byte = 0x01
    override fun write(outputStream: OutputStream) {
        outputStream.writeFloat(x)
        outputStream.writeFloat(y)
        outputStream.writeFloat(z)

    }

    fun toVec3(): Vec3 {
        return Vec3(x, y, z)
    }

    override fun toString(): String {
        return "$x $y $z"
    }

    companion object {

        val id: Byte = 0x01
        fun read(input: InputStream): PositionPacket {
            val x = input.readFloat()


            val y = input.readFloat()


            val z = input.readFloat()
            println("$x $y $z")

            return PositionPacket(x, y, z)
        }
    }
}