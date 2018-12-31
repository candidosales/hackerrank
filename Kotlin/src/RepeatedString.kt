import java.util.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    var countForString = 0L
    var total = 0L

    if (s == "a") return n

    for (i in 0 until s.length) {
        if (s[i] == 'a') {
            countForString++
        }
    }


    val divisor = n / s.length
    total += divisor * countForString;

    val remainder = n % s.length

//    println("divisor $divisor")
//    println("total $total")
//    println("remainder $remainder")

    for (i in 0 until remainder.toInt()) {
        if (s[i] == 'a') {
            total++
        }
    }

    return total
}

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val s = scan.nextLine()
//
//    val n = scan.nextLine().trim().toLong()

    var result = repeatedString("aba", 10)
    println(result)

//    result = repeatedString("a", 1000000000000)
//    println(result)
}
