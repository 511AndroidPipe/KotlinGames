package com.pipeanayap.kotlingames.games
//Adivina un numero
//Se debe seleccionar un numeor dentro de un rango
//La computadora debe ser capaz de seleccionar este numeror
//El programa debe solicitar al usuario ingresar la suposicion
//El juego termina cuando el jugador acierta el numero

fun main(){
    val range = 1..10
    val numberToGuess = range.random()
    var attempts = 0

    println("Bienvenido al juego de adivina un Numero")
    println("Estoy pensando en un numero entre 1 y 10. Adivinalo")
    println("Ingresa tu suposicion")

    //Inicio del ciclo del juego
    do {
        var guess = readlnOrNull()?.toIntOrNull()
        attempts++

        if (guess != null){
            //El numero que me pasaron es valido
            when{
                guess < numberToGuess -> println("El numero que buscas es mayor")
                guess > numberToGuess -> println("El numero que buscas es menor")
                else -> println("Felicidades le atinaste padrino, solo te tomo $attempts intentos")
            }
        }else{
//            No es un numero
            println("Por favor, ingresa un numero valido")
        }

    }while (guess != numberToGuess)




}