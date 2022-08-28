package com.dummy.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer alienid;
	
	String alienname, alienemail, alienphone, alienlocation;

	public Integer getAlienid() {
		return alienid;
	}

	public void setAlienid(Integer alienid) {
		this.alienid = alienid;
	}

	public String getAlienname() {
		return alienname;
	}

	public void setAlienname(String alienname) {
		this.alienname = alienname;
	}

	public String getAlienemail() {
		return alienemail;
	}

	public void setAlienemail(String alienemail) {
		this.alienemail = alienemail;
	}

	public String getAlienphone() {
		return alienphone;
	}

	public void setAlienphone(String alienphone) {
		this.alienphone = alienphone;
	}

	public String getAlienlocation() {
		return alienlocation;
	}

	public void setAlienlocation(String alienlocation) {
		this.alienlocation = alienlocation;
	}

	@Override
	public String toString() {
		return "alienid=" + alienid + ", alienname=" + alienname + ", alienemail=" + alienemail
				+ ", alienphone=" + alienphone + ", alienlocation=" + alienlocation;
	}
}
