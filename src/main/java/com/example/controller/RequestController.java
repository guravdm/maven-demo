package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.RequestDomain;
import com.example.model.RequestCommonModel;
import com.example.repository.IRequest;
import com.example.repository.RequestRepository;

@RestController
public class RequestController {

	@Autowired
	RequestRepository requestRepository;

	@Autowired
	IRequest request;

	@RequestMapping(value = "/saveRequest", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private void saveRequest(@RequestBody RequestCommonModel requestCommonModel, HttpSession session) {
		System.out.println(requestCommonModel.getOrga_id());
		System.out.println("requestCommonModel : " + requestCommonModel.toString());
		requestRepository.saveRequest(requestCommonModel, session);
	}

	@RequestMapping(value = "/req", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private void saveDomain(@RequestBody RequestDomain rd) {
		request.save(rd);
	}

}
