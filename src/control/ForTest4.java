package control;

public class ForTest4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i%3 != 0) continue;
			sum += i;
		}
		
		System.out.println("1~1000까지 3의 배수의 합은 " + sum);
	}
}
