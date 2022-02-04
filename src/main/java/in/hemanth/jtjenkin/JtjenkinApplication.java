package in.hemanth.jtjenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JtjenkinApplication {

	@GetMapping
	public String fun(){
		return "Hello from sb to Jenkins, just a basic one. Got lot more to do.";
	}

	public static void main(String[] args) {
		SpringApplication.run(JtjenkinApplication.class, args);
	}

}
