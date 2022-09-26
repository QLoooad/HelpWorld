
public class T10 {
	
	/*public static int funtion1(int number, int k) {
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) { //넘버를 i로 나누어 나머지가 0이되는것을 찾음
				k--; 			  //k 번째만큼 계속함
				if(k == 0) {	  //k 만큼 반복하다 k가 0이 되면 그 값을 리턴함
					return i;
				}
			}
		}return -1; //k가 0이 되기전에 함수가 끝나면 -1리턴  그 리턴값이 아래 if
	} 
	
	public static char funtion2(String input) {
		return input.charAt(input.length() -1); //charAt는 0부터 length는 1부터
		/*charAt는 String으로 저장된 문자열 중에서 한 글자만 선택해서 
		  char타입으로 변환해주는 녀석

	} */
		
	public static int max(int a, int b) {
		return (a > b) ? a : b; //삼항연산자
	}
	
	public static int funtion3(int a, int b, int c) {
		int result = max(a,b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {

		/*int result = funtion1(1000, 100);
		if(result == -1) {
			System.out.println("1000의 10번째 약수는 없습니다.");
		}else {
			System.out.println("1000의 10번째 약수는 " + result + "입니다.");
		}
		
	} 
		
		System.out.println("Hello World의 마지막 단어는 " + funtion2("Hello World"));
	} */
		
		System.out.println("123, 456, 789중 가장 큰 값은 " + funtion3(123, 456, 789));
		
		}
	}
