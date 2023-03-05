-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2022 at 04:08 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `billingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `Bill_Id` int(15) NOT NULL,
  `Token_Id` int(11) NOT NULL,
  `Sub_Total` int(10) NOT NULL,
  `Discount` int(5) NOT NULL,
  `Balance` int(10) NOT NULL,
  `Payable` int(10) NOT NULL,
  `Cashier_Name` varchar(25) NOT NULL,
  `Date` varchar(50) NOT NULL,
  `Payment` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`Bill_Id`, `Token_Id`, `Sub_Total`, `Discount`, `Balance`, `Payable`, `Cashier_Name`, `Date`, `Payment`) VALUES
(1, 25, 220, 0, 30, 220, 'Himesh', 'Tue Jul 12 07:17:04 IST 2022', 250),
(2, 26, 860, 0, 40, 860, 'Himesh', 'Tue Jul 12 07:17:53 IST 2022', 900);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Token_Id` int(11) NOT NULL,
  `Product_Id` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Token_Id`, `Product_Id`, `Quantity`) VALUES
(1, 1, 200),
(1, 3, 200),
(1, 4, 2),
(10, 1, 100),
(10, 8, 250),
(11, 1, 100),
(11, 8, 250),
(12, 1, 200),
(12, 4, 2),
(13, 1, 200),
(13, 4, 2),
(15, 1, 200),
(15, 4, 2),
(20, 1, 200),
(20, 4, 2),
(25, 1, 200),
(25, 4, 2),
(26, 4, 5),
(26, 7, 1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Product_Id` int(10) NOT NULL,
  `Product_Name` varchar(25) DEFAULT NULL,
  `Price` int(15) DEFAULT NULL,
  `Product_Unit` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Product_Id`, `Product_Name`, `Price`, `Product_Unit`) VALUES
(1, 'Rice', 10, 100),
(2, 'Sugar', 65, 100),
(3, 'Dhal', 50, 100),
(4, 'Biscuite', 100, 1),
(5, 'Onion', 22, 100),
(6, 'Coconut', 85, 1),
(7, 'Salmon', 360, 1),
(8, 'Leeks', 60, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`Bill_Id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD KEY `Product_Id` (`Product_Id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Product_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `Bill_Id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Product_Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Product_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
