package com.example.demo.impl;

import java.util.List;

import com.example.demo.model.AjayModel;

public interface AjayService  {
	public String insertData(AjayModel ajaymodel);
	public String updateData(AjayModel ajaymodel);
	public String deleteData(String id);
	public AjayModel getDetails(String id);
	public List<AjayModel> getallDetails();

}
