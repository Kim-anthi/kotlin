fun main(args: Array<String>) {
    var my_string:String="eMobilis"
    var my_char:Char='G'
    var my_int:Int=1234
    var my_float:Float=54.12f
    var my_double:Double=12.123
    var my_bool:Boolean=true
    var my_array= arrayOf("Mango", "Kim", 20, 'k', false)

    println(my_string)
    println(my_char)
    println(my_int)
    println(my_float)
    println(my_double)
    println(my_bool)
//    println(my_array[1])
    for (i in my_array){
        println(i)
    }
}