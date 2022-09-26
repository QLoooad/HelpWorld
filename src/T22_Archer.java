
public class T22_Archer {

	String name;
	String power;
	public T22_Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	public boolean equals(Object obj) {
		T22_Archer temp = (T22_Archer) obj;
		if(name == temp.name && power == temp.power) {
			return true;
		}else {
			return false;
		}
	}
	
}
