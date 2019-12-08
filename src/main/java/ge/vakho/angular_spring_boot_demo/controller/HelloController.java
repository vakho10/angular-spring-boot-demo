package ge.vakho.angular_spring_boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ge.vakho.angular_spring_boot_demo.model.PostMessage;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello, world!";
	}

	@PostMapping
	public String hello(@ModelAttribute PostMessage message) {
		return String.format("Hello, %s!", message.getName());
	}
}