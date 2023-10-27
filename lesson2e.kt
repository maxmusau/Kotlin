fun main(args: Array<String>) {
    //when condition
    //execute a particular task when a condition is satisfied
    // var vowels =listOf('a','e','i','o','u')
    var character='5'
    when  (character){
        in 'a' ..'z' ->println("It is an alphabet")
        in '0'..'9' ->println("it is a number")   
    }
}
