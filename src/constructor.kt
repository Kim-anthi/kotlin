class learners(var fname:String, var course_taken:String, var Phone_no:Int){


}

fun main(args: Array<String>) {
    val learner=learners("John Doe", "MIT", 722222222)
    println(learner.fname)
    println(learner.course_taken)
    println(learner.Phone_no)
}