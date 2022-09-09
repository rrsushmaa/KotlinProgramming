package oops

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(
    open val title: String,
    open val genre: String,
    open val year: Int,
    open var isBorrowed: Boolean = false
) : Lendable {
    override fun borrow() {
        println("You are borrowing something..")
    }

}

data class Book(
    override val title: String,
    override val genre: String,
    override val year: Int,
    private val author: String,
    override var isBorrowed: Boolean
) : InventoryItem(title, genre, year, isBorrowed) {

    override fun borrow() {
        if(isBorrowed){
            println("Sorry, this Book[name=$title, author=$author] was already borrowed")

        }else{
            println("Thank you for borrowing this book Book[name=$title, author=$author]")
        }
    }
}

data class Dvd(
    override val title: String,
    override val genre: String,
    override val year: Int,
    val length: Double,
    override var isBorrowed: Boolean
) : InventoryItem(title, genre, year, isBorrowed) {
    override fun borrow() {
        if(isBorrowed){
            println("Sorry, this DVD[name=$title, duration=$length] was already borrowed")

        }else{
            println("Thank you for borrowing this DVD >> DVD[name=$title, duration=$length]")
        }
    }
}

fun main() {
    val book1 = Book("You can acheive","Philosophy",2023,"Sushmaa",true)
    book1.borrow()
    println()
    val dvd1 = Dvd("You can conquer","Vignesh",2024,52.28,false)
    dvd1.borrow()
    println()
    val dvd2 = dvd1.copy(isBorrowed = true)
    dvd2.borrow()
}