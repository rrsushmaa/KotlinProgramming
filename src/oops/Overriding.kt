package oops

open class Course(private val name:String, private val price: Double){
    open fun learn(){
        println("You are learning this course $name which costs $price")
    }
}

open class KotlinCourse(): Course("Kotlin",1000.0){
    fun greet(){
        println("Hello, Kotlin!")
    }

    override fun learn() {
        println("Hey there, Welcome to Kotlin!")
        super.learn()
    }
}

class SpecialKotlinCourse():KotlinCourse() {
    override fun learn() {
        println("This is a special course")
        super.learn()
    }
}

fun main() {
    val kotlin = SpecialKotlinCourse()
    kotlin.learn()
    kotlin.greet()
}