package dataStructureProblems

fun main(args: Array<String>) {
    primeNumber()
}

/*
to check the num from 1..100 is a prime number or not
 */
fun primeNumber() {
    for (num in 1..100) {
        if (num % 2 == 0) {
            println("${num} is not a primeNumber")
        } else if (num % 3 == 0) {
            println("${num} is not a primeNumber")
        } else {
            println("${num} is a primeNumber")
        }
    }
}