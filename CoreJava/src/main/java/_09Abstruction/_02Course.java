package _09Abstruction;

class Course{
	public int courseId;
	public String courseName;
	public String duration;
	
	public Course(int courseId, String courseName, String duration) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
}

class Student{
	public int StudentId;
	public String StudentName;
	public Course course;
	
	public Student(int StudentId, String StudentName, Course course) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.course = course;
	}
}
public class _02Course {
	public static void main(String[] args) {
		Course cs = new Course(1, "Java", "SixMonthes");
		
		
		System.out.println("*************************************");
		Student std = new Student(1, "Eshwar", cs);
		System.out.println("Student id is:"+std.StudentId);
		System.out.println("Student Name is:"+std.StudentName);
		System.out.println("Course Name is:"+std.course.courseName);
		System.out.println("Course Duration is:"+std.course.duration);
	}

}
