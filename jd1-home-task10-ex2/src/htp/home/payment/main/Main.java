package htp.home.payment.main;

/*
 * Задача 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		payment.add("Title", 1);
		
		printReceipt(payment);
		
		PaymentLogic pl = new PaymentLogic();
		int totalSum = pl.sumOfPayment(payment);		
		System.out.println("Total sum: " + totalSum + "$.");
	}
	
	public static void printReceipt(Payment payment) {
		System.out.println("Receipt:");
		for(Payment.Good good : payment.getGood()) {
			System.out.println(good.getTitle() + " - " + good.getPrice() + "$;");			
		}
	}

}
