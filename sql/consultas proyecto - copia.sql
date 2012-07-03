--Clientes por mes y por tipo 
SELECT
nombres,apellidos,direccion,ciudad,cod_plan,extract(MONTH FROM fecha_ingreso) AS mes,tipo
FROM contrato JOIN abonado ON id=id_abonado ORDER BY MONTH(fecha_ingreso);

--Franjas mayor uso de la red
CREATE OR REPLACE VIEW vista_franja AS
SELECT extract(HOUR from hora_inicio)AS franja_horaria FROM llamada
UNION ALL
SELECT extract(HOUR from hora_fin)AS franja_horaria FROM llamada 
;

SELECT franja_horaria,count(*) AS veces_usada 
FROM vista_franja 
GROUP BY franja_horaria
ORDER BY veces_usada  DESC
;

--Listado Usuarios que contratan plan de Datos
--y Consumo Mensual
SELECT id,nombres,apellidos,cod_plan_datos,costo_correo,costo_internet,
vol_datos_correo,vol_datos_internet
FROM abonado JOIN contrato NATURAL JOIN plan_datos_simcard NATURAL JOIN plan_datos
WHERE id=id_abonado ORDER BY id;


--Planes mas escogidos
SELECT 
COUNT(cod_plan) AS suscriptores,cod_plan
FROM contrato NATURAL JOIN plan
GROUP BY cod_plan ORDER BY suscriptores DESC; 




---Clientes Postpago
SELECT id,nombres,apellidos,direccion,ciudad,cod_plan,simcard,fecha_ingreso 
FROM abonado join contrato 
where id=id_abonado and cod_plan IN (SELECT cod_plan from postpago);



---Clientes Prepago
SELECT id,nombres,apellidos,direccion,ciudad,cod_plan,simcard,fecha_ingreso 
FROM abonado join contrato 
where id=id_abonado and cod_plan IN (SELECT cod_plan from prepago);




--Operadores extranjeros que ofrecen tarifa de roamming
SELECT
*
FROM cia_internacional;




--Operadores nacionales mas frecuentemente utilzados
SELECT cia_local,COUNT(cia_local) AS veces_utilizado
FROM llamada GROUP BY cia_local;




--Planes preferidos por usuarios de convenios corporativos
SELECT cod_plan AS codigo_plan_corporativo,COUNT(cod_plan) 
AS suscriptores FROM abonado JOIN contrato WHERE
id=id_abonado AND tipo='corporativo' 
GROUP BY cod_plan ORDER BY suscriptores DESC;



--Consumo servicios de mensaje,internet,correo electronico
--por region y por genero.
--Internet y Correo
SELECT id,genero,ciudad,cod_plan_datos,vol_datos_correo,vol_datos_internet
FROM abonado JOIN contrato NATURAL JOIN plan_datos_simcard
WHERE id=id_abonado ORDER BY genero;

--Mensajes
SELECT id,genero,ciudad,cia_local,fecha,hora,msjs_enviados
FROM abonado JOIN contrato NATURAL JOIN consumo_mensaje
WHERE id=id_abonado ORDER BY genero;




--Estadisitcas de robos y perdidas por mes y ciudad
SELECT fecha,ciudad 
FROM simcard_robo;


--Oficinas que mas facturan por mes
CREATE OR REPLACE VIEW sucursal_empleado AS
SELECT id_empleado AS id,s.nombre AS nombre_sucursal,s.cod_sucursal
from (empleado e JOIN sucursal s) 
WHERE e.cod_sucursal=s.cod_sucursal 
;

SELECT cod_sucursal,nombre_sucursal,SUM(costo_plan) AS Facturacion
FROM (sucursal_empleado JOIN contrato) NATURAL JOIN postpago
WHERE id=id_empleado
GROUP BY cod_sucursal;


--Consumo por tipo de abonado
CREATE OR REPLACE VIEW datos_consumo AS
SELECT id,nombres,apellidos,tipo,cod_plan,simcard
FROM abonado JOIN contrato
WHERE id=id_abonado;


--Consumo Llamada
SELECT id,tipo,nombres,apellidos,simcard,cia_local,hora_inicio,hora_fin
FROM datos_consumo NATURAL JOIN llamada
ORDER BY tipo;


--Consumo Mensaje
SELECT id,tipo,nombres,apellidos,simcard,msjs_enviados,cia_local,fecha,hora
FROM datos_consumo NATURAL JOIN consumo_mensaje
ORDER BY tipo;







--Equipos mas demandados
SELECT modelo,marca,COUNT(modelo) AS cantidad
FROM equipo NATURAL JOIN abonado
GROUP BY modelo ORDER BY cantidad DESC;


