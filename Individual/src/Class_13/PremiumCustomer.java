package Class_13;

import java.util.Objects;

public class PremiumCustomer extends Customer {
	
	//프리미엄 고객은 누적 구입액에 따라 할인율 차등부여
	// 백만원이상 2% / 300만원이상 5% / 천마원 이상 10%
	

	private int sale; //할인율
	private int totalPrice; //누적구입액
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public void buy(String productName, int price) {
		totalPrice += price;
		double p = calcDiscount(price);
		System.out.printf("%s상품을 %d 할인율을 적용하여 %.1f원에 구입하였습니다.", productName, sale, p);
	}
	
	private double calcDiscount(int price) {
		if(totalPrice >= 1000000) {
			sale = 2;
			return price - (price * 0.02);
		} else if(totalPrice >= 3000000) {
			sale = 5;
			return price - (price * 0.05);
		}else if(totalPrice >= 10000000) {
			sale = 10;
			return price - (price * 0.1);
		} else {
			sale = 0;
			return price;
		}
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sale, totalPrice);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PremiumCustomer other = (PremiumCustomer) obj;
		return Double.doubleToLongBits(sale) == Double.doubleToLongBits(other.sale) && totalPrice == other.totalPrice;
	}
	@Override
	public String toString() {
		return "PremiumCustomer [sale=" + sale + ", totalPrice=" + totalPrice + "]";
	}
	

	
}
