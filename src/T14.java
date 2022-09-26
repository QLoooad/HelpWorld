
public class T14 {

	public static void main(String[] args) {
		long sum = 0;
		int N = 9;
		int [][] array = new int[N][N];
			for(int i = 0; i< N; i++) {
				for(int j = 0; j < N; j++) {
					array[i][j] = (int)(Math.random() * 10);
					System.out.print(array[i][j] + " ");
						for(int k = 0; k < N; k++) {
						sum += array[i][j];
						}
				
				}
				System.out.println();
			}
			System.out.println(sum);
			double number1 = 0.1;
			double number2 = 1.1;
			double qwe = number1+number2;
			double a = 1.2;
			System.out.println(qwe);
			System.out.println(qwe==a);
		}
		
}  


