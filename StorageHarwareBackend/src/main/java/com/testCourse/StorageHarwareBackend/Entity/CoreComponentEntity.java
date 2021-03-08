package com.testCourse.StorageHarwareBackend.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "core_component")
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
