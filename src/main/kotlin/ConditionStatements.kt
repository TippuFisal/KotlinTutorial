fun main(args:Array<String>){

    val a = 10
    val b = 5
    ifCondition(a,b)
    whenCondtion(a,b)
}

fun ifCondition(a:Int,b:Int){
    if (a>b){
        println("Yes, A is greater than B: $a")
    }else{
        println("No, A is not-greater than B: $b")
    }

    // if as a Expression
    val maxValue = if (a>b){
        a
    }else{
        b
    }

    println("maxValue: $maxValue")
}

fun whenCondtion(a:Int,b:Int){
    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}