package org.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
