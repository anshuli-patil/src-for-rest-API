package com.hackathon1;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/InfoService")
public class InfoService {

	InfoDao infoDao = new InfoDao();

	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers(@QueryParam("user_type") String type, @QueryParam("user_name") String name) {

		String entityValue = new InfoFilter().getResponseText(type, name);
		return Response.status(200).entity(entityValue).build();

		// return new InfoDao().getAllInfo();
		// return new ArrayList<Info>();
	}

	
}
