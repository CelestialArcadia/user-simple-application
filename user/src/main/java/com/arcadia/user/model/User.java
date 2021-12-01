package com.arcadia.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@Column
	private long id;

	@Column
	@NotNull(message = "{Notull.User.firstName}")
	private String firstName;

	@Column
	@NotNull(message = "{NotNull.User.lastName}")
	private String lastName;

	@Column
	@NotNull(message = "{NotNull.User.email}")
	private String email;
}
