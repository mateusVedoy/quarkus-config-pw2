package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name="Ifrs.pw2", defaultValue="Text")
    String value;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from class "+value;
    }
}
