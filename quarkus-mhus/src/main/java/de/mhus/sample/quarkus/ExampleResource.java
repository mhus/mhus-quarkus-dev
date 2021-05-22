package de.mhus.sample.quarkus;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.mhus.lib.core.MDate;

@Path("/hello")
public class ExampleResource {

    @PostConstruct
    public void doInit() {
        
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy " + MDate.toIso8601(new Date());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("info")
    public String info() {
        
        return "";
    }

}