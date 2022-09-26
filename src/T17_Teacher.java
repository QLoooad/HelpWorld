
public class T17_Teacher extends T16_Person{

	private String reacherID;
	private int monthSalary;
	private int workedYear;
	
	public String getReacherID() {
		return reacherID;
	}
	public void setReacherID(String reacherID) {
		this.reacherID = reacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	public T17_Teacher(String name, int age, int height, int weight, String reacherID, int monthSalary,
			int workedYear) {
		super(name, age, height, weight);
		this.reacherID = reacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show() {
		System.out.println("-----------------------------");
		System.out.println("교사 이름 : " + getName());
		System.out.println("교사 나이 : " + getAge());
		System.out.println("교사 키 : " + getHeight());
		System.out.println("교사 몸무게 : " + getWeight());
		System.out.println("교직원 번호 : " + getReacherID());
		System.out.println("교사 월급 : " + getMonthSalary());
		System.out.println("교사 연차 : " + getWorkedYear());
	}
}
