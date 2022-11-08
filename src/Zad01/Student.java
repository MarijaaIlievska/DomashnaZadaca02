package Zad01;

public class Student {
	
	//Декларирање на атрибути
	public String firstName;
	public String lastName;
	public int index;
	//Default конструктор
	public Student (){
	}
	//Конструктор кој на влез прима три аргументи
	public Student (String firstName, String lastName, int index){
	this.firstName = firstName;
	this.lastName = lastName;
	this.index = index;
	}
}
