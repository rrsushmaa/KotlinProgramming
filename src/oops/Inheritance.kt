
open class Person(open val name: String, open val age: Int) {
    fun greet(){
        println("Hello $name!!")
    }
}

class Employee(override val name: String, override val age:Int): Person(name,age) {

    fun isReceivedPayment():Boolean = true
}
fun main() {
    val person = Person("Sushmaa",26)
    println("${person.name} -> ${person.age}")

    val employee = Employee("Vignesh",30)
    employee.greet()
    println(employee.isReceivedPayment())
}