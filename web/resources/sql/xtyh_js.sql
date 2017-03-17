CREATE TABLE zaasmis.dbo.XTYH_JS (
  JUES_ID NUMERIC(19) NOT NULL,
  YONGH_ID NUMERIC(19) NOT NULL,
  PRIMARY KEY (JUES_ID, YONGH_ID),
  FOREIGN KEY (JUES_ID) REFERENCES JS (JUES_ID),
  FOREIGN KEY (YONGH_ID) REFERENCES XTYH (YONGH_ID)
);

INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1420);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1421);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1422);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1423);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1424);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1425);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1426);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1427);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1428);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1429);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1430);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1431);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1432);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (28, 1612);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 1812);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 2295);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 2296);
INSERT INTO zaasmis.dbo.XTYH_JS (JUES_ID, YONGH_ID) VALUES (10, 2305);