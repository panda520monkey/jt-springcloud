/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.27 : Database - jt
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jt_user` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `jt_user`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(40) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` char(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=586 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`age`,`sex`) values (1,'黑熊精',9222,'男'),(2,'鲤鱼精',502,'男'),(3,'金角大王',465,'男'),(4,'银角大王',545,'男'),(5,'唐僧',50,'男'),(6,'悟空',4898,'男'),(7,'白龙驴',7,'男'),(8,'八戒',87,'男'),(9,'沙悟净',797,'男'),(11,'小乔',797,'女'),(12,'貂蝉',797,'女'),(16,'黄月英',797,'女'),(17,'孙尚香',797,'女'),(18,'甄姬c',79,'女'),(21,'孙尚香D',797,'女'),(22,'刘备',797,'男'),(23,'陆逊',50,'男'),(24,'陆逊',50,'男'),(25,'关羽',50,'男'),(27,'阿科',50,'女'),(31,'王昭君',50,'女'),(38,'貂蝉',50,'女'),(39,'西施',50,'女'),(40,'严真煌',50,'女'),(41,'白骨精',50,'女'),(43,'小乔',50,'男'),(44,'大乔',50,'女'),(46,'不知火舞',50,'女'),(555,'999',50,'5'),(585,'999',50,'5');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
