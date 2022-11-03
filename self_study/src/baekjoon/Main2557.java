package baekjoon;

class Print {
	public String sentence;
	//constructor
	public Print() {}//기본 생성자
	
	public void setPrint(String sentence) {
		this.sentence = sentence;
		System.out.println(this.sentence);
	}
}

public class Main2557 {
	
	public static void main(String[] args) {
	Print p = new Print();
	p.setPrint("Hello World!");
	}
}
