package com.bagcity.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bagctiy.vo.Staff;

@Repository("staffDao")
public interface StaffDao {

	List<Staff> findAll(String companyId);

	void save(Staff staff);

	Staff findById(String id, String companyId);

	void delete(String id);

}
