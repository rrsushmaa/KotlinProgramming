package conditionals

import java.util.Random


fun main() {

    val result = when (val random: Int = Random().nextInt(50) + 1) {
        in 1..10 -> {
            println("Value between 1 to 10")
            random
        }
        in 11..20 -> {
            println("Value between 11 to 20")
            random
        }
        in 21..30 -> {
            println("Value between 21 to 30")
            random
        }
        in 31..40 -> {
            println("Value between 31 to 40")
            random
        }

        else -> {
            println("Value is greater than 40")
            random
        }
    }

    println(result)
}