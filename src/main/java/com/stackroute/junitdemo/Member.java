package com.stackroute.junitdemo;

public class Member {
    private int age;
    private double salary;
    private String name;
    public Member()
    {
        name = "Harry Potter";
        salary = 2500.3;
        age = 30;

    }
    public String getName(){ return name;}
    public int getAge(){ return age;}
    public double getSalary() { return salary;}
}
 class MemberVariable {
     Member mm = new Member();

     public String display() {
         String s = "";
         s = s + ("Name:" + mm.getName());
         s = s + ("Age:" + mm.getAge());
         s = s + ("Salary:" + mm.getSalary());
         return s;     }
 }