package com.pipeanayap.kotlingames.games

fun main() {
    println("Ingresa un numero entero")
    val numeroInicial = readlnOrNull()?.toIntOrNull()

    if (numeroInicial == null || numeroInicial <= 2) {
        println("Ingresa un numero valido o mayor a 2")
    }

    var esPrimo = true

    for (i in 2..numeroInicial!! - 1) {
        if (numeroInicial % i == 0) {
            esPrimo = false
            break
        }
    }

    if (esPrimo) {
        println("El numero es primo")
    } else {
        println("No es primo")
    }
}