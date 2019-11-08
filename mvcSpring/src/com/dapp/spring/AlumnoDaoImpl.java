package com.dapp.spring;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {


	
	@Override
	public List<AlumnoDto> getAll() {
		
		List<AlumnoDto>listadoAlumnos = new ArrayList <AlumnoDto>();
		
		AlumnoDto a0 = new AlumnoDto(1,"daniel","perez");
		AlumnoDto a1 = new AlumnoDto(2,"andres","perez");
		AlumnoDto a2 = new AlumnoDto(3,"camolpo","perez");
		
		listadoAlumnos.add(a0);listadoAlumnos.add(a1);listadoAlumnos.add(a2);
		return listadoAlumnos;
		
		
		
		
		
	}

}
