CREATE TABLE zaasmis.dbo.QX (
  QUANX_ID NUMERIC(19) PRIMARY KEY NOT NULL,
  QUANXBH VARCHAR(20),
  QUANXMC VARCHAR(50),
  MOK_ID NUMERIC(19) NOT NULL,
  SHIFKXG VARCHAR(10),
  JUES_ID NUMERIC(19),
  QUANXSM VARCHAR(200),
  JILCJZ NUMERIC(19) NOT NULL,
  JILCJSJ DATETIME NOT NULL,
  JILXGZ NUMERIC(19) NOT NULL,
  JILXGSJ DATETIME NOT NULL,
  YONGH_ID NUMERIC(19),
  JUESJB NUMERIC(19),
  FOREIGN KEY (JUES_ID) REFERENCES JS (JUES_ID),
  FOREIGN KEY (MOK_ID) REFERENCES XTMK (MOK_ID),
  FOREIGN KEY (YONGH_ID) REFERENCES XTYH (YONGH_ID)
);


INSERT INTO zaasmis.dbo.QX (QUANXBH, QUANXMC, MOK_ID, SHIFKXG, JUES_ID, QUANXSM, JILCJZ, JILCJSJ, JILXGZ, JILXGSJ, YONGH_ID, JUESJB) VALUES ('', '人员信息管理系统', 300, 'N', null, '', 558, '2016-03-10 14:41:00.770', 558, '2016-03-10 14:41:00.770', 558, 60);
INSERT INTO zaasmis.dbo.QX (QUANXBH, QUANXMC, MOK_ID, SHIFKXG, JUES_ID, QUANXSM, JILCJZ, JILCJSJ, JILXGZ, JILXGSJ, YONGH_ID, JUESJB) VALUES ('', '2015博士后', 326, 'Y', null, '', 558, '2016-05-04 15:34:32.200', 558, '2016-05-04 15:34:32.200', null, 60);
INSERT INTO zaasmis.dbo.QX (QUANXBH, QUANXMC, MOK_ID, SHIFKXG, JUES_ID, QUANXSM, JILCJZ, JILCJSJ, JILXGZ, JILXGSJ, YONGH_ID, JUESJB) VALUES ('', '2015一导研究生', 327, 'Y', null, '', 558, '2016-05-04 15:48:27.147', 558, '2016-05-04 15:48:27.147', 1612, 60);
INSERT INTO zaasmis.dbo.QX (QUANXBH, QUANXMC, MOK_ID, SHIFKXG, JUES_ID, QUANXSM, JILCJZ, JILCJSJ, JILXGZ, JILXGSJ, YONGH_ID, JUESJB) VALUES ('', '2015博士后', 326, 'Y', null, '', 558, '2016-05-12 14:54:02.260', 558, '2016-05-12 14:54:02.260', 1264, 40);