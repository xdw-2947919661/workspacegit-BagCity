package com.bagcity.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bagcity.service.StaffService;
import com.bagcity.util.BaseController;
import com.bagctiy.vo.Staff;
import com.bagctiy.vo.staff.response.StaffResponse;

@RestController
@RequestMapping("/staff")
public class StaffController extends BaseController {
	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/findall", method = RequestMethod.POST, produces = APPLICATION_JSON, consumes = APPLICATION_JSON)
	public ResponseEntity<List<StaffResponse>> findAll(HttpServletRequest request) {
		List<Staff> staffList = staffService.findAll();
		
		List<StaffResponse> response = new ArrayList<StaffResponse>();
		StaffResponse sResponse=new StaffResponse();
		staffList.stream().forEach(staff->{
			response.add(sResponse.convert(staff));
		});
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(HttpServletRequest request) {

		return "xx";
	}
}
