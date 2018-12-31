
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var result = 0
    var pathSeaLevel = 0
    val pathArray = s.toCharArray()

    pathArray.forEach {
        pathSeaLevel = if (it.toString() == "U") pathSeaLevel + 1 else pathSeaLevel - 1

        if (pathSeaLevel == 0 && it.toString() == "U") {
            result++
        }
    }
    return result
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val s = scan.nextLine()
//
//    var result = countingValleys(n, s)
//    println(result)


    var result = countingValleys(8, "UDDDUDUU")
    println(result)

    result = countingValleys(12, "DDUUDDUDUUUD")
    println(result)

    result = countingValleys(10, "UDUUUDUDDD")
    println(result)
}
