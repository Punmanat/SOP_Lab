package com.patrick.lab.sop_lab;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hello")
public class Hello {

	@GetMapping("/{firstname}/{lastname}")
	public String hello(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		return String.format("Hello %s %s", firstname,lastname);
	}
	
	@PostMapping("")
	public ResponseEntity<HelloOb> helloPost(@RequestBody HelloOb hello) {
		return new ResponseEntity<HelloOb>(hello, HttpStatus.CREATED);
	}
	
	@PostMapping("/object")
	public String Obj(@RequestBody Object object) {
		return String.format("\"Payload\" : %s", object);
	}
	
}
