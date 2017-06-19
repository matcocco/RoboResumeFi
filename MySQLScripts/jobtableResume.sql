CREATE TABLE `Resume`.`jobtable` (
  `idjobtable` INT NOT NULL AUTO_INCREMENT,
  `startdate` DATETIME NULL,
  `enddate` DATETIME NULL,
  `duties` BLOB NULL,
  `idpersontable` INT,
  PRIMARY KEY (`idjobtable`));
