package functions

import java.util.*

fun addSpaceBetween(value: String): String{
    var result = ""
    for(letter in value){
        result += "$letter "
    }
    /* another way of implementing in loop
        result = ""
        for((index, element) in value.withIndex()){
         if(index == value.length-1){
                result += "$element"
             break
           }
          result += "$element "
     }*/
    return result
}

fun getCurrentDate(): Date{
    return Date()
}


fun maxOfThreeNumbers(a: Int, b: Int, c: Int): Int {
    return if(a>b && a>c){
        a
    }else if(b>c){
        b
    }else{
        c
    }
}

fun maxOfNNumbers( list: List<Int>): Int {
    var max = 0
    for(number in list){
        if(number < max)
            continue
        max = number
    }
    return max
}

fun reverseListPreDefined(list: List<Int>): List<Int> = list.asReversed()

fun reverseList(list: List<Int>): List<Int>{
   val reversedList = arrayListOf<Int>()
    for(i in list.size-1 downTo 0){
        reversedList.add(list[i])
    }
    return reversedList
}

fun greet(){
    println("Hello!")
}

fun greet(name: String){
    println("Hello $name!!")
}

fun getRandomNumber() = Math.random() * 100

fun main() {
    val result = addSpaceBetween("Kotlin")
    println("result = $result --> length = ${result.length}")
    println("Date is ${getCurrentDate()}")
    println("Maximum of 3,19,8 is ${maxOfThreeNumbers(3,19,8)}")
    println("Maximum of 3,19,8 is ${maxOfNNumbers(listOf(3,19,8))}")
    println("Reversed List using predefined function is ${reverseListPreDefined(listOf(1,2,3))}")
    println("Reversed List is ${reverseList(listOf(1,2,3))}")
    greet()
    greet("Sushu")
    println(getRandomNumber())
}