-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2022 at 08:49 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teknoko`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `harga` float NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_barang`, `nama_barang`, `kategori`, `harga`, `stok`) VALUES
('GL 1', 'Gula Pasir', 'GL', 12000, 50),
('GL 2', 'Gula Jawa', 'GL', 6000, 23),
('KP 1', 'ABC Susu', 'KP', 10000, 38),
('KP 2', 'Kapal Api', 'KP', 12000, 20),
('KP 3', 'Coffe Mix', 'KP', 8000, 42),
('SBN 1', 'Sabun LifeBouy', 'SBN', 3000, 40),
('SBN 2', 'Sabun Shinzui', 'SBN', 7000, 20),
('SNK 1', 'Pocky Coklat', 'SNK', 5000, 100),
('SNK 2', 'Pocky Strowberry', 'SNK', 4000, 188);

-- --------------------------------------------------------

--
-- Table structure for table `laporan_pengiriman`
--

CREATE TABLE `laporan_pengiriman` (
  `id_transaksi` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `laporan_pengiriman`
--

INSERT INTO `laporan_pengiriman` (`id_transaksi`, `nama`, `alamat`, `biaya`) VALUES
('A 100', 'Aqil', 'BanjarSari', 50000),
('A 102', 'Bagus', 'Purwokerto', 50000),
('A 103', 'Bintang', 'Purwokerto', 50000),
('A 104', 'Bintang', 'Bali', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_login` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_login`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(20) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `tgl_transaksi`, `bayar`, `kembalian`, `total`) VALUES
('A 100', '2022-01-11', 240000, 1000, 239000),
('A 101', '2022-01-11', 100000, 2000, 98000),
('A 102', '2022-01-13', 200000, 83000, 117000),
('A 103', '2022-01-26', 80000, 4000, 76000),
('A 104', '2022-01-26', 110000, 0, 110000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_barang`
--

CREATE TABLE `transaksi_barang` (
  `id_transaksi` varchar(20) NOT NULL,
  `kd_barang` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga_akhir` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi_barang`
--

INSERT INTO `transaksi_barang` (`id_transaksi`, `kd_barang`, `jumlah`, `harga_akhir`) VALUES
('A 100', 'GL 1', 5, 60000),
('A 100', 'KP 1', 8, 80000),
('A 100', 'KP 2', 7, 84000),
('A 100', 'SNK 1', 3, 15000),
('A 101', 'SBN 1', 7, 21000),
('A 101', 'SBN 2', 7, 49000),
('A 101', 'SNK 2', 7, 28000),
('A 102', 'GL 1', 3, 36000),
('A 102', 'KP 2', 5, 60000),
('A 102', 'SBN 2', 3, 21000),
('A 103', 'GL 2', 4, 24000),
('A 103', 'KP 1', 2, 20000),
('A 103', 'KP 3', 4, 32000),
('A 104', 'GL 2', 3, 18000),
('A 104', 'KP 2', 5, 60000),
('A 104', 'KP 3', 4, 32000);

--
-- Triggers `transaksi_barang`
--
DELIMITER $$
CREATE TRIGGER `transaksi_barang` AFTER INSERT ON `transaksi_barang` FOR EACH ROW UPDATE barang
    SET stok = stok - NEW.jumlah
    WHERE kd_barang = NEW.kd_barang
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `laporan_pengiriman`
--
ALTER TABLE `laporan_pengiriman`
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `transaksi_barang`
--
ALTER TABLE `transaksi_barang`
  ADD KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `kd_barang` (`kd_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `laporan_pengiriman`
--
ALTER TABLE `laporan_pengiriman`
  ADD CONSTRAINT `laporan_pengiriman_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_barang`
--
ALTER TABLE `transaksi_barang`
  ADD CONSTRAINT `transaksi_barang_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_barang_ibfk_2` FOREIGN KEY (`kd_barang`) REFERENCES `barang` (`kd_barang`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
