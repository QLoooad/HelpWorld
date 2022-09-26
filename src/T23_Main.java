
public class T23_Main {

	public static void main(String[] args) {

		T23_Hero[] heros = new T23_Hero[3];
		
		heros[0] = new T23_Warrior("전사");
		heros[1] = new T23_Archer("궁수");
		heros[2] = new T23_Wizard("마법사");
		
		for(int i = 0; i < heros.length; i++) {
			heros[i].attack();
			if(heros[i] instanceof T23_Warrior) {
				T23_Warrior temp = (T23_Warrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof T23_Archer) {
				T23_Archer temp = (T23_Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof T23_Wizard) {
				T23_Wizard temp = (T23_Wizard) heros[i];
				temp.fireBall();
			}
		}

	}
}
