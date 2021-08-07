package com.spring.controlll;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Dto.DTOimple;


public interface FindEmps {

	public java.util.List<DTOimple> findEmp(boolean s,String prop);

}
