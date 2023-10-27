//kotlin when statements
fun main(args: Array<String>) {
    // create  a program  to isplay  the season based on a given month
    var month:String="April"
    when (month){
        "December","January","February" -> println("Spring")
        "March","April","May"->println("Winter")
        "June","July","August"->println("Summer")
        "September","October","November"->println("Autumn")
    }

    // create a program to display the name of an objectt based on an input
    var object1:String="earth"
    when (object1){
        "sun" -> println("$object1 is a star")
        "earth"->println("$object1 is a planet")
        "moon"->println("$object1 is a satelite")
    }
}
