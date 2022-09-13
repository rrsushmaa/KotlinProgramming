package oops

// DRY - don't repeat yourself
class Stack<E>(vararg items: E) {
    private var arrayList = items.toMutableList()
    fun push(value: E){
        arrayList.add(value)
    }

    fun pop(): E? {
        if(arrayList.isEmpty())
            return null
        return arrayList.removeLast()
    }

    fun fetchList(): MutableList<E> {
        return arrayList
    }
}

fun <T> stackOf(vararg items: T): Stack<T>{
   return Stack(*items)
}

fun main() {
    val intStack = Stack(1,2,3,4)
    val stringStack = Stack("apple","mango","pineapple","guava")
    intStack.pop()
    intStack.push(9)
    val stack2 = stackOf("Hi","Hey","Hello")
    println(stack2.pop())
    println(intStack.fetchList())
    stringStack.push("Strawberry")
    println(stringStack.fetchList())
}


