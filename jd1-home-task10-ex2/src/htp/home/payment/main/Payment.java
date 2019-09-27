package htp.home.payment.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Good> order;
	
	
	public Payment() {		
		order = new ArrayList<Good>();
	}
	
	public Payment(List<Good> order) {		
		this.order = order;
	}

	public List<Good> getGood() {
		return order;
	}

	public void setGood(List<Good> order) {
		this.order = order;
	}
	
	public void add(String title, int price) {
		order.add(new Good("Mars", 100)); 
		order.add(new Good("Snikers", 150));
		order.add(new Good("Bounty", 120));
	}
	
	@Override
	public String toString() {
		return "Payment [order=" + order + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}



	public class Good {
		
		private String title;
		private int price;
		
		
		public Good(String title, int price) {
			this.title = title;
			this.price = price;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
	}
}
