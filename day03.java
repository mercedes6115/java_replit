package day03;
import java.util.Scanner;
import java.util.Random;
public class Day03 {
	public static void main(String[] args) {
		/*
		  //제어문 -> 반복문 -> while, do~ while
		   while(조건){
		   }
		   
		   do{
		   }while(조건식)
		 */
		/*
		int sum =0, num=0;
		
		while(sum<100) {
			sum+=num;
			num++;
		}
		System.out.println((num-1) + "까지의 합= "+sum);
		// while 과 for문은 언제든지 상호 변환할 수 있다
		*/
		/*
		int a = 0;
		while(a < 10) {
			System.out.print(a+ " ");
			a++;
		}
		System.out.println();
		// while 과 do~while의 가장 큰 차이점은 while 은 실행구문이 단 한번도 실행되지 않을수 있다는점에 비해
		// do~while은 실행구문이 반드시 한번은 실행되어야만 한다는 점이다 do다음에 조건식을 검사하므로
		int a1 = 0;
		do {
			System.out.print(a1+" ");
			a1++;
		}while(a1<10); // do~while문 이므로 반드시 1회는 실시하지만 그냥 while문보다 1회더 많이 실행되는것은 무조건적인것은 아니다  
		// 1회 이상 반복될때는 while 과 do~while문 둘다 동일한 결과가 나타난다 
		// 0회 일때는 차이가 있지만 1회이상부터는 동일한 결과를 나타낸다 
		 * */
		/*
		int i = 0;
		while(i<3) {
			int j = 0;
			while(j<5) {
				System.out.println(i+" "+j);
				j++;
			}
			i++;
		}
		*/
		/*
		 break 는 if구문을 제외한 가장 가까운  {}를 탈출하는 제어 키워드 
		 이중으로 중복된 for문이면 가장 가까운 for문 하나만 탈출하는 것이다 
		 */
		/*
		out: // break에 위치를 지정해서 이 위치로 탈출 out레이블이 위치해 있는 곳으로 탈출 
		for (int i =0; i<10;i++) {
			for (int j =0;j<10;j++) {
				if(j==3) {
					break out;
				}
				System.out.println(i + " "+j);
			}
		}
		*/
		// continue 제어 키워드 
		// 반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.
		/*
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i+ " ");
		}
		*/
		/*
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(j ==3) {
					continue; // 3을 안찍고 출력문으로 넘김
				}
				System.out.println(i+ ", "+j);
			}
		}
		*/
		/*
		out:
			for(int  i = 0; i < 10 ; i ++) {
				for (int j = 0 ; j < 5; j++) {
					if(i == 3 & j == 2) {
						break out;
					}
					System.out.println(i + " "+ j);
				}
			}
		*/
		/*
		String [] menu= {"품절","빅맥","타코","백반"};
		out:
		while(true) {
			System.out.println("원하는 메뉴를 선택하세요 0");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if(i > 3) {
				System.out.println("메뉴를 잘못선택 하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는"+ menu[i]+"입니다");
			if(i==0) {
				System.out.println("프로그램을 종료합니다");
				break out;
			}
		}
		scanner.close();
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num = sc.nextInt();
		String ans = (num ==0) ? "입력하신 숫자는 0입니다" : "입력하신 숫자는 0이 아닙니다";
		System.out.println(ans);
		*/
		/*
		Scanner sc = new Scanner(System.in); // 객체는 한번만 생성 
		System.out.println("1st 숫자입력: ");
		int num1 = sc.nextInt();

		System.out.println("2nd 숫자입력: ");
		int num2 = sc.nextInt();
		
		String max =  (num1==num2) ? "같다" : (num1 > num2)? "num1이 크다" : "num2가 크다";
		System.out.println(max);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("a 숫자입력: ");int a = sc.nextInt();
		System.out.println("b 숫자입력: ");int b = sc.nextInt();
		System.out.println("c 숫자입력: ");int c = sc.nextInt();
		int min = a;
		if (b < min) min =b;
		if (c < min) min =c;
		System.out.println("최소값: "+min);
		*/
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("10부터 99사이의 숫자를 맞추세요! ");
		int rnd = 10 + rand.nextInt(90);
		int ans;
		do {
			System.out.print("어떤 숫자일까요? >> ");
			ans = sc.nextInt();
			if (rnd > ans){
				System.out.println("더 큰 숫자입니다.\n");
			}else if(rnd<ans) {
				System.out.println("더 작은 숫자입니다.\n");
			}
		}while(rnd != ans);
		System.out.println("정답입니다.");

			
		}
	}
