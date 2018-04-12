package com.exmp2.AbstractFactoryPattern;
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}