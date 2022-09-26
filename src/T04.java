
public class T04 {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60; //나머지
		
		System.out.println(minute + "분 " + second + "초");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int a = 50;
		int b = 50;
		
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println("a와 b가 같으면서 a가 30보다 큰가?\n" + ((a == b) && (a > 30)));
		System.out.println("a가 50이 아닌가?" + !(a == 50));
		// ! not 연산자
		// && and 연산자
		
		int i =20;
		i++;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i +=1;
		System.out.println(i);
		// 셋다 같은 +1
		
		
		int x = 50;
		int y = 60;
		System.out.println("최대값은 " + max(x,y) + "입니다.");
		
		//pow 거듭제곱
		double A = Math.pow(2.0, 20.0);
		System.out.println("3^20 = " + (int)A);
		System.out.println("3^20 = " + A);
		
		
	    }	
		static int max(int a, int b) {
			int result = (a > b) ? a:b ;
			//삼항 연산자  a가 b보다 클때 참이면 a 거짓이면 b 반환
			return result;
		}
		
	

}
