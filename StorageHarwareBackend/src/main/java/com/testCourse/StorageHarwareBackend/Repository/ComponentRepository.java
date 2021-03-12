package com.testCourse.StorageHarwareBackend.Repository;

 

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;

@Repository
public interface ComponentRepository extends MongoRepository<ComponentEntity, Integer>{

}
