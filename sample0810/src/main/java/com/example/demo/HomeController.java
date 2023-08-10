package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mms")
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<?> home(){
		Map<String, String> map = new HashMap<>();
		map.put("id", "moo1");
		
		return ResponseEntity.ok().body(map);
	}
	
	@GetMapping("/health")
	public ResponseEntity<?> health(){
		Map<String, String> map = new HashMap<>();
		map.put("status", "good");
		
		return ResponseEntity.ok().body(map);
	}
	
	@GetMapping("/check")
	public ResponseEntity<?> check(){
		Map<String, String> map = new HashMap<>();
		map.put("check", "can't use");
		
		return ResponseEntity.ok().body(map);
	}

}
