open class parent{
    var dad="Loves football"
    var mom="Loves shopping sprees"
}
class daughter:parent(){
    fun dau(){
        println("mom $mom")
    }
}
class son:parent(){
    fun so (){
        println("dad $dad")
    }

}

fun main(args: Array<String>) {
    val obj=daughter()
    obj.dau()
    val obj2=son()
    obj2.so()
}