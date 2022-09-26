
public class T16_Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	//아래 코드 한번에 만들기(위 코드 적고 빈칸에 우클릭>Source> Generate Getters and Setters>Select All)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//생성자 (하나의 인스턴스를 만들때 자동으로 그 인스턴스가 가지고있는 각 변수를 한번에 초기화해주는 함수)
	//빈칸 우클릭>Source>Generate Constructor using Fields
	public T16_Person(String name, int age, int height, int weight) {
		super(); //부모클래스의 생성자를 실행한다는뜻
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	}

	