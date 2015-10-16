package com.github;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/sample")
@Api(value = "/sample", description = "Sample Description")
public class Sample {

	@Path("/date")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "getDate", notes = "method return Date", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), @ApiResponse(code = 204, message = "Date not found") })
	public String date() {
		return "21.10.2015";
	}

	@Path("/sayHello")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Say Hello World", notes = "Anything Else?")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Hello world"), @ApiResponse(code = 500, message = "Something wrong in Server") })
	public Response sayHello() {
		String hello = "Hello world";
		return Response.status(200).entity(hello).build();
	}

	@Path("/hi")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "getDate", notes = "method return Date", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), @ApiResponse(code = 204, message = "Date not found") })
	public String hi(@ApiParam(name = "userName", value = "UserName to the application", required = true) @PathParam("userName") String userName) {
		return "hi" + userName;
	}

}