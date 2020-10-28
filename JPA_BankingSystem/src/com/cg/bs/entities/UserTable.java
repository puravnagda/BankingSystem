package com.cg.bs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class UserTable 
{
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="seq_user_id", allocationSize=1)
	private int user_id;
	private String login_password, secret_question, Transaction_password, lock_status, Pancard;
	@Override
	public String toString() {
		return "UserTable [user_id=" + user_id + ", login_password="
				+ login_password + ", secret_question=" + secret_question
				+ ", Transaction_password=" + Transaction_password
				+ ", lock_status=" + lock_status + ", Pancard=" + Pancard + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	public String getSecret_question() {
		return secret_question;
	}
	public void setSecret_question(String secret_question) {
		this.secret_question = secret_question;
	}
	public String getTransaction_password() {
		return Transaction_password;
	}
	public void setTransaction_password(String transaction_password) {
		Transaction_password = transaction_password;
	}
	public String getLock_status() {
		return lock_status;
	}
	public void setLock_status(String lock_status) {
		this.lock_status = lock_status;
	}
	public String getPancard() {
		return Pancard;
	}
	public void setPancard(String pancard) {
		Pancard = pancard;
	}
}
