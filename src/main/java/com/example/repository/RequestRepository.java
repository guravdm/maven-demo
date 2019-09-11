package com.example.repository;

import javax.servlet.http.HttpSession;

import com.example.model.RequestCommonModel;

public interface RequestRepository {

	void saveRequest(RequestCommonModel requestCommonModel, HttpSession session);

}
