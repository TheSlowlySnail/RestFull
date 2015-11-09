package com.youtube.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
@Path("/v2/status")
public class V2_Hello {
	@GET
	@Path("/{parameter}")
	public Response responseText(@PathParam("parameter") String parameter) {
		return Response.status(Status.ACCEPTED).entity("Hallo " + parameter).build();
	}
}
