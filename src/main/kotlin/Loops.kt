fun main(args: Array<String>){
    loopUsingDownTo()
}


/* -----------------
    FOR LOOP - START
    ---------------- */

/**
 * For Loop Using Until.
 * Until will work before the last number, Example -> Last Number is 10 it will run up to 9.
 */

private fun loopUsingUntil(){
    val startFrom = 0
    val endTo = 100

    for (i in startFrom until endTo){
        println(i)
    }
}

/**
 * For Loop Using Range.
 */
private fun loopUsingRange(){
    val startFrom = 0
    val endTo = 100

    for (i in startFrom..endTo){
        println(i)
    }
}

/**
 * For Loop Using DownTo.
 * Down to use to decrement the range from start to end.
 */
private fun loopUsingDownTo() {
    val startFrom = 100
    val endTo = 0

    for (i in startFrom downTo endTo) {
        if (i % 2 == 0){
            continue // it will skip
        }else{
            println(i)
        }
    }
}
/* ------------------
    FOR LOOP - END
   ------------------ */



/* ---------------------
    WHILE LOOP - START
   --------------------- */


/**
 * While Loop
 */

private fun whileLoop(){
    var startFrom = 0
    val endTo = 10

    while (startFrom <= endTo){
        println(startFrom)
        if (startFrom == 5)
            break // it will stop this loop

        startFrom++
    }
}


/**
 * doWhileLoop
 */
private fun doWhileLoop(){
    val startFrom = 0
    val endTo = 10

    do { // First it will run then check the condition next
        println(startFrom)
    }while(startFrom > endTo)
}

/* ---------------------
    WHILE LOOP - END
   --------------------- */