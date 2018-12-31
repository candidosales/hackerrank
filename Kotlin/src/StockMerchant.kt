import java.util.*
import kotlin.collections.*
import kotlin.io.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val count = hashMapOf<Int, Int>()
    var results = 0

    ar.forEach {
        if (count.containsKey(it)) {
            val value = count[it]!!.plus( 1)
            count[it] = value
        } else {
            count[it] = 1
        }
    }


    count.forEach {
        if (it.value >= 2) {
            results += it.value / 2
        }
    }

    return results

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().trim().split(" ").map{ it.trim().toInt() }.toTypedArray()

    var result = sockMerchant(n, ar)
    println(result)

    result = sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
    println(result)

    result = sockMerchant(10, arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3))
    println(result)
}
