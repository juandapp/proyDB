
---Clientes nuevos por mes y por tipo
SELECT a.nombres,a.tipo, c.fecha_ingreso FROM abonado a JOIN contrato c ON id_abonado=id;

---usuarios de planes prepago registrados
SELECT id_abonado, pre.cod_plan FROM contrato NATURAL JOIN prepago pre;

----usuarios de planes postpago
SELECT id_abonado, p.cod_plan FROM contrato NATURAL JOIN postpago p;

---Equipos más demandados (todos los comprados)
SELECT modelo, marca FROM equipo NATURAL JOIN abonado;