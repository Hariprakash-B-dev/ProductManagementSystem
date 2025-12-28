package com.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.entity.Owner;
import com.pms.service.IOwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	@Autowired
	IOwnerService owner;
	
	@PostMapping("/signup")
	ResponseEntity<Object> signUp(@RequestBody Owner o){
		return new ResponseEntity<Object>(owner.signup(o), HttpStatus.ACCEPTED);
	}
}
