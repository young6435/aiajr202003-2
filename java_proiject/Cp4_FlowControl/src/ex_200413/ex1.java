package ex_200413;

public class ex1 {

	public static void main(String[] args) {
//		문제1. 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.

//		int num=120;
//		if(num>0) {
//		if((num%2)==0)
//		System.out.println(“양수이면서 짝수");

		// and 연산을 사용하고 if문을 한개로 줄임.
		int num=120;
		if(num>0 && (num%2)==0) {

		System.out.println("양수이면서 짝수");
		
		}
		
		
		
	}

}
