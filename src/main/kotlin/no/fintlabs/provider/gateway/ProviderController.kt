package no.fintlabs.provider.gateway

import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response

@Path("/")
class ProviderController {

    @GET
    @Path("/status")
    fun status(): Map<String, Any> = TODO()

    @POST
    @Path("/heartbeat")
    fun heartbeat(): Response =
        Response.status(200).entity("💗").build()


}