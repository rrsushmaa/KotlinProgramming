
abstract class PersonWithAbstract(open val name: String) {
    abstract fun speek()
    abstract fun greet()
    fun sweet(){
      println("You are sweet")
    }
}

class EmployeeOfTheCompany(override val name: String): PersonWithAbstract(name) {

    override fun speek() {
        println("I'm connecting from my office")
    }

    override fun greet() {
        println("Hello there, I'm $name. Glad to meet you.")
    }
    fun work(){
        println("Kudos $name for your awesome work!")
    }
}

fun main(){
    val employee = EmployeeOfTheCompany("Vignesh")
    employee.work()
    employee.speek()
    employee.greet()
    employee.sweet()
}