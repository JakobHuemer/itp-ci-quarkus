package at.htlleonding;

import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path( "/" )
public class Home {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public String hello() {
        return "<h1>Hello world from Jakob Huemer-Fistelberger</h1>";
    }
}
