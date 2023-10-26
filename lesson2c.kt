
fun main(args: Array<String>) {
    // nested if
    // create a program to determine whether someone qualifies to  donate blood or not
    var age:Int=19
    var weight:Double=40.0
    if (age >=18){
        if (weight >=50){
            println("Qualifies")
        }
        else{println("Underweight")}
    }
    else{println("Underage")}

}