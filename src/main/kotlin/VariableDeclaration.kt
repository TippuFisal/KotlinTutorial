/**
 * To declare a variable we have two keywords
 *
 * val and var
 *
 * val:
 *      val key word is use to declare contact value,
 *      Example : if you declare -> val appName:String = "Facebook",
 *      we can't change the appName again, we can declare not possible to change.
 *
 * var :
 *      var key word is use to declare dynamic value
 *      Example : if you declare -> var name:String = "Tippu Fisal"
 *      we can change the value whenever we want, like this
 *      name = "Sheriff"
 */

fun main(args: Array<String>) {

    // val keyword example
    val appName: String = "Facebook"
    val appSerialNumber: Int = 254637

    println("App name: ${appName}, Serial Number: ${appSerialNumber}")

    // var keyword example
    var name: String = "Tippu Fisal"
    var age: Int = 22

    println("Before change :")
    println("Name: ${name}, Age: ${age}")

    name = "Sheriff"
    age = 23

    println("After change :")
    println("Name: ${name}, Age: ${age}")

}