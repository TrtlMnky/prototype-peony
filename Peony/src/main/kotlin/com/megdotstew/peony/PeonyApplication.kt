package com.megdotstew.peony

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PeonyApplication

fun main(args: Array<String>) {
	runApplication<PeonyApplication>(*args)
}
