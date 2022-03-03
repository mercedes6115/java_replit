import java.util.Scanner;
class Day02 {
  public static void main(String[] args) {
    /*
    연산자 
    산술 연산자 + - x % / 
    증감 연산자 ++ -- 
    비트 연산자 & : (and) , | : (or) 
    비교 연산자 <, >, <=, >=, ==, != 
    대입 연산자 =  += -= 등등 
    삼항 연산자 (조건식) ? true : false
    쉬프트 연산자 >> , <<
    
    */
    /*
    int a = 3 ;
    int b = ++a; // 먼저 1증가 시킨 값을 대입 전위형 연산 

    int c = 3;
    int d = c++; // 원래 값을 대입시키고 원래값을 1증가 후위형 연산 

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    */
    /*
    int a = (true) ? 1 : 2;
    System.out.println(a);
    */
    /*
    int a = 13;
    int b = (a % 2 == 0) ? 10: 12;
    System.out.println(b);
    if (a > 5){
      b=10;
    }else{
      b=20;
    }
    c
    System.out.println((a % 2 == 0) ? "짝수" : "홀수");
    */
    /*
    int c = 85;
    System.out.println((c >= 90) ? "A" : (c >= 80) ? "B" : (c >= 70)                        ? "C" : (c >= 60) ? "D" : "F");
    */
    /*
    제어문 -> 조건문 -> if, switch
    제어문 -> 반복문 -> for, while, do~while
    if 문 block 처리 필수화 
    if (a>5){

    } 이런식으로 블록처리 습관화 
        
    
    */
    /*
    &, && 의 차이 -> 효율성의 차이 
    |, || 도 같은 차이 -> 하나만 사용하면 모든 조건 모두 확인하여 결정 
    두개를 사용하면 조건을 전부 확인하지 않고 하나만으로도 결정가능하다 
    
    int a = 1;
    int b = 2;
    if(a < 3 & b < 3){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
    */
    /*
    switch문
    변수값에 따라서 특정위치 case로 이동해서 구문을 실행하는 선택 제어문
    */
    /*
    int a =88;
    int b = (int)a / 10;
    switch(b){
        case 10: case 9:
            System.out.println("A");
            break; 
        case 8: 
            System.out.println("B");
            break;
        case 7: 
            System.out.println("C");
            break;
        case 6: 
            System.out.println("D");
            break;
        default : 
            System.out.println("F");
            break;
    }
    */
    /*
    Scanner scanner = new Scanner(System.in);
    System.out.print("월을 입력하세요 : ");
    int month = scanner.nextInt();
    switch(month){
      case 1: 
        System.out.println("Jan"); break;
      case 2: 
        System.out.println("Feb"); break;
      case 3: 
        System.out.println("Mar"); break;
      case 4: 
        System.out.println("Apr"); break;
      case 5: 
        System.out.println("May"); break;
      case 6: 
        System.out.println("Jun"); break;
      case 7: 
        System.out.println("Jul"); break;
      case 8: 
        System.out.println("Aug"); break;
      case 9: 
        System.out.println("Sep"); break;
      case 10: 
        System.out.println("Oct"); break;
      case 11: 
        System.out.println("Nov"); break;
      case 12: 
        System.out.println("Dec"); break;
      default: 
        System.out.println("None"); break;}
    scanner.close();
    */
    
  
    
  }
}