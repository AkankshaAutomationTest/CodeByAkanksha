package packagedemo;

public class AssignmentNo1 {
	int age;
	int r;

	public void method() {
		System.out.println("New Batch");
	}

	public void method2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.method();
		s.method2();
		s.age=12;
		s.r=1;
		System.out.println("Age of student is " + s.age);
		System.out.println("Roll No of student is " + s.r);
	}
	}



