-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: confederacao
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `academia`
--

DROP TABLE IF EXISTS `academia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `academia` (
  `idAcad` int(11) NOT NULL AUTO_INCREMENT,
  `nomeAcademia` varchar(30) DEFAULT NULL,
  `nomeProf` varchar(30) DEFAULT NULL,
  `graduacaoProf` varchar(30) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idAcad`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `academia`
--

LOCK TABLES `academia` WRITE;
/*!40000 ALTER TABLE `academia` DISABLE KEYS */;
INSERT INTO `academia` VALUES (1,'Judorama','Pedro','Roxa',34,'Masculino','Rua b');
/*!40000 ALTER TABLE `academia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aluno` (
  `idAluno` int(11) NOT NULL AUTO_INCREMENT,
  `nomeAluno` varchar(30) DEFAULT NULL,
  `GraduacaoAlu` varchar(30) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAluno`)
) ENGINE=MyISAM AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Pedro','Roxa','Masculino',16),(2,'alita','roxa','Feminino',20),(3,'José','Roxa','Masculino',23),(4,'João','Laranja','Masculino',16),(5,'Pedro','Laranja','Masculino',18),(6,'Maria','Laranja','Feminino',17),(7,'Joaquim','Roxa','Masculino',24),(8,'Joana','Laranja','Feminino',19),(9,'Mario','Roxa','Masculino',23),(10,'Claudete','Laranja','Feminino',18),(11,'Mauro','Roxa','Masculino',34),(12,'Caio','Preta','Masculino',34),(13,'Charles Anao','MiniGraduacao','M',110),(14,'Charles Anao','MiniGraduacao','M',110),(15,'Charles Anao','MiniGraduacao','M',110),(16,'Charles Anao','MiniGraduacao','M',110),(17,'Charles Anao','MiniGraduacao','M',110),(18,'Charles Anao','MiniGraduacao','M',110),(19,'Charles Anao','MiniGraduacao','M',110),(20,'Charles Anao','MiniGraduacao','M',110),(21,'Charles Anao','MiniGraduacao','M',110),(22,'Charles Anao','MiniGraduacao','M',110),(23,'Charles Anao','MiniGraduacao','M',110),(24,'Charles Anao','MiniGraduacao','M',110),(25,'Charles Anao','MiniGraduacao','M',110),(26,'Charles Anao','MiniGraduacao','M',110),(27,'Charles Anao','MiniGraduacao','M',110),(28,'Charles Anao','MiniGraduacao','M',110),(29,'Charles Anao','MiniGraduacao','M',110),(30,'Charles Anao','MiniGraduacao','M',110),(31,'Charles Anao','MiniGraduacao','M',110),(32,'Charles Anao','MiniGraduacao','M',110),(33,'Charles Anao','MiniGraduacao','M',110),(34,'Charles Anao','MiniGraduacao','M',110),(35,'Charles Anao','MiniGraduacao','M',110),(36,'Charles Anao','MiniGraduacao','M',110),(37,'Charles Anao','MiniGraduacao','M',110),(38,'Charles Anao','MiniGraduacao','M',110),(39,'Charles Anao','MiniGraduacao','M',110),(40,'Charles Anao','MiniGraduacao','M',110),(41,'Charles Anao','MiniGraduacao','M',110),(42,'Charles Anao','MiniGraduacao','M',110),(43,'Charles Anao','MiniGraduacao','M',110),(44,'Charles Anao','MiniGraduacao','M',110),(45,'Charles Anao','MiniGraduacao','M',110),(46,'Charles Anao','MiniGraduacao','M',110),(47,'Charles Anao','MiniGraduacao','M',110),(48,'Charles Anao','MiniGraduacao','M',110),(49,'Charles Anao','MiniGraduacao','M',110),(50,'Charles Anao','MiniGraduacao','M',110),(51,'Charles Anao','MiniGraduacao','M',110),(52,'Charles Anao','MiniGraduacao','M',110),(53,'Charles Anao','MiniGraduacao','M',110),(54,'Charles Anao','MiniGraduacao','M',110),(55,'Charles Anao','MiniGraduacao','M',110),(56,'Charles Anao','MiniGraduacao','M',110),(57,'Charles Anao','MiniGraduacao','M',110),(58,'Charles Anao','MiniGraduacao','M',110),(59,'Charles Anao','MiniGraduacao','M',110),(60,'Charles Anao','MiniGraduacao','M',110),(61,'Charles Anao','MiniGraduacao','M',110),(62,'Charles Anao','MiniGraduacao','M',110),(63,'Charles Anao','MiniGraduacao','M',110),(64,'Charles Anao','MiniGraduacao','M',110);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campeonato`
--

DROP TABLE IF EXISTS `campeonato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `campeonato` (
  `idCamp` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCamp` varchar(30) DEFAULT NULL,
  `ProfResp` varchar(30) DEFAULT NULL,
  `localCamp` varchar(30) DEFAULT NULL,
  `dataCamp` date DEFAULT NULL,
  `horario` time DEFAULT NULL,
  PRIMARY KEY (`idCamp`)
) ENGINE=MyISAM AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campeonato`
--

LOCK TABLES `campeonato` WRITE;
/*!40000 ALTER TABLE `campeonato` DISABLE KEYS */;
INSERT INTO `campeonato` VALUES (1,'luta','joao','pantanal','2018-04-22','00:00:14'),(2,'JudoFast','Joao','Rua neve, 23','2023-05-18','08:00:00'),(3,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(4,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(5,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(6,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(7,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(8,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(9,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(10,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(11,'Combate','Gilberto','Avenida Grande','2018-03-24','00:05:12'),(12,'JudoramaCami','Rodrigo Maia','Parque Verde','2018-04-26','00:00:10'),(13,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(14,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(15,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(16,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(17,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(18,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(19,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(20,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(21,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(22,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(23,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(24,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(25,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(26,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(27,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(28,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(29,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(30,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(31,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(32,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(33,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(34,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(35,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(36,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(37,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(38,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(39,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(40,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(41,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(42,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(43,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(44,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00'),(45,'Combate','Gilberto','Avenida Grande','2018-03-24','10:00:00');
/*!40000 ALTER TABLE `campeonato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscricao`
--

DROP TABLE IF EXISTS `inscricao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inscricao` (
  `idInscri` int(11) NOT NULL AUTO_INCREMENT,
  `grad` varchar(30) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `idAluno` int(11) DEFAULT NULL,
  `idCamp` int(11) DEFAULT NULL,
  `NomeCamp` varchar(20) DEFAULT NULL,
  `nomeAtleta` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idInscri`),
  KEY `idAluno` (`idAluno`),
  KEY `idCamp` (`idCamp`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscricao`
--

LOCK TABLES `inscricao` WRITE;
/*!40000 ALTER TABLE `inscricao` DISABLE KEYS */;
INSERT INTO `inscricao` VALUES (1,'amaelo',21,56.5,45.5,NULL,NULL,NULL,NULL),(2,'Roxa',16,56.78,20,NULL,NULL,NULL,NULL),(3,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(4,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(5,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(6,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(7,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(8,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(9,'Roxa',23,56.7,30.6,NULL,NULL,'Judorama','Joana'),(10,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(11,'Roxa',13,45.6,25,NULL,NULL,NULL,NULL),(12,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(13,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(14,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(15,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(16,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(17,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(18,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(19,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(20,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(21,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(22,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(23,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(24,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(25,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(26,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(27,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos'),(28,'Roxa',13,45.6,25,NULL,NULL,'Judorama','Carlos');
/*!40000 ALTER TABLE `inscricao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-16 19:15:54
