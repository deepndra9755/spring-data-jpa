package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dto.DTOimpl;
import com.example.service.IServiceImpl;

@SpringBootApplication
public class InsertingSpecialValuesToMangoDbApplication {
	private Integer id;
	private List<Integer> mobile;
	private LocalDate dob;
	private LocalDateTime dom;
	private Integer tell[];
	private Map<String,Float>resultDt;
	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(InsertingSpecialValuesToMangoDbApplication.class, args);
		IServiceImpl s2=cts.getBean("ss",IServiceImpl.class);
	DTOimpl dd=new DTOimpl();
	dd.setId(30);
	dd.setDob(LocalDate.now());
	dd.setDom(LocalDateTime.now());
	List<Long> ss=new ArrayList<Long>();
	ss.add(9755745362l);
	ss.add(7755745362l);
	ss.add(7373838393l);
	dd.setMobile(ss);
	Map<String,Float> ms=new HashMap();
	ms.put("hindi",39.3f);
	ms.put("english",58.0f);
	ms.put("mathes",49f);
	ms.put("physisc",49f);
	ms.put("chemestry",90f);
	dd.setResultDt(ms);
	DTOimpl js=s2.GetForm(dd);
		System.out.println(js);
//s2.GetForm(dd);
		((ConfigurableApplicationContext) cts).close();
	 }

}
