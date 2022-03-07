package day04;

import java.util.Arrays;

public class Day04 {

	public static void main(String[] args) {
		/*
		// 배열: 동일한 자료형을 묶어 저장하는 잠초형 자료형임
		// 최초 생성시 지정한 크기를 절대 변경할 수 없다는 특징이 있다
		 1.배열 선언
		 int[] a; ,int a[];
		 double[] b;
		 String []c; 
		 
		 2.배열 객체 생성
		 new int[3];
		 new String[5];
		 
		 3. 배열 자료형 변수에 객체 넣기 
		 int[] a = new int[3];
		 int 배열 자료형의 변수명 a 참조변수에 새로운 int 자료형 3개를 저장할 것이다.
		*/
		// 배열 선언 방법
		/*
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		int array3[] = new int[3];
		int array4[];
		array4 = new int[3];
		
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		int[] a = new int[3];
		// 배열을 선언함과 동시에 객체를 생성하여 초기화 진행 초기화 값은 0이다.
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		
		// 방법 1. 배열 객체에서 값 꺼내기
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		*/
		// 방법2. 배열 객체 생성과 함께 값 넣기
		/*
		int[] b = new int[] {3,4,5}; // fm방식 
		
		int[] b1 ;
		b1 = new int[] {3,4,5};
		// 방법 3.
		int[] c = {3,4,5}; // 제일 많이 쓰이는 방식 
		*/
		/*
		int[] c; 
		c = {3,4,5} //선언과 대입 분리가 불가능
		*/
		/*
		 배열에서의 초기화값 정리
		 // int , long , short ,char ,byte -> 0으로 초기화
		 // boolean -> false
		 // float double -> 0.0
		 // class -> null
		 */
		/*
		int value1;
		int[] value2;
		
		int[] value4 = null; // null로 초기화 하여 오류 미발생 
		System.out.println();
		
		boolean[] arr1 = new boolean[3];
		
		for(int i=0 ; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
		for(boolean j: arr1){
		      System.out.println(j);
		}
		*/
		/*
		//int[] array2 = new int[3];
		String[] array3 = new String[3];
		for(String each: array3) {
			System.out.println(each);
		}
		*/
		/*
		// 배열 전체를 출력하는 간단한 방법
		// Arrays.toString(배열명): 배열의 모든 원소를 한번에 모두 출력
		boolean[] array1 = new boolean[3];
		int[] array2 = new int[3];
		String[] array3 = new String[3];
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		*/
		// 배열의 특징 
		/*
		int[] a = new int[] {3,4,5,6,7};
		System.out.println(a.length);
		for (int each : a) {
			System.out.println(each);
		}
		*/
		// 이차원 배열: 가로와 세로 2차원으로 data를 저장하는 배열 
		// 자료형[][] 변수명; 
		/*
		int [][] array1=new int[3][4];
		int [][] a = {{1,2},{3,4,5}};
		
		    for(int i =0; i < a.length ;i++) {
			for(int j = 0 ; j < a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		*/
		/*
		for(int[] array:a) {
			for(int k :array) {
				System.out.print(k+" ");	
			}
			System.out.println(" ");
		}
		*/
		/*
		int[] a = new int[100];
		for(int i=0; i< a.length; i++) {
			a[i]=i+1;
			
		}
		
		System.out.println(Arrays.toString(a));
		*/
		
		int[] arr1= {5,4,3,2,1};
		int[] arr2= new int[arr1.length];
//		for(int i= arr1.length-1,j=0 ; i>=0 ; i--,j++) {
//			arr2[j]=arr1[i];
//		}
		for (int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}