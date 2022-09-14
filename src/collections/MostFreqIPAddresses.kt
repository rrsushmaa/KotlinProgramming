package collections

import java.io.File
import java.util.*

fun main() {
    val ipAddressAndCount = mutableMapOf<String, Int>()
    var count: Int
    File("src/collections/ips.txt").forEachLine {
        count = 0
        if(ipAddressAndCount.containsKey(it)){
            var value = ipAddressAndCount.getValue(it)
            ipAddressAndCount[it] = ++value
        }
        ipAddressAndCount.putIfAbsent(it, ++count)
    }

    println(ipAddressAndCount.entries)
    val maxViewCount = Collections.max(ipAddressAndCount.values)
    val ips = mutableMapOf<String,Int>()
    ipAddressAndCount.entries.forEach{
        if(maxViewCount == it.value)
            ips[it.key] = it.value
    }

    println("Most frequently visited ips and counts are $ips")

}