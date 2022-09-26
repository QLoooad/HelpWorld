
public class T18_Main  extends T18_Player{
		//추상(abstract)은 "무조껀" 상속해서 사용 
		//추상메소드도 "전부" 사용되어야함
		//꼭 만들어야할걸 알려주는것?
	public static void main(String[] args) {
		//스태틱으로 선언된 메소드 안에서는 같은 스태틱으로 선언해야함
		//play("Joakim Karud - Mighy Love"); <<이렇게하면 오류
		
		T18_Main main = new T18_Main();
		main.play("Joakim Karud - Mighy Love");
		main.pause();
		main.stop();
		
		T18_Dog dog = new T18_Dog();
		T18_Cat cat = new T18_Cat();
		dog.crying();
		cat.crying();
	}

	@Override
	void play(String songName) {
		System.out.println(songName + " 곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println(" 곡을 일시정지합니다.");
	}

	@Override
	void stop() {
		System.out.println(" 곡을 정지합니다.");
	}


}
