package com.example.demo.entities;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	@Id
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Role() {
		super();

	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}
	

}
