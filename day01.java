package day01;

public class Day01 { 
  
	public static void main(String[] args) {
    /*
    // char -> 문자 하나를 저장하는 자료형 ""를 사용
    char a ='A';
    char b = 65; //아스키 코드값을 문자로 인식
    char c = '\u0041'; // 유니코드값을 문자로 인식
    char value1 = 'A';
    char value2 = '가';
    char value3 = '3'; // 숫자가 아닌 문자 3 

    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
    System.out.println(b);
    */
    // 형변환 casting 
    // boolean을 제외한 자료형들은 서로 캐스팅이 가능하다 
    int a = (int)3.41; //결과 = 3 
    // 크기가 작은 자료형을 큰 자료형에 대입할 때는 손실이 
    // 발생하지 않으므로 자동 형변환이 실행된다 이런걸 
    // up casting 이라고 한다 
    float value 1 = 3; // int -> float 은 업캐스팅 
    // 자동형변환
    int value2 = (int)3.41; // 실수는 기본이 double  
    // 업 캐스팅이 아님
    float val = 2.1242413123F; // 뒤에 F 는 float임을     // 알려주는 개념
    // 형변환 이랑은 다른 개념     
    // 수동 형변환 으로 해야함 
    int val2 = 8/5;

    //qiuz1
    byte a = 3;
    byte b =5;
    byte c =130;
    byte d =a+b;
    long e = 100;
    float f = 3.5;
    }

}
