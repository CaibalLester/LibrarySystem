-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 21, 2024 at 03:34 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarysystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `BookID` int NOT NULL,
  `Title` varchar(50) NOT NULL,
  `Author` varchar(50) NOT NULL,
  `ISBN` int NOT NULL,
  `Publisher` varchar(50) NOT NULL,
  `YearPublished` int NOT NULL,
  `Quantity` int NOT NULL,
  `Pages` int NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BookID`, `Title`, `Author`, `ISBN`, `Publisher`, `YearPublished`, `Quantity`, `Pages`, `Status`) VALUES
(14, 'Lester', 'Caibal', 4, 'c', 5, 6, 7, 'Reserved'),
(15, 'Mi', 'b', 4, 'c', 5, 6, 7, 'Checked Out'),
(16, 'Shiro', 'Caibal', 4, 'c', 5, 6, 7, 'Reserved'),
(17, 'Myx', 'Les', 1, 'Lala', 2, 3, 4, 'Available'),
(18, 'Leslie', 'Try', 10, 'Cai', 11, 12, 13, 'Available'),
(19, 'Shiro', 'Caibal', 4, 'c', 5, 6, 7, 'Reserved'),
(20, 'Lixert', 'Lax', 19, 'Lao', 2, 3, 4, 'Checked Out');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `user_id` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `userrole` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`user_id`, `username`, `password`, `email`, `fullname`, `userrole`) VALUES
(1, 'Les', 'pass', 'lestercaibal@gmail.com', 'Lester Caibal', 'Student'),
(2, 'Kath', 'kath', 'riverakatherine@gmail.com', 'Katherine Rivera', 'Librarian'),
(3, 'Jhoanna', 'Dolores', 'Dolores@gmail.com', 'Jhoanna Dolores', 'Student'),
(4, 'Joyce', 'Morales', 'Joyce@gmail.com', 'Joyce Morales', 'Student');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `BookID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `user_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
