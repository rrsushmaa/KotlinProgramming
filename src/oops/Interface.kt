package oops

interface Human {
    fun greet()
    var age: Int
    fun calc(){
        println("Hello")
    }
}

interface Woman {
    fun empowered()
}

class Employee(private val name:String): Human, Woman {
    override var age = 25
    override fun greet() {
        println("$name is an Employee.")
    }

    override fun empowered() {
       println("You're empowered at this age $age!")
    }
}

class Engineer(private val name: String): Human {
    override var age: Int = 30
    override fun greet() {
        println("$name is an Engineer.")
    }
}


fun main() {
    val sushmaa:Human = Employee("Sushmaa")
    sushmaa.greet()
    sushmaa.calc()
    val vignesh:Human = Engineer("Vignesh")
    vignesh.greet()
    vignesh.calc()
    val sushu = Employee("Sushu")
    sushu.empowered()
}

