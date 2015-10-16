package com.github;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/version")
@Api(value = "/version", description = "Operations about Version")
public class VersionServiceCxfrsImpl {

	private String shortBuildVersion;
	private String buildTimeStamp;
	private String gitTag;
	private String gitRevision;
	private String userName;
	private String jenkinsJobBuildinfo;
	private String marketVersion;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	
    @ApiOperation(value = "Find ZZZZ by ID", notes = "More notes about this method", response = Container.class)
    @ApiResponses(value = {
      @ApiResponse(code = 500, message = "Invalid ID supplied"),
      @ApiResponse(code = 204, message = "Version not found") 
    })
	public List<Container> getVersion() {
		List<Container> versionInfo = new LinkedList<Container>();
		versionInfo.add(new Container("shortBuildVersion", shortBuildVersion));
		versionInfo.add(new Container("buildTimeStamp", buildTimeStamp));
		versionInfo.add(new Container("gitTag", gitTag));
		versionInfo.add(new Container("gitRevision", gitRevision));
		versionInfo.add(new Container("userName", userName));
		versionInfo.add(new Container("jenkinsJobBuildinfo", jenkinsJobBuildinfo));
		versionInfo.add(new Container("marketVersion", marketVersion));
		return versionInfo;
	}

	public String getShortBuildVersion() {
		return shortBuildVersion;
	}

	public void setShortBuildVersion(String shortBuildVersion) {
		this.shortBuildVersion = shortBuildVersion;
	}

	public String getBuildTimeStamp() {
		return buildTimeStamp;
	}

	public void setBuildTimeStamp(String buildTimeStamp) {
		this.buildTimeStamp = buildTimeStamp;
	}

	public String getGitTag() {
		return gitTag;
	}

	public void setGitTag(String gitTag) {
		this.gitTag = gitTag;
	}

	public String getGitRevision() {
		return gitRevision;
	}

	public void setGitRevision(String gitRevision) {
		this.gitRevision = gitRevision;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJenkinsJobBuildInfo() {
		return jenkinsJobBuildinfo;
	}

	public void setJenkinsJobBuildInfo(String jenkinsJobBuildinfo) {
		this.jenkinsJobBuildinfo = jenkinsJobBuildinfo;
	}

	public String getMarketVersion() {
		return marketVersion;
	}

	public void setMarketVersion(String marketVersion) {
		this.marketVersion = marketVersion;
	}

}