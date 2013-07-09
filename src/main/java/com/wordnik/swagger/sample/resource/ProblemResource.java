package com.wordnik.swagger.sample.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.sample.data.School;

@Path("/problemservice")
@Api(value = "/problemservice", description = "does not work")
public interface ProblemResource {

  @GET
  @Produces("application/json")
  @Path("/problem/{id}")
  @ApiOperation(value="Return a list of flight detail sites",
          notes="Input parameter takes a flight Id",
          response=School.class,
          responseContainer = "List")
  List<School> getFlightDetailSiteList(
          @ApiParam(value="flight ID", required=true)
          @PathParam("id")
          String id);
  
}
