package com.exmp2.AbstractFactoryPattern;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}