package com.akshay.mad


// TODO: 4. Show Any type
// Similar to Object in Java
// Every class in Kotlin inherits [Any] class
class Fruit(): Any()


// TODO: 5. Show Unit and Nothing

fun abc(): Unit {
    // Unit is equivalent of Java's Void.
    // Unit is the default return type.
}

fun divide(x: Double, y: Double): Nothing {
    // Nothing is subtype of every type

    // Nothing never returns, basically it's unreachable code
    // Confused on what's the use?
    TODO("")
    throw IllegalArgumentException("")
}




fun playingWithType() {
    // TODO: 6. Playing with Nullability
    var nullStr: String? = null
    // OK
    var str: String? = "str"
    val length: Int = str?.length ?: 0
//    str = null
    nullStr = null
    // Not okay
    // Won't compile, because [String?] is different of [String]
    str = nullStr
}