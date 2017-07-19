package com.bagcity.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@RequestMapping(value="/{id}",consumes=APPLICATION_JSON,produces=APPLICATION_JSON, method = RequestMethod.POST)
	public ResponseEntity<StaffResponse> findById(@PathVariable(value="id") final String id){
		Staff staff=staffService.findById(id);
		StaffResponse response=new StaffResponse().convert(staff);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	
	
	@RequestMapping(value = "/add",consumes=APPLICATION_JSON,produces=APPLICATION_JSON, method = RequestMethod.POST)
	public ResponseEntity<Map<Object,Object>> add(@RequestBody Staff staff) {
		Map<Object,Object> map=new HashMap<Object, Object>();
		staff=staffService.save(staff);
		if(staff!=null){
			map.put("returnCode",SUCCESS_TEXT);
		}else{
			map.put("returnCode",FAILURE_TEXT);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
