import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		//다형성 부모 클래스의 변수를 자식 클래스로 가능
		
		System.out.println("복숭아 : 1, 바나나 : 2");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		T21_Fruit  fruit; //<<<<<<<<<< 이거뭐임
		if(input == 1) {
			fruit = new T21_Peach();
			fruit.show();
		}else if(input == 2){
			fruit = new T21_Banana();
			fruit.show();
		}
		
	}

}
