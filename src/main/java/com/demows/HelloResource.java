package com.demows;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloResource
{
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello() {
        String response = "Greeting: Hello World";
        return Response.status(Response.Status.OK).entity(response).build();
    }
}
