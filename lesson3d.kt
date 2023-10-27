fun main(args: Array<String>) {
    // kotlin classes
    //object oriented programming
    // classes can have methods/functions, properties/variables
    var mycarObject=Car()
    // access the properties in the class
    mycarObject.brand="Toyota"
    mycarObject.mileage="23,000km"
    mycarObject.cc="3000"
    println(mycarObject.brand)

    // access the functions
    mycarObject.Drive()

}
class Car {
    // properties
    var brand=""
    var mileage=""
    var cc=""
    // functions 
    fun Drive(){
        println("The car is on drive mode")
    }
    fun Parking(location:String){
        println("The car is parked at $location")
    }
    
}