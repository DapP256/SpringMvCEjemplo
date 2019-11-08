package com.dapp.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	AlumnoDao ad;
	
	
	@Override
	public List<AlumnoDto> getAll() {
		
		return ad.getAll();
	}

}
