package loops

fun main() {
    var sum  = 0L
//    for(i in 1..10){
//        println(i)
//        sum += i
//    }
//
//    println(sum)
//    var list = listOf("Sushmaa","Vignesh")
//    for ((index, element) in list.withIndex()){
//        println("$index -> $element")
//    }
//
//    println("sum is $sum")
//    while(sum >= 50){
//        println("sum = $sum")
//        sum--
//    }

    // named loop
    dividendLoop@for(i in 2..10){
        for(j in 2..9){
            if(i % j != 0){
                break@dividendLoop
            }
            println("$i -- $j")
        }
    }

//    sum = 0;
    for( i in 100L..100000L){
        sum+= i
    }
    println(sum)

    println((1..100000).sum())
    println((1..100000L).sum())
    println((1..10000L).sum())
    println((1..10000).sum())
}