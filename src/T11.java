
public class T11 { //����Լ�

	public static int factorial(int number) {
		if(number == 1) {
			return 1;
		}else {
			return number * factorial(number-1);
		} // 5*4*3*2*1 = 120 �ε� ����Լ��� ���� ���� 5>4>3>2>1 �� ���� 1���� ���
		  // ���� ��� 1*2*3*4*5
		  // 1���� ����ص� �� ���丮�� ���� �� �ٸ� ���丮���� ����� �ѹ��� 1�� �������� (�μ��ǰ��� ����, �޼��� ��)
	}	  // �̶�� �ϴ� �� ������
	
	public static void main(String[] args) {

		System.out.println("10 ���丮���� " + factorial(10));
		
	}

}
