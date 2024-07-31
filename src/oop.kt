class Fruits{
    var name=""
    var color=""
    var shape=""
    var price=0
}

fun main(args: Array<String>) {
    val myobj=Fruits()
    myobj.name="Banana"
    myobj.color="yellow"
    myobj.shape="curved"
    myobj.price=10

    val myobj2=Fruits()
    myobj2.name="Apple"
    myobj2.color="green"
    myobj2.shape="round"
    myobj2.price=30

    println("I love eating ${myobj2.name} and it is ${myobj2.shape} in shape")
    println("I love eating ${myobj.name} and it is ${myobj.shape} in shape")
}