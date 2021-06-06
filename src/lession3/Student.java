package lession3;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int age;

	// contructor
	public Student() {
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// method
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập id : ");
		setId(input.nextInt());
		input.nextLine();
		System.out.println("Nhập name : ");
		setName(input.nextLine());
		System.out.println("Nhập age : ");
		setAge(input.nextInt());
	}

	public void outputInfo() {
		System.out.println("ID : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
	}
	// setter and getter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
