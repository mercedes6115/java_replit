package day05;

import java.util.Arrays;

public class Day05 {
	public static void main(String[] args) {
		//String - 문자열 자료형, 자바에서 가장 많이 사용되는 자료형
		/*
		String b = "swift";
		String c = new String("swift"); // 정석 방법이나 자바에서 편의성을 위해 위와같이 선언해도 상관없음
		
		
		String str1 = "하이";
		System.out.println(str1);
		*/
		/*
		 String의 특징 
		 1. 한번 정의된 문자열은 변경할 수 없다
		  만약 문자열의 내용을 변경하면  기존 문자열을 수정하는 것이 아니라 
		  새로운 문자열을 생성하여 사용하게 되는 것이다. 기존 객체는 버린다.
		 
		 2. 문자열을 입력해서  객체를 생성할때 같은 문자열 끼리 객체를 공유한다.
		  이유는 메모리의 효율성 때문이다. 
		 */
		/*
		String str1="안녕";
		String str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = "안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		
		/*
		str1                 100번지
		 | -----------------> "안녕"
		str2
		  
		  				    200번지
		str1 ------------>"안녕하세요"
		
		                    100번지
		str2 --------------> "안녕"  포인터가 새로 만들어진다고 이해
		*/
		/*
		String str1 = new String("안녕"); // new 사용
		String str2 = "안녕"; // new 미사용
		String str3 = "안녕";
		String str4 = new String("안녕");
		*/
		/*
		                          100번지
		 str1 ------------------> "안녕"
		                  200번지
		 str2 -----------> "안녕"
		 str3------------> "안녕"
		                                     400번지
		 str4 ------------------------------->"안녕"
		  
		 new 키워드를 사용하면 새로운 주소에 만든다 라고 이해 
		 이휴에 new를 미사용해서 선언한 "안녕"이란 문자열들은 죄다 200번지로 공유한다 라고 이해
		 */
		/*
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		// 여기서 비교 연산자는 단순  글자 비교가 아닌 주소값, 메모리값을 비교한다고 생각 

		System.out.println(System.identityHashCode(str1)); // 실제 주소값을 확인하는 출력문
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		// 문자열은 비교할때 == 연산자로 단순비교하면 안된다 
		// 문자열은 비교할때 equals 메서드를 이용한다 
		*/
		
		/* 문자열 연산
		 
		*/
		/*
		String str1 = "안녕"+"하세요"+"!"; // 메모리 관점으로 비효울적 안녕, 하세요, ! 3개  안녕+하세요,  4개 안녕하세요 ,+ ,! 5개의 객체생성
		System.out.println(str1); // String 은 수정이 안되기 때문에 생기는 비효울성
		
		// 개발시 실제 사용하는 방식 
		String str2 = "반갑"; 
		str2 += "습니다";
		str2 += "!";
		System.out.println(str2);
		*/
		// 문자열 관련 메서드 정리 
		
		// length() 문자열 길이
		/*
		String str1= "Hello Java"; // 띄어쓰기(space)도 카운트한다
		String str2= "아무도모르게 다가온 이별에 대면했을때"; // 한글 영어 다 한글자씩 카운트 한다 
		System.out.println(str1.length());
		System.out.println(str2.length());
		// charAt() 문자열 검색
		System.out.println(str1.charAt(1)); // 1번 인덱스위치에 있는 문자를 검색해서 출력 
		System.out.println(str2.charAt(2));
		
		// indexOf() 글자가 위치한 인덱스를 반환
		System.out.println(str1.indexOf('o'));
		System.out.println(str2.indexOf('대'));
		// lastIndexOf() 뒤에서 부터 검색해서 나찾는 인덱스 반환 
		System.out.println(str1.lastIndexOf('v')); // 뒤에서부터 첫번째로 등장하는 'v'가 위치한 인덱스 반환 
		*/
		/*
		// valueOf() 기본 자료형 -> 문자열로 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		// concat() 문자열을 연결 
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// toLowerCase(), toUpperCase() 대소문자 변환  
		String str6 = "Java Study";
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		// replace() 문자열 변경 
		System.out.println(str6.replace("Study","공부"));
		
		// substring() 문자열에서 slicing
		System.out.println(str6.substring(0,5));  //0번째 인덱스 부터 5번째 미만 인덱스까지 슬라이싱
		
		// trim() 여백 제거 
		System.out.println("            sd             ".trim());
		
		// equals() 문자열 내용비교 메모리값 상관없이 문자 내용 자체만 비교하는 함수 
		System.out.println(str6.equals(str6));
		System.out.println(str6.equals(str4));
		
		// equalsIgnoreCase() 대소문자 상관없이 같은지를  확인 -> abc ABC 같음
		
		*/
		//1.
		/*
		int[] a = new int[] {1,2,3,4,5};
		for(int each : a ) {
			System.out.println(each);
		}
		*/
		/*
		int[][] b = new int[][] {{1,3,5},{7,9}};
		for(int i =0; i < b.length ;i++) {
			for(int j = 0 ; j < b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		*/
		/*
		
		String str = "내 이름은 배본영 입니다. 나이는 27살 입니다.";
		String name = str.substring(str.indexOf("배"),str.lastIndexOf("영")+1);
		int age = Integer.parseInt(str.substring(19,21)); // 문자열을 integer로 변환 
		//String age1 = Integer.toString(age); // integer을 문자열로 변환
		System.out.println(name);
		System.out.println(age);
		*/
		
		/*
		 // 클래스와 객체 
		 // 클래스와 객체의 개념을 익히는것은 세부 문법을 익히는 것만큼 매우 중요하다 
		 // 객체는 object 사용할 수 있는 실체를 의미하고 클래스는 그 객체를 만드는 설계도라고 볼 수 있다
		 // 따라서 한개의 클래스로 여러개의 객체를 만들 수 있다.
		 // 변수 -> 배열-> 구조체 -> 클래스 (포함관계)
		 // 변수: 다양한 형태의 데이터를 저장하기 위해 각각의 데이터를 저장하는 변수 
		 // 배열: 변수들이 많아지면 관리가 힘들다 따라서 배열을 사용하면 같은 자료형의 변수들을 묶어서 한개의 자료형으로 관리할 수 있다
		 // 구조체 : 배열은 같은 자료형을 묶어서 관리한다 여러가지의 자료형을 묶어서 관리할 수 는 없다  배열의 
		 // 단점을 보완하기 위해 사용되는 자료형 
		 // 클래스: 구조체는 데이터만 관리할 수 있다. 여기에 기능들(메서드)까지 추가한 것이 클래스이다.
		  
		  
		 // 절차지향과 객체지향 
		 // 객체지향 개념 전에는 대부분의 프로그램을 절차지향으로 구현했다.
		 // 절자지향은 순서대로 단계적으로 실행되도록 명령어를 나열하는 방식 
		 // class의 등장 후에는 객체지형 프로그래밍 방식이 주로 사용된다. 
		 
		 // 자바에서의 객제 지향 요소
		 // 자바는 프로그램을 객체단위로 구성해서 상호 연동시킨다
		 // 자바에서의 객체지향 문법요소는 크게 class, interface가 있다.
		 // class는 일반 class, 추상 class로 나눌수 있다.
		   
		 // 크게 보면 2개(class, interface) 작게보면 3개(일반 class, 추상 class, interface) 
		 // 의 객체지향 문법 요소를 사용한다.
		   
		 // class명과  file명은 반드시 일치해야 한다
		 // class밖에 올수 있는 것은 package, import, 또다른 class선언
		 // 접근지정자 public 은 한개의 .java 파일 안에서 최대 1개의 class에만 붙일 수 있다.
		 
		 // 객체와 인스턴스의 차이 
		 // 객체 라는 표현, 인스턴스 라는 표현은 같은 대상을 가리킨다 
		 // 클래스로 객체를 만드는데 객체와 클래스의 관계를 표현할때 인스턴스 라고한다
		 // 단독으로 그 자체만을 표현할 때는 객체라고 한다
		 
		 
		 A a = new A();
		 클래스명  객체명 = new 클래스명(); 
		   
		  
		*/
		
	}

}
