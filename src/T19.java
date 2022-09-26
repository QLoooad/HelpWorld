
public class T19 extends T19_Parent { //T19_Final_Parent{
	//파이널 : 어디서도 상속할수없고 밖에서 바꿀수 없다
	//클래스에 파이널을 달면 상속 불가능 (T19_Final_Parent)
/*	public void show() {
		System.out.println("Hello");
	}
	//부모와 같은 이름으로 메소드를 바꿀때
	//상속하고자 하는 클래스의 메소드가 파이널이라면 *오버라이딩* 불가능
/*		오버라이딩이란?
		조상클래스로부터 상속받은 메소드의 내용을 변경하는 것
		상속받은 메소드를 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야 하는 경우가 많다.
		==> 이럴 때 조상의 메소드를 오버라이딩이라고 한다.
*/
	public static void main(String[] args) {
//      final int number
		int number = 10;
		number = 5; //<<파이널이 있다면 안바뀜
		System.out.println(number);
		
		T19 main = new T19();
		main.show();
		
	}

}
