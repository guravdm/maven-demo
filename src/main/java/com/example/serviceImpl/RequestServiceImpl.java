package com.example.serviceImpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RequestDao;
import com.example.domain.RequestDomain;
import com.example.model.RequestCommonModel;
import com.example.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestRepository {

	@Autowired
	RequestDao requestDao;

	@Override
	public void saveRequest(RequestCommonModel rc, HttpSession session) {

		try {
			RequestDomain rd = new RequestDomain();
			rd.setActivity(rc.getActivity());
			rd.setAction(rc.getAction());
			rd.setState(rc.getState_id());
			rd.setAddress(rd.getAddress());
			rd.setSpoc_id(rd.getSpoc_id());
			rd.setEntityId(rd.getEntityId());
			rd.setDeclaredWeeklyHolidy(rd.getDeclaredWeeklyHolidy());
			rd.setEmailId(rd.getEmailId());
			rd.setEmployerResAddress(rc.getEmployerResAddress());
			rd.setEstablishmentSector(rc.getEstablishmentSector());
			rd.setFaxNo(rc.getFaxNo());
			rd.setDateOfCommencement(rc.getDateOfCommencement());
			rd.setFemalesCount(rc.getFullTimeMemberFemales());
			rd.setMalesCount(rc.getFullTimeMemberMales());
			rd.setPostalAddress(rc.getPostalAddress());
			rd.setNatureOfBusiness(rc.getNatureOfBusiness());
			rd.setManagerName(rc.getManagerName());
			rd.setMemberOfEmployementFamily(rc.getMemberOfEmployementFamily());
			requestDao.saveRequest(rd);
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
