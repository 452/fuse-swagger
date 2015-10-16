package com.github;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "version")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(value = "A pet is a person's best friend" )
public class Container {

	@XmlElement
	@ApiModelProperty(value = "name", required=true)
	private String name;
	@XmlElement
	@ApiModelProperty(value = "value", required=true)
	private String value;

	public Container() {
	}

	public Container(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}