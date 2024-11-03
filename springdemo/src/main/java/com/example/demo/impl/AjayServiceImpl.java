package com.example.demo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.AjayModel;
import com.example.demo.repo.AjayRepo;
@Service
public class AjayServiceImpl implements AjayService{
	private AjayRepo ajayrepo;

	

	public AjayServiceImpl(AjayRepo ajayrepo) {
		super();
		this.ajayrepo = ajayrepo;
	}
   @Override
	public String insertData(AjayModel ajaymodel) {
		// TODO Auto-generated method stub
		ajayrepo.save(ajaymodel);
		return "inserted";
	}

	@Override
	public String updateData(AjayModel ajaymodel) {
		// TODO Auto-generated method stub
		ajayrepo.save(ajaymodel);
		return "updated";
	}

	@Override
	public String deleteData(String id) {
		// TODO Auto-generated method stub
		ajayrepo.deleteById(id);
		return "deleted";
	}

	@Override
	public AjayModel getDetails(String id) {
		// TODO Auto-generated method stub
		return ajayrepo.findById(id).get();
	}

	@Override
	public List<AjayModel> getallDetails() {
		// TODO Auto-generated method stub
		return ajayrepo.findAll();
	}

}
