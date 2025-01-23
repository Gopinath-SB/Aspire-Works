package productApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	@RequestMapping("/products")
	public List<Product> getAllProduct() {
		return productservice.getAllProduct();
	}

	@RequestMapping("/products/{id}")
	public Product getProductId(@PathVariable String id) {
		return productservice.getProductId(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/product")
	public void addProduct(@RequestBody Product products) {
		productservice.addProduct(products);
	}

	@PutMapping("/products/{id}")
	public void updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
		productservice.updateProduct(id, updatedProduct);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void updatetopic(@PathVariable String id) {
		productservice.deleteTopic(id);
	}

}
