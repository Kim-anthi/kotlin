//for loop

fun main(args: Array<String>) {
    var my_array = arrayOf("Beamer", "M7", 't', 55)
    for (i in my_array) {
        println(my_array[3])
    }

//    range
    for (x in 5..15){
        println("Range is $x")
    }
    for (ch in 'D'..'K'){
        println(ch)
    }

    var num = 10

    while(num>=5){
        println("Loop: $num")
        num--
    }
}