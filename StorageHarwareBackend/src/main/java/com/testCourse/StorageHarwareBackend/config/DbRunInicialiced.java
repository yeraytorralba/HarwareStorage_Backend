package com.testCourse.StorageHarwareBackend.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.testCourse.StorageHarwareBackend.Entity.ComponentEntity;
import com.testCourse.StorageHarwareBackend.Entity.CoreComponentEntity;
import com.testCourse.StorageHarwareBackend.Entity.MakerComponentEntity;
import com.testCourse.StorageHarwareBackend.Entity.TypeComponentEntity;
import com.testCourse.StorageHarwareBackend.Repository.ComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.CoreComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.MakerComponentRepository;
import com.testCourse.StorageHarwareBackend.Repository.TypeComponentRepository;

@Configuration
public class DbRunInicialiced {

	@Autowired
	MakerComponentRepository makerComponentRepository;
	@Autowired
	CoreComponentRepository coreComponentRepository;
	@Autowired
	TypeComponentRepository typeComponentRepository;
	@Autowired
	ComponentRepository componentRepository;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		try {
			makerComponentRepository.deleteAll();
			coreComponentRepository.deleteAll();
			typeComponentRepository.deleteAll();
			componentRepository.deleteAll();

		} catch (Exception e) {
			logger.error("Error in Drop collections");
		}
		try {
			// insert dataSet to initial bd MakerComponentEntity
			List<MakerComponentEntity> makers = new ArrayList<MakerComponentEntity>();

			makers.add(new MakerComponentEntity(1, "Msi"));
			makers.add(new MakerComponentEntity(2, "Asus"));
			makers.add(new MakerComponentEntity(3, "Gigabyte"));
			makers.add(new MakerComponentEntity(4, "AsRock"));
			makers.add(new MakerComponentEntity(5, "Sapphire"));
			makers.add(new MakerComponentEntity(6, "Corsair"));
			makers.add(new MakerComponentEntity(7, "kingston"));
			makers.add(new MakerComponentEntity(8, "WD"));
			makers.add(new MakerComponentEntity(9, "Crucial"));

			this.makerComponentRepository.saveAll(makers);

			// insert dataSet to initial bd MakerComponentEntity
			List<CoreComponentEntity> cores = new ArrayList<CoreComponentEntity>();

			cores.add(new CoreComponentEntity(1, "Intel"));
			cores.add(new CoreComponentEntity(2, "AMD"));
			cores.add(new CoreComponentEntity(3, "Nvidia"));

			this.coreComponentRepository.saveAll(cores);

			// insert dataSet to initial bd typeComponentEntity

			List<TypeComponentEntity> types = new ArrayList<TypeComponentEntity>();

			types.add(new TypeComponentEntity(1, "Procesador"));
			types.add(new TypeComponentEntity(2, "Placa Base"));
			types.add(new TypeComponentEntity(3, "Grafica"));
			types.add(new TypeComponentEntity(4, "Memoria RAM"));
			types.add(new TypeComponentEntity(5, "Disco Duro"));

			this.typeComponentRepository.saveAll(types);

			// insert dataSet to initial bd MakerComponentEntity
			List<ComponentEntity> components = new ArrayList<ComponentEntity>();

			components.add(createComponentEntity(1, 8, "Geforce GTX 2070", "2019/04/05", 3, 1, 3));
			components.add(createComponentEntity(2, 6, "Geforce GTX 2060", "2019/04/05", 3, 1, 3));
			components.add(createComponentEntity(3, 8, "Radeon RX 5500", "2019/08/05", 2, 1, 3));
		  
			components.add(createComponentEntity(4, 8, "Strick Radeon RX 5500", "2019/06/25", 2, 2, 3));
			components.add(createComponentEntity(5, 8, "Radeon RX 5500", "2019/06/25", 2, 5, 3));
			components.add(createComponentEntity(6, 8, "Radeon RX 570 OC", "2019/06/25", 2, 5, 3));
			components.add(createComponentEntity(7, 6, "Radeon RX 570 OC", "2019/06/25", 2, 5, 3));
			components.add(createComponentEntity(8, 8, "Radeon RX 570", "2019/06/25", 2, 4, 3));

			components.add(createComponentEntity(9, 8, "Strix Geforce GTX 2070 OC", "2019/05/05", 3, 2, 3));
			components.add(createComponentEntity(10, 6, "Strix Geforce GTX 2060 OC", "2019/05/05", 3, 2, 3));
			
			//#Placa base
			components.add(createComponentEntity(11, 0, "PRIME B460M-A", "2019/03/17", null, 2, 2));
			components.add(createComponentEntity(12, 0, "TUF GAMING B460-PLUS", "2019/04/27", null, 2, 2));
			components.add(createComponentEntity(13, 0, "Z390-A PRO", "2019/03/23", null, 1, 2));
			components.add(createComponentEntity(14, 0, "MPG X570 Gaming Plus", "2019/05/03", null, 1, 2));
			//#Memoria RAM
			components.add(createComponentEntity(15, 8, "HYPERX DDR4 3200mhz cl18", "2019/08/15", null, 7, 4));
			components.add(createComponentEntity(16, 4, "HYPERX DDR4 2800mhz cl15", "2019/08/15", null, 7, 4));
			components
					.add(createComponentEntity(17, 16, "HYPERX Fury Black DDR4 3200mhz cl16", "2019/08/15", null, 7, 4));

			components.add(createComponentEntity(18, 16, "Vengeance LPX DDR4 3200 CL16", "2019/04/30", null, 6, 4));
			components.add(createComponentEntity(19, 8, "Vengeance RGB DDR4 3600 CL18", "2019/04/30", null, 6, 4));

			components.add(createComponentEntity(20, 4, "DDR4 2400 PC419200 CL17", "2018/08/20", null, 9, 5));
			components.add(createComponentEntity(21, 8, "DDR4 2400 PC419200 CL17", "2018/08/20", null, 9, 5));
			
			//#Memoria Disco Duro
			components.add(createComponentEntity(22, 1024, "SSD M.2 Blue 3D Nand Sata", "2019/05/22", null, 8, 5));
			components.add(createComponentEntity(23, 512, "SSD M.2 Blue 3D Nand NVMe Sata", "2019/05/22", null, 8, 5));
			components.add(createComponentEntity(24, 1024, "SSD Blue 3D Nand Sata", "2018/11/02", null, 8, 5));
			components.add(createComponentEntity(25, 512, "SSD Blue 3D Nand Sata", "2018/11/02", null, 8, 5));

			components.add(createComponentEntity(26, 256, "SSD BX500 3D NAND SATA3", "2018/11/18", null, 9, 5));
			components.add(createComponentEntity(27, 512, "SSD MX500 SATA", "2018/11/18", null, 9, 5));
 
			this.componentRepository.saveAll(components);

		} catch (Exception e) {
			System.err.println("Error with creating DB MONGO INICIALITION");
			System.err.println(e.getMessage());
			System.err.println("Cause");
			System.err.println(e.getCause());
		}
	}

	public ComponentEntity createComponentEntity(int id, int memo, String name, String year, Integer core, Integer maker,
			Integer type) {
		// TODO Auto-generated constructor stub

		Optional<MakerComponentEntity> makerFinded; 
		Optional<CoreComponentEntity> coreFinded;
		Optional<TypeComponentEntity> typeFinded;
		
		makerFinded = (maker != null) ? makerComponentRepository.findById(maker) : null;
		coreFinded = (core != null) ? coreComponentRepository.findById(core) : null;
		typeFinded = (type != null) ? typeComponentRepository.findById(type) : null;

		if (makerFinded != null && coreFinded != null && typeFinded != null) {
			logger.info("Entitys found , create new component");			 
		} else {
			logger.warn("Some Entitys not found , error in create new component , create new component with entitys null");			
		}
		return new ComponentEntity(id, memo, name, new Date(year), coreFinded != null ? coreFinded.get():null, makerFinded != null ? makerFinded.get():null,
				typeFinded != null ? typeFinded.get():null);
		
	}
}