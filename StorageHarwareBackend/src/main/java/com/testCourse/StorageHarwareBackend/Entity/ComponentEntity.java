package com.testCourse.StorageHarwareBackend.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "component")
public class ComponentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type")
	private TypeComponentEntity type;
	
	private int memo;
	private Date year;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maker")
	private MakerComponentEntity maker;


    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "core")
	private CoreComponentEntity core;

	public ComponentEntity() { 
	}

	public ComponentEntity(int id, String name, TypeComponentEntity type, int memo, Date year,
			MakerComponentEntity maker, CoreComponentEntity core) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.memo = memo;
		this.year = year;
		this.maker = maker;
		this.core = core;
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

	public TypeComponentEntity getType() {
		return type;
	}

	public void setType(TypeComponentEntity type) {
		this.type = type;
	}

	public int getMemo() {
		return memo;
	}

	public void setMemo(int memo) {
		this.memo = memo;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public MakerComponentEntity getMaker() {
		return maker;
	}

	public void setMaker(MakerComponentEntity maker) {
		this.maker = maker;
	}

	public CoreComponentEntity getCore() {
		return core;
	}

	public void setCore(CoreComponentEntity core) {
		this.core = core;
	}

	@Override
	public String toString() {
		return "ComponentEntity [id=" + id + ", name=" + name + ", type=" + type + ", memo=" + memo + ", year=" + year
				+ ", maker=" + maker + ", core=" + core + "]";
	}

}
