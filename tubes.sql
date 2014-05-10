-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2014 at 08:26 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `id_pasien` int(15) NOT NULL,
  `nama_pasien` int(30) NOT NULL,
  `riwayat` int(100) NOT NULL,
  `alamat` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
  `id_pegawai` varchar(15) NOT NULL,
  `nama_pegawai` varchar(30) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `status`) VALUES
('1234', 'higia', 'dokter'),
('1234', 'higia', 'dokter'),
('1234', 'higi', 'perawat'),
('001', 'alifah', 'perawat'),
('0000', 'eka', 'dokter'),
('001', 'putri', 'perawat'),
('', '', 'dokter');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `id_petugas` varchar(15) NOT NULL,
  `nama_petugas` varchar(30) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama_petugas`, `username`, `password`) VALUES
('1234', 'higia', 'higia', 'higia'),
('0908', 'hhh', 'aaaa', 'aaaa'),
('1234', 'ipeh', 'ipeeh', 'ipeeh'),
('001', 'eka yudistika', 'eka', 'eka'),
('002', 'elistiana', 'elis', 'eka'),
('003', 'alifah', 'ipeh', 'aaa');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
