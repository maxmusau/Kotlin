fun main(args: Array<String>) {
    var height:Double=1.9
    var weight:Int=100
    var BMI:Double=weight/(height * height)
    if (BMI <18.5)println("$BMI class= Underweight")
    else if (BMI >=18.5 && BMI <=22.9)println("$BMI class= Normal")
    else if (BMI >=23 && BMI <=24.9)println("$BMI class= Overweight")
    else if (BMI >=25 && BMI <=29.9)println("$BMI class= Pre-Obese")
    else if (BMI >=30 && BMI <=34.9)println("$BMI class= Obese Class I")
    else if (BMI >=34 && BMI <=39.9)println("$BMI class= Obese Class II")
    else if (BMI >=40)println("$BMI class= Obese Class III")
}