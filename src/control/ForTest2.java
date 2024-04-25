package control;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 3; i <= 1000; i+=3) {
			sum += i;
		}
		
		System.out.println("1~1000까지 3의 배수의 합은 " + sum);
	}
}
