package com.github;

import com.wordnik.swagger.jaxrs.ConfigReader;

public class RestEasyConfigReader extends ConfigReader {

  private ServletConfig config;

  public RestEasyConfigReader(ServletConfig config){
    this.config =  config;
  }

  @Override
  public String basePath() {
    return getParameterOrDefault("swagger.api.basepath", "http://localhost:8080/js");
  }

  @Override
  public String swaggerVersion() {
    return "1.2";
  }

  @Override
  public String apiVersion() {
    return "1.0";
  }

  @Override
  public String modelPackages() {
    return "com.js.model";
  }

  @Override
  public String apiFilterClassName() {
    return null;
  }

  private String getParameterOrDefault(String key, String defaultValue){
    if ((config != null) && (config.getInitParameter(key) !=null ))
      return config.getInitParameter(key);

    return defaultValue;
  }
}