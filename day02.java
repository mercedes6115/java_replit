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
    /*
    반복문 for 문
    for(start; stop condition; step)
    */
    /*
    for(int a = 3; a < 10; ++a){ // 이런식으로 step을 이용가능 
      System.out.println(a);
    }
    for(int a = 0, b =0; a < 10; a++, b++){  
      System.out.println(a+b+"");
    }
    for (int a =0; ; a++){} // for문 에서 무한루프 
    for(;;) //-> while(True)느낌 무한루프 
    */
    /*
    //for each 
    //String name ="홍길동";
    String[] names ={"홍길동","이몽룡"};
    int[] nums={1,2,3,4,5};
    for(String name: names){
      System.out.println(name);
    }
    */
    /* // for -1
    int sum=0;
    for(int a =0; a<1000; a+=3){
      sum += a;
    }
    System.out.println(sum);
    */
    /* 별찍기
    for(int i=1;i<6;i++){
	    for(int j=0;j<i;j++){
		    System.out.print("*");
	    }
	  System.out.println("");
    }
    */
    /* 역방향
    for(int i=5;i>0;i--){
	    for(int j=0;j<i;j++){
		    System.out.print("*");
	    }
	  System.out.println("");
    }
    */
    /* 별찍기 정삼각형
    for(int i=1;i<=5;i++){
	    for(int j=1;j<5-i+1;j++){
		    System.out.print(" "); 
	    }
	    for(int x=1;x<=2*i-1;x++){
		    System.out.print("*"); 
	    }
	  System.out.println("");
    } 
    */
    /*
    int[] nums={70,60,55,75,95,90,80,85,100};
    int max = nums[0];
    int min = nums[0];
    for(int num: nums){
      if (num > max){
        max = num;
      }
    
      if (min > num){
        min = num;
      }
    }
    System.out.println(max);
    System.out.println(min);
    */
  }
}