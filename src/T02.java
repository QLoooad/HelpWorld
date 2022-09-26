
public class T02 {
	
	//final static double PI = 3.141592;
	//final : 선언이후 변경 불가 (상수)
	//final static int INT_MAX = 2147483647;
	//int 의 최대값  최소 -2147483648
	public static void main(String[] args) {
		
		int a = 1;
		double a1 = 1;
		int b = 2;
		double b1 = 2;
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a1 / b1 = " + (a1/b1));
		
		//반올림 (인트 형변환 후 프린트 실행 시 소숫점은 사라짐)
		//소숫점 사라짐으로 반올림 구현 가능
		double B = 0.6;
		int A = (int) (b + 0.5);
		System.out.println(a);
		
	}

}
