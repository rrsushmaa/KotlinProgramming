package io

fun main() {
    println("Enter a word to guess")
    val word = readLine()
    if(word == null){
        println("No word given, game over")
        return
    }

    print100Lines()

    val letters = word.lowercase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()

    while(correctGuesses != letters){
        println("Provide guess the letter")
        val guess = readLine()

        if(guess.toString().length !=1){
            println("Please provide only one letter")
            continue
        }

        if (guess != null  && word.contains(guess)) {
          correctGuesses.add(guess.lowercase().single())
        }

        printExploredWord(word, correctGuesses)
        println()
    }

    println("Well done!")
}

private fun print100Lines() {
    for (i in 1..100) {
        println()
    }
}

fun printExploredWord(word: String, correctGuesses: Set<Char>){
    for(character in word.lowercase().toCharArray()){
      if(correctGuesses.contains(character)){
          print("$character ")
      }else{
          print("_ ")
      }
    }

}