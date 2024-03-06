//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var palace = 'K'
    var city ="N"

    var place = "Joburg"
    place ="Johannesburg"
    var bucket = "bird"
    bucket = "birds"

    var fname ="Mary"
    var lname = "Esther"
    var fullName = "$fname $lname"
    println(fullName)

    var name = "Peter"
    var age = 26
    var profession = "policeman"

    var statement = "$name who is $age years old is a $profession"
    println(statement)

    fun greeting (name: String){
        println("Hello, $name")

        greeting("James")
    }

        var fruit = "mango"
        println(fruit[0])
        println(fruit[4])
        println(fruit.last())
        println(fruit.indexOf("n"))

    var fruit2 = "banana"
    println(fruit.indexOf("a"))

    var weight = 40.7
    println("I weigh" + weight)

    println(weight.toString()+ "kgs is my weight")

    var city5 = "Nairobi"
    var city2 = "Kiambu"
    println(city == city2)

    println(city.equals(city2))

    var city3 = "Nairobi"
    var city4 = "nairobi"
    println(city.uppercase())   NAIROBI
    println(city.lowercase())   nairobi

    var emptyString = ""
    var blankString = " "

    println(emptyString.isEmpty())   true
    println(blankString.isEmpty())   false

    println(emptyString.isBlank())   true      true
    println(blankString.isBlank())   false     true

    var statement = "Good Morning"
    println(statement.indexOf(" ")) blank space = 4
    println(statement.indexOf("x"))  doesn't exist = -1
    println(statement[45])   = error

    val town = "Kitale"
    println(town)
    println(town.trimStart())    no pace at the begin
    println(town.trimEnd())
    println(town.trim())

    var statement1 = "The blue car overtook the black car"
    println(statement.replace(oldValue ="car", newValue = "bike"))

    println(statement.replace(oldValue = "a", newValue = "x"))

    println(statement.startsWith(prefix:"t"))         false
    println(statement.startsWith(prefix:"The"))       true
    println(statement.endsWith(suffix:"That"))        false

    println(statement1.startsWith())

    println(statement1.split(""))
    println(statement1.split(...delimeters:"a"))  c r    bl ck

    var dateNow = "2024-02-28"
    println(dateNow.split("-"))



}
