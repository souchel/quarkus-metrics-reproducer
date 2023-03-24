package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public interface GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{firstname}")
    String hello(@PathParam("firstname") String firstname);
}
