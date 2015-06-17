package com.amertkara.simplerest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/product")
public class Product {

  @GET
  @Path("{abc}")
  public Response getProductbyId(
		  @DefaultValue("3") @PathParam("abc") String productID ) {
	return Response.status(200).entity("Hello Jerseyy " + productID).build();
  }
}