package com.wordnik.swagger.sample.resource;

import java.util.List;

import javax.ws.rs.PathParam;

import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.sample.data.School;

public class ProblemResourceImpl implements ProblemResource {


  @Override
  public List<School> getFlightDetailSiteList(@ApiParam(value = "flight ID", required = true) @PathParam("id") String id) {
    return null;
  }
}
