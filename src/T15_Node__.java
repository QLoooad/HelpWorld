
public class T15_Node__ {

	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public T15_Node__(int x, int y) { //초기화 = 해당 값으로 설정한다(0으로 바꾸는거 아님)
		this.x = x;
		this.y = y;
	}
	public T15_Node__ getCenter(T15_Node__ Aother) { //Aother int a << a와 같은거
		return new T15_Node__((this.x + Aother.getX()) / 2,(this.y + Aother.getY()) / 2);
	}
}
