package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.exception.MongoAppException;
import com.mongo.model.User;
import com.mongo.service.UserServiceImpl;
import com.mongo.wrapper.WrapperUser;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl userser;
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user) throws MongoAppException
	{System.out.println("*********post,an"+user);
		User users = userser.createUser(user);
		return new ResponseEntity<User>(users,HttpStatus.OK);
	}
	
	@GetMapping("/viewAllUser")
	public ResponseEntity<List<User>> viewAllUser() throws MongoAppException
	{
		List<User> users = userser.viewAll();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/viewOneUser/{Id}")
	public ResponseEntity<User> viewOneUser(@PathVariable String Id) throws MongoAppException
	{
		User users = userser.viewOne(Id);
		return new ResponseEntity<User>(users,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{Id}")
	public ResponseEntity<List<User>> deleteUser(@RequestParam("Id") String Id) throws MongoAppException
	{
		List<User> users = userser.deleteUser(Id);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@PostMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody WrapperUser user) throws MongoAppException
	{
		User users = userser.updateUser(user);
		return new ResponseEntity<User>(users,HttpStatus.OK);
	}
}
