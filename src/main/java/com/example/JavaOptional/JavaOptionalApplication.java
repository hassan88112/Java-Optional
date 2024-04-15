package com.example.JavaOptional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.SimpleTimeZone;

@SpringBootApplication
public class JavaOptionalApplication {

	public static void main(String[] args) {


		Person person=new Person("hassan","hassanshalash@gmail.com");
		String email=person
				.getEmail()
				.map(String::toUpperCase)
				.orElse("not valid email");

		System.out.println(email);

		/*SpringApplication.run(JavaOptionalApplication.class, args);

		Optional<String> empty=Optional.ofNullable("hello");

		System.out.println(empty.isPresent());
		System.out.println(empty.isEmpty());

		String upper= empty
						.map(String::toUpperCase)
				        .orElse("world");

		System.out.println(upper);*/

	}


}
class Person{
	private final String name;
	private final String email;

	public String getName() {
		return name;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
}