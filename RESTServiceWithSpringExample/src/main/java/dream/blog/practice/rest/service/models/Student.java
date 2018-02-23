package dream.blog.practice.rest.service.models;

public class Student {

	private int age;
	private String name;
	private double weight;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Student(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
}
