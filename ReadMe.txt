Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

	sudo rm -rf /root/.m2/repository/com/github

    mvn install
    for JBoss Fuse in /opt/...
    sudo mvn clean install -DskipTests=true
    
To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    features:addurl mvn:com.github/fuse-swagger/1.0.0/xml/features
	features:install fuse-swagger

    osgi:update 1
    start 1
    
    localhost:8181/cxf
    
    http://localhost:8181/api
    
    http://localhost:8181/cxf/rest/api-docs
    
    http://localhost:8181/cxf/rest/version
    
    http://petstore.swagger.io/
    
    http://localhost:8181/cxf/swagger?_wadl