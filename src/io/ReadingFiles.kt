package io

import java.io.File

fun main() {
    var lineNumber = 0
    File("src/io/inputFile.txt").forEachLine {
        ++ lineNumber
        println("$lineNumber: $it")
    }

}