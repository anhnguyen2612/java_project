-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2021 at 05:07 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idad` varchar(45) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idad`, `user`, `pass`) VALUES
('1', 'admin', '123'),
('2', 'admin_nguyen', '123321');

-- --------------------------------------------------------

--
-- Table structure for table `diem`
--

CREATE TABLE `diem` (
  `idlop` varchar(45) NOT NULL,
  `mon` varchar(45) DEFAULT NULL,
  `idmon` varchar(45) NOT NULL,
  `idsv` varchar(45) NOT NULL,
  `diem15` float DEFAULT NULL,
  `diem45` float DEFAULT NULL,
  `diemthi` float DEFAULT NULL,
  `tongket` float DEFAULT NULL,
  `ketqua` varchar(45) DEFAULT NULL,
  `idgv` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diem`
--

INSERT INTO `diem` (`idlop`, `mon`, `idmon`, `idsv`, `diem15`, `diem45`, `diemthi`, `tongket`, `ketqua`, `idgv`) VALUES
('17cntt', 'tech', 't1', 'sv1', 5, 5, 5, 5, 'ket quả', 'gv1');

-- --------------------------------------------------------

--
-- Table structure for table `giaovien`
--

CREATE TABLE `giaovien` (
  `idgv` varchar(45) NOT NULL,
  `hoten` varchar(45) DEFAULT NULL,
  `idmon` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL,
  `idlop` varchar(45) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  `user` varchar(25) DEFAULT NULL,
  `pass` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `giaovu`
--

CREATE TABLE `giaovu` (
  `idgvu` varchar(45) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `giaovu`
--

INSERT INTO `giaovu` (`idgvu`, `user`, `pass`) VALUES
('giaovu1', 'giagia', '123'),
('giaovu2', 'sinsin', '123321');

-- --------------------------------------------------------

--
-- Table structure for table `khoa`
--

CREATE TABLE `khoa` (
  `idkhoa` varchar(45) NOT NULL,
  `khoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `khoa`
--

INSERT INTO `khoa` (`idkhoa`, `khoa`) VALUES
('cntt', 'công nghệ thông tin'),
('ks', 'khách sạn'),
('kt', 'kiến trúc'),
('qtkd', 'quản trị kinh doanh');

-- --------------------------------------------------------

--
-- Table structure for table `lop`
--

CREATE TABLE `lop` (
  `idlop` varchar(45) NOT NULL,
  `lop` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL,
  `khoahoc` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lop`
--

INSERT INTO `lop` (`idlop`, `lop`, `idkhoa`, `khoahoc`) VALUES
('17cntt', '17dthb5', 'cntt', 'nuuun'),
('17qtkd', 'a1', 'qtkd', 'noooon');

-- --------------------------------------------------------

--
-- Table structure for table `mon`
--

CREATE TABLE `mon` (
  `idmon` varchar(45) NOT NULL,
  `mon` varchar(45) DEFAULT NULL,
  `tinchi` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mon`
--

INSERT INTO `mon` (`idmon`, `mon`, `tinchi`, `idkhoa`) VALUES
('t1', 'tech', 'tinchi1', 'cntt'),
('t2', 'code', 'tinchi2', 'cntt');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `idsv` varchar(45) NOT NULL,
  `hoten` varchar(45) DEFAULT NULL,
  `idlop` varchar(45) DEFAULT NULL,
  `hedt` varchar(45) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `diachi` varchar(45) DEFAULT NULL,
  `gioitinh` varchar(45) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`idsv`, `hoten`, `idlop`, `hedt`, `ngaysinh`, `diachi`, `gioitinh`, `sdt`, `idkhoa`) VALUES
('sv1', 'huy', '17cntt', 'nulld', '2011-04-13', '??? DBP', 'Nam', '0932132123', 'cntt'),
('sv2', 'nghĩa', '17qtkd', 'null', '2009-04-13', '??? DBP', 'Nam', '0976523223', 'qtkd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idad`);

--
-- Indexes for table `diem`
--
ALTER TABLE `diem`
  ADD KEY `FK_Mon_idx` (`idmon`),
  ADD KEY `FK_SV_idx` (`idsv`);

--
-- Indexes for table `giaovien`
--
ALTER TABLE `giaovien`
  ADD PRIMARY KEY (`idgv`),
  ADD KEY `FK_IDmon_idx` (`idmon`);

--
-- Indexes for table `giaovu`
--
ALTER TABLE `giaovu`
  ADD PRIMARY KEY (`idgvu`);

--
-- Indexes for table `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`idkhoa`);

--
-- Indexes for table `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`idlop`);

--
-- Indexes for table `mon`
--
ALTER TABLE `mon`
  ADD PRIMARY KEY (`idmon`),
  ADD KEY `FK_KhoaHoc_idx` (`idkhoa`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`idsv`),
  ADD KEY `FK_Lop_idx` (`idlop`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `diem`
--
ALTER TABLE `diem`
  ADD CONSTRAINT `FK_Mon` FOREIGN KEY (`idmon`) REFERENCES `mon` (`idmon`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_SV` FOREIGN KEY (`idsv`) REFERENCES `sinhvien` (`idsv`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `giaovien`
--
ALTER TABLE `giaovien`
  ADD CONSTRAINT `giaovien_ibfk_1` FOREIGN KEY (`idmon`) REFERENCES `mon` (`idmon`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `mon`
--
ALTER TABLE `mon`
  ADD CONSTRAINT `FK_KhoaHoc` FOREIGN KEY (`idkhoa`) REFERENCES `khoa` (`idkhoa`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `FK_Lop` FOREIGN KEY (`idlop`) REFERENCES `lop` (`idlop`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
