fun main(args: Array<String>) {
    // iterative statements
    // for loops
    // looping/ iterating through a collection
    // loop through an string
    var name="Modcom"
    for (letter in name){
        println(letter)
        if (letter=='d'){
            break //terminate the for loop
        }
    }
    // loop through a list
    var counties=listOf("Makueni","Kiambu","Kisumu","Siaya","Nakuru")
    for (county in counties){
        println(county)
    }

    //loop through a range of numbers
    for (num in 0..9){//0 >=..<=9
        println(num)
    }

    // through the alphabets
    for (letter in 'a'..'z'){
        print("$letter ")
    }

    //while loop - loop/repeat a task while the condition is true
    // we should increment the value in the condition 
    var count=0
    while (count <10){
        println("$count  looping")
        count++
    }

    
}