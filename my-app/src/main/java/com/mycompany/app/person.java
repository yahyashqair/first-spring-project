package com.mycompany.app;

import org.springframework.beans.factory.InitializingBean;

public class person  {
	 private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public String toString() {
	return "My Name is : "+this.name;
}

}
