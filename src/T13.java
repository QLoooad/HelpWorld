import java.util.Scanner;

public class T13 {
	
	public static int max(int a, int b) {
		return (a> b) ? a : b;
	}

	public static void main(String[] args) {

		/*Scanner scanner = new Scanner(System.in); //import 단축키 Ctrl+Shift+O
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i <number; i++) {
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수) : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++) {
			result = max(result, array[i]);
		} System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : "+ result + " 입니다."); */
		int N = 1100;
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * 100 + 1); //랜덤은 0.*** 으로 나옴
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += array[i];
		}
		System.out.println( N + "개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
		System.out.println(sum);
		}
	}
