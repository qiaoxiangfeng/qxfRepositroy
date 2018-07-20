package com.readingClub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Role {
    @Id
    @GeneratedValue
	private int id;
	private String name;
}
