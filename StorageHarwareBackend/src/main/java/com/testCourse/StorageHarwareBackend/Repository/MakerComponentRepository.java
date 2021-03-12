package com.testCourse.StorageHarwareBackend.Repository;

 
 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.testCourse.StorageHarwareBackend.Entity.MakerComponentEntity;

@Repository
public interface MakerComponentRepository extends MongoRepository<MakerComponentEntity, Integer>{

}
