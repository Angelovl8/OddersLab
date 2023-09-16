-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-05-2023 a las 11:21:50
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tesla`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `CLIENTE`
--

CREATE TABLE `CLIENTE` (
  `cod_cliente` int(20) NOT NULL,
  `NIF` char(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` char(9) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `CP` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `CLIENTE`
--

INSERT INTO `CLIENTE` (`cod_cliente`, `NIF`, `nombre`, `apellidos`, `telefono`, `direccion`, `CP`) VALUES
(100, '30218878Y', 'Angelo', 'Visentin', '666302629', 'Hermenegildo Casas Jimenez 27', '41020'),
(104, '28919734V', 'Óscar', 'Díaz', '640052883', 'Negrita 1', '41013'),
(105, '30218865X', 'Pablo', 'Cubero', '665421312', 'Casa Cubero', '41670');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `COCHE`
--

CREATE TABLE `COCHE` (
  `matricula` char(7) NOT NULL,
  `color` varchar(15) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `precio` decimal(20,2) NOT NULL DEFAULT 0.00,
  `cod_cliente` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `COCHE`
--

INSERT INTO `COCHE` (`matricula`, `color`, `modelo`, `marca`, `precio`, `cod_cliente`) VALUES
('123123X', 'Rojo', 'Tesla Model X', 'Tesla', '150000.00', 100),
('127127X', 'Rojo', 'Skoda Octavia', 'Skoda', '15000.00', 104);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `REVISION`
--

CREATE TABLE `REVISION` (
  `cod_interno` int(20) NOT NULL,
  `cambio_filtro` enum('S','N') NOT NULL,
  `cambio_aceite` enum('S','N') NOT NULL,
  `cambio_frenos` enum('S','N') NOT NULL,
  `cambio_otros` enum('S','N') NOT NULL,
  `fecha_revision` date NOT NULL CHECK (`fecha_revision` >= '2000-01-01' and `fecha_revision` <= '2023-12-31'),
  `matricula` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `REVISION`
--

INSERT INTO `REVISION` (`cod_interno`, `cambio_filtro`, `cambio_aceite`, `cambio_frenos`, `cambio_otros`, `fecha_revision`, `matricula`) VALUES
(100, 'S', 'N', 'S', 'N', '2023-05-21', '123123x'),
(104, 'S', 'N', 'S', 'N', '2023-05-22', '127127X');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `CLIENTE`
--
ALTER TABLE `CLIENTE`
  ADD PRIMARY KEY (`cod_cliente`),
  ADD UNIQUE KEY `telefono` (`telefono`),
  ADD UNIQUE KEY `NIF` (`NIF`);

--
-- Indices de la tabla `COCHE`
--
ALTER TABLE `COCHE`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `cod_cliente` (`cod_cliente`);

--
-- Indices de la tabla `REVISION`
--
ALTER TABLE `REVISION`
  ADD PRIMARY KEY (`cod_interno`),
  ADD KEY `matricula` (`matricula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `CLIENTE`
--
ALTER TABLE `CLIENTE`
  MODIFY `cod_cliente` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4321346;

--
-- AUTO_INCREMENT de la tabla `REVISION`
--
ALTER TABLE `REVISION`
  MODIFY `cod_interno` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123123124;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `COCHE`
--
ALTER TABLE `COCHE`
  ADD CONSTRAINT `coche_ibfk_1` FOREIGN KEY (`cod_cliente`) REFERENCES `CLIENTE` (`cod_cliente`);

--
-- Filtros para la tabla `REVISION`
--
ALTER TABLE `REVISION`
  ADD CONSTRAINT `revision_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `COCHE` (`matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
