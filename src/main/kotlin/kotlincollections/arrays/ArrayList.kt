package kotlincollections.arrays

fun main(args:Array<String>){
    arrayList()

}
fun arrayList(){
    var nameOfList = arrayListOf<String>()
    for(i in 0 until 10){
        nameOfList.add("faizal")
        println(nameOfList[i])

    }



}