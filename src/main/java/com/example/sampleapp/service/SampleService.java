package com.example.sampleapp.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class SampleService {

    @POST
    public Response post(String payload) {
        String output = "Creating " + payload;
        System.out.println(output);
        return Response.status(201).entity(output).build();
    }


    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String id) throws Exception {
        String METHOD_NAME = "get";
        String output = "Getting " + id;
        System.out.println(output);

        return Response.status(200).entity(output).build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") String id){
        System.out.println("DELETE " + id);
        return;
    }

    @PUT
    @Path("/{id}")
    public void update(String payload){
        System.out.println("PUT " + payload);
    }
}
