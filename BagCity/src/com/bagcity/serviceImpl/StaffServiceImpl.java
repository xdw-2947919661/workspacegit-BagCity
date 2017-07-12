package com.bagcity.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bagcity.dao.StaffDao;
import com.bagcity.service.StaffService;
import com.bagcity.util.SessionManger;
import com.bagctiy.vo.Staff;

@Service("staffService")
public class StaffServiceImpl implements StaffService {
	@Resource(name = "staffDao")
	private StaffDao staffDao;

	@Override
	public Staff find(Staff var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff findById(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> findAll() {
		List<Staff> staffs= staffDao.findAll(SessionManger.sessionUser.getCompanyId());
		return staffs;
	}

}
