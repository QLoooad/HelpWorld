
public class T03 {

	public static void main(String[] args) {
		
		double a = 10.6;
		double b = 6.8;
		double c = 8.4;
		
		System.out.println((a+b+c)/3);
		
		for (char i = 'a'; i<='z'; i++) {
			System.out.print(i+" ");
		}
		
		int A = 500;
		System.out.println("\n10진수 : " + A);
		System.out.format("8진수 : %o\n", A);
		System.out.format("16진수 : %x\n", A);
		
		// 3에서(0~) 6번째(1~)까지 출력
		String name = "John Doe";
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(5,8));
		System.out.println(name.substring(0,4));
		
	}

}
