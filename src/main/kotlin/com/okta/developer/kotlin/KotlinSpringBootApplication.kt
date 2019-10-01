package com.okta.developer.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class KotlinSpringBootApplication {


	@GetMapping("/")
	fun hello(@AuthenticationPrincipal authenticationToken: OAuth2AuthenticationToken): String {
		return "Welcome, " + authenticationToken.principal.attributes["name"]
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}

