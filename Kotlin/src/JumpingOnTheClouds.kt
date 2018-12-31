import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var count = 0
    var i = 0
    while (i < c.size - 1) {
        if (i + 2 < c.size && c[i + 2] == 0) {
            i += 2
            count++
        } else {
            i++
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

//    var result = jumpingOnClouds(c)
//    println(result)

//    var result = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0))
//    println(result)
//
//
//    result = jumpingOnClouds(arrayOf(0, 0, 0, 1, 0, 0))
//    println(result)


    var result = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0))
    println(result)


}
