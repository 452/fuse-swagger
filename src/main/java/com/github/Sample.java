package com.github;

import javax.ws.rs.Path;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/w")
@Api(value = "/w", description = "dsss about Version")
public class Sample {

	@Path("/time")
	
    @ApiOperation(value = "ssss ZZZZ by ID", notes = "More notes about this method", response = String.class)
    @ApiResponses(value = {
      @ApiResponse(code = 500, message = "ss ID supplied"),
      @ApiResponse(code = 204, message = "ss not found") 
    })
	public String time() {
		return "Hi";
	}

}