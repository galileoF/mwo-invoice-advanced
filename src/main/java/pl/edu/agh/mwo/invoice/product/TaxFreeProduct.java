package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class TaxFreeProduct extends Product {
	public TaxFreeProduct(String name, BigDecimal price) {
		super(name, price, BigDecimal.ZERO);
		if(price.compareTo(BigDecimal.ZERO)<0){
			throw new IllegalArgumentException("Wrong price, cannot be negative");
		}
		if(name.length() == 0){
			throw new IllegalArgumentException("Cannot be empty");
		}
	}
}
