package kotlincollections.arrays

fun main(args: Array<String>) {
    arrayExample()
}

/*
 * we will execute array example in this function
 */
fun arrayExample() {
    // we declare array integer with size of 56 and default value is 0.
    // array is a fixed in size
    // array is mutable.
    var arr = Array<Int>(56) { 0 }
    arr[0] = 16
    arr[45] = 15
    arr[34] = 54
    arr[23] = 21
    arr[5] = 38
    for (i in 0 until arr.size) {
        if (arr[i] != 0) {
            println("Index $i -> value ${arr[i]} ")
        }
    }
}