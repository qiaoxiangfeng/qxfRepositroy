package com.readingClub.entity;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract  class BaseEntity {
	@Id
	@GeneratedValue
	private Integer id;
	@CreatedDate
	private Date CreateTime;
	@LastModifiedDate
	private Date UpdateTime;
}
