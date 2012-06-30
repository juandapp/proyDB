-----ENTREGA 2 DEL PROYECTO
-----Juan David Rengifo 0939879
-----Juan David Pati�o 0932180
-----Cristian Dario Loaiza 0933174

-----CREACION DE TABLAS

DROP TABLE sucursal CASCADE;
CREATE TABLE sucursal (
cod_sucursal varchar(10) PRIMARY KEY,
nombre varchar(20),
ciudad varchar(15),
direccion varchar(50),
telefono varchar(10));


DROP TABLE empleado CASCADE;
CREATE TABLE empleado (
id_empleado varchar(10) PRIMARY KEY,
nombre varchar(20),
genero varchar(10),
estado_civil varchar(12),
fecha_nacimiento Date,
fecha_ingreso Date,
tipo_contrato varchar(15),
cargo varchar(15),
cod_sucursal varchar(10),
FOREIGN KEY(cod_sucursal) REFERENCES sucursal(cod_sucursal));


DROP TABLE equipo CASCADE;
CREATE TABLE equipo (
imei varchar(20) PRIMARY KEY,
modelo varchar(15),
marca varchar(15));


DROP TABLE abonado CASCADE;
CREATE TABLE abonado (
id varchar(10) PRIMARY KEY,
tipo_documento varchar(100),
nombres varchar(20),
apellidos varchar(20),
direccion varchar(50),
genero varchar(10),
estado_civil varchar(10),
fecha_nacimiento Date,
comuna varchar(5),
barrio varchar(10),
ciudad varchar(15),
tipo varchar(20),
imei varchar(20),
FOREIGN KEY(imei) REFERENCES equipo(imei));


DROP TABLE plan CASCADE;
CREATE TABLE plan (
cod_plan varchar(10) PRIMARY KEY,
tarifa_otro_operador int,
tarifa_msj_multimedia int,
tarifa_msj_texto int);


DROP TABLE postpago CASCADE;
CREATE TABLE postpago (
cod_plan varchar(10) PRIMARY KEY,
total_minutos int,
costo_min_adicional int,
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE empresa CASCADE;
CREATE TABLE empresa (
nombre varchar(15) PRIMARY KEY,
telefono varchar(10),
direccion varchar(50),
cod_plan varchar(10),
FOREIGN KEY(cod_plan) REFERENCES postpago(cod_plan));


DROP TABLE cia_internacional CASCADE;
CREATE TABLE cia_internacional (
id varchar(10) PRIMARY KEY,
nombre varchar(15),
pais varchar(15),
tarifa_mensajes int,
tar_llamada_entra_inter int,
tar_llamada_sale_inter int,
tar_llamada_entra_nal int,
tar_llamada_sale_nal int,
tar_datos_recibidos int,
tar_datos_enviados int);


DROP TABLE correos CASCADE;
CREATE TABLE correos (
email varchar(20) PRIMARY KEY,
id_abonado varchar(10),
FOREIGN KEY(id_abonado) REFERENCES abonado(id));


DROP TABLE cia_local CASCADE;
CREATE TABLE cia_local (
id varchar(10) PRIMARY KEY,
nombre varchar(10));


DROP TABLE prepago CASCADE;
CREATE TABLE prepago (
cod_plan varchar(10) PRIMARY KEY,
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE promocion CASCADE;
CREATE TABLE promocion (
nombre varchar(10) PRIMARY KEY,
descripcion varchar(70),
cod_plan varchar(10),
FOREIGN KEY(cod_plan) REFERENCES prepago(cod_plan));


DROP TABLE simcard CASCADE;
CREATE TABLE simcard (
codigo varchar(15) PRIMARY KEY,
num_telefono varchar(15),
activacion_internet varchar(15),
bloqueado_por_robo varchar(15),
activacion_correo varchar(15),
autorizacion_roaming varchar(15));

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
medio_recarga varchar(15),
simcard varchar(15),
FOREIGN KEY(simcard) REFERENCES simcard(codigo));


DROP TABLE mensaje_entrante_roaming CASCADE;
CREATE TABLE mensaje_entrante_roaming (
simcard varchar(15),
fecha Date,
hora time,
cia_internacional varchar(10),
tel_origen varchar(10),
PRIMARY KEY(simcard, hora, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE mensaje_saliente_roaming CASCADE;
CREATE TABLE mensaje_saliente_roaming (
simcard varchar(15),
fecha Date,
hora time,
cia_internacional varchar(10),
tel_destino varchar(10),
PRIMARY KEY(simcard, hora, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE llamada_entrante_roaming CASCADE;
CREATE TABLE llamada_entrante_roaming (
simcard varchar(15),
hora_inicio time, -----time (hh:mm:ss)
fecha Date,
cia_internacional varchar(10),
pais_origen varchar(15),
tel_origen varchar(15),
hora_fin time,
PRIMARY KEY(simcard, hora_inicio, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));


DROP TABLE consumo_mensaje CASCADE;
CREATE TABLE consumo_mensaje (
simcard varchar(15),
cia_local varchar(10),
msjs_enviados int,
fecha Date,
hora Time,
PRIMARY KEY(simcard, cia_local, fecha, hora),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_local) REFERENCES cia_local(id));


DROP TABLE llamada CASCADE;
CREATE TABLE llamada (
simcard varchar(15),
hora_inicio time,
fecha Date,
tel_destino varchar(10),
hora_fin time,
cia_local varchar(10),
PRIMARY KEY(simcard, hora_inicio, fecha),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_local) REFERENCES cia_local(id));


DROP TABLE plan_datos CASCADE;
CREATE TABLE plan_datos (
cod_plan_datos varchar(10) PRIMARY KEY,
costo_internet int,
costo_correo int);


DROP TABLE plan_datos_simcard CASCADE;
CREATE TABLE plan_datos_simcard (
simcard varchar(15),
cod_plan_datos varchar(10),
tipo_pago varchar(10),
vol_datos_correo varchar(10),
vol_datos_internet varchar(10),
PRIMARY KEY(simcard, cod_plan_datos),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cod_plan_datos) REFERENCES plan_datos(cod_plan_datos));


DROP TABLE contrato CASCADE;
CREATE TABLE contrato (
id_abonado varchar(10),
id_empleado varchar(10),
cod_plan varchar(10),
simcard varchar(15),
fecha_ingreso Date,
PRIMARY KEY(id_abonado, id_empleado, cod_plan, simcard),
FOREIGN KEY(id_abonado) REFERENCES abonado(id),
FOREIGN KEY(id_empleado) REFERENCES empleado(id_empleado),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cod_plan) REFERENCES plan(cod_plan));


DROP TABLE llamada_saliente_roaming CASCADE;
CREATE TABLE llamada_saliente_roaming (
simcard varchar(15),
fecha Date,
hora_inicio time,
hora_fin time,
pais_destino varchar(15),
tel_destino varchar(15),
cia_internacional varchar(10),
PRIMARY KEY(simcard, hora_inicio, fecha, cia_internacional),
FOREIGN KEY(simcard) REFERENCES simcard(codigo),
FOREIGN KEY(cia_internacional) REFERENCES cia_internacional(id));





-----------Insert
INSERT INTO plan VALUES('12345',750, 350, 100);
INSERT INTO plan VALUES('12354',750, 450, 19);
INSERT INTO plan VALUES('pre123',900, 250, 200);

INSERT INTO postpago VALUES('12345',1000, 550);
INSERT INTO postpago VALUES('12354',560, 450);

INSERT INTO prepago VALUES('pre123');


INSERT INTO equipo VALUES ('245879652114523','MB200','Motorola');
INSERT INTO equipo VALUES ('569874147587745','GalaxyAce','Samsung');
INSERT INTO equipo values ('545478569852136','Xperia','SonyEriccson');
INSERT INTO equipo values ('474578569885475','C3','Nokia');

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


  