package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/hello")
    public String home() {
        // return System.getenv("TEST");
		return "Hello World 2010XX";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
