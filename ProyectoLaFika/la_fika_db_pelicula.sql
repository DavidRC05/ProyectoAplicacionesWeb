CREATE DATABASE  IF NOT EXISTS `la_fika_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `la_fika_db`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: la_fika_db
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `idpelicula` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `sipnosis` varchar(45) DEFAULT NULL,
  `minutos` int DEFAULT NULL,
  `year` int DEFAULT NULL,
  `linktrailer` varchar(150) DEFAULT NULL,
  `linkbanner` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idpelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,'asdf','asdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(6,'aw','asdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://deadline.com/wp-content/uploads/2022/10/The-Super-Mario-Bros-Movie.jpg?w=681&h=383&crop=1'),(7,'asd','asdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(8,'asd','asdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(9,'asd','asdfas',234234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(10,'asd','asdfas',234,44,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://deadline.com/wp-content/uploads/2022/10/The-Super-Mario-Bros-Movie.jpg?w=681&h=383&crop=1'),(11,'asd','asdfasasdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(12,'asd','asdfas',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x'),(13,'asd','asdfs',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://deadline.com/wp-content/uploads/2022/10/The-Super-Mario-Bros-Movie.jpg?w=681&h=383&crop=1'),(14,'asd','asdfs',234,4,'https://www.youtube.com/watch?v=AZS_d_hS2dM','https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2021/06/avatar-2366079.jpg?tf=1080x');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-04 17:15:53
