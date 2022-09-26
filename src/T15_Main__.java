
public class T15_Main__ { //제대로 이해못함 나중에 15강 다시

	public static void main(String[] args) {

		T15_Node__ one = new T15_Node__(10, 20);
		T15_Node__ two = new T15_Node__(30, 40);
		T15_Node__ result = one.getCenter(two);
		System.out.println("X : " + result.getX() + " \nY : " + result.getY());
		
	}

}
