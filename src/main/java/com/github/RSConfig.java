package com.github;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/rest")
public class RSConfig extends Application {

	    public RSConfig() {
	        BeanConfig beanConfig = new BeanConfig();
//	        beanConfig.setBasePath("http://localhost:8002/api");
	        beanConfig.setResourcePackage("com.github");
	        beanConfig.setBasePath("/api");
	        beanConfig.setContact("support@example.com");
	        beanConfig.setDescription("REST API");
	        beanConfig.setLicenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html");
	        beanConfig.setResourcePackage("com.example");
	        beanConfig.setTermsOfServiceUrl("https://www.example.com/resources/eula");
	        beanConfig.setTitle("REST API");
	        beanConfig.setVersion("1.0.0");
	        beanConfig.setScan(true);
	    }

}