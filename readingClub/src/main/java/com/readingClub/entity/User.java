package com.readingClub.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class User extends BaseEntity {
	
	private Integer parentId;
    private String realName;
    private String mobilePhone;
    private String wechatNum;
    private String wechatName;
    private String clubNum;
    private Date clubStartTime;
    private Date clubEndTime;
    private Date renewalNum;
    private Integer inviteNum;
    private BigDecimal inviteAllMoney;
    private BigDecimal inviteEtlMoney;
}
