-----ENTREGA 2 DEL PROYECTO
-----Juan David Rengifo 0939879
-----Juan David Pati�o 0932180
-----Cristian Dario Loaiza 0933174

-----CREACION DE TABLAS

DROP TABLE sucursal CASCADE;
CREATE TABLE sucursal (
cod_sucursal varchar(100) PRIMARY KEY,
nombre varchar(100),
ciudad varchar(100),
direccion varchar(100),
telefono varchar(100));


DROP TABLE empleado CASCADE;
CREATE TABLE empleado (
id_empleado varchar(100) PRIMARY KEY,
nombre varchar(100),
genero varchar(100),
estado_civil varchar(100),
fecha_nacimiento Date,
fecha_ingreso Date,
tipo_contrato varchar(100),
cargo varchar(100),
cod_sucursal varchar(100),
FOREIGN KEY(cod_sucursal) REFERENCES sucursal(cod_sucursal));


DROP TABLE equipo CASCADE;
CREATE TABLE equipo (
imei varchar(100) PRIMARY KEY,
modelo varchar(100),
marca varchar(100));


DROP TABLE abonado CASCADE;
CREATE TABLE abonado (
id varchar(100) PRIMARY KEY,
tipo_documento varchar(100),
nombres varchar(100),
apellidos varchar(100),
direccion varchar(100),
genero varchar(100),
estado_civil varchar(100),
fecha_nacimiento Date,
comuna varchar(100),
barrio varchar(100),
ciudad varchar(100),
tipo varchar(100),
imei varchar(100),
FOREIGN KEY(imei) REFERENCES equipo(imei));


DROP TABLE plan CASCADE;
CREATE TABLE plan (
cod_plan varchar(100) PRIMARY KEY,
tarifa_otro_operador int,
tarifa_msj_multimedia int,
tarifa_msj_texto int);


DROP TABLE postpago CASCADE;
CREATE TABLE postpago (
cod_plan varchar(100) PRIMARY KEY,
total_minutos int,
costo_min_adicional int,
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE empresa CASCADE;
CREATE TABLE empresa (
nombre varchar(100) PRIMARY KEY,
telefono varchar(100),
direccion varchar(100),
cod_plan varchar(100),
FOREIGN KEY(cod_plan) REFERENCES postpago(cod_plan));


DROP TABLE cia_internacional CASCADE;
CREATE TABLE cia_internacional (
id varchar(100) PRIMARY KEY,
nombre varchar(100),
pais varchar(100),
tarifa_mensajes int,
tar_llamada_entra_inter int,
tar_llamada_sale_inter int,
tar_llamada_entra_nal int,
tar_llamada_sale_nal int,
tar_datos_recibidos int,
tar_datos_enviados int);


DROP TABLE correos CASCADE;
CREATE TABLE correos (
email varchar(100) PRIMARY KEY,
id_abonado varchar(100),
FOREIGN KEY(id_abonado) REFERENCES abonado(id));


DROP TABLE cia_local CASCADE;
CREATE TABLE cia_local (
id varchar(100) PRIMARY KEY,
nombre varchar(100));


DROP TABLE prepago CASCADE;
CREATE TABLE prepago (
cod_plan varchar(100) PRIMARY KEY,
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE promocion CASCADE;
CREATE TABLE promocion (
nombre varchar(100) PRIMARY KEY,
descripcion varchar(100),
cod_plan varchar(100),
FOREIGN KEY(cod_plan) REFERENCES prepago(cod_plan));


DROP TABLE simcard CASCADE;
CREATE TABLE simcard (
codigo varchar(100) PRIMARY KEY,
num_telefono varchar(100),
activacion_internet varchar(100),
bloqueado_por_robo varchar(100),
activacion_correo varchar(100),
autorizacion_roaming varchar(100));

DROP SEQUENCE recarga_seq CASCADE;
CREATE SEQUENCE recarga_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

DROP TABLE recarga CASCADE;
CREATE TABLE recarga (
num_recarga int PRIMARY KEY,
valor int,
fecha Date,
medio_recarga varchar(100),
simcard varchar(100),
FOREIGN KEY(simcard) REFERENCES simcard(codigo));


DROP TABLE mensaje_entrante_roaming CASCADE;
CREATE TABLE mensaje_entrante_roaming (
simcard varchar(100),
fecha Date,
hora time,
cia_internacional varchar(100),
tel_origen varchar(100),
PRIMARY KEY(simcard, hora, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE mensaje_saliente_roaming CASCADE;
CREATE TABLE mensaje_saliente_roaming (
simcard varchar(100),
fecha Date,
hora time,
cia_internacional varchar(100),
tel_destino varchar(100),
PRIMARY KEY(simcard, hora, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE llamada_entrante_roaming CASCADE;
CREATE TABLE llamada_entrante_roaming (
simcard varchar(100),
fecha Date,
hora_inicio time, -----time (hh:mm:ss)
hora_fin time,
pais_origen varchar(100),
tel_origen varchar(100),
cia_internacional varchar(100),
PRIMARY KEY(simcard, hora_inicio, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE consumo_mensaje CASCADE;
CREATE TABLE consumo_mensaje (
simcard varchar(100),
cia_local varchar(100),
msjs_enviados int,
fecha Date,
hora Time,
PRIMARY KEY(simcard, cia_local, fecha, hora),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_local) REFERENCES cia_local(id));


DROP TABLE llamada CASCADE;
CREATE TABLE llamada (
simcard varchar(100),
hora_inicio time,
fecha Date,
tel_destino varchar(100),
hora_fin time,
cia_local varchar(100),
PRIMARY KEY(simcard, hora_inicio, fecha),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_local) REFERENCES cia_local(id));


DROP TABLE plan_datos CASCADE;
CREATE TABLE plan_datos (
cod_plan_datos varchar(100) PRIMARY KEY,
costo_internet int,
costo_correo int);


DROP TABLE plan_datos_simcard CASCADE;
CREATE TABLE plan_datos_simcard (
simcard varchar(100),
cod_plan_datos varchar(100),
tipo_pago varchar(100),
vol_datos_correo varchar(100),
vol_datos_internet varchar(100),
PRIMARY KEY(simcard, cod_plan_datos),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cod_plan_datos) REFERENCES plan_datos(cod_plan_datos));


DROP TABLE contrato CASCADE;
CREATE TABLE contrato (
id_abonado varchar(100),
id_empleado varchar(100),
cod_plan varchar(100),
simcard varchar(100),
fecha_ingreso Date,
valor int,
PRIMARY KEY(id_abonado, id_empleado, cod_plan, simcard),
FOREIGN KEY(id_abonado) REFERENCES abonado(id),
FOREIGN KEY(id_empleado) REFERENCES empleado(id_empleado),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE llamada_saliente_roaming CASCADE;
CREATE TABLE llamada_saliente_roaming (
simcard varchar(100),
fecha Date,
hora_inicio time,
hora_fin time,
pais_destino varchar(100),
tel_destino varchar(100),
cia_internacional varchar(100),
PRIMARY KEY(simcard, hora_inicio, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE simcard_robo CASCADE;
CREATE TABLE simcard_robo (
simcard varchar(100),
ciudad varchar(100),
fecha Date,
PRIMARY KEY (simcard, fecha),
FOREIGN KEY (simcard) REFERENCES simcard(codigo));




-----------Insert
INSERT INTO plan VALUES('mas 1250',215, 180, 137);
INSERT INTO plan VALUES('sin fin ideal 1460',126, 180, 137);
INSERT INTO plan VALUES('sin fin ideal 2000',121, 180, 137);
INSERT INTO plan VALUES('mas blackberry 210',216, 180, 137);
INSERT INTO plan VALUES('mas blackberry 780',216, 180, 137);
INSERT INTO plan VALUES('bb todo destino 130bb',265, 180, 137);
INSERT INTO plan VALUES('bb todo destino 290bb',190, 180, 137);
INSERT INTO plan VALUES('bbsf 800',132, 180, 137);
INSERT INTO plan VALUES('bbsf 1120',128, 180, 137);

INSERT INTO plan VALUES('12345',750, 350, 100);
INSERT INTO plan VALUES('12354',750, 450, 19);
INSERT INTO plan VALUES('pre123',900, 250, 200);

INSERT INTO postpago VALUES('mas 1250',1250, 115);
INSERT INTO postpago VALUES('sin fin ideal 1460',1460, 126);
INSERT INTO postpago VALUES('sin fin ideal 2000',2000, 121);
INSERT INTO postpago VALUES('mas blackberry 210',210, 235);
INSERT INTO postpago VALUES('mas blackberry 780',780, 116);
INSERT INTO postpago VALUES('bb todo destino 130bb',130, 265);
INSERT INTO postpago VALUES('bb todo destino 290bb',290, 190);
INSERT INTO postpago VALUES('bbsf 800',800, 132);
INSERT INTO postpago VALUES('bbsf 1120',1120, 128);



INSERT INTO postpago VALUES('12345',1000, 550);
INSERT INTO postpago VALUES('12354',560, 450);

INSERT INTO prepago VALUES('pre123');


INSERT INTO equipo VALUES ('245879652114523','MB200','Motorola');
INSERT INTO equipo VALUES ('569874147587745','GalaxyAce','Samsung');
INSERT INTO equipo values ('545478569852136','Xperia','SonyEriccson');
INSERT INTO equipo values ('474578569885475','C3','Nokia');

INSERT INTO equipo VALUES ('85698569','CK 15 txt pro','Sony ericson');
INSERT INTO equipo VALUES ('145678903256458','GT-C3310','Samsung Beat Deluxe');
INSERT INTO equipo VALUES ('336790125689045','GT-P7300','Samsung Galaxy Tab 8.9');
INSERT INTO equipo VALUES ('244490456876267','EX108','Motorola Motokey tm Mini');
INSERT INTO equipo VALUES ('982929498575610','XT300','Motorola spice');
INSERT INTO equipo VALUES ('458677019284752','P970','LG Optimus Black');
INSERT INTO equipo VALUES ('598273451978345','T300','LG Cookie Music');
INSERT INTO equipo VALUES ('183409278456256','Xperia TM mini pro','Sony Ericson');
INSERT INTO equipo VALUES ('250927465731734','Xperia TM Play','Sony Ericson');
INSERT INTO equipo VALUES ('360254398231761','Lumia 710','Nokia');
INSERT INTO equipo VALUES ('800012345443532','C3','Nokia');
INSERT INTO equipo VALUES ('262002452422103','Cuerve 9360','Blackberry');
INSERT INTO equipo VALUES ('201444431030594','Cuerve 9380','Blackberry');
INSERT INTO equipo VALUES ('313578234521349','One Touch 990A','Alcatel');
INSERT INTO equipo VALUES ('679283746510923','One Touch 901A','Alcatel');



INSERT INTO abonado VALUES ('100','Cedula','Juan David','Patino Patino','Cra 50#32-20',
			    'Masculino','Casado','1989-11-11','5','La Base','Cali', 'Individual',
			    '245879652114523');
INSERT INTO abonado VALUES ('101','Cedula','Juan David','Rengifo Diaz','Cra 30#54-21',
			    'Masculino','Soltero','1991-01-05','6', 'Floresta', 'Cali', 'Individual',
			    '569874147587745');
INSERT INTO abonado values ('102','Cedula','Cristian Dario', 'Loaiza Orduz','Calle 12 # 13-41',
                            'Masculino','Soltero','1992-12-06','7', 'Buitrera','Cali','Corporativo',
                            '474578569885475');
INSERT INTO abonado values ('103','Cedula','Camila','Perez Gonzales','Calle 32 # 24-11',
			    'Femenino','Casado','1990-05-28','8','Caney','Cali','Corporativo',
			    '545478569852136');

INSERT INTO sucursal values ('01','Principal','Cali','Cra 5 # 13-20','3801542');

INSERT INTO empleado values ('1000','Andres Martinez','Masculino','Viudo','1970-05-24','2000-10-08',
			    'Tiempo Completo','Vendedor','01');
			 
INSERT INTO simcard VALUES ('112547854125469','3154741365','Si','No','No',
			    'Si');
INSERT INTO simcard VALUES ('154786985414754','3154568745','Si','No','No',
			    'No');
INSERT INTO simcard VALUES ('123541254876523','3154651645','Si','No','No',
			    'Si');
INSERT INTO simcard VALUES ('112547445233469','3203654238','Si','No','Si',
			    'No');


--INSERT INTO contrato VALUES ('100','1000','12345','112547854125469','2012-01-05');	
---INSERT INTO contrato VALUES ('101','1000','pre123','154786985414754','2012-02-15');
--INSERT INTO contrato VALUES ('102','1000','pre123','123541254876523','2012-02-22');
--INSERT INTO contrato VALUES ('103','1000','12354','112547445233469','2012-03-10');	

INSERT INTO cia_internacional VALUES ('1020','London Roaming','England',100,500,400,400,300,150,200);
INSERT INTO cia_internacional VALUES ('1030','Movistar Roaming','Espania',500,400,600,500,200,100,500);
INSERT INTO cia_internacional VALUES ('1040','Claro Roaming','Chile',200,300,400,500,600,700,500);

  

----NUEVOS INSERT

INSERT INTO "public".sucursal (cod_sucursal, nombre, ciudad, direccion, telefono) VALUES ('02', 'Medillin movil', 'Medellin', 'Calle 65 #69-695', '6985695');
INSERT INTO "public".sucursal (cod_sucursal, nombre, ciudad, direccion, telefono) VALUES ('03', 'Bogota movil', 'Bogota', 'Cra 100 #4AN-69', '6985695');
INSERT INTO "public".sucursal (cod_sucursal, nombre, ciudad, direccion, telefono) VALUES ('04', 'CoorpoMovil', 'Cucuta', 'Av 1 # 36-96', '65489654');
INSERT INTO "public".sucursal (cod_sucursal, nombre, ciudad, direccion, telefono) VALUES ('05', 'Telecomunicacion', 'Cali', 'Cr 56 # 11-25', '2759618');


INSERT INTO "public".empleado (id_empleado, nombre, genero, estado_civil, fecha_nacimiento, fecha_ingreso, tipo_contrato, cargo, cod_sucursal) VALUES ('6958695', 'Camilo Hernandez', 'Masculino', 'Casado', '1970-10-21', '2002-10-31', 'Tiempo Completo', 'Gerente', '02');
INSERT INTO "public".empleado (id_empleado, nombre, genero, estado_civil, fecha_nacimiento, fecha_ingreso, tipo_contrato, cargo, cod_sucursal) VALUES ('23023514', 'Gustavo Gutierrez', 'Masculino', 'Union Libre', '1986-03-19', '2009-07-02', 'Medio Tiempo', 'Vendedor', '03');
INSERT INTO "public".empleado (id_empleado, nombre, genero, estado_civil, fecha_nacimiento, fecha_ingreso, tipo_contrato, cargo, cod_sucursal) VALUES ('8465486', 'Johana Urrutia', 'Femenino', 'Soltero', '1992-03-21', '2011-06-30', 'Tiempo Completo', 'Vendedor', '04');
INSERT INTO "public".empleado (id_empleado, nombre, genero, estado_civil, fecha_nacimiento, fecha_ingreso, tipo_contrato, cargo, cod_sucursal) VALUES ('365268', 'Julian Pineda', 'Masculino', 'Casado', '1989-12-21', '2009-09-19', 'Contratista', 'Vendedor', '05');

INSERT INTO "public".abonado (id, tipo_documento, nombres, apellidos, direccion, genero, estado_civil, fecha_nacimiento, comuna, barrio, ciudad, tipo, imei) VALUES ('104', 'Tarjeta de Identidad', 'Paulo', 'Jimenez', 'Carrera 65#-63-65', 'Masculino', 'Soltero', '1995-12-16', '9', 'Bellavista', 'Cali', 'Individual', '201444431030594');
INSERT INTO "public".abonado (id, tipo_documento, nombres, apellidos, direccion, genero, estado_civil, fecha_nacimiento, comuna, barrio, ciudad, tipo, imei) VALUES ('105', 'Cedula', 'Maritza', 'Gomez', 'cr 32 # 643 34', 'Femenino', 'Casado', '1970-01-03', '3', 'Bolivar', 'Bogota', 'Individual', '800012345443532');

INSERT INTO "public".plan (cod_plan, tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto) VALUES ('prepago 2012', 600, 300, 150);
INSERT INTO "public".plan (cod_plan, tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto) VALUES ('pre sin fin', 750, 250, 19);

INSERT INTO "public".prepago (cod_plan) VALUES ('prepago 2012');
INSERT INTO "public".prepago (cod_plan) VALUES ('pre sin fin');


INSERT INTO "public".empresa (nombre, telefono, direccion, cod_plan) VALUES ('Ilunimacions S.A.', '4456256', 'Calle 26 # 31-00', 'sin fin ideal 1460');
INSERT INTO "public".empresa (nombre, telefono, direccion, cod_plan) VALUES ('Acarreos Luis ', '6969596', 'Cr 25 # 99-78', 'sin fin ideal 2000');
INSERT INTO "public".empresa (nombre, telefono, direccion, cod_plan) VALUES ('Ruana Verde S.A.', '6693562', 'Calle 3 # 91-58', 'mas blackberry 210');
INSERT INTO "public".empresa (nombre, telefono, direccion, cod_plan) VALUES ('Aluminio', '5568456', 'Av 9 # 66-96', 'mas blackberry 210');

INSERT INTO "public".cia_internacional (id, nombre, pais, tarifa_mensajes, tar_llamada_entra_inter, tar_llamada_sale_inter, tar_llamada_entra_nal, tar_llamada_sale_nal, tar_datos_recibidos, tar_datos_enviados) VALUES ('1050', 'Francia movil', 'Francia', 200, 200, 200, 200, 200, 200, 200);
INSERT INTO "public".cia_internacional (id, nombre, pais, tarifa_mensajes, tar_llamada_entra_inter, tar_llamada_sale_inter, tar_llamada_entra_nal, tar_llamada_sale_nal, tar_datos_recibidos, tar_datos_enviados) VALUES ('1070', 'EE UU movil', 'EE UU', 150, 150, 150, 150, 150, 150, 150);
INSERT INTO "public".cia_internacional (id, nombre, pais, tarifa_mensajes, tar_llamada_entra_inter, tar_llamada_sale_inter, tar_llamada_entra_nal, tar_llamada_sale_nal, tar_datos_recibidos, tar_datos_enviados) VALUES ('1060', 'Argen Claro', 'Argentina', 200, 200, 200, 200, 200, 200, 200);


INSERT INTO "public".correos (email, id_abonado) VALUES ('juan@gmail.com', '100');
INSERT INTO "public".correos (email, id_abonado) VALUES ('Cristian@yahoo.com', '102');
INSERT INTO "public".correos (email, id_abonado) VALUES ('cristian@hotmail.com', '102');
INSERT INTO "public".correos (email, id_abonado) VALUES ('juandap@gmail.com', '100');


INSERT INTO "public".cia_local (id, nombre) VALUES ('315', 'Movistar');
INSERT INTO "public".cia_local (id, nombre) VALUES ('300', 'Tigo');
INSERT INTO "public".cia_local (id, nombre) VALUES ('310', 'Claro');


INSERT INTO "public".recarga (num_recarga, valor, fecha, medio_recarga, simcard) VALUES (10, 20000, '2012-07-01', 'Internet', '112547445233469');
INSERT INTO "public".recarga (num_recarga, valor, fecha, medio_recarga, simcard) VALUES (12, 50000, '2012-07-01', 'Tarjeta', '112547445233469');

INSERT INTO "public".llamada_entrante_roaming (simcard, fecha, hora_inicio, hora_fin, pais_origen, tel_origen, cia_internacional) VALUES ('112547854125469', '2012-07-02', '20:55:49', '20:55:49', 'Inglaterra', '12312312', '1020');
INSERT INTO "public".llamada_entrante_roaming (simcard, fecha, hora_inicio, hora_fin, pais_origen, tel_origen, cia_internacional) VALUES ('123541254876523', '2012-07-02', '20:58:21', '20:58:21', 'Espana', '3123123', '1030');

INSERT INTO "public".llamada_saliente_roaming (simcard, fecha, hora_inicio, hora_fin, pais_destino, tel_destino, cia_internacional) VALUES ('112547854125469', '2012-07-02', '20:55:21', '20:55:21', 'Inglaterra', '1313', '1020');
INSERT INTO "public".llamada_saliente_roaming (simcard, fecha, hora_inicio, hora_fin, pais_destino, tel_destino, cia_internacional) VALUES ('123541254876523', '2012-07-02', '20:57:05', '20:57:05', 'España', '132123', '1030');

INSERT INTO "public".mensaje_entrante_roaming (simcard, fecha, hora, cia_internacional, tel_origen) VALUES ('112547854125469', '2012-07-02', '20:55:11', '1020', '1313');
INSERT INTO "public".mensaje_entrante_roaming (simcard, fecha, hora, cia_internacional, tel_origen) VALUES ('123541254876523', '2012-07-02', '20:56:58', '1030', '1323123');

INSERT INTO "public".mensaje_saliente_roaming (simcard, fecha, hora, cia_internacional, tel_destino) VALUES ('112547854125469', '2012-07-02', '20:55:01', '1020', '123123');
INSERT INTO "public".mensaje_saliente_roaming (simcard, fecha, hora, cia_internacional, tel_destino) VALUES ('123541254876523', '2012-07-02', '20:56:51', '1030', '412312');
 
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('100', '1000', '12345', '112547854125469', '2012-01-05', 60000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('101', '1000', 'pre123', '154786985414754', '2012-02-15', 69000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('102', '1000', 'pre123', '123541254876523', '2012-02-22', 50000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('103', '1000', '12354', '112547445233469', '2012-03-10', 25000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('100', '1000', 'sin fin ideal 2000', '112547854125469', '2012-07-02', 58000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('101', '6958695', 'mas blackberry 210', '154786985414754', '2012-07-02', 120000);
INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('102', '6958695', 'mas blackberry 210', '123541254876523', '2012-07-02', 55000);


INSERT INTO "public".llamada (simcard, hora_inicio, fecha, tel_destino, hora_fin, cia_local) VALUES ('112547854125469', '21:44:49', '2012-07-02', '123123123', '21:55:49', '310');
INSERT INTO "public".llamada (simcard, hora_inicio, fecha, tel_destino, hora_fin, cia_local) VALUES ('112547854125469', '21:58:11', '2012-07-02', '1312312', '21:59:11', '310');

INSERT INTO "public".consumo_mensaje (simcard, cia_local, msjs_enviados, fecha, hora) VALUES ('112547854125469', '310', 2, '2012-07-02', '21:45:35');
INSERT INTO "public".consumo_mensaje (simcard, cia_local, msjs_enviados, fecha, hora) VALUES ('112547854125469', '300', 3, '2012-07-02', '21:45:49');

INSERT INTO "public".simcard (codigo, num_telefono, activacion_internet, bloqueado_por_robo, activacion_correo, autorizacion_roaming) VALUES ('2365214', '3156986593', 'No', 'Si', 'Si', 'Si');

INSERT INTO "public".simcard_robo (simcard, ciudad, fecha) VALUES ('2365214', 'Cali', '2012-07-02');

--INSERT INTO "public".simcard (codigo, num_telefono, activacion_internet, bloqueado_por_robo, activacion_correo, autorizacion_roaming) VALUES ('2365214', '3156986593', 'No', 'Si', 'Si', 'Si');

INSERT INTO "public".contrato (id_abonado, id_empleado, cod_plan, simcard, fecha_ingreso, valor) VALUES ('102', '23023514', 'mas blackberry 210', '2365214', '2012-07-03', 29000);

INSERT INTO "public".consumo_mensaje (simcard, cia_local, msjs_enviados, fecha, hora) VALUES ('2365214', '300', 2, '2012-07-03', '00:25:39');

INSERT INTO "public".llamada (simcard, hora_inicio, fecha, tel_destino, hora_fin, cia_local) VALUES ('2365214', '00:25:21', '2012-07-03', '13123', '00:29:21', '300');

DISTINCT 