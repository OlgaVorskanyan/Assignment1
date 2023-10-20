fun main() {

    // Task 1
    val array = arrayOf(1, 2, 3, 4, 5)
    val list = listOf("t-shirt", "jacket", "shoes")
    println("Array: ${array.joinToString()}")
    println("List: ${list.joinToString()}")

    // Task 2
    var str = "Hello, "
    str += "World"
    println("Concatenated String: $str")
    val substring = str.substring(7)
    println("Substring: $substring")
    println("Uppercase: ${str.toUpperCase()}")

    // Task 3
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }

    // Task 4
    fun checkNumber(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }
    println("Number: 5, Result: ${checkNumber(5)}")
    println("Number: -3, Result: ${checkNumber(-3)}")
    println("Number: 0, Result: ${checkNumber(0)}")

    // Task 5
    println("Enter your name:")
    val name = readLine()
    println("Enter your age:")
    val age = readLine()?.toIntOrNull()
    if (name != null && age != null) {
        println("Hello, $name! You are $age years old.")
    } else {
        println("Invalid input.")
    }

    // Task 6
    fun divide(a: Double, b: Double): String {
        return if (b != 0.0) {
            "Result: ${a / b}"
        } else {
            "Cannot divide by zero."
        }
    }
    println(divide(10.0, 2.0))
    println(divide(5.0, 0.0))

    // Task 7
    val currentDateTime = java.time.LocalDateTime.now()
    val formattedDateTime = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(currentDateTime)
    println("Current Date and Time: $formattedDateTime")

    // Task 8
    data class Person(val name: String, val age: Int)
    val person = Person("Alice", 30)
    println("Person: ${person.name}, Age: ${person.age}")

    // Task 9
    fun lifeStage(age: Int): String {
        return when {
            age < 13 -> "Child"
            age < 20 -> "Teenager"
            else -> "Adult"
        }
    }
    println("Age: ${person.age}, Life Stage: ${lifeStage(person.age)}")

    // Task 10
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: ${evenNumbers.joinToString()}")
}