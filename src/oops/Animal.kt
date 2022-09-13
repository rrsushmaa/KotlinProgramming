package oops

class Animal {
    var age: Int = 0
        set(value) {
            if(value >=0){
                field = value
            }
        }
}

fun main(){
  val animal  = Animal()
    animal.age = 3
    println(animal.age)
    animal.age = -2
    println(animal.age)
}