package Day03;

public class Student {
	
	private String name; // 이름
	private int english; // 영어
	private int math; // 수학 
	
	public Student() {
	}
	
	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	

}
