package productApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> product = new ArrayList<>(Arrays.asList(new Product("01", "Samsung", 45000.0),
			new Product("02", "Vivo", 30000.0), new Product("03", "Redmi", 25000.0)));

	public List<Product> getAllProduct() {
		return product;
	}

	public Product getProductId(String id) {

		return product.stream().filter(p -> p.getId().equals(id)).findFirst().get();

	}

	public void addProduct(Product products) {
		product.add(products);
	}

	public void updateProduct(String id, Product updateProduct) {

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getId().equals(id)) {
				product.set(i, updateProduct);
			}	

		}
	}

	public void deleteTopic(String id) {
		product.removeIf(t -> t.getId().equals(id));
	}

}
