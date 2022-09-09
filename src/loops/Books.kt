package loops

fun main() {
    val books = arrayListOf("Gita","Master","Romeo")
    for(book in books){
        if(book.contains('e')){
            for(letter in book){
                println(letter)
            }
            println()
        }
    }

}