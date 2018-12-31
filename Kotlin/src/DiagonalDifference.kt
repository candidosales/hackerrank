import java.util.*

// Complete the diagonalDifference function below.
fun diagonalDifference(arr: Array<Array<Int>>): Int {
//    println(arr.size)
    var diagonal1 = 0
    var diagonal2 = 0
    val sizeArray = arr.size -1

    for (i in 0..sizeArray) {
        diagonal1 += arr[i][i]
    }

    for (i in 0..sizeArray) {
        diagonal2 += arr[0 + i][sizeArray - i]
    }

    val value = diagonal1 - diagonal2

    return if (value < 0) value * -1 else value
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}