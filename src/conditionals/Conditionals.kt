package conditionals

fun main() {
    val mode = 5
    when ( mode ){
        2 -> println("x is 2")
        !in 1..5 -> println("Between 1 to 5")
        in 6..10 -> println("Between 5 to 10")
        5*2 -> println("x is 10")
        "Hello".length -> println("x is having the length of this work 'Hello'")
        else -> println("x is neither 2 nor 10")
    }
}