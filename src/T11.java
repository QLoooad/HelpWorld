
public class T11 { //재귀함수

	public static int factorial(int number) {
		if(number == 1) {
			return 1;
		}else {
			return number * factorial(number-1);
		} // 5*4*3*2*1 = 120 인데 재귀함수는 스택 개념 5>4>3>2>1 이 들어가면 1부터 계산
		  // 실제 계산 1*2*3*4*5
		  // 1부터 계산해도 저 팩토리얼 안의 또 다른 팩토리얼이 생기니 넘버에 1이 들어갈수없음 (인셉션같은 개념, 꿈속의 꿈)
	}	  // 이라고 일단 난 이해함
	
	public static void main(String[] args) {

		System.out.println("10 팩토리얼은 " + factorial(10));
		
	}

}
