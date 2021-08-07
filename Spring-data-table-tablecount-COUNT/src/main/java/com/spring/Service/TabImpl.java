package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.IRepo.TabDataCounter;
@Service("sr")
public class TabImpl implements ITabService {
 @Autowired
 TabDataCounter tc;
	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return (int)tc.count();
	}

}
