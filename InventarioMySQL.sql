-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2020 a las 19:33:52
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventariosql`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `business_headquarter`
--

CREATE TABLE `business_headquarter` (
  `id_business_headquarter` int(11) NOT NULL,
  `name_business` varchar(255) NOT NULL,
  `director` varchar(255) DEFAULT NULL,
  `id_geographic_location` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `business_headquarter`
--

INSERT INTO `business_headquarter` (`id_business_headquarter`, `name_business`, `director`, `id_geographic_location`) VALUES
(1, 'Ara', 'Juan Camilo', 44),
(2, 'Jumbo', 'Maria Fernanda', 60),
(3, 'Exito', 'Melissa Marin', 36),
(4, 'Ara', 'Juan Camilo', 44),
(5, 'Jumbo', 'Maria Fernanda', 60),
(6, 'Exito', 'Melissa Marin', 36),
(7, 'Ara', 'Juan Camilo', 44),
(8, 'Jumbo', 'Maria Fernanda', 60),
(9, 'Exito', 'Melissa Marin', 36),
(10, 'Ara', 'Juan Camilo', 44),
(11, 'Jumbo', 'Maria Fernanda', 60),
(12, 'Exito', 'Melissa Marin', 36);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `business_headquarter_provider`
--

CREATE TABLE `business_headquarter_provider` (
  `id_business_headquarter_provider` int(11) NOT NULL,
  `id_provider` int(11) NOT NULL,
  `id_business_headquarter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `business_headquarter_provider`
--

INSERT INTO `business_headquarter_provider` (`id_business_headquarter_provider`, `id_provider`, `id_business_headquarter`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 1, 1),
(5, 2, 2),
(6, 3, 3),
(7, 1, 1),
(8, 2, 2),
(9, 3, 3),
(10, 1, 1),
(11, 2, 2),
(12, 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `business_headquarter_stock`
--

CREATE TABLE `business_headquarter_stock` (
  `id_business_headquarter_stock` int(11) NOT NULL,
  `id_business_headquarter` int(11) NOT NULL,
  `id_stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `business_headquarter_stock`
--

INSERT INTO `business_headquarter_stock` (`id_business_headquarter_stock`, `id_business_headquarter`, `id_stock`) VALUES
(1, 1, 3),
(2, 2, 1),
(3, 3, 2),
(4, 1, 3),
(5, 2, 1),
(6, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `costumer`
--

CREATE TABLE `costumer` (
  `id_costumer` int(11) NOT NULL,
  `id_geographic_location` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(255) NOT NULL,
  `document` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `costumer`
--

INSERT INTO `costumer` (`id_costumer`, `id_geographic_location`, `name`, `surname`, `email`, `phone_number`, `date_of_birth`, `gender`, `document`) VALUES
(1, 34, 'Juan', 'Perez', 'juanp@hotmail.com', '3114557865', '1992-01-09', 'masculino', '1234'),
(2, 42, 'Laura', 'Peña', 'laup@gmail.com', '3126781243', '1982-03-12', 'femenino', '1324'),
(3, 50, 'Clara', 'Rojas', 'clarar@hotmail.com', '3212048818', '1995-10-13', 'otro', '1432'),
(4, 34, 'Juan', 'Perez', 'juanp@hotmail.com', '3114557865', '0000-00-00', 'masculino', '1243'),
(5, 42, 'Laura', 'Peña', 'laup@gmail.com', '3126781243', '0000-00-00', 'femenino', '4132'),
(6, 50, 'Clara', 'Rojas', 'clarar@hotmail.com', '3212048818', '0000-00-00', 'otro', '4231');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `geographic_location`
--

CREATE TABLE `geographic_location` (
  `id_geographic_location` int(11) NOT NULL,
  `location_name` varchar(255) NOT NULL,
  `location` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `geographic_location`
--

INSERT INTO `geographic_location` (`id_geographic_location`, `location_name`, `location`) VALUES
(1, 'Amazonas', NULL),
(2, 'Antioquia', NULL),
(3, 'Arauca', NULL),
(4, 'Atlántico', NULL),
(5, 'Bolívar', NULL),
(6, 'Boyacá', NULL),
(7, 'Caldas', NULL),
(8, 'Caquetá', NULL),
(9, 'Casanare', NULL),
(10, 'Cauca', NULL),
(11, 'Cesar', NULL),
(12, 'Chocó', NULL),
(13, 'Córdoba', NULL),
(14, 'Cundinamarca', NULL),
(15, 'Guainía', NULL),
(16, 'Guaviare', NULL),
(17, 'Huila', NULL),
(18, 'La Guajira', NULL),
(19, 'Magdalena', NULL),
(20, 'Meta', NULL),
(21, 'Nariño', NULL),
(22, 'Norte de Santander', NULL),
(23, 'Putumayo', NULL),
(24, 'Quindío', NULL),
(25, 'Risaralda', NULL),
(26, 'San Andrés y Providencia', NULL),
(27, 'Santander', NULL),
(28, 'Sucre', NULL),
(29, 'Tolima', NULL),
(30, 'Valle del Cauca', NULL),
(31, 'Vaupés', NULL),
(32, 'Vichada', NULL),
(33, 'Leticia', 1),
(34, 'Medellín', 2),
(35, 'Arauca', 3),
(36, 'Barranquilla', 4),
(37, 'Cartagena de Indias', 5),
(38, 'Tunja', 6),
(39, 'Manizales', 7),
(40, 'Florencia', 8),
(41, 'Yopal', 9),
(42, 'Popayán', 10),
(43, 'Valledupar', 11),
(44, 'Quibdó', 12),
(45, 'Montería', 13),
(46, 'Bogotá', 14),
(47, 'Inírida', 15),
(48, 'San José del Guaviare', 16),
(49, 'Neiva', 17),
(50, 'Riohacha', 18),
(51, 'Santa Marta', 19),
(52, 'Villavicencio', 20),
(53, 'San Juan de Pasto', 21),
(54, 'San José de Cúcuta', 22),
(55, 'Mocoa', 23),
(56, 'Armenia', 24),
(57, 'Pereira', 25),
(58, 'San Andrés', 26),
(59, 'Bucaramanga', 27),
(60, 'Sincelejo', 28),
(61, 'Ibagué', 29),
(62, 'Cali', 30),
(63, 'Mitú', 31),
(64, 'Puerto Carreño', 32),
(65, 'Amazonas', NULL),
(66, 'Antioquia', NULL),
(67, 'Arauca', NULL),
(68, 'Atlántico', NULL),
(69, 'Bolívar', NULL),
(70, 'Boyacá', NULL),
(71, 'Caldas', NULL),
(72, 'Caquetá', NULL),
(73, 'Casanare', NULL),
(74, 'Cauca', NULL),
(75, 'Cesar', NULL),
(76, 'Chocó', NULL),
(77, 'Córdoba', NULL),
(78, 'Cundinamarca', NULL),
(79, 'Guainía', NULL),
(80, 'Guaviare', NULL),
(81, 'Huila', NULL),
(82, 'La Guajira', NULL),
(83, 'Magdalena', NULL),
(84, 'Meta', NULL),
(85, 'Nariño', NULL),
(86, 'Norte de Santander', NULL),
(87, 'Putumayo', NULL),
(88, 'Quindío', NULL),
(89, 'Risaralda', NULL),
(90, 'San Andrés y Providencia', NULL),
(91, 'Santander', NULL),
(92, 'Sucre', NULL),
(93, 'Tolima', NULL),
(94, 'Valle del Cauca', NULL),
(95, 'Vaupés', NULL),
(96, 'Vichada', NULL),
(97, 'Leticia', 1),
(98, 'Medellín', 2),
(99, 'Arauca', 3),
(100, 'Barranquilla', 4),
(101, 'Cartagena de Indias', 5),
(102, 'Tunja', 6),
(103, 'Manizales', 7),
(104, 'Florencia', 8),
(105, 'Yopal', 9),
(106, 'Popayán', 10),
(107, 'Valledupar', 11),
(108, 'Quibdó', 12),
(109, 'Montería', 13),
(110, 'Bogotá', 14),
(111, 'Inírida', 15),
(112, 'San José del Guaviare', 16),
(113, 'Neiva', 17),
(114, 'Riohacha', 18),
(115, 'Santa Marta', 19),
(116, 'Villavicencio', 20),
(117, 'San Juan de Pasto', 21),
(118, 'San José de Cúcuta', 22),
(119, 'Mocoa', 23),
(120, 'Armenia', 24),
(121, 'Pereira', 25),
(122, 'San Andrés', 26),
(123, 'Bucaramanga', 27),
(124, 'Sincelejo', 28),
(125, 'Ibagué', 29),
(126, 'Cali', 30),
(127, 'Mitú', 31),
(128, 'Puerto Carreño', 32),
(129, 'Amazonas', NULL),
(130, 'Antioquia', NULL),
(131, 'Arauca', NULL),
(132, 'Atlántico', NULL),
(133, 'Bolívar', NULL),
(134, 'Boyacá', NULL),
(135, 'Caldas', NULL),
(136, 'Caquetá', NULL),
(137, 'Casanare', NULL),
(138, 'Cauca', NULL),
(139, 'Cesar', NULL),
(140, 'Chocó', NULL),
(141, 'Córdoba', NULL),
(142, 'Cundinamarca', NULL),
(143, 'Guainía', NULL),
(144, 'Guaviare', NULL),
(145, 'Huila', NULL),
(146, 'La Guajira', NULL),
(147, 'Magdalena', NULL),
(148, 'Meta', NULL),
(149, 'Nariño', NULL),
(150, 'Norte de Santander', NULL),
(151, 'Putumayo', NULL),
(152, 'Quindío', NULL),
(153, 'Risaralda', NULL),
(154, 'San Andrés y Providencia', NULL),
(155, 'Santander', NULL),
(156, 'Sucre', NULL),
(157, 'Tolima', NULL),
(158, 'Valle del Cauca', NULL),
(159, 'Vaupés', NULL),
(160, 'Vichada', NULL),
(161, 'Leticia', 1),
(162, 'Medellín', 2),
(163, 'Arauca', 3),
(164, 'Barranquilla', 4),
(165, 'Cartagena de Indias', 5),
(166, 'Tunja', 6),
(167, 'Manizales', 7),
(168, 'Florencia', 8),
(169, 'Yopal', 9),
(170, 'Popayán', 10),
(171, 'Valledupar', 11),
(172, 'Quibdó', 12),
(173, 'Montería', 13),
(174, 'Bogotá', 14),
(175, 'Inírida', 15),
(176, 'San José del Guaviare', 16),
(177, 'Neiva', 17),
(178, 'Riohacha', 18),
(179, 'Santa Marta', 19),
(180, 'Villavicencio', 20),
(181, 'San Juan de Pasto', 21),
(182, 'San José de Cúcuta', 22),
(183, 'Mocoa', 23),
(184, 'Armenia', 24),
(185, 'Pereira', 25),
(186, 'San Andrés', 26),
(187, 'Bucaramanga', 27),
(188, 'Sincelejo', 28),
(189, 'Ibagué', 29),
(190, 'Cali', 30),
(191, 'Mitú', 31),
(192, 'Puerto Carreño', 32),
(193, 'Amazonas', NULL),
(194, 'Antioquia', NULL),
(195, 'Arauca', NULL),
(196, 'Atlántico', NULL),
(197, 'Bolívar', NULL),
(198, 'Boyacá', NULL),
(199, 'Caldas', NULL),
(200, 'Caquetá', NULL),
(201, 'Casanare', NULL),
(202, 'Cauca', NULL),
(203, 'Cesar', NULL),
(204, 'Chocó', NULL),
(205, 'Córdoba', NULL),
(206, 'Cundinamarca', NULL),
(207, 'Guainía', NULL),
(208, 'Guaviare', NULL),
(209, 'Huila', NULL),
(210, 'La Guajira', NULL),
(211, 'Magdalena', NULL),
(212, 'Meta', NULL),
(213, 'Nariño', NULL),
(214, 'Norte de Santander', NULL),
(215, 'Putumayo', NULL),
(216, 'Quindío', NULL),
(217, 'Risaralda', NULL),
(218, 'San Andrés y Providencia', NULL),
(219, 'Santander', NULL),
(220, 'Sucre', NULL),
(221, 'Tolima', NULL),
(222, 'Valle del Cauca', NULL),
(223, 'Vaupés', NULL),
(224, 'Vichada', NULL),
(225, 'Leticia', 1),
(226, 'Medellín', 2),
(227, 'Arauca', 3),
(228, 'Barranquilla', 4),
(229, 'Cartagena de Indias', 5),
(230, 'Tunja', 6),
(231, 'Manizales', 7),
(232, 'Florencia', 8),
(233, 'Yopal', 9),
(234, 'Popayán', 10),
(235, 'Valledupar', 11),
(236, 'Quibdó', 12),
(237, 'Montería', 13),
(238, 'Bogotá', 14),
(239, 'Inírida', 15),
(240, 'San José del Guaviare', 16),
(241, 'Neiva', 17),
(242, 'Riohacha', 18),
(243, 'Santa Marta', 19),
(244, 'Villavicencio', 20),
(245, 'San Juan de Pasto', 21),
(246, 'San José de Cúcuta', 22),
(247, 'Mocoa', 23),
(248, 'Armenia', 24),
(249, 'Pereira', 25),
(250, 'San Andrés', 26),
(251, 'Bucaramanga', 27),
(252, 'Sincelejo', 28),
(253, 'Ibagué', 29),
(254, 'Cali', 30),
(255, 'Mitú', 31),
(256, 'Puerto Carreño', 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice`
--

CREATE TABLE `invoice` (
  `id_invoice` int(11) NOT NULL,
  `id_costumer` int(11) NOT NULL,
  `date_invoice` date NOT NULL,
  `description` varchar(255) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `invoice`
--

INSERT INTO `invoice` (`id_invoice`, `id_costumer`, `date_invoice`, `description`, `total`) VALUES
(1, 1, '2020-08-09', 'producto de aseo:Jabon FAB', 5),
(2, 2, '2020-01-10', 'paquete de alimento:Papas Margarita', 2),
(3, 3, '2020-03-28', 'alimento:1 Lb de arroz Roa', 2.5),
(4, 1, '0000-00-00', 'producto de aseo:Jabon FAB', 5),
(5, 2, '0000-00-00', 'paquete de alimento:Papas Margarita', 2),
(6, 3, '0000-00-00', 'alimento:1 Lb de arroz Roa', 2.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id_product` int(11) NOT NULL,
  `id_stock` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `amount` int(11) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id_product`, `id_stock`, `name`, `amount`, `price`, `description`, `brand`) VALUES
(1, 2, 'Pan integral', 120, 4, 'Rico pan para el desayuno', 'Bimbo'),
(2, 3, 'Coca cola enlatada', 230, 2.5, 'Coca cola fria para la sed', 'Coca cola'),
(3, 1, 'Chocolates 3 unidades', 50, 5, 'Chocolates para compartir momentos unicos', 'Ferrero Rocher'),
(4, 2, 'Pan integral', 120, 4, 'Rico pan para el desayuno', 'Bimbo'),
(5, 3, 'Coca cola enlatada', 230, 2.5, 'Coca cola fria para la sed', 'Coca cola'),
(6, 1, 'Chocolates 3 unidades', 50, 5, 'Chocolates para compartir momentos unicos', 'Ferrero Rocher');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provider`
--

CREATE TABLE `provider` (
  `id_provider` int(11) NOT NULL,
  `NIT` varchar(255) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `manager_name` varchar(255) DEFAULT NULL,
  `manager_surname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `provider`
--

INSERT INTO `provider` (`id_provider`, `NIT`, `company_name`, `manager_name`, `manager_surname`, `email`) VALUES
(1, '100', 'Bimbo', 'David', 'Lopez', 'bimbo@gmail.com'),
(2, '200', 'Coca Cola', 'Carlos', 'Guzman', 'cocacola@gmail.com'),
(3, '300', 'Ferrero Rocher', 'Daniela', 'Hernandez', 'ferrerosRocher@gmail.com'),
(4, '100', 'Bimbo', 'David', 'Lopez', 'bimbo@gmail.com'),
(5, '200', 'Coca Cola', 'Carlos', 'Guzman', 'cocacola@gmail.com'),
(6, '300', 'Ferrero Rocher', 'Daniela', 'Hernandez', 'ferrerosRocher@gmail.com'),
(7, '100', 'Bimbo', 'David', 'Lopez', 'bimbo@gmail.com'),
(8, '200', 'Coca Cola', 'Carlos', 'Guzman', 'cocacola@gmail.com'),
(9, '300', 'Ferrero Rocher', 'Daniela', 'Hernandez', 'ferrerosRocher@gmail.com'),
(10, '100', 'Bimbo', 'David', 'Lopez', 'bimbo@gmail.com'),
(11, '200', 'Coca Cola', 'Carlos', 'Guzman', 'cocacola@gmail.com'),
(12, '300', 'Ferrero Rocher', 'Daniela', 'Hernandez', 'ferrerosRocher@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `id_stock` int(11) NOT NULL,
  `name_stock` varchar(255) DEFAULT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`id_stock`, `name_stock`, `amount`) VALUES
(1, 'stock grandisimo', 15),
(2, 'stock pequeño', 20),
(3, 'stock normal', 50),
(4, 'stock grandisimo', 15),
(5, 'stock pequeño', 20),
(6, 'stock normal', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock_invoice`
--

CREATE TABLE `stock_invoice` (
  `id_stock_invoice` int(11) NOT NULL,
  `id_invoice` int(11) NOT NULL,
  `id_stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `stock_invoice`
--

INSERT INTO `stock_invoice` (`id_stock_invoice`, `id_invoice`, `id_stock`) VALUES
(7, 1, 1),
(8, 1, 2),
(9, 1, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `business_headquarter`
--
ALTER TABLE `business_headquarter`
  ADD PRIMARY KEY (`id_business_headquarter`),
  ADD KEY `id_geographic_location` (`id_geographic_location`);

--
-- Indices de la tabla `business_headquarter_provider`
--
ALTER TABLE `business_headquarter_provider`
  ADD PRIMARY KEY (`id_business_headquarter_provider`),
  ADD KEY `id_provider` (`id_provider`),
  ADD KEY `id_business_headquarter` (`id_business_headquarter`);

--
-- Indices de la tabla `business_headquarter_stock`
--
ALTER TABLE `business_headquarter_stock`
  ADD PRIMARY KEY (`id_business_headquarter_stock`),
  ADD KEY `id_business_headquarter` (`id_business_headquarter`),
  ADD KEY `id_stock` (`id_stock`);

--
-- Indices de la tabla `costumer`
--
ALTER TABLE `costumer`
  ADD PRIMARY KEY (`id_costumer`),
  ADD KEY `costumer_id_geographic_location_fk` (`id_geographic_location`);

--
-- Indices de la tabla `geographic_location`
--
ALTER TABLE `geographic_location`
  ADD PRIMARY KEY (`id_geographic_location`),
  ADD KEY `geographic_location_location_fk` (`location`);

--
-- Indices de la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`id_invoice`),
  ADD KEY `invoice_id_costumer_fk` (`id_costumer`);

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id_product`);

--
-- Indices de la tabla `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id_provider`);

--
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id_stock`);

--
-- Indices de la tabla `stock_invoice`
--
ALTER TABLE `stock_invoice`
  ADD PRIMARY KEY (`id_stock_invoice`),
  ADD KEY `id_invoice` (`id_invoice`),
  ADD KEY `id_stock` (`id_stock`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `business_headquarter`
--
ALTER TABLE `business_headquarter`
  MODIFY `id_business_headquarter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `business_headquarter_provider`
--
ALTER TABLE `business_headquarter_provider`
  MODIFY `id_business_headquarter_provider` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `business_headquarter_stock`
--
ALTER TABLE `business_headquarter_stock`
  MODIFY `id_business_headquarter_stock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `costumer`
--
ALTER TABLE `costumer`
  MODIFY `id_costumer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `geographic_location`
--
ALTER TABLE `geographic_location`
  MODIFY `id_geographic_location` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=257;

--
-- AUTO_INCREMENT de la tabla `invoice`
--
ALTER TABLE `invoice`
  MODIFY `id_invoice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `id_product` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `provider`
--
ALTER TABLE `provider`
  MODIFY `id_provider` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `stock`
--
ALTER TABLE `stock`
  MODIFY `id_stock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `stock_invoice`
--
ALTER TABLE `stock_invoice`
  MODIFY `id_stock_invoice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `business_headquarter`
--
ALTER TABLE `business_headquarter`
  ADD CONSTRAINT `business_headquarter_ibfk_1` FOREIGN KEY (`id_geographic_location`) REFERENCES `geographic_location` (`id_geographic_location`);

--
-- Filtros para la tabla `business_headquarter_provider`
--
ALTER TABLE `business_headquarter_provider`
  ADD CONSTRAINT `business_headquarter_provider_ibfk_1` FOREIGN KEY (`id_provider`) REFERENCES `provider` (`id_provider`),
  ADD CONSTRAINT `business_headquarter_provider_ibfk_2` FOREIGN KEY (`id_business_headquarter`) REFERENCES `business_headquarter` (`id_business_headquarter`);

--
-- Filtros para la tabla `business_headquarter_stock`
--
ALTER TABLE `business_headquarter_stock`
  ADD CONSTRAINT `business_headquarter_stock_ibfk_1` FOREIGN KEY (`id_business_headquarter`) REFERENCES `business_headquarter` (`id_business_headquarter`),
  ADD CONSTRAINT `business_headquarter_stock_ibfk_2` FOREIGN KEY (`id_stock`) REFERENCES `stock` (`id_stock`);

--
-- Filtros para la tabla `costumer`
--
ALTER TABLE `costumer`
  ADD CONSTRAINT `costumer_id_geographic_location_fk` FOREIGN KEY (`id_geographic_location`) REFERENCES `geographic_location` (`id_geographic_location`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `geographic_location`
--
ALTER TABLE `geographic_location`
  ADD CONSTRAINT `geographic_location_location_fk` FOREIGN KEY (`location`) REFERENCES `geographic_location` (`id_geographic_location`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_id_costumer_fk` FOREIGN KEY (`id_costumer`) REFERENCES `costumer` (`id_costumer`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `stock` (`id_stock`);

--
-- Filtros para la tabla `stock_invoice`
--
ALTER TABLE `stock_invoice`
  ADD CONSTRAINT `stock_invoice_ibfk_1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice` (`id_invoice`),
  ADD CONSTRAINT `stock_invoice_ibfk_2` FOREIGN KEY (`id_stock`) REFERENCES `stock` (`id_stock`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
