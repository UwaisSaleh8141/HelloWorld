package com.casper.helloworld

// DATA CLASSES

// Every Data Class in Kotlin needs to fulfill the following requirements -

// The primary constructor must have at least one parameter
// All the parameters declared in the primary constructor need to be marked as val or var.
// Data classes cannot be abstract, open, sealed or inner.

data class User(val id: Long, var name :String)

fun main(){

    val user1 = User(1,"Uwais")

    val name = user1.name
    println(name)

    user1.name = "Alex"

    val user2 = User(1, "Alex")
    // You can also use Kotlin’s Structural equality operator == to check for equality. The == operator internally calls the equals() method -
    println(user1 == user2)

    // Dataclasses have a toString Method
    println("User Details : $user1")

    // Using the copy() Method
    // Copies the customer object into a separate Object
    // and updates the name.
    // The advantage is, that the existing user object remains unchanged.
    val updatedUser :User = user1.copy(name = "Mike")
    println(updatedUser)
    println(user1)

    println(user2.component1()) // Prints 1
    println(user2.component2()) // Prints "Alex"

    // Deconstructing Data Classes
    val (id, names) = updatedUser
    println("id = $id, name = $names") // Prints "id = 1, name = Mike"

}