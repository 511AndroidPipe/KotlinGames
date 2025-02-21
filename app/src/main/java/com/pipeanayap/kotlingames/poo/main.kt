package com.pipeanayap.kotlingames.poo

fun main() {
    val person1 = Person("juan", 27)
    person1.sayHello()

    val carro1 = Car("porsche", "911 turbo s", 2025)
    carro1.drive()

    val bankAccount = BankAccount(1000.0)

    bankAccount.deposit(3000.0)
    bankAccount.deposit(15000.0)
    bankAccount.withdraw(1000.0)
    println(bankAccount.getBalance())

    val newDog = Dog("jaibas")
    newDog.makeSound()

    val shapes : List<Shape> = listOf(
        Circle(10.0),
        Rectangle(20.5, 30.1),
        Square(10.0)
    )

    for(shape in shapes){
        println("el area es : ${shape.area()}")
    }

}

//No necesitas poner constructor, con esto es mas que suficiente
class Person(val name : String, val age : Int){

     fun sayHello(){
         println("hello, mi name is $name and i am $age years old")
     }

}

//Clase llamada car
// con las propiedades brand, model

class Car(val brand : String, val model : String, val year : Int){

    fun drive(){
        println("The car is driving")
    }
}

class BankAccount(private var balance : Double){

    fun deposit(amount : Double){
        balance+= amount
        println("Deposited $amount. New balance : $balance")
    }

    fun withdraw(amount: Double){
        if (balance >= amount){
            balance  -= amount
            println("Withdrew $amount. New balance $balance")
        }else{
            println("Insufficient funds")
        }
    }

    fun getBalance() : Double{
        return balance
    }
}

//Herencia

open class Animal(var name : String, ){
     open fun makeSound(){
         println("making weird noise")
     }
}

class Dog(name : String) : Animal(name){
    override fun makeSound() {
        println("wau wau")
    }
}

open class Shape(){
    open fun area() : Double{
        return 0.0
    }
}

class Circle(private val radius : Double) : Shape(){
    override fun area() : Double{
        return Math.PI * radius * radius
    }
}

class Rectangle(private val base : Double, private val height : Double) : Shape(){
    override fun area() : Double{
        return (base * height) / 2
    }
}

class Square(private val side : Double) : Shape(){
    override fun area() : Double{
        return side * side
    }
}

//En abstract las clases solo se definen, no se implementan
//Las funciones open, no te obligan a implementarlo enlaotra clase, la abstracta si
abstract class Vehicle(){
    abstract fun start()
}

class Motorcycle() : Vehicle(){
    override fun start(){
        println("start engine")
    }
}

interface Volar{
    fun ganarVelocidad()
    fun asegurarAlas()

}

class Avion : Volar{

    override fun ganarVelocidad(){

    }

    override fun asegurarAlas(){

    }
}

interface DBConnection{
    fun connect()

}

class MongoConnection() : DBConnection{
    override fun connect(){

    }
}

class SQLConnection() : DBConnection{
    override fun connect(){

    }
}