package no.fintlabs.provider.gateway

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ProviderController {

    @GetMapping("/status")
    fun status(): Map<String, Any> = TODO()

    @PostMapping("/heartbeat")
    fun heartbeat(): ResponseEntity<Any> = ResponseEntity.ok("💗")

    @PostMapping("/register")
    fun register(): ResponseEntity<Any> = TODO()

    private fun handleSync(
        domain: String,
        pkg: String,
        entity: String,
        status: HttpStatus
    ): ResponseEntity<Any> {
        return ResponseEntity.status(status).build()
    }

    @PostMapping("/{domain}/{package}/{entity}")
    fun fullSync(
        @PathVariable("domain") domain: String,
        @PathVariable("package") pkg: String,
        @PathVariable("entity") entity: String
    ): ResponseEntity<Any> = handleSync(domain, pkg, entity, HttpStatus.CREATED)

    @PatchMapping("/{domain}/{package}/{entity}")
    fun deltaSync(
        @PathVariable("domain") domain: String,
        @PathVariable("package") pkg: String,
        @PathVariable("entity") entity: String
    ): ResponseEntity<Any> = handleSync(domain, pkg, entity, HttpStatus.CREATED)

    @DeleteMapping("/{domain}/{package}/{entity}")
    fun deleteSync(
        @PathVariable("domain") domain: String,
        @PathVariable("package") pkg: String,
        @PathVariable("entity") entity: String
    ): ResponseEntity<Any> = handleSync(domain, pkg, entity, HttpStatus.OK)

}