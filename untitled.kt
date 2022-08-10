class Master(name: String, surname: String, age: Int){
    val name: String
    val surname: String
    val age: Int
    init {
        this.name = name
        this.surname = surname
        this.age = age
    }
}

fun main() {
    println("Write action:\n${"1.Enter new master"}\n${"2.Enter new beast"}\n${"3.Exit"}")
    var ch = readln().toInt()
    var Master = Master("John", "Doe", 45)
    var Animals = mutableListOf("Pig")
    var pet = "Pig"
    while (ch < 3) {
        if (ch == 1) {
            println("Input new master")
            Master = Master(readln(), readln(), readln().toInt())
            for (pet in Animals) {
                when (pet) {
                    "Pig" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Hrew to ${Master.name} ${Master.surname} ${Master.age} years old")
                    "Cat" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Meow to ${Master.name} ${Master.surname} ${Master.age} years old")
                    "Dog" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Gav to ${Master.name} ${Master.surname} ${Master.age} years old")
                    else -> ("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Nothing to ${Master.name} ${Master.surname} ${Master.age} years old")
                }
            }
        } else if (ch == 2) {
            println("Input new beast")
            pet = readln()
            Animals.add(pet)
            when (pet) {
                "Pig" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Hrew to ${Master.name} ${Master.surname} ${Master.age} years old")
                "Cat" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Meow to ${Master.name} ${Master.surname} ${Master.age} years old")
                "Dog" -> println("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Gav to ${Master.name} ${Master.surname} ${Master.age} years old")
                else -> ("${Master.name} ${Master.surname} ${Master.age} years old say Hello to $pet\n$pet say Nothing to ${Master.name} ${Master.surname} ${Master.age} years old")

            }
        } else {
            println("Wrong action, choose another one")
        }
        println("Write action:\n${"1.Enter new master"}\n${"2.Enter new beast"}\n${"3.Exit"}")
        ch = readln().toInt()
    }
}