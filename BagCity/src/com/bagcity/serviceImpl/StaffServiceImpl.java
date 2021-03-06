package com.bagcity.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bagcity.dao.StaffDao;
import com.bagcity.service.StaffService;
import com.bagcity.util.IdUtil;
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
	public Staff findById(String id) {
		Staff staff=staffDao.findById(id,SessionManger.sessionUser.getCompanyId());
		return staff;
	}

	@Override
	public List<Staff> findAll() {
		List<Staff> staffs= staffDao.findAll(SessionManger.sessionUser.getCompanyId());
		return staffs;
	}

	@Override
	public Staff save(Staff staff) {
		staff.setCompanyId(SessionManger.sessionUser.getCompanyId());
		staff.setId(IdUtil.createId());
		staff.setPassword("123");
		staff.setCreateUserId(SessionManger.sessionUser.getId());
		staffDao.save(staff);
		return staff;
	}

	@Override
	public void delete(String id) {
		staffDao.delete(id);
	}

}
