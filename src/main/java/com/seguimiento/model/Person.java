package com.seguimiento.model;
public class Person {

  private int id;
  private String name;
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

private int age;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public Person(){

  }

  public Person(int id,String name, int age) {
    super();
    this.id=id;
    this.name = name;
    this.age = age;
  }
//getter and setter methods
}