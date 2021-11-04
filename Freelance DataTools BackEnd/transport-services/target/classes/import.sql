INSERT INTO TBL_CLASIFICACION VALUES (1, 'EMPRESA', 'TIPO_USUARIO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (2, 'REPRESENTANTE LEGAL', 'TIPO_USUARIO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (3, 'CONDUCTOR', 'TIPO_USUARIO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (4, 'CC', 'TIPO_DOCUMENTO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (5, 'CE', 'TIPO_DOCUMENTO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (6, 'NIT', 'TIPO_DOCUMENTO', 1);
INSERT INTO TBL_CLASIFICACION VALUES (7, 'OTRO', 'TIPO_DOCUMENTO', 1);

INSERT INTO TBL_PAIS VALUES(1, 'COLOMBIA', NULL, 1);
INSERT INTO TBL_PAIS VALUES(2, 'CUNDINAMARCA', 1, 1);
INSERT INTO TBL_PAIS VALUES(3, 'BOGOTA D.C', 2, 1);
INSERT INTO TBL_PAIS VALUES(4, 'ANTIOQUIA', 1, 1);
INSERT INTO TBL_PAIS VALUES(5, 'MEDELLIN', 4, 1);

-- EMPRESA
INSERT INTO TBL_USUARIO VALUES (1, '992345789-3', 'PATRICK S.A.', 'CALLE 1 # 45 - 34', 5, '7654321', 6, 1);

-- REPRESENTANTE LEGAL
INSERT INTO TBL_USUARIO VALUES (2, '234567876', 'PATRICIO SANCHEZ', 'CARRERA 12 # 12 - 87', 5, '9237345', 5, 2);

-- CONDUCTOR
INSERT INTO TBL_USUARIO VALUES (3, '987654322', 'PATRICIA GONZALEZ', 'TRANSV 5 # 76 - 39', 5, '7125372', 4, 3);
INSERT INTO TBL_USUARIO VALUES (4, '23523523', 'DANNA LOPEZ', 'TRANSV 6 # 96 - 93', 3, '7125372', 4, 3);
INSERT INTO TBL_USUARIO VALUES (5, '76585464', 'ANGELA RIOS', 'CALLE 6 # 96 - 93', 3, '7456321', 4, 3);


INSERT INTO tbl_vehiculo VALUES ('1', 'CARRO UNO', 'ERT-234', 'WRT345', '234SFD', '2021', '2021-03-03', '5', '0', '3000', '2500', '4', 'RENAULT', 'PARTICULAR');
INSERT INTO tbl_vehiculo VALUES ('2', 'CARRO DOS', 'IJH-854', 'UGHDS345', '234SFD', '2019', '2019-03-03', '6', '0', '3000', '2500', '4', 'SUBARU', 'PUBLICO');
INSERT INTO tbl_vehiculo VALUES ('3', 'CARRO TRES', 'LEW-714', 'BNDF123', '234SFD', '2012', '2012-03-03', '4', '0', '3000', '2500', '4', 'CHEVROLET', 'PUBLICO');
INSERT INTO tbl_vehiculo VALUES ('4', 'CAMION', 'TRD-904', 'WDN735', '234SFD', '2017', '2017-03-03', '4', '1', '15000', '12500', '4', 'KIA', 'PARTICULAR');
INSERT INTO tbl_vehiculo VALUES ('5', 'BUS', 'ZQW-216', 'OYG0932', '234SFD', '2020', '2020-03-03', '35', '20', '13000', '11000', '4', 'VOLKSWAGEN', 'PARTICULAR');



