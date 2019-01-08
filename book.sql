CREATE TABLE `book` (
  `ISBN` bigint(20) NOT NULL,
  `bookName` varchar(50) DEFAULT NULL,
  `publication` varchar(50) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

