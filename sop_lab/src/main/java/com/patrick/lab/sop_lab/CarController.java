package com.patrick.lab.sop_lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="cars")
public class CarController {
	private static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("BMW-X3", "4", "black"));
		cars.add(new Car("Nissan-Leaf", "4", "white"));
		cars.add(new Car("Honda-CBR300", "2", "green"));
		cars.add(new Car("Honda-wave", "2", "blue"));
	}
	
	@GetMapping("/{name}")
	public ResponseEntity get(@PathVariable String name){
		for(Car _car: cars) {
			if(_car.getName().equalsIgnoreCase(name)) {
				return new ResponseEntity<>(_car, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("")
	public List<Car> list(){
		return cars;
	}
	
	@PostMapping("")
	public ResponseEntity<Car> create(@RequestBody Car car){
		cars.add(car);
		return new ResponseEntity<Car>(car, HttpStatus.CREATED);
	}
	
	@PutMapping("/{name}")
	public ResponseEntity<Car> update(@RequestBody Car car, @PathVariable String name){
		for(Car _car: cars) {
			if(_car.getName().equalsIgnoreCase(name)) {
				_car.setColor(car.getColor());
				_car.setName(car.getName());
				_car.setWheel(car.getWheel());
				return new ResponseEntity<Car>(car, HttpStatus.OK);
			}
		}
		return new ResponseEntity<Car>(car, HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{name}")
	public ResponseEntity<String> delete(@PathVariable String name){
		Iterator<Car> iterator = cars.iterator();
		Car car = iterator.next();
		if (car.getName().equalsIgnoreCase(name)) {
			iterator.remove();
			return new ResponseEntity<String>("Delete success", HttpStatus.OK);

		}
		return new ResponseEntity<String>("Not found", HttpStatus.NOT_FOUND);

	}
	
	

}
