USE sqldb;
SELECT * FROM usertbl;
SHOW INDEX FROM usertbl;
SHOW TABLE STATUS LIKE 'usertbl';

CREATE INDEX idx_usertbl_addr ON usertbl(addr);
SHOW INDEX FROM usertbl;


SHOW TABLE STATUS LIKE 'usertbl';
ANALYZE TABLE usertbl;
SHOW TABLE STATUS LIKE 'usertbl';



CREATE UNIQUE INDEX idx_usertbl_birthYear ON usertbl(birthYear);
-- 중복값

CREATE UNIQUE INDEX idx_usertbl_name ON usertbl(name);


SHOW INDEX FROM usertbl;


DROP INDEX idx_usertbl_name ON usertbl;

CREATE UNIQUE INDEX idx_usertbl_name_birthYear ON usertbl(name, birthYear);

SHOW INDEX FROM usertbl;


SHOW INDEX FROM usertbl;

DROP INDEX idx_usertbl_addr ON usertbl;
DROP INDEX idx_usertbl_name_birthYear ON usertbl;

SHOW INDEX FROM usertbl;

CREATE DATABASE scoula_db;

CREATE USER 'scoula'@'%' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON scoula_db.* TO 'scoula'@'%';

FLUSH PRIVILEGES;
