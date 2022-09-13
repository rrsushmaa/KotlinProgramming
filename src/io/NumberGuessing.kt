package io

import java.util.Random

fun main() {
    var number : Int
    var continueGame: String?
    var guess: String
    println("Welcome to number guessing game.. ")
    do {
        number =  Random().nextInt(10)
        println("Please guess the number which falls between 1 - 10")
        guess = readLine().toString()
        if(guess == ""){
            println("You did not provide valid input. Do you want to try again? [Y/N]")
            continueGame = readLine()
            continue
        }

        checkRandomNumberMatchesTheInput(guess, number)

        continueGame = checkIfUserWantsToPlayAgain()

    }while (isPlayAgain(continueGame))
    println("Thanks for playing with me... Have a nice day!! :)")
}

private fun checkIfUserWantsToPlayAgain(): String? {
    println("Wanna play again? [Y/N]")
    var continueGame  = readLine()
    if (doesNotContainYesOrNo(continueGame)) {
        println("Please choose only from these options : Y or N")
        continueGame = readLine()
    }
    return continueGame
}

private fun doesNotContainYesOrNo(continueGame1: String?) =
    !isPlayAgain(continueGame1) && !continueGame1.equals("N", true)

private fun isPlayAgain(continueGame: String?) = continueGame.equals("Y", true)

private fun checkRandomNumberMatchesTheInput(guess: String, number: Int) {
    if (guess.toInt() == number)
        println("Hurray! Your guess is right! The actual number is $number!!")
    else
        println("Uh Oh, the actual number is $number :(")
}