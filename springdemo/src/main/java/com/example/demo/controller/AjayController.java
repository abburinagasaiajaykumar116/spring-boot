package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.impl.AjayService;
import com.example.demo.model.AjayModel;

@RestController
@RequestMapping("/ajay")
public class AjayController {
	private AjayService ajayservice;

	public AjayController(AjayService ajayservice) {
		super();
		this.ajayservice = ajayservice;
	}
	   @PostMapping("/")
		public String insertData(@RequestBody AjayModel ajaymodel) {
			// TODO Auto-generated method stub
			ajayservice.insertData(ajaymodel);
			return "inserted";
		}

		@PutMapping("/")
		public String updateData(@RequestBody AjayModel ajaymodel) {
			// TODO Auto-generated method stub
			ajayservice.updateData(ajaymodel);
			return "updated";
		}

		@DeleteMapping("/{id}")
		public String deleteData(@PathVariable("id") String id) {
			// TODO Auto-generated method stub
			ajayservice.deleteData(id);
			return "deleted";
		}

		@GetMapping("/{id}")
		public AjayModel getDetails(@PathVariable("id") String id) {
			// TODO Auto-generated method stub
			return ajayservice.getDetails(id);
		}

		@GetMapping("/")
		public List<AjayModel> getallDetails() {
			// TODO Auto-generated method stub
			return ajayservice.getallDetails();
		}

}
