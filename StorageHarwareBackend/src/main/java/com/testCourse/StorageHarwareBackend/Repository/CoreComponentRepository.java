package com.testCourse.StorageHarwareBackend.Repository;

 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Entity.CoreComponentEntity;

@Repository
public interface CoreComponentRepository extends CrudRepository<CoreComponentEntity, Integer>{

}
