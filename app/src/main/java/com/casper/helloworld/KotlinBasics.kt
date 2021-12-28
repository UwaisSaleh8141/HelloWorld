package com.casper.helloworld

fun main(){

    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)
    val myName = "Uwais"

    println("Hello " + myName)

    /*
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
     */
    var myAge = 20

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 1203981230948

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isNight: Boolean = true
    // not night
    isNight = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println("First Char: " + firCharInStr)
    println("Last Char: " + lastCharInStr)

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result /= 2
    result *= 5
    result -= 1
    println("\nResult: " + result)

    var moduloResult = 5%2
    println("Modulo Result: " + moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("\nisEqual is: " + isEqual)

    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    val isNotEqual = 5!=5
    println("isNotEqual is: $isNotEqual")

    println("is 5 Greater Than 3: ${5 > 3}")
    println("is 5 Less Than Equal To 3: ${5 <= 3}")
    println("is 5 Less Than Equal To 5: ${5 <= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("\nmyNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")  //32

    //Increment & Decrement operators (++, --)
    myNum++ //33
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")  //34, however it prints 33 (previous value) then increments
    // increments before use
    println("myNum is ${++myNum}")  //35 because it is incremented before use
    println("myNum is ${--myNum}")  //34

    // If Statements
    var age = 17

    if(age >= 21){
        println("\nYou may drink in the US (21 and older)")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age >= 18){
        println("\nYou may vote (18 and older)")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16){
        println("\nYou can get your drivers licence (16 and older)")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        println("\nYou're too young")
    }

    // Kotlin’s "when" expression is the replacement of switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("\nSpring")
        2 -> println("\nSummer")
        3 -> {
            println("\nFall")
            println("Autumn")
        }
        4 -> println("\nWinter")
        else -> println("\nInvalid Season")
    }

    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age) {
        !in 0..20 -> println("\nYou may drink in the US (21 and older)")
        in 18..20 -> println("\nYou may vote (18 and older)")
        16,17 -> println("\nYou can get your drivers licence (16 and older)")
        else -> println("\nYou're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("\n$x is an Int")
        !is Double -> println("\n$x is not Double")
        is String -> println("\n$x is a String")
        else -> println("\n$x is none of the above")
    }

    // While loop executes a block of code repeatedly as long as a given condition is true
    var y = 10
    while(y >= 0) {
        print("$y ")
        y-=2
    }
    print("\n")
    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)

    print("\n\n")
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
    print("\n")

    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lecture).
    for(num in 1..10) {
        print("$num ")
    }
    print("\n")
    // infix notation
    for(i in 1 until 10) {	// Same as - for(i in 1.until(10))
        print("$i ")
    }
    print("\n")
    for(i in 10 downTo 1) {	 // Same as - for(i in 10.downTo(1))
        print("$i ")
    }
    print("\n")
    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }

    print("\n\n")

    myFunction()
    println("Add Up: " + addUp(5,10)  + " Average: " + average(5.0,10.0))
    println(average(5.0,10.0))

}

fun myFunction(){
    println("Called From myFunction")
}

fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun average(a: Double, b: Double) : Double{
    return (a+b)/2
}