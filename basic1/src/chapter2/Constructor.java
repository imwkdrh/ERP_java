package chapter2;

//	생성자 : 클래스의 인스턴스가 생성되는 순간에 호출되는 메서드
//	클래스와 같은 이름을 가지고 있음, 반환타입이 존재하지 않음
//	클래스명(매개변수, ...) {인스턴스가 생성될 때 수행할 작업}

class Human1{
	String name;
	int age;
	String gender;
	
	Human1(){
		//	1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
		System.out.println("Human1의 인스턴스가 생성되었습니다.");
		
		//	2. 인스턴스를 생성과 동시에 인스턴스 변수를 초기화하고 싶을 때
//		name = "홍길동";
//		age = 20;
//		gender="남";
	}
	Human1(String name1, int age1, String gender1){
		name=name1;
		age=age1;
		gender=gender1;
	}
	
	void great() {
		System.out.println(name.concat( "이 인사를 합니다."));
	}
	
	
	
}
class Human2{
	String name;
	int age;
	String gender;
}
public class Constructor {
	public static void main(String[] args) {
		
		Human1 human1 = new Human1(); 
		human1.great();
		Human1 human2 = new Human1();
		System.out.println(human2.name);
		Human1 human3 = new Human1("이영희",17, "여");
		System.out.println(human3.name);
	}
}
