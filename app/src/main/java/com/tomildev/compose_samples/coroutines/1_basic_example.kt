package com.tomildev.compose_samples.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun basicExample() = runBlocking {
    launch {
        delay(100L)
        println("World!")
    }
    println("Hello")
}