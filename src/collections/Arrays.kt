package collections

fun main() {
    val arrays = arrayOf("Chennai","Bangalore","Hyderabad","Pune","Mumbai","Kolkata","Kochin","Ahmedabad")

    val family = listOf("Sushmaa","Vichchu","Arttee","Vj","Harshy","Tannu miss")

    val arrayList = arrayListOf("Apple","Mango")

    arrayList.add("Strawberry")

    println(arrays[0])
    println(family)
    println(arrayList)
    if(arrays.contains("Chennai"))
        println("Yes")
}