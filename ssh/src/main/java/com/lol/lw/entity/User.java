package com.lol.lw.entity;

import java.util.Set;

/*@Entity
@Table(name = "Fuser")*/
public class User {
	private int id;
	private String userName;
	private Set<UserOrder> set;
/*	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	@Column(name="userName")*/
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public Set<UserOrder> getSet() {
      return set;
    }
  
    public void setSet(Set<UserOrder> set) {
      this.set = set;
    }
  
    @Override
    public String toString() {
      return "User [id=" + id + ", userName=" + userName + "]";
    }

}
