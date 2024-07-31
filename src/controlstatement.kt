fun main(args: Array<String>) {
    var age=18

    if (age>=18){
        println("Eligible to vote")


}else{
    println("Sorry you are not")

    }
    var num=4
    if (num%2==0){
        println("$num is an even number")}
    else{
        println("$num is odd")
        }
    var marks=70
    if (marks>=80 && marks<=100) {
        println("You have an A")
    }
    else if (marks>=60 && marks<=79){
        println("You have B")
    }
    else if (marks>=40 && marks<=59){
        println("You have C")
    }
    else if (marks>=30 && marks<=39){
        println("You have D")
    }
    else if (marks>=0 && marks<=29){
        println("You have failed")
    }
    else{
        println("Wrong input")
    }

}