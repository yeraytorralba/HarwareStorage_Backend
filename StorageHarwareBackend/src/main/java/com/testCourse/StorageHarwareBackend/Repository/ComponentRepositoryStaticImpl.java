package com.testCourse.StorageHarwareBackend.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class ComponentRepositoryStaticImpl implements ComponentRepositoryStatic{

	
	private String[] almacenStatico = {"grafica","procesador","ssd","placa base","refrigeracion"}; 
	
	
	@Override
	public String findOneStatic(Integer id) {  
		return almacenStatico[id];
	}

	@Override
	public String[] findAllStatic() {  
		return almacenStatico;
	}
	
	

}
