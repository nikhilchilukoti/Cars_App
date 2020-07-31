-- -----------------------------------------------------
-- Table carsvendor
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `carsvendor` ;
USE `carsvendor` ;

-- -----------------------------------------------------
-- Table `carsvendor`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`role` (
  `ro_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ro_type` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ro_id`));

INSERT INTO `carsvendor`.`role` (`ro_id`, `ro_type`) VALUES ('1', 'ADMIN');
INSERT INTO `carsvendor`.`role` (`ro_id`, `ro_type`) VALUES ('2', 'USER');

-- -----------------------------------------------------
-- Table `carsvendor`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`user` (
  `us_id` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `us_name` VARCHAR(75) NULL DEFAULT NULL,
  `us_password` VARCHAR(255) NULL DEFAULT NULL,
  `us_email` VARCHAR(50) NULL DEFAULT NULL,
  `us_mobile_number` VARCHAR(45) NULL DEFAULT NULL,
  `us_confirmed` TINYINT(1) NULL DEFAULT NULL,
  `us_ro_id` INT(11) NOT NULL,
  PRIMARY KEY (`us_id`, `us_ro_id`),
  UNIQUE INDEX `us_name_UNIQUE` (`us_name` ASC) VISIBLE,
  INDEX `fk_user_role_idx` (`us_ro_id` ASC) VISIBLE,
    FOREIGN KEY (`us_ro_id`) REFERENCES `carsvendor`.`role` (`ro_id`));
    
INSERT INTO `carsvendor`.`user` (`us_id`, `us_name`, `us_password`, `us_email`, `us_mobile_number`, `us_confirmed`, `us_ro_id`)
VALUES ('1', 'admin', '$2a$10$SZ/GoSeV/wluF6AfG2VXB.Q2AYlLBxYc8sbSS/9nFfkfVv/U3Odtm', 'admin@gmail.com', '9876543210', 1, 1);
INSERT INTO `carsvendor`.`user` (`us_id`, `us_name`, `us_password`, `us_email`, `us_mobile_number`, `us_confirmed`, `us_ro_id`)
VALUES(3,'user','$2a$10$SZ/GoSeV/wluF6AfG2VXB.Q2AYlLBxYc8sbSS/9nFfkfVv/U3Odtm','user@gmail.com','7896587456',1,2);

-- -----------------------------------------------------
-- Table `carsvendor`.`carseries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`carseries` (
  `carseries_id` BIGINT(20) NOT NULL,
  `carseries_name` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`carseries_id`));

INSERT INTO `carsvendor`.`carseries`(`carseries_id`,`carseries_name`) values
('1','BENZ'),
('2','BMW'),
('3','AUDI');

-- -----------------------------------------------------
-- Table `carsvendor`.`carmodel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`carmodel` (
  `carmodel_id` BIGINT(20) NOT NULL,
  `carmodel_name` VARCHAR(20) NULL DEFAULT NULL,
  `carmodel_price` BIGINT(20) NOT NULL,
  PRIMARY KEY (`carmodel_id`));

INSERT INTO `carsvendor`.`carmodel`(`carmodel_id`,`carmodel_name`,`carmodel_price`) values
(1,'Benz-1',123),(2,'Benz-2',143),(3,'Benz-3',343),
(4,'Bmw-1',765),(5,'Bmw-2',8789),(6,'Bmw-3',9487),
(7,'Audi-1',567),(8,'Audi-2',867),(9,'Audi-3',9789);

-- -----------------------------------------------------
-- Table `carsvendor`.`accessories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`accessories` (
  `accessories_id` BIGINT(20) NOT NULL,
  `accessories_name` VARCHAR(20) NULL DEFAULT NULL,
  `accessories_price` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`accessories_id`)) ;

INSERT INTO `carsvendor`.`accessories`(`accessories_id`,`accessories_name`,`accessories_price`) values
('1','a1','3243'),('2','a2','3233'),('3','a3','5422'),
('4','b1','45'),('5','b2','545'),('6','b3','56'),
('7','c1','232'),('8','c2','565'),('9','c3','213'),

('10','d1','3243'),('11','d2','3233'),('12','d3','5422'),
('13','e1','45'),('14','e2','545'),('15','e3','56'),
('16','f1','232'),('17','f2','565'),('18','f3','213'),

('19','g1','3243'),('20','h2','3233'),('21','h3','5422'),
('22','h1','45'),('23','h2','545'),('24','h3','56'),
('25','i1','232'),('26','i2','565'),('27','i3','213');


-- -----------------------------------------------------
-- Table `carsvendor`.`colors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`colors` (
  `colors_id` BIGINT(20) NOT NULL,
  `colors_name` VARCHAR(20) NULL DEFAULT NULL,
  `colors_price` BIGINT(20) NULL DEFAULT NULL,
  `colors_quantity` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`colors_id`)) ;

INSERT INTO `carsvendor`.`colors`(`colors_id`,`colors_name`,`colors_price`,`colors_quantity`) values
(1,"red",123,0),(2,"blue",343,0),(3,"green",987,0),(4,"black",987,0),(5,"indigo",987,0),(6,"grey",987,0),(7,"red",987,0),(8,"orange",987,0),(9,"yellow",987,0),
(10,"green",123,0),(11,"blue",343,0),(12,"red",987,0),(13,"cyan",987,0),(14,"white",987,0),(15,"gold",987,0),(16,"violet",987,0),(17,"brown",987,0),(18,"blue",987,0),
(19,"green",123,0),(20,"blue",343,0),(21,"red",987,0),(22,"purple",987,0),(23,"silver",987,0),(24,"black",987,0),(25,"green",987,0),(26,"orange",987,0),(27,"d3",987,0);


-- -----------------------------------------------------
-- Table `carsvendor`.`carseriesmodel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`carseriesmodel` (
  `carseriesmodel_id` BIGINT(20) NOT NULL,
  `carseries_id` BIGINT(20) NOT NULL,
  `carmodel_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`carseriesmodel_id`),
  FOREIGN KEY (`carseries_id`) 
  REFERENCES `carsvendor`.`carseries` (`carseries_id`),
  FOREIGN KEY (`carmodel_id`) 
  REFERENCES `carsvendor`.`carmodel` (`carmodel_id`));

INSERT INTO `carsvendor`.`carseriesmodel`(`carseriesmodel_id`,`carseries_id`,`carmodel_id`) VALUES
(1,1,1),(2,1,2),(3,1,3),
(4,2,4),(5,2,5),(6,2,6),
(7,3,7),(8,3,8),(9,3,9);

-- -----------------------------------------------------
-- Table `carsvendor`.`carmodelaccessories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`carmodelaccessories` (
  `carmodelaccessories_id` BIGINT(20) NOT NULL,
  `carmodel_id` BIGINT(20) NOT NULL,
  `accessories_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`carmodelaccessories_id`),
  FOREIGN KEY (`carmodel_id`) 
  REFERENCES `carsvendor`.`carmodel` (`carmodel_id`),
  FOREIGN KEY (`accessories_id`) 
  REFERENCES `carsvendor`.`accessories` (`accessories_id`));

INSERT INTO `carsvendor`.`carmodelaccessories`(`carmodelaccessories_id`,`carmodel_id`,`accessories_id`) VALUES
(1,1,1),(2,1,2),(3,1,3),
(4,2,4),(5,2,5),(6,2,6),
(7,3,7),(8,3,8),(9,3,9),

(10,4,10),(11,4,11),(12,4,12),
(13,5,13),(14,5,14),(15,5,15),
(16,6,16),(17,6,17),(18,6,18),

(19,7,19),(20,7,20),(21,7,21),
(22,8,22),(23,8,23),(24,8,24),
(25,9,25),(26,9,26),(27,9,27);

-- -----------------------------------------------------
-- Table `carsvendor`.`carmodelcolors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `carsvendor`.`carmodelcolors` (
  `carmodelcolors_id` BIGINT(20) NOT NULL,
  `carmodel_id` BIGINT(20) NOT NULL,
  `colors_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`carmodelcolors_id`),
  FOREIGN KEY (`carmodel_id`) 
  REFERENCES `carsvendor`.`carmodel` (`carmodel_id`),
  FOREIGN KEY (`colors_id`) 
  REFERENCES `carsvendor`.`colors` (`colors_id`));

INSERT INTO `carsvendor`.`carmodelcolors`(`carmodelcolors_id`,`carmodel_id`,`colors_id`) VALUES
(1,1,1),(2,1,2),(3,1,3),(4,2,4),(5,2,5),(6,2,6),(7,3,7),(8,3,8),(9,3,9),
(10,4,10),(11,4,11),(12,4,12),(13,5,13),(14,5,14),(15,5,15),(16,6,16),(17,6,17),(18,6,18),
(19,7,19),(20,7,20),(21,7,21),(22,8,22),(23,8,23),(24,8,24),(25,9,25),(26,9,26),(27,9,27);


CREATE TABLE IF NOT EXISTS `carsvendor`.`carsorders` (
  `order_id` BIGINT(20) NOT NULL,
  `carseries_id` BIGINT(20) NOT NULL,
  `carmodel_id` BIGINT(20) NOT NULL,
  `total_price` BIGINT(20) NOT NULL,
  PRIMARY KEY (`order_id`),
  FOREIGN KEY (`carseries_id`) 
  REFERENCES `carsvendor`.`carseries` (`carseries_id`),
  FOREIGN KEY (`carmodel_id`) 
  REFERENCES `carsvendor`.`carmodel` (`carmodel_id`));

INSERT INTO `carsvendor`.`carsorders`(`order_id`,`carseries_id`,`carmodel_id`,`total_price`) VALUES
(1,1,1,13242),(2,1,2,1122);






show tables;
select * from user;
select * from accessories;
select * from colors;
select * from carmodel;
select * from carsorders;
SELECT carmodel_name from carmodel where carmodel_id in (select carmodel_id from carseriesmodel where carseries_id=3);

SELECT * FROM accessories WHERE accessories_id IN (SELECT accessories_id FROM carmodelaccessories WHERE carmodel_id = 4);
select * from carmodelaccessories;

SELECT * FROM colors WHERE colors_id IN (SELECT colors_id FROM carmodelcolors WHERE carmodel_id = 3);


select * from carseriesmodel;
select * from carmodelaccessories;
select * from carmodelcolors;
select * from accessories;
select * from carseries;
select * from carmodel;
select * from colors;
select * from role;
