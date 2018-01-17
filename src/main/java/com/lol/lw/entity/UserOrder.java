package com.lol.lw.entity;

public class UserOrder {
  private int id ;
  private int quantity;
  private String pro_name;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public String getPro_name() {
    return pro_name;
  }
  public void setPro_name(String pro_name) {
    this.pro_name = pro_name;
  }
  @Override
  public String toString() {
    return "UserOrder [id=" + id + ", quantity=" + quantity + ", pro_name=" + pro_name + "]";
  }

  
  
}
