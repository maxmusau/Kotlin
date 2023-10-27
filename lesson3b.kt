fun main(args: Array<String>) {
    //kotlin functions
    // call the other functions
    BMI()
    Area_circle()
   
}
// user defined functions
fun BMI(){
     // create a program that calculates BMI using weight and height variables
     var weight=70
     var height=1.9
     var BMI=weight/ (height *height)
     println("The weight is $weight, height is $height BMI Value is $BMI")
}
// create a function to calculate the area of a circle
fun Area_circle(){
    var radius=81
    var pi=3.14
    var area=pi *radius *radius
    println("The area of a circle with radius $radius is $area")

}