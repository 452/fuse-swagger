package com.github;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/rest")
public class RSConfig extends Application {

	private final Log logger = LogFactory.getLog(getClass());

	public RSConfig() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		logger.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
		BeanConfig beanConfig = new BeanConfig();
		// beanConfig.setBasePath("http://localhost:8002/api");
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

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet();

		resources.add(VersionServiceCxfrsImpl.class);
		resources.add(Sample.class);

		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);

		return resources;
	}

}