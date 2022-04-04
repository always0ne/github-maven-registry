package com.github.maven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MavenApplication

fun main(args: Array<String>) {
	runApplication<MavenApplication>(*args)
}
