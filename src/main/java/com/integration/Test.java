package com.integration;

import ServiceLayer.ClientAuth;
import ServiceLayer.InsertObject;
import beans.Employee;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/home")
public class Test {

    @Path("/login")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@HeaderParam("AUTHORIZATION") String authorizationHeader,
                          Employee employee) {
        boolean validClient = ClientAuth.validate(authorizationHeader);

        if (validClient) {
            Response rs = Response.status(Response.Status.OK).entity("Sucessfully Inserted").build();
            boolean val = InsertObject.checkObjectExist(employee);
            if (val) {
                return rs;
            } else {
                boolean va = InsertObject.saveObject(employee);
            }
            return rs;

        } else {

            Response rs = Response.status(Response.Status.UNAUTHORIZED).entity("Invalid Client").build();
            return rs;
        }
    }


}
