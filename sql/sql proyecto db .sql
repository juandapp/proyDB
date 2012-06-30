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
num_recarga integer DEFAULT nextval('recarga_seq'::regclass) NOT NULL,
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
hora_inicio time, -----time (hh:mm:ss)
fecha Date,
cia_internacional varchar(100),
pais_origen varchar(100),
tel_origen varchar(100),
hora_fin time,
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



INSERT INTO abonado VALUES ('100','Cedula','Juan David','Pati�o Pati�o','Cra 50#32-20',
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
			    'No');
INSERT INTO simcard VALUES ('154786985414754','3154568745','Si','No','No',
			    'No');
INSERT INTO simcard VALUES ('123541254876523','3154651645','Si','No','No',
			    'Si');
INSERT INTO simcard VALUES ('112547445233469','3203654238','Si','No','Si',
			    'No');


INSERT INTO contrato VALUES ('100','1000','12345','112547854125469','2012-01-05');	
INSERT INTO contrato VALUES ('101','1000','pre123','154786985414754','2012-02-15');
INSERT INTO contrato VALUES ('102','1000','pre123','123541254876523','2012-02-22');
INSERT INTO contrato VALUES ('103','1000','12354','112547445233469','2012-03-10');	


  