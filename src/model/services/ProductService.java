package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> product, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : product) {
			if (criteria.test(p)) {
				sum = sum + p.getPrice();
			}
		}
		return sum;

	}
}
