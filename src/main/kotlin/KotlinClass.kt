fun main (args: Array<String>){

    //object creation
    val kotlinClass = KotlinClass()

    // call showName function, we have to pass the value for name, because we created parameter function
    kotlinClass.showName("Tippu Fisal")

    kotlinClass.age = 23 // age value declaration using object
    kotlinClass.showAge() // call showAge function

}

/**
 * KotlinClass
 */
class KotlinClass {

    var age:Int = 0
    fun showAge(){ // this is function
        println("Age: ${age}")
    }

    fun showName(name:String){ // this is parameter function
        println("Name: ${name}")
    }
}