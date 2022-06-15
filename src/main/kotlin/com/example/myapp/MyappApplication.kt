package com.example.myapp

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class MyappApplication {

	@Value("\${my-app.welcome-message}")
	val myAppWelcomeMessage: String = ""

	@PostConstruct
	fun printMyAppWelcomeMessage() {
		println(myAppWelcomeMessage)
	}
}

fun main(args: Array<String>) {
	runApplication<MyappApplication>(*args)

	// Logging
	logger.trace { "I'm trace! Hello, world!" }
	logger.debug { "I'm debug! Hello, world!" }
	logger.info { "I'm info! Hello, world!" }
	logger.warn { "I'm warn! Hello, world!" }
	logger.error { "I'm error! Hello, world!" }
}