package ru.kosm.kotlin_test

class Test {
    
    fun test() {
        val str = "Hello"
        System.out.println(str)
    }
    
    fun test2(arg : DataClassTest) {
        System.out.println(arg.name + "." + arg.age)
    }
    
}

data class DataClassTest(val name: String, val age: Int)

open class ConsTest {
    private var param : String
    
    val xxx: String
        get() {
            return param + "suffix"
        }
    
    constructor(xxx: String?) {
        param = xxx ?: "NULL"
    }
    
    
}

class Container(ct : ConsTest?) {
    var ct : ConsTest?
    
    init {
        this.ct = ct
    }
    
}


fun main(args : Array<String>) { 
    Test().test()
    Test().test2(DataClassTest("Petrov Vasily", 103))
    System.out.println(ConsTest(null).xxx)
    val ct = ConsTest("Helllloooo")
    System.out.println("Container: " + Container(ct).ct?.xxx)
}