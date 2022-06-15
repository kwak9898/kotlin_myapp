package com.example.myapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

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
}