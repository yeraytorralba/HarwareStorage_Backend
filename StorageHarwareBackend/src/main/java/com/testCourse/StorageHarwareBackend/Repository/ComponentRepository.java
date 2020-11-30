package com.testCourse.StorageHarwareBackend.Repository;

 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;

@Repository
public interface ComponentRepository extends CrudRepository<ComponentEntity, Integer>{

}
