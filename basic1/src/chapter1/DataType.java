package chapter1;

public class DataType {
	public static void main(String[] args) {
		
		//	기본형 데이터 타입
		
		//	정수형 데이터 타입 : 실수부가 존재하지 않는 정수를 나타냄 (부호를 가지고 있음)
		
		//	byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		//	-128 ~ +127
		byte byte1 = -128;
		//	byte1 = 128;
		
		
		//	short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ +32767
		short short1 = 128;
		short1 = 32767;
		//	short1 = 32768;
		
		
		//	int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		//	-2147483648 ~ +2147483647
		int int1 = 32768;
		int1 = 2_147_483_647;
		//	정수형 리터럴 상수는 int 타입임
		//	int1 = 2_147_483_648L;

		
		
		//	long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		//	-9223372036854775808 ~ +9223372036854775807
		long long1 = 3_000_000_000L;
		
		//	가장 많이 사용되는 정수형 타입 : int
		//	메모리 공간을 절약할 때 사용되는 정수형 타입 : byte, short
		//	큰 수를 다룰 때 사용되는 정수형 타입 : long
		
		//	정수형 int에 연산 결과를 저장하는 데이터 타입으로 사용할 때는
		//	연산 결과가 범위를 초과할 수 있는지 주의할 필요가 있다
		int a = 200000, b = 300000;
		int result = a + b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		
		
		
		//	실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		
		//	float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		//	소수점 6~7번째 자리에서 오차가 발생
		//	실수형 리터럴 상수는 double 타입임
		float float1 = 3.14159265358979323846f;
		System.out.println(float1);
		
		//	double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		//	소수점 15-17째 자리에서 오차가 발생
		double double1 = 3.14159265358979323846;
		System.out.println(double1);
		
		
		
		//	문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		//	
		//	char : 2byte (16bit)의 크기를 가지는 문자형 데이터 타입
		//	0 ~ 65535 범위
		//	문자를 리터럴로 표현할 땐 ''로 묶어서 표현함
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		//	논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		
		//	boolean : 1byte (8bit)의 크기를 가지는 논리형 데이터 타입
		//	true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		
		//	형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		//	자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		//	강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생
		
		int number = 300;
		long long2 = number;
		number = (int)long2;
		
		char char3 = 100;
		short short2 = (short)char3;
		int int2 = char3;
		
		
		
		//	배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		//	new 연산자를 이용해서 생성 해야함
		// 한선 생성된 배열의 크기는 변경할 수 없음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
