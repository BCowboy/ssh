package com.lol.lw.entity;

public class Detail {
 
  private int id;
  private int age;
  private String address;
  private User user;
  
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Detail [id=" + id + ", age=" + age + ", address=" + address + ", user=" + user + "]";
  }
  
}
