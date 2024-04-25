package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3;
		int h1, h2, h3;
		int s, b;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		c1 = (int) (Math.random() * 10);
		
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);

//		System.out.println(c1 + "," + c2 + "," + c3);
		
		do {
			count++;
			s = b = 0;
			System.out.print("0~9 사이 중복되지 않은 숫자 세 개를 공백으로 구분하여 입력해주세요(ex. 1 2 3) >>> ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;

			if(h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			
			if(h3 == c3) s++;
			else if(h3 == c2 || h3 == c1) b++;
			
			System.out.printf("%dS %dB\n", s, b);
		} while(s != 3);
		
		System.out.printf("정답입니다. %d번만에 맞추셨습니다.", count);
	}
}