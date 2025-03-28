package no.fintlabs.provider.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProviderGatewayApplication

fun main(args: Array<String>) {
	runApplication<ProviderGatewayApplication>(*args)
}
