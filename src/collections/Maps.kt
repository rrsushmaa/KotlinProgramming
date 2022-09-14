package collections

fun main() {
    val mappedEmployee: Map<String, String> = mapOf(
        Pair("Sushmaa","Thoughtworks"),
        "Vignesh" to "Tata AMC",
        "Arttee" to "AND Inc"
    )

    val mappedEmployee2: Map<String, String> = mapOf(
        "Sushmaa" to "Thoughtworks",
        "Vignesh" to "Tata AMC",
        "Arttee" to "AND Inc"
    )

    mappedEmployee.entries.forEach {
        println(it.key)
    }

    println(mappedEmployee == mappedEmployee2)
    println(mappedEmployee.keys)
    println(mappedEmployee.values)
    println(mappedEmployee.entries)

    val fruitsAndTaste = mutableMapOf("Mango" to "Sweet")

    fruitsAndTaste["pineapple"] = "Sweet"

    println(fruitsAndTaste.entries)
}