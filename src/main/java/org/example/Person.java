package org.example;

public class Person {
  String firstName;
  String lastName;
  int age;
 double weight;
 double height;
 String eyeColor;

 //constructor overloading
 public Person (String firstName, String lastName, int age){
   this(70,186,"blue"); //constructor chaining
   this.firstName=firstName;
   this.lastName=lastName;
   this.age=age;
 }

 public Person (double weight, double height, String eyeColor){
   this.weight=weight;
   this.height=height;
   this.eyeColor=eyeColor;
 }

 public String getFirstName (){
   return this.firstName;
 }
  public String getLastName (){
    return this.lastName;
  }
  public int getAge (){
    return this.age;
  }
  public Boolean isTeen () {
    if (this.age >= 13 && this.age <= 19) {
      return true;
    }
    else{
      return false;
    }




  }


}
