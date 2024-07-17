package chapter3;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class package3 {
	public static void main(String[] args) {
		
		//	Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		//	범위 제약
		System.out.println(random.nextInt(3)); // 0 ~ 2 난수
		System.out.println(random.nextInt(3)+1); // 1 ~ 3 난수
		
		//	SEED 지정
		random = new Random(1);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		
		//	UUID 클래스 : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		
		//	Date 클래스 : 날짜를 다루는 클래스
		//	Date 클래스의 대부분의 메서드는 Java 1.1 부터 사용하지 않도록 권장
		Date dateNow = new Date();
		System.out.println(dateNow);
		System.out.println(dateNow.getDate());
		
		//	LocalDateTime 클래스 : Java 8부터 Date를 대체하기 위해 사용되는 클래스
		//	LocalDate 클래스, LocalTime 클래스, LocalDateTime 클래스
		
		//	현재 날짜 및 시간의 인스턴스 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//	특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 7, 9, 9, 0, 0); //(년, 월 ,일, 시, 분, 초)
		System.out.println(date1);
		
		//	특정 날짜 및 시간의 요소 불러오기
		//	getXXX();
		int year = now.getYear();
		System.out.println(year);
		int month = now.getMonthValue();
		System.out.println(month);
		int day = now.getDayOfMonth();
		System.out.println(day);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
