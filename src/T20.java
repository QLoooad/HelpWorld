
public class T20 implements T20_Cat, T20_Dog{

	public static void main(String[] args) {
		//인터페이스 사용 시 다중 상속 가능
		//인터페이스는 코딩 불가능 메소드 설계까지만 가능
		//abstract는 코딩가능
		//같은 이름의 메소드가 있다면 하나만 호출해도 오류 x
		T20 main = new T20();
		main.crying();
		main.show1();
		main.show2();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("멍멍이는 야옹하고 울지요");
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("Good Bye world");
	}

}
