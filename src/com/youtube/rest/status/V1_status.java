package com.youtube.rest.status;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
//https://www.youtube.com/watch?v=4DY46f-LZ0M&index=2&list=PLu47tUtKqNlwfR-nqjiWUaIWOYEi9FyW0
// Minute 22

@Path("/v1/status")
public class V1_status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return"<p>Java Web Service</p>";
	}

}
