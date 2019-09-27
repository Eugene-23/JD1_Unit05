package htp.home.payment.main;

public class PaymentLogic {
	
	public int sumOfPayment(Payment payment) {
		int sum = 0;
		for(Payment.Good good : payment.getGood()) {
			sum = sum + good.getPrice();
		}				
		return sum;
	}
}
