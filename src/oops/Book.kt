package oops

class Book (val title:String, val author: String, val publicationYear: Int, val isBorrowed: Boolean) {

    fun borrowBook(): Boolean{
        return if(!isBorrowed)
            true
        else{
            println("Sorry this book is already borrowed")
            false
        }
    }

    fun returnBook(): Boolean{
        return if(isBorrowed)
            true
        else{
            println("Sorry this book is already borrowed")
            false
        }
    }

    fun printBook(){
        println("Title : ${this.title} >> Author : ${this.author} >> Published On : ${this.publicationYear} >> Borrowed: ${this.isBorrowed}")
    }
}

fun main() {
    val myFirstBook = Book("My view on this IT world","Sushmaa R R",2030,false)
    myFirstBook.borrowBook()
    myFirstBook.printBook()
    myFirstBook.returnBook()
    myFirstBook.printBook()
    //using named parameter during initialization.  Flexible to change the order of the parameter
    val mySecondBook = Book(title="How to balance work and family",author="Sushmaa R R", isBorrowed = true, publicationYear = 2032)
    mySecondBook.printBook()
}