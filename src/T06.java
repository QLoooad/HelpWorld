
public class T06 {
	
	final static int N = 15;

	public static void main(String[] args) {

		//모든 조건문 반복문에는 () 적용
		int x = 50, sum = 0, y = 550;
		int i_backUp = x;
		
		while(x <=y){
			sum +=x++;
		}System.out.println( i_backUp + "부터 " + y + "까지의 합은"  + sum + "입니다.");
		
		// for문: 초기화 부분, 조건 부분, 연산 부분
		for(int i = N; i > 0; i--){
			for(int j = i; j > 0; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		//print >> 줄바꿈x, println >> 줄바꿈o
		
		// x^2 + y^2 = r^2  
		// i = x, j = y 
		for(int i = -N; i <= N; i++) {
			for(int j =-N; j <= N; j++) {
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//반복문 무한루프에 브레이크 걸기
		
		int count = 0;
		
		for(;;) {
			System.out.println("HI");
			count++;
			if(count >= 10){
				break;
			}
		}
		
		
		
		
	}

}
