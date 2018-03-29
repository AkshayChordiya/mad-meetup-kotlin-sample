package com.akshay.mad


// TODO: 7. let
fun let() {
    val person: Person? = null

//    if (person != null) {
//        person.name
//    }
//
    person?.name
    person?.email
    person?.age

    val let = person?.let {
        it.name = "Alex"
        it.email = "alex@bitfurther.com"
        it.age = 14
    }
}

// TODO: 8. also
fun also() {
    val person: Person = Person().also {
        it.name = "Alex"
        it.email = "alex@bitfurther.com"
        it.age = 14
    }
}


// TODO: 9. apply
fun apply() {
    val person2 = Person()
    person2.name = "A"
    person2.email = "A"
    person2.age = 12
    val person: Person = Person().apply {
        name = "Alex"
        email = "alex@bitfurther.com"
        age = 14
    }
}



// TODO: 10. with
fun with() {
    val person: Unit = with(Person()) {
        name = "Alex"
        email = "alex@bitfurther.com"
        age = 14
    }
}





// TODO: 11. run

fun run() {
    val person: Unit = Person().run {
        name = "Alex"
        email = "alex@bitfurther.com"
        age = 14
    }
}
