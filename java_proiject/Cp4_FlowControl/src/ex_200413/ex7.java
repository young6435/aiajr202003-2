package ex_200413;

public class ex7 {

	public static void main(String[] args) {
//		문제 7. 1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. 
//		while문과 do~while 문을 각각 한번씩 사용해서 작성

		int num = 1;
		
		while (num<=100) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("---------");
		
		
		num = 100;
		
		do {
			System.out.println(num);
			num--;
		}
		while (num>0);
		
	}

}
