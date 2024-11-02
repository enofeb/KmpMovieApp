package com.enofeb.movieapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform