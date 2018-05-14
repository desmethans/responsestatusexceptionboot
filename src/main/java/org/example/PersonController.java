package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("persons")
class PersonController {
	@GetMapping("{id}")
	Person get(@PathVariable long id, @RequestHeader("Accept") String accept) {
		if (id == 1) {
			Person person = new Person();
			person.setName("joe");
			return person;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}
