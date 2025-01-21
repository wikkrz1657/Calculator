package com.example.calculator

sealed class Operations( val symbol: String) {
    object Add : Operations( "+")
    object Substract : Operations( "-")
    object  Multiply : Operations( "x")
    object Divide : Operations( "/")

}