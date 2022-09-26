import java.util.Scanner;

public class T16_Main {

	public static void main(String[] args) {

		T16_Student student1 = new T16_Student("홍길동", 20, 175, 75, "20170101", 1, 4.5);
		T16_Student student2 = new T16_Student("김삼순", 20, 165, 55, "20170105", 1, 4.3);
		student1.show();
		student2.show();
		System.out.println("******\n******\n******\n******\n******\n******\n******");
		T16_Student[] studentsArray = new T16_Student[100];
		for(int i = 0; i < 3; i++) {
			studentsArray[i] = new T16_Student("김동명", 20, 175, 75, i + "", 1, 4.5);
			studentsArray[i].show();
		}
		T17_Teacher teacher1 = new T17_Teacher("John kim", 40, 188, 95, "20100055", 280, 3);
		teacher1.show();
		
		System.out.println("-----------------------스캐너-----------------------\n-----------------------스캐너-----------------------\n-----------------------스캐너-----------------------\n-----------------------스캐너-----------------------\n");
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 몇명의 학생이 존재합니까?");
		int number = scanner.nextInt();
		T16_Student[] students = new T16_Student[number];
		for(int j = 0; j < number; j++) {
			String name;
			int age;
			int height;
			int weight;
			String studentId;
			int grade;
			double gAP;
			System.out.println("학생의 이름을 입력하세요 : ");
			name = scanner.next();
			System.out.println("학생의 나이를 입력하세요 : ");
			age = scanner.nextInt();
			System.out.println("학생의 키를 입력하세요 : ");
			height = scanner.nextInt();
			System.out.println("학생의 몸무게를 입력하세요 : ");
			weight = scanner.nextInt();
			System.out.println("학생의 학번을 입력하세요 : ");
			studentId = scanner.next();
			System.out.println("학생의 학년을 입력하세요 : ");
			grade = scanner.nextInt();
			System.out.println("학생의 학점을 입력하세요 : ");
			gAP = scanner.nextDouble();
			students[j] = new T16_Student(name, age, height, weight, studentId, grade, gAP);
		}
		for(int j = 0; j < number; j++) {
			students[j].show();
		}
	}
	
	

}
