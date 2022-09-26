
public class T05 {

	public static void main(String[] args) {

		String a = "I Love You.";
		if(a.contains("Love")) { // contains: 스트링 a가 ? 를 포함하는가
			System.out.println("Me Too.");
		}
		else {
			System.out.println("I Hate You.");
		}
		
int score = 76;
		
		if(score >= 95) {
			System.out.println("A+");
		}else if(score >= 90) {
			System.out.println("A");
		}else if(score >= 85) {
			System.out.println("B+");
		}else if(score >= 80) {
			System.out.println("B");
		}else{
			System.out.println("C+");
		}
		
		String A = "Man";
		int b = 0;
		
		//String 비교 시 equals() 사용
		//String은 다른 자료형과는 다른 문자열 자료형이기 때문
		
		if(A.equals("Man")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 0) {
			System.out.println("b는 0입니다");
		}else {
			System.out.println("b는 0이 아닙니다");
		}
		
		
		if(A.equalsIgnoreCase("man") && b == 0) {
			//equalsIgnoreCase는 대소문자 구별 없이 비교함
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
	}
}
