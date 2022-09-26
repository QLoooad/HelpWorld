
public class T16_Student extends T16_Person{
	
	//extends << Person을 Student가 상속한다
	private String StudentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public T16_Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight); //부모클래스의 생성자를 실행한다는뜻
		StudentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	public void show(){
		System.out.println("-----------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
	
	}
}
