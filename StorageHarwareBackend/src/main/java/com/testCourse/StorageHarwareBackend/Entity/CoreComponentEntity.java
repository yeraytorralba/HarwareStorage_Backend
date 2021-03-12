package com.testCourse.StorageHarwareBackend.Entity;
 
import javax.persistence.Column; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="core_component")
public class CoreComponentEntity {

	@Id
	@Column(name="id", insertable=false, updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	 

	public CoreComponentEntity() {

	}

	public CoreComponentEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CoreComponentEntity [id=" + id + ", name=" + name + "]";
	}

	 
}
