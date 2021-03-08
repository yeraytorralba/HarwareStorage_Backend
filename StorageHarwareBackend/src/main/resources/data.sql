#tabla type_component
INSERT INTO type_component(name) VALUES ('Procesador');
INSERT INTO type_component(name) VALUES ('Placa Base');
INSERT INTO type_component(name) VALUES ('Grafica');
INSERT INTO type_component(name) VALUES ('Memoria RAM');
INSERT INTO type_component(name) VALUES ('Disco Duro');

#tabla maker_component
INSERT INTO maker_component(name) VALUES ('Msi');
INSERT INTO maker_component(name) VALUES ('Asus');
INSERT INTO maker_component(name) VALUES ('Gigabyte');
INSERT INTO maker_component(name) VALUES ('AsRock');
INSERT INTO maker_component(name) VALUES ('Sapphire'); 
INSERT INTO maker_component(name) VALUES ('Corsair'); 
INSERT INTO maker_component(name) VALUES ('kingston'); 
INSERT INTO maker_component(name) VALUES ('WD'); 
INSERT INTO maker_component(name) VALUES ('Crucial'); 

#tabla core_component
INSERT INTO core_component(name) VALUES ('Intel'); 
INSERT INTO core_component(name) VALUES ('AMD'); 
INSERT INTO core_component(name) VALUES ('Nvidia');  

#tabla component
#Graphics
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Geforce GTX 2070','2019/04/05',3,1,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (6,'Geforce GTX 2060','2019/04/05',3,1,3);

INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Radeon RX 5500','2019/08/05',2,1,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Strick Radeon RX 5500','2019/06/25',2,2,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Radeon RX 5500','2019/06/25',2,5,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Radeon RX 570 OC','2019/06/25',2,5,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (6,'Radeon RX 570 OC','2019/06/25',2,5,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Radeon RX 570','2019/06/25',2,4,3);


INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Strix Geforce GTX 2070 OC','2019/05/05',3,2,3);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (6,'Strix Geforce GTX 2060 OC','2019/05/05',3,2,3);
#Placa base
INSERT INTO component(memo, name, year, core, maker, type) VALUES (0,'PRIME B460M-A','2019/03/17',null,2,2);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (0,'TUF GAMING B460-PLUS','2019/04/27',null,2,2);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (0,'Z390-A PRO','2019/03/23',null,1,2);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (0,'MPG X570 Gaming Plus','2019/05/03',null,1,2);
#Memoria RAM
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'HYPERX DDR4 3200mhz cl18','2019/08/15',null,7,4);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (4,'HYPERX DDR4 2800mhz cl15','2019/08/15',null,7,4);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (16,'HYPERX Fury Black DDR4 3200mhz cl16','2019/08/15',null,7,4);

INSERT INTO component(memo, name, year, core, maker, type) VALUES (16,'Vengeance LPX DDR4 3200 CL16','2019/04/30',null,6,4);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'Vengeance RGB DDR4 3600 CL18','2019/04/30',null,6,4);

INSERT INTO component(memo, name, year, core, maker, type) VALUES (4,'DDR4 2400 PC419200 CL17','2018/08/20',null,9,5);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (8,'DDR4 2400 PC419200 CL17','2018/08/20',null,9,5);
#Memoria Disco Duro
INSERT INTO component(memo, name, year, core, maker, type) VALUES (1024,'SSD M.2 Blue 3D Nand Sata','2019/05/22',null,8,5);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (512,'SSD M.2 Blue 3D Nand NVMe Sata','2019/05/22',null,8,5);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (1024,'SSD Blue 3D Nand Sata','2018/11/02',null,8,5);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (512,'SSD Blue 3D Nand Sata','2018/11/02',null,8,5);

INSERT INTO component(memo, name, year, core, maker, type) VALUES (256,'SSD BX500 3D NAND SATA3','2018/11/18',null,9,5);
INSERT INTO component(memo, name, year, core, maker, type) VALUES (512,'SSD MX500 SATA','2018/11/18',null,9,5);

