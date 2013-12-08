-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2013 at 01:06 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `appserver`
--

-- --------------------------------------------------------

--
-- Table structure for table `app_status`
--

CREATE TABLE IF NOT EXISTS `app_status` (
  `APPID` varchar(255) NOT NULL,
  `APPSTATUS` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`APPID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `app_status`
--

INSERT INTO `app_status` (`APPID`, `APPSTATUS`) VALUES
('01a5cc04-ef5b-4440-9b5d-b4d3bc8eecc5', 1),
('06f785a4-faac-4a94-9041-51b408b79bae', 0),
('082f00c2-c164-4974-b8cf-255c90699b1d', 0),
('08c5136f-4d2d-47d6-81fe-3cc5d24b96f6', 0),
('0b77d016-0dfd-4900-afe5-d3d604869273', 0),
('126c522e-e211-43ec-8c51-9a55d95e5549', 0),
('12b07921-46d0-412d-8644-4ca3b27ea63d', 1),
('1703467a-70a0-4a2c-9e71-f919f9153553', 0),
('18b0eb44-29ad-42cf-881b-965952511cb2', 0),
('19a46223-1766-492d-803c-8a487d2a40ef', 1),
('1b1c40b6-3860-4b2d-be81-3157db01d06d', 0),
('1c0a636b-998d-4570-beea-41401b153493', 1),
('1cee9ffd-c292-4d71-872e-a924945c1fe0', 1),
('2095d369-a4c9-4f3a-9aaa-11ded802b117', 1),
('20e3d090-a2a8-4307-b688-19db1aac017f', 1),
('2134c6ab-f119-41ad-a839-0a5c21810871', 1),
('2194be9d-de55-42c0-9eca-9dd20dac7093', 1),
('22216f4d-dd51-4343-9668-2ea40cf007bf', 0),
('24ce0b6f-6ea2-4b79-a448-b54eccb47e61', 1),
('29c5c71f-40c1-4a37-ad63-543360d1c0be', 0),
('2a4068bf-0ae5-47ea-80f7-8c82c63de0fc', 1),
('2b0cc1fd-c555-4534-afb5-74b53a7f248f', 0),
('3026178f-6650-4ac4-9cec-0f0c94236458', 1),
('32656190-bfc9-4146-bd3e-7a26f404325f', 1),
('38d65e6d-60e8-4754-8dc0-f2e0e9e1d280', 1),
('3ad77342-3f35-4b0f-aa78-712797b37a92', 0),
('3d188671-c452-429f-b44b-82d393b416f1', 1),
('3d928097-8ce3-4dd9-a2ba-003ba2944894', 1),
('44210714-e768-4c59-bc6b-8509d8f3459d', 0),
('45697c13-1fa7-48d6-8905-6f20fd67f504', 0),
('472d7bd4-ad28-461f-8eaa-c6ce19bd2cb0', 1),
('509c45cf-28f6-4cca-bd12-b7307befffab', 0),
('51f235a0-7198-4889-81b1-3a8443e2d5c8', 0),
('5221c406-f211-4bb1-ac83-34635ab09097', 1),
('522ec522-ee76-4d09-8859-3984796bfb9f', 0),
('52a3b522-af84-4083-9b57-aff55bef69ba', 1),
('5316da0d-2fbd-4c29-ac9b-a2619d750811', 1),
('5b6ad39c-ecf9-4ff5-8ab8-acfe294eff06', 1),
('5f6167f2-b093-42c8-bd59-a2ba11b3affc', 0),
('61d96dff-c206-477f-b7fd-18a64fa344ff', 0),
('6cc38d48-a0a5-4753-8de4-8583f4a4169f', 0),
('6d8137c2-8646-469a-9ad7-cc762d74437d', 0),
('721a9497-61e9-4bd0-ad85-ee78a803e167', 1),
('72a0cab1-6fbd-498d-aae4-1ff309d5b9a4', 1),
('72a3eb57-4ce4-4083-b3ec-ab49f14124e1', 1),
('735883a5-e0eb-4c63-971c-d231b34d75ab', 0),
('73b547fe-14fc-43a4-a592-7a35f063dcdc', 0),
('77367189-9f44-4962-9997-7b7898a8ffbf', 0),
('7751b249-a298-4258-a5ba-dc8aa0b154f2', 0),
('7a599f78-0e9d-4520-87d8-ae1c6c2a4386', 0),
('7b77632b-9be7-4073-bcaa-183cfd457756', 1),
('7eed75ab-5a7d-412c-95b1-a7f599c13f94', 0),
('83a70aaa-70b8-4d8e-9e0f-8509b3329320', 0),
('83b73aa3-e1b7-4cd4-8d26-468f63d09308', 1),
('8824be4e-fc31-4ea0-9d4c-353165ee75f2', 0),
('8ac2c1c4-63c7-4761-94cb-afb1eb08799f', 1),
('8de317d1-9345-4ebf-ab93-4c8d696b081e', 0),
('905ca3b6-9a30-47b3-85da-3fd401fa99fb', 1),
('9132810d-5041-44e6-912d-8c3d2c5718d1', 1),
('93ec87f2-3c25-4f8a-b689-a22af805cd99', 0),
('95cd19a4-165d-4ad6-a147-92ccc3abb118', 0),
('9a3bc59b-2049-45b2-aa53-64f44bf8a58a', 0),
('9b441ddf-a367-4f41-afce-a23c453b1c1d', 1),
('9c5f6c3e-738a-4989-b2d0-7913386b949c', 1),
('9de4566b-29c9-44a4-85f4-317ce55aff50', 0),
('a1971ae8-d3c6-471d-81e7-53a0bdc77f0c', 0),
('a57af253-1f09-4067-be3b-e67ae0807520', 1),
('a64a616a-5d14-4c6d-a188-6798f04f7204', 1),
('ada16600-b3d9-460d-be09-8a96af8cc49e', 1),
('aed41b08-f851-4288-82c3-bb90222c501b', 0),
('af0ca1fa-2ae3-4a57-b778-4a8941f33209', 0),
('af9d4659-7377-4c51-a0e3-98673ccb668a', 1),
('afc699c4-6763-4cd6-a344-734c5aff416e', 0),
('b0a0d5c1-8369-4f89-aaf8-b7621e590413', 0),
('b0b6f61d-d89f-4421-9137-a289c91f6b70', 0),
('b4d61185-fc4d-48d9-8759-68b0d836d6a8', 0),
('b7dc3d77-8d8a-4f8d-b8d8-6c656aa9e3d1', 0),
('b819b288-ce5e-45b2-ba64-150dd478672a', 1),
('b81f8658-fbc6-4b59-b75a-31777e68b7e1', 1),
('b843ee9d-ec76-4054-9819-344990f22d7f', 0),
('be607b5f-f341-4ee0-a1ea-8e04fd8a5ef9', 1),
('c15e395a-0ccf-43b8-a140-03ac058f7e14', 0),
('c3cff526-d08b-43a4-b7c4-8fbd4018cb95', 0),
('c932589c-fe6b-40c0-a32b-49c74bf4ab19', 1),
('ca0742bb-ff02-4cff-ab7c-f8b77a486f91', 1),
('cd6b1bfd-bbe5-4a37-acf2-da30b814dd27', 0),
('cfd7a055-2c3b-4503-b6a5-6aa398967d8a', 1),
('d386b748-3a49-4993-b683-3f5bcc6e733c', 0),
('d8838ad6-8bfd-4c9c-82cf-c5cfc63e6132', 0),
('dba709c7-265c-4e1e-baed-3c3a3d4e7a6b', 0),
('dc1309ac-9ced-4906-8250-bb607a1859c0', 0),
('e612536d-f849-4bb4-9ada-b47822151061', 1),
('e6377c76-6ef1-454e-9d91-e5e60aa61c5a', 1),
('e7570055-f1b9-4f19-b628-1935f458001e', 0),
('eb53d012-f7d3-4ffd-a379-363cacc86cad', 1),
('eb906ab7-02a8-40b6-b85e-61b08ea66dd4', 1),
('eb99bd1f-8f16-455c-a404-165be2ad0168', 1),
('f1dd5d1b-58ac-4ebb-a210-9ab69869e847', 1),
('f2ff7a98-dec6-4fb1-9b56-3c18e5c5369b', 1),
('fef1d20b-8cde-4fdd-9975-d6b25db251c7', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
