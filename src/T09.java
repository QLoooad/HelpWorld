
public class T09 {
	
	// (int)반환형, (funtion)함수명, (바로 아래 3개)매개변수
	public static int funtion(int a, int b, int c) {
		int min;
		if(a > b) { //작은수 찾기
			if(b > c) {
				min = c;
			}else {
				min = b;
			}
		}else {
			if(a > c) {
				min = c;
			}else {
				min = a;
			}
		}
		for(int i = min; i > 0; i--) { //최대공약수 찾기
			if(a % i == 0 &&b % i == 0 && c % i == 0) {
				return i; //i 를 펑션에 리턴
			}
		}
		return -1; //for의 값이 없다면 -1을 리턴하여 최대공약수가 1만 존재함을 보여줌
	}

	public static void main(String[] args) {

		System.out.println(funtion(10,15,20));
		
	}

}
