package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	
	private ArrayList<Product> products;
	
	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
		if (quantity <= 0){
			throw new IllegalArgumentException("Wrong quantity");
		}
	}

	public BigDecimal getSubtotal() {
		return null;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}
}
