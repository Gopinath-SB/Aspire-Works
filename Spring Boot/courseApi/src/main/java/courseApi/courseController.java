package courseApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
