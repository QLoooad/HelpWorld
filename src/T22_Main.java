
public class T22_Main {

	public static void main(String[] args) {

		T22_Archer archer1 = new T22_Archer("궁수1", "상");
		T22_Archer archer2 = new T22_Archer("궁수2", "상");
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));
	}

}
