package control;

public class EarningOrLoss {
	public static void main(String[] args) {
		double seedMoney = 1_000_000;
		
		for (int i = 1; i <= 50; i++) {
			seedMoney += seedMoney/2 * 0.4;
			seedMoney -= seedMoney/2 * 0.3;
			System.out.println(i +": " + seedMoney);			
		}
	}
}
