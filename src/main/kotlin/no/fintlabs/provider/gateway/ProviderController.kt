package no.fintlabs.provider.gateway

import jakarta.ws.rs.*
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.core.Response.Status

@Path("/")
class ProviderController {

    @GET
    @Path("/status")
    fun status(): Map<String, Any> = TODO()

    @POST
    @Path("/heartbeat")
    fun heartbeat(): Response =
        Response.status(200).entity("💗").build()

    @POST
    @Path("/register")
    fun register(): Response = TODO()

    private fun handleSync(
        domain: String,
        pkg: String,
        entity: String,
        status: Status
    ): Response {
        return Response.status(status).build()
    }

    @POST
    @Path("/{domain}/{package}/{entity}")
    fun fullSync(
        @PathParam("domain") domain: String,
        @PathParam("package") pkg: String,
        @PathParam("entity") entity: String
    ): Response = handleSync(domain, pkg, entity, Status.CREATED)

    @PATCH
    @Path("/{domain}/{package}/{entity}")
    fun deltaSync(
        @PathParam("domain") domain: String,
        @PathParam("package") pkg: String,
        @PathParam("entity") entity: String
    ): Response = handleSync(domain, pkg, entity, Status.CREATED)

    @DELETE
    @Path("/{domain}/{package}/{entity}")
    fun deleteSync(
        @PathParam("domain") domain: String,
        @PathParam("package") pkg: String,
        @PathParam("entity") entity: String
    ): Response = handleSync(domain, pkg, entity, Status.OK)

}