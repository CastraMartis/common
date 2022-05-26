package dev.scorbett123.common

import dev.scorbett123.common.utils.InputStream
import dev.scorbett123.common.utils.OutputStream


fun main(args: Array<String>) {
    for (i in 0..1000) {
        val inpyt = OutputStream()

        inpyt.writeInt(i)

        val output = InputStream(inpyt.bytes)
        val o = output.readInt()
        if (o != i) {
            println("$i -> $o")
        }
    }
}
