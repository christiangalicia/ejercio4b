-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 15, 2017 at 04:58 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `temporal`
--

-- --------------------------------------------------------

--
-- Table structure for table `autobus`
--

CREATE TABLE `autobus` (
  `idAutobus` int(11) NOT NULL,
  `clave` int(11) NOT NULL,
  `tipo` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `idRuta` int(11) NOT NULL,
  `idConductor` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `autobus`
--

INSERT INTO `autobus` (`idAutobus`, `clave`, `tipo`, `idRuta`, `idConductor`) VALUES
(1, 123, 'lg', 1, 1),
(2, 122, 'lg', 1, 1),
(3, 124, 'lg', 1, 1),
(4, 112, 'lg', 1, 1),
(5, 113, 'lg', 2, 2),
(6, 344, 'platino', 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `capacidad`
--

CREATE TABLE `capacidad` (
  `idCapcidad` int(11) NOT NULL,
  `asiento` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `idAutobus` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `capacidad`
--

INSERT INTO `capacidad` (`idCapcidad`, `asiento`, `estado`, `idAutobus`) VALUES
(1, 1, 0, 5),
(2, 2, 0, 5),
(3, 3, 0, 5),
(4, 4, 0, 5),
(5, 5, 0, 5),
(6, 6, 0, 5),
(7, 7, 0, 5),
(8, 8, 0, 5),
(9, 9, 0, 5),
(10, 10, 0, 5),
(11, 11, 0, 5),
(12, 12, 0, 5),
(13, 13, 0, 5),
(14, 14, 0, 5),
(15, 15, 0, 5),
(16, 16, 0, 5),
(17, 17, 0, 5),
(18, 18, 0, 5),
(19, 19, 0, 5),
(20, 20, 0, 5),
(21, 21, 0, 5),
(22, 22, 0, 5),
(23, 23, 0, 5),
(24, 24, 0, 5),
(25, 25, 0, 5),
(26, 26, 0, 5),
(27, 27, 0, 5),
(28, 28, 0, 5),
(29, 29, 0, 5),
(30, 30, 0, 5),
(31, 31, 0, 5),
(32, 32, 0, 5),
(33, 33, 0, 5),
(34, 34, 0, 5),
(35, 35, 0, 5),
(36, 36, 0, 5),
(37, 37, 0, 5),
(38, 38, 0, 5),
(39, 39, 0, 5),
(40, 40, 0, 5),
(41, 41, 0, 5),
(42, 1, 0, 6),
(43, 2, 0, 6),
(44, 3, 0, 6),
(45, 4, 0, 6),
(46, 5, 0, 6),
(47, 6, 0, 6),
(48, 7, 0, 6),
(49, 8, 0, 6),
(50, 9, 0, 6),
(51, 10, 0, 6),
(52, 11, 0, 6),
(53, 12, 0, 6),
(54, 13, 0, 6),
(55, 14, 0, 6),
(56, 15, 0, 6),
(57, 16, 0, 6),
(58, 17, 0, 6),
(59, 18, 0, 6),
(60, 19, 0, 6),
(61, 20, 0, 6),
(62, 21, 0, 6),
(63, 22, 0, 6),
(64, 23, 0, 6),
(65, 24, 0, 6),
(66, 25, 0, 6),
(67, 26, 0, 6),
(68, 27, 0, 6),
(69, 28, 0, 6),
(70, 29, 0, 6);

-- --------------------------------------------------------

--
-- Table structure for table `conductor`
--

CREATE TABLE `conductor` (
  `idConductor` int(11) NOT NULL,
  `nombre` varchar(300) COLLATE utf8_spanish2_ci NOT NULL,
  `clave` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `conductor`
--

INSERT INTO `conductor` (`idConductor`, `nombre`, `clave`) VALUES
(1, 'juan perez', 111),
(2, 'juan garcia', 110),
(3, 'luis', 444);

-- --------------------------------------------------------

--
-- Table structure for table `rutas`
--

CREATE TABLE `rutas` (
  `idRuta` int(11) NOT NULL,
  `destino` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `horario` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `costo` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `rutas`
--

INSERT INTO `rutas` (`idRuta`, `destino`, `horario`, `costo`) VALUES
(1, 'Puebla', '12:00-2:00', 120),
(2, 'Puebla', '13:00-15:00', 125),
(3, 'Oaxaca', '12:30-14:30', 180);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autobus`
--
ALTER TABLE `autobus`
  ADD PRIMARY KEY (`idAutobus`);

--
-- Indexes for table `capacidad`
--
ALTER TABLE `capacidad`
  ADD PRIMARY KEY (`idCapcidad`);

--
-- Indexes for table `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`idConductor`);

--
-- Indexes for table `rutas`
--
ALTER TABLE `rutas`
  ADD PRIMARY KEY (`idRuta`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autobus`
--
ALTER TABLE `autobus`
  MODIFY `idAutobus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `capacidad`
--
ALTER TABLE `capacidad`
  MODIFY `idCapcidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT for table `conductor`
--
ALTER TABLE `conductor`
  MODIFY `idConductor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `rutas`
--
ALTER TABLE `rutas`
  MODIFY `idRuta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

