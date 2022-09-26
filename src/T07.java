//스캐너

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T07 {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + " 입니다.");
		sc.close(); */
		
		File file =new File("input.txt"); // 빨간줄 생길때 예외처리로 맨 아래e.~~없애고 syso 넣으면 경고문 생성
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) { //hasNextInt << sc에 int 가 있다면 실행해라
				System.out.println(sc.nextInt()*100);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");  // <<맨아래 이거
		}
		
		
	}

}
