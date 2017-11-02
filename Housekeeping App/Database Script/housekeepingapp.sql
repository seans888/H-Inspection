-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2017 at 11:57 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `housekeepingapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `inspectionchecklist`
--

CREATE TABLE `inspectionchecklist` (
  `RecId` varchar(36) NOT NULL,
  `ChecklistNo` int(11) NOT NULL,
  `RoomTypeCode` varchar(250) NOT NULL,
  `RoomPart` varchar(250) NOT NULL,
  `SubPart1` varchar(50) NOT NULL,
  `SubPart2` varchar(50) NOT NULL,
  `ChecklistCode` varchar(250) NOT NULL,
  `ChecklistDescription` varchar(500) NOT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inspectionchecklist`
--

INSERT INTO `inspectionchecklist` (`RecId`, `ChecklistNo`, `RoomTypeCode`, `RoomPart`, `SubPart1`, `SubPart2`, `ChecklistCode`, `ChecklistDescription`, `DateCreated`) VALUES
('781f8372-b913-11e7-906f-5cf9389ce0eb', 1, 'NS', 'Entrance', '1', '0', 'NS-Entrance-1-0', 'Entrance louver –clean & dust-free', '2017-10-24 23:31:32'),
('781f9aaa-b913-11e7-906f-5cf9389ce0eb', 2, 'NS', 'Entrance', '1', '0', 'NS-Entrance-2-0', 'Room plate no. – clean & well-polished', '2017-10-24 23:31:32'),
('781f9b7d-b913-11e7-906f-5cf9389ce0eb', 3, 'NS', 'Entrance', '2', '0', 'NS-Entrance-3-0', 'Appearance door surface- in good condition', '2017-10-24 23:31:32'),
('781f9c44-b913-11e7-906f-5cf9389ce0eb', 4, 'NS', 'Entrance', '3', '0', 'NS-Entrance-4-0', 'Let the door close by itself to test the door closure – in working order', '2017-10-24 23:31:32'),
('781f9ca5-b913-11e7-906f-5cf9389ce0eb', 5, 'NS', 'Entrance', '4', '0', 'NS-Entrance-5-0', 'Eye viewer and fire escape plan in order.', '2017-10-24 23:31:32'),
('781f9d01-b913-11e7-906f-5cf9389ce0eb', 6, 'NS', 'Entrance', '5', '0', 'NS-Entrance-6-0', 'Privacy Sign/Make Up Room Sign', '2017-10-24 23:31:32'),
('781f9d87-b913-11e7-906f-5cf9389ce0eb', 7, 'NS', 'Entrance', '6', '0', 'NS-Entrance-7-0', 'Key card holder – in working order', '2017-10-24 23:31:32'),
('781f9dfe-b913-11e7-906f-5cf9389ce0eb', 8, 'NS', 'Entrance', '7', '0', 'NS-Entrance-8-0', 'Switches at the entrance working correctly', '2017-10-24 23:31:32'),
('781f9e4f-b913-11e7-906f-5cf9389ce0eb', 9, 'NS', 'Entrance', '8', '0', 'NS-Closet-1-0', 'Door surface in good condition', '2017-10-24 23:31:32'),
('781f9eb0-b913-11e7-906f-5cf9389ce0eb', 10, 'NS', 'Closet', '1', '0', 'NS-Closet-2-0', 'Lights in working order', '2017-10-24 23:31:32'),
('781f9f01-b913-11e7-906f-5cf9389ce0eb', 11, 'NS', 'Closet', '2', '0', 'NS-Closet-3-0', 'Ensure the items below are sufficient:', '2017-10-24 23:31:32'),
('781f9f52-b913-11e7-906f-5cf9389ce0eb', 12, 'NS', 'Closet', '3', '0', 'NS-Closet-3-1', '6 Hangers ', '2017-10-24 23:31:32'),
('781f9f9d-b913-11e7-906f-5cf9389ce0eb', 13, 'NS', 'Closet', '3', '1', 'NS-Closet-3-2', '2 bathrobes ', '2017-10-24 23:31:32'),
('781f9fe8-b913-11e7-906f-5cf9389ce0eb', 14, 'NS', 'Closet', '3', '2', 'NS-Closet-3-3', '2 pairs of slippers', '2017-10-24 23:31:32'),
('781fa039-b913-11e7-906f-5cf9389ce0eb', 15, 'NS', 'Closet', '3', '3', 'NS-Closet-3-4', '1 set of iron and board', '2017-10-24 23:31:32'),
('781fa0a0-b913-11e7-906f-5cf9389ce0eb', 16, 'NS', 'Closet', '3', '4', 'NS-Closet-3-5', 'Elsafe open/ working', '2017-10-24 23:31:32'),
('781fa0e6-b913-11e7-906f-5cf9389ce0eb', 17, 'NS', 'Closet', '3', '5', 'NS-Closet-3-6', '1 set of laundry list and bag', '2017-10-24 23:31:32'),
('781fa13c-b913-11e7-906f-5cf9389ce0eb', 18, 'NS', 'Closet', '3', '6', 'NS-Closet-3-7', '1 extra pillow with pillow cover ', '2017-10-24 23:31:32'),
('781fa18d-b913-11e7-906f-5cf9389ce0eb', 19, 'NS', 'Closet', '3', '7', 'NS-Closet-3-8', 'Dining dress code', '2017-10-24 23:31:32'),
('781fa1d3-b913-11e7-906f-5cf9389ce0eb', 20, 'NS', 'Closet', '3', '8', 'NS-Closet-3-9', 'Flashlight', '2017-10-24 23:31:32'),
('781fa219-b913-11e7-906f-5cf9389ce0eb', 21, 'NS', 'Closet', '3', '9', 'NS-Luggage-1-0', 'Luggage bench fabric top is clean', '2017-10-24 23:31:32'),
('781fa26a-b913-11e7-906f-5cf9389ce0eb', 22, 'NS', 'Luggage', '1', '0', 'NS-Luggage-2-0', 'Drawers – clean & dust-free', '2017-10-24 23:31:32'),
('781fa316-b913-11e7-906f-5cf9389ce0eb', 23, 'NS', 'Luggage', '2', '0', 'NS-Minibar-1-0', 'Arrangement of the items is neat & clean', '2017-10-24 23:31:32'),
('781fa35c-b913-11e7-906f-5cf9389ce0eb', 24, 'NS', 'Minibar', '1', '0', 'NS-Minibar-2-0', 'Ensure the items below are sufficient:', '2017-10-24 23:31:32'),
('781fa39d-b913-11e7-906f-5cf9389ce0eb', 25, 'NS', 'Minibar', '2', '0', 'NS-Minibar-2-1', '2 coke, 2 sprite, 1 C2 lemon, 1 C2 apple, 1 pineapple juice, 1 orange juice, 1 mineral water, 2 San Mig Light, 2 Pale Pilsen', '2017-10-24 23:31:32'),
('781fa3fe-b913-11e7-906f-5cf9389ce0eb', 26, 'NS', 'Minibar', '2', '1', 'NS-Minibar-2-2', '1 Pringles, 1 cashew nut, 1 cup noodles (placed in the coffee tray on the writing desk)', '2017-10-24 23:31:32'),
('781fa444-b913-11e7-906f-5cf9389ce0eb', 27, 'NS', 'Minibar', '2', '2', 'NS-Minibar-3-0', 'Fridge is cold and clean', '2017-10-24 23:31:32'),
('781fa485-b913-11e7-906f-5cf9389ce0eb', 28, 'NS', 'Minibar', '3', '0', 'NS-WritingTable-1-0', 'Check the table surface – clean', '2017-10-24 23:31:32'),
('781fa4c5-b913-11e7-906f-5cf9389ce0eb', 29, 'NS', 'WritingTable', '1', '0', 'NS-WritingTable-2-0', 'Lights and switches are working', '2017-10-24 23:31:32'),
('781fa506-b913-11e7-906f-5cf9389ce0eb', 30, 'NS', 'WritingTable', '2', '0', 'NS-WritingTable-3-0', 'Hairdryer', '2017-10-24 23:31:32'),
('781fa547-b913-11e7-906f-5cf9389ce0eb', 31, 'NS', 'WritingTable', '3', '0', 'NS-WritingTable-4-0', 'Dustbin under the table is clean', '2017-10-24 23:31:32'),
('781fa587-b913-11e7-906f-5cf9389ce0eb', 32, 'NS', 'WritingTable', '4', '0', 'NS-WritingTable-5-0', 'Items on writing table:', '2017-10-24 23:31:32'),
('781fa5c8-b913-11e7-906f-5cf9389ce0eb', 33, 'NS', 'WritingTable', '5', '0', 'NS-WritingTable-5-1', 'Compendium with 1 stationary pad, 1 envelope, channel guide', '2017-10-24 23:31:32'),
('781fa60e-b913-11e7-906f-5cf9389ce0eb', 34, 'NS', 'WritingTable', '5', '1', 'NS-WritingTable-5-2', 'Guest Comment Card', '2017-10-24 23:31:32'),
('781fa65f-b913-11e7-906f-5cf9389ce0eb', 35, 'NS', 'WritingTable', '5', '2', 'NS-WritingTable-5-3', 'Pencil', '2017-10-24 23:31:32'),
('781fa6a0-b913-11e7-906f-5cf9389ce0eb', 36, 'NS', 'WritingTable', '5', '3', 'NS-WritingTable-5-4', 'We Go Beyond Card', '2017-10-24 23:31:32'),
('781fa6e0-b913-11e7-906f-5cf9389ce0eb', 37, 'NS', 'WritingTable', '5', '4', 'NS-WritingTable-5-5', 'Minibar Voucher/Slip', '2017-10-24 23:31:32'),
('781fa721-b913-11e7-906f-5cf9389ce0eb', 38, 'NS', 'WritingTable', '5', '5', 'NS-WritingTable-5-6', 'Happenings This Week', '2017-10-24 23:31:32'),
('781fa7cd-b913-11e7-906f-5cf9389ce0eb', 39, 'NS', 'WritingTable', '5', '6', 'NS-WritingTable-5-7', 'Wine List', '2017-10-24 23:31:32'),
('781fa819-b913-11e7-906f-5cf9389ce0eb', 40, 'NS', 'WritingTable', '5', '7', 'NS-WritingTable-5-8', 'Safety and Security Tent Card', '2017-10-24 23:31:32'),
('781fa864-b913-11e7-906f-5cf9389ce0eb', 41, 'NS', 'WritingTable', '5', '8', 'NS-WritingTable-5-9', 'Coffee tray with 3 coffee sticks, 3 creamer, 3 white sugar, 3 brown sugar, 1 Equal/sweetener, 3 Lipton tea, 2 mineral water, 3 cocktail napkin ', '2017-10-24 23:31:32'),
('781fa8c0-b913-11e7-906f-5cf9389ce0eb', 42, 'NS', 'WritingTable', '5', '9', 'NS-WritingTable-5-10', '2 mugs overturned with coaster (for Lake Wing)', '2017-10-24 23:31:32'),
('781fa931-b913-11e7-906f-5cf9389ce0eb', 43, 'NS', 'WritingTable', '5', '10', 'NS-WritingTable-5-11', '2 cups and saucers (for Mountain Wing)', '2017-10-24 23:31:32'),
('781fa982-b913-11e7-906f-5cf9389ce0eb', 44, 'NS', 'WritingTable', '5', '11', 'NS-WritingTable-5-12', 'Kettle', '2017-10-24 23:31:32'),
('781fa9d3-b913-11e7-906f-5cf9389ce0eb', 45, 'NS', 'WritingTable', '5', '12', 'NS-WritingTable-6-0', 'Magazine', '2017-10-24 23:31:32'),
('781faa24-b913-11e7-906f-5cf9389ce0eb', 46, 'NS', 'WritingTable', '6', '0', 'NS-WritingTable-7-0', 'Welcome fruits – check on freshness', '2017-10-24 23:31:32'),
('781faa7a-b913-11e7-906f-5cf9389ce0eb', 47, 'NS', 'WritingTable', '7', '0', 'NS-WritingTable-8-0', 'TV rim no finger marks', '2017-10-24 23:31:32'),
('781faacb-b913-11e7-906f-5cf9389ce0eb', 48, 'NS', 'WritingTable', '8', '0', 'NS-WritingTable-9-0', 'TV channel all correct and clear', '2017-10-24 23:31:32'),
('781fab16-b913-11e7-906f-5cf9389ce0eb', 49, 'NS', 'WritingTable', '9', '0', 'NS-CenterTable-1-0', 'Arrangement of the sofa & table  in order.', '2017-10-24 23:31:32'),
('781fab6c-b913-11e7-906f-5cf9389ce0eb', 50, 'NS', 'CenterTable', '1', '0', 'NS-CenterTable-2-0', 'Check underneath cushion ', '2017-10-24 23:31:32'),
('781fabc3-b913-11e7-906f-5cf9389ce0eb', 51, 'NS', 'CenterTable', '2', '0', 'NS-CenterTable-3-0', 'Fruit plate, napkin and 2 sets cutleries - clean.', '2017-10-24 23:31:32'),
('781fac14-b913-11e7-906f-5cf9389ce0eb', 52, 'NS', 'CenterTable', '3', '0', 'NS-Window-1-0', 'Check appearance of the glass – clean', '2017-10-24 23:31:32'),
('781fac75-b913-11e7-906f-5cf9389ce0eb', 53, 'NS', 'Window', '1', '0', 'NS-Window-2-0', 'Curtains are neat, presentable with hooks all intact and curtain rod', '2017-10-24 23:31:32'),
('781facc5-b913-11e7-906f-5cf9389ce0eb', 54, 'NS', 'Window', '2', '0', 'NS-Window-3-0', 'Pull the curtains to test if they are working', '2017-10-24 23:31:32'),
('781fad16-b913-11e7-906f-5cf9389ce0eb', 55, 'NS', 'Window', '3', '0', 'NS-BedsideTable-1-0', 'Surface free from stains/sticky stains.', '2017-10-24 23:31:32'),
('781fad62-b913-11e7-906f-5cf9389ce0eb', 56, 'NS', 'BedsideTable', '1', '0', 'NS-BedsideTable-2-0', 'Torch light - working', '2017-10-24 23:31:32'),
('781fadb3-b913-11e7-906f-5cf9389ce0eb', 57, 'NS', 'BedsideTable', '2', '0', 'NS-BedsideTable-3-0', 'Behind table - dust', '2017-10-24 23:31:32'),
('781fadfe-b913-11e7-906f-5cf9389ce0eb', 58, 'NS', 'BedsideTable', '3', '0', 'NS-BedsideTable-4-0', 'All switches and lights – working.', '2017-10-24 23:31:32'),
('781fae49-b913-11e7-906f-5cf9389ce0eb', 59, 'NS', 'BedsideTable', '4', '0', 'NS-BedsideTable-5-0', 'Telephone & template – working ', '2017-10-24 23:31:32'),
('781faef1-b913-11e7-906f-5cf9389ce0eb', 60, 'NS', 'BedsideTable', '5', '0', 'NS-BedsideTable-6-0', 'Items on bedside table:', '2017-10-24 23:31:32'),
('781faf31-b913-11e7-906f-5cf9389ce0eb', 61, 'NS', 'BedsideTable', '6', '0', 'NS-BedsideTable-6-1', '1 Bible, Environment Card, Telephone Directory,  Amenity Card, Room Attendant’s Card,  Asmara Spa Tent Card, TV remote', '2017-10-24 23:31:32'),
('781faf7d-b913-11e7-906f-5cf9389ce0eb', 62, 'NS', 'BedsideTable', '6', '1', 'NS-Bed-1-0', 'Appearance of the bed – neat and sheet tightened.', '2017-10-24 23:31:32'),
('781fafc3-b913-11e7-906f-5cf9389ce0eb', 63, 'NS', 'Bed', '1', '0', 'NS-Bed-2-0', 'Bedsheet and pillow cases clean.', '2017-10-24 23:31:32'),
('781fb009-b913-11e7-906f-5cf9389ce0eb', 64, 'NS', 'Bed', '2', '0', 'NS-Bed-3-0', 'Free from rubbish under the bed.', '2017-10-24 23:31:32'),
('781fb049-b913-11e7-906f-5cf9389ce0eb', 65, 'NS', 'Bed', '3', '0', 'NS-Bed-4-0', 'Bedhead free from dust', '2017-10-24 23:31:32'),
('781fb08a-b913-11e7-906f-5cf9389ce0eb', 66, 'NS', 'Bed', '4', '0', 'NS-Bathroom-1-0', 'Door surface – clean.', '2017-10-24 23:31:32'),
('781fb0d6-b913-11e7-906f-5cf9389ce0eb', 67, 'NS', 'Bathroom', '1', '0', 'NS-Bathroom-2-0', 'Dust bin with liner', '2017-10-24 23:31:32'),
('781fb116-b913-11e7-906f-5cf9389ce0eb', 68, 'NS', 'Bathroom', '2', '0', 'NS-Bathroom-3-0', 'Tub  – clean. Bath soap available', '2017-10-24 23:31:32'),
('781fb15c-b913-11e7-906f-5cf9389ce0eb', 69, 'NS', 'Bathroom', '3', '0', 'NS-Bathroom-4-0', 'Toilet bowl - clean. Flush in working order.', '2017-10-24 23:31:32'),
('781fb1a2-b913-11e7-906f-5cf9389ce0eb', 70, 'NS', 'Bathroom', '4', '0', 'NS-Bathroom-5-0', 'Shower room and shower glass – clean.', '2017-10-24 23:31:32'),
('781fb1e3-b913-11e7-906f-5cf9389ce0eb', 71, 'NS', 'Bathroom', '5', '0', 'NS-Bathroom-6-0', 'Handbasin, vanity counter, vanity mirror and shaving mirror – clean.', '2017-10-24 23:31:32'),
('781fb234-b913-11e7-906f-5cf9389ce0eb', 72, 'NS', 'Bathroom', '6', '0', 'NS-Bathroom-7-0', 'Rubbermat', '2017-10-24 23:31:32'),
('781fb26f-b913-11e7-906f-5cf9389ce0eb', 73, 'NS', 'Bathroom', '7', '0', 'NS-Bathroom-8-0', 'Towel Reminder', '2017-10-24 23:31:32'),
('781fb2b0-b913-11e7-906f-5cf9389ce0eb', 74, 'NS', 'Bathroom', '8', '0', 'NS-Bathroom-9-0', 'Towel supplies:', '2017-10-24 23:31:32'),
('781fb2f1-b913-11e7-906f-5cf9389ce0eb', 75, 'NS', 'Bathroom', '9', '0', 'NS-Bathroom-9-1', '2 bath towels - on the towel rack.', '2017-10-24 23:31:32'),
('781fb331-b913-11e7-906f-5cf9389ce0eb', 76, 'NS', 'Bathroom', '9', '1', 'NS-Bathroom-9-2', '2 hand towels ', '2017-10-24 23:31:32'),
('781fb3e8-b913-11e7-906f-5cf9389ce0eb', 77, 'NS', 'Bathroom', '9', '2', 'NS-Bathroom-9-3', '2 face towels – on vanity counter (For suites, premier and VIPs)', '2017-10-24 23:31:32'),
('781fb434-b913-11e7-906f-5cf9389ce0eb', 78, 'NS', 'Bathroom', '9', '3', 'NS-Bathroom-9-4', '1 bath mat hanging on shower glass door handle ', '2017-10-24 23:31:32'),
('781fb47f-b913-11e7-906f-5cf9389ce0eb', 79, 'NS', 'Bathroom', '9', '4', 'NS-Bathroom-10-0', 'Amenities set-up:', '2017-10-24 23:31:32'),
('781fb4cb-b913-11e7-906f-5cf9389ce0eb', 80, 'NS', 'Bathroom', '10', '0', 'NS-Bathroom-10-1', '1 bath gel', '2017-10-24 23:31:32'),
('781fb516-b913-11e7-906f-5cf9389ce0eb', 81, 'NS', 'Bathroom', '10', '1', 'NS-Bathroom-10-2', '1 shampoo', '2017-10-24 23:31:32'),
('781fb55c-b913-11e7-906f-5cf9389ce0eb', 82, 'NS', 'Bathroom', '10', '2', 'NS-Bathroom-10-3', '1 lotion ', '2017-10-24 23:31:32'),
('781fb5a8-b913-11e7-906f-5cf9389ce0eb', 83, 'NS', 'Bathroom', '10', '3', 'NS-Bathroom-10-4', '1 vanity kit', '2017-10-24 23:31:32'),
('781fb5f3-b913-11e7-906f-5cf9389ce0eb', 84, 'NS', 'Bathroom', '10', '4', 'NS-Bathroom-10-5', '1 bath soap', '2017-10-24 23:31:32'),
('781fb63f-b913-11e7-906f-5cf9389ce0eb', 85, 'NS', 'Bathroom', '10', '5', 'NS-Bathroom-10-6', '1 sanitary bag', '2017-10-24 23:31:32'),
('781fb685-b913-11e7-906f-5cf9389ce0eb', 86, 'NS', 'Bathroom', '10', '6', 'NS-Bathroom-10-7', '1 shower cap', '2017-10-24 23:31:32'),
('781fb6d0-b913-11e7-906f-5cf9389ce0eb', 87, 'NS', 'Bathroom', '10', '7', 'NS-Bathroom-10-8', '2 dental kit', '2017-10-24 23:31:32'),
('781fbef1-b913-11e7-906f-5cf9389ce0eb', 88, 'NS', 'Bathroom', '10', '8', 'NS-Bathroom-10-9', '1 facial tissue in a tissue box', '2017-10-24 23:31:32'),
('781fbf82-b913-11e7-906f-5cf9389ce0eb', 89, 'NS', 'Bathroom', '10', '9', 'NS-Bathroom-11-0', '2 Tumbler overturned with coaster', '2017-10-24 23:31:32'),
('781fbfee-b913-11e7-906f-5cf9389ce0eb', 90, 'NS', 'Bathroom', '11', '0', 'NS-Veranda-1-0', 'Appearance door surface- in good condition.', '2017-10-24 23:31:32'),
('781fc049-b913-11e7-906f-5cf9389ce0eb', 91, 'NS', 'Veranda', '1', '0', 'NS-Veranda-2-0', 'Glass panel and door -clean', '2017-10-24 23:31:32'),
('781fc0a5-b913-11e7-906f-5cf9389ce0eb', 92, 'NS', 'Veranda', '2', '0', 'NS-Veranda-3-0', 'Door lock functioning well', '2017-10-24 23:31:32'),
('781fc0f6-b913-11e7-906f-5cf9389ce0eb', 93, 'NS', 'Veranda', '3', '0', 'NS-Veranda-4-0', 'Lamp/light/diffuser clean and working', '2017-10-24 23:31:32'),
('781fc141-b913-11e7-906f-5cf9389ce0eb', 94, 'NS', 'Veranda', '4', '0', 'NS-Veranda-5-0', 'Table and chairs clean', '2017-10-24 23:31:32'),
('781fc192-b913-11e7-906f-5cf9389ce0eb', 95, 'NS', 'Veranda', '5', '0', 'S-Entrance-1-0', 'Entrance louver –clean & dust-free', '2017-10-24 23:31:32'),
('781fc1e8-b913-11e7-906f-5cf9389ce0eb', 96, 'S', 'Entrance', '1', '0', 'S-Entrance-2-0', 'Room plate no. – clean & well-polished', '2017-10-24 23:31:32'),
('781fc239-b913-11e7-906f-5cf9389ce0eb', 97, 'S', 'Entrance', '2', '0', 'S-Entrance-3-0', 'Appearance door surface- in good condition', '2017-10-24 23:31:32'),
('781fc28f-b913-11e7-906f-5cf9389ce0eb', 98, 'S', 'Entrance', '3', '0', 'S-Entrance-4-0', 'Let the door close by itself to test the door closure – in working order', '2017-10-24 23:31:32'),
('781fc2eb-b913-11e7-906f-5cf9389ce0eb', 99, 'S', 'Entrance', '4', '0', 'S-Entrance-5-0', 'Eye viewer and fire escape plan in order.', '2017-10-24 23:31:32'),
('781fc337-b913-11e7-906f-5cf9389ce0eb', 100, 'S', 'Entrance', '5', '0', 'S-Entrance-6-0', 'Privacy Sign/Make Up Room Sign', '2017-10-24 23:31:32'),
('781fc382-b913-11e7-906f-5cf9389ce0eb', 101, 'S', 'Entrance', '6', '0', 'S-Entrance-7-0', 'Key card holder – in working order', '2017-10-24 23:31:32'),
('781fc3cd-b913-11e7-906f-5cf9389ce0eb', 102, 'S', 'Entrance', '7', '0', 'S-Entrance-8-0', 'Switches at the entrance working correctly', '2017-10-24 23:31:32'),
('781fc414-b913-11e7-906f-5cf9389ce0eb', 103, 'S', 'Entrance', '8', '0', 'S-Closet-1-0', 'Door surface in good condition', '2017-10-24 23:31:32'),
('781fc46a-b913-11e7-906f-5cf9389ce0eb', 104, 'S', 'Closet', '1', '0', 'S-Closet-2-0', 'Lights in working order', '2017-10-24 23:31:32'),
('781fc4bb-b913-11e7-906f-5cf9389ce0eb', 105, 'S', 'Closet', '2', '0', 'S-Closet-3-0', 'Ensure the items below are sufficient:', '2017-10-24 23:31:32'),
('781fc506-b913-11e7-906f-5cf9389ce0eb', 106, 'S', 'Closet', '3', '0', 'S-Closet-3-1', '6 Hangers ', '2017-10-24 23:31:32'),
('781fc557-b913-11e7-906f-5cf9389ce0eb', 107, 'S', 'Closet', '3', '1', 'S-Closet-3-2', '2 bathrobes ', '2017-10-24 23:31:32'),
('781fc5a2-b913-11e7-906f-5cf9389ce0eb', 108, 'S', 'Closet', '3', '2', 'S-Closet-3-3', '2 pairs of slippers', '2017-10-24 23:31:32'),
('781fc5f3-b913-11e7-906f-5cf9389ce0eb', 109, 'S', 'Closet', '3', '3', 'S-Closet-3-4', '1 set of iron and board', '2017-10-24 23:31:32'),
('781fc649-b913-11e7-906f-5cf9389ce0eb', 110, 'S', 'Closet', '3', '4', 'S-Closet-3-5', 'Elsafe open/ working', '2017-10-24 23:31:32'),
('781fc68f-b913-11e7-906f-5cf9389ce0eb', 111, 'S', 'Closet', '3', '5', 'S-Closet-3-6', '1 set of laundry list and bag', '2017-10-24 23:31:32'),
('781fc6db-b913-11e7-906f-5cf9389ce0eb', 112, 'S', 'Closet', '3', '6', 'S-Closet-3-7', '1 extra pillow with pillow cover ', '2017-10-24 23:31:32'),
('781fc72c-b913-11e7-906f-5cf9389ce0eb', 113, 'S', 'Closet', '3', '7', 'S-Closet-3-8', 'Dining dress code', '2017-10-24 23:31:32'),
('781fc777-b913-11e7-906f-5cf9389ce0eb', 114, 'S', 'Closet', '3', '8', 'S-Closet-3-9', 'Flashlight', '2017-10-24 23:31:32'),
('781fc7bd-b913-11e7-906f-5cf9389ce0eb', 115, 'S', 'Closet', '3', '9', 'S-Luggage-1-0', 'Luggage bench fabric top is clean', '2017-10-24 23:31:32'),
('781fc80e-b913-11e7-906f-5cf9389ce0eb', 116, 'S', 'Luggage', '1', '0', 'S-Luggage-2-0', 'Drawers – clean & dust-free', '2017-10-24 23:31:32'),
('781fc85f-b913-11e7-906f-5cf9389ce0eb', 117, 'S', 'Luggage', '2', '0', 'S-Minibar-1-0', 'Arrangement of the items is neat & clean', '2017-10-24 23:31:32'),
('781fc8b5-b913-11e7-906f-5cf9389ce0eb', 118, 'S', 'Minibar', '1', '0', 'S-Minibar-2-0', 'Ensure the items below are sufficient:', '2017-10-24 23:31:32'),
('781fc901-b913-11e7-906f-5cf9389ce0eb', 119, 'S', 'Minibar', '2', '0', 'S-Minibar-2-1', '2 coke, 2 sprite, 1 C2 lemon, 1 C2 apple, 1 pineapple juice, 1 orange juice, 1 mineral water, 2 San Mig Light, 2 Pale Pilsen', '2017-10-24 23:31:32'),
('781fd1ad-b913-11e7-906f-5cf9389ce0eb', 120, 'S', 'Minibar', '2', '1', 'S-Minibar-2-2', '1 Pringles, 1 cashew nut, 1 cup noodles (placed in the coffee tray on the writing desk)', '2017-10-24 23:31:32'),
('781fd25f-b913-11e7-906f-5cf9389ce0eb', 121, 'S', 'Minibar', '2', '2', 'S-Minibar-3-0', 'Fridge is cold and clean', '2017-10-24 23:31:32'),
('781fd2e0-b913-11e7-906f-5cf9389ce0eb', 122, 'S', 'Minibar', '3', '0', 'S-WritingTable-1-0', 'Check the table surface – clean', '2017-10-24 23:31:32'),
('781fd367-b913-11e7-906f-5cf9389ce0eb', 123, 'S', 'WritingTable', '1', '0', 'S-WritingTable-2-0', 'Lights and switches are working', '2017-10-24 23:31:32'),
('781fd3f9-b913-11e7-906f-5cf9389ce0eb', 124, 'S', 'WritingTable', '2', '0', 'S-WritingTable-3-0', 'Hairdryer', '2017-10-24 23:31:32'),
('781fd47a-b913-11e7-906f-5cf9389ce0eb', 125, 'S', 'WritingTable', '3', '0', 'S-WritingTable-4-0', 'Dustbin under the table is clean', '2017-10-24 23:31:32'),
('781fd531-b913-11e7-906f-5cf9389ce0eb', 126, 'S', 'WritingTable', '4', '0', 'S-WritingTable-5-0', 'Items on writing table:', '2017-10-24 23:31:32'),
('781fd5a2-b913-11e7-906f-5cf9389ce0eb', 127, 'S', 'WritingTable', '5', '0', 'S-WritingTable-5-1', 'Compendium with 1 stationary pad, 1 envelope, channel guide', '2017-10-24 23:31:32'),
('781fd624-b913-11e7-906f-5cf9389ce0eb', 128, 'S', 'WritingTable', '5', '1', 'S-WritingTable-5-2', 'Guest Comment Card', '2017-10-24 23:31:32'),
('781fd68f-b913-11e7-906f-5cf9389ce0eb', 129, 'S', 'WritingTable', '5', '2', 'S-WritingTable-5-3', 'Pencil', '2017-10-24 23:31:32'),
('781fd6e0-b913-11e7-906f-5cf9389ce0eb', 130, 'S', 'WritingTable', '5', '3', 'S-WritingTable-5-4', 'We Go Beyond Card', '2017-10-24 23:31:32'),
('781fd73c-b913-11e7-906f-5cf9389ce0eb', 131, 'S', 'WritingTable', '5', '4', 'S-WritingTable-5-5', 'Minibar Voucher/Slip', '2017-10-24 23:31:32'),
('781fd7ee-b913-11e7-906f-5cf9389ce0eb', 132, 'S', 'WritingTable', '5', '5', 'S-WritingTable-5-6', 'Happenings This Week', '2017-10-24 23:31:32'),
('781fd844-b913-11e7-906f-5cf9389ce0eb', 133, 'S', 'WritingTable', '5', '6', 'S-WritingTable-5-7', 'Wine List', '2017-10-24 23:31:32'),
('781fd89a-b913-11e7-906f-5cf9389ce0eb', 134, 'S', 'WritingTable', '5', '7', 'S-WritingTable-5-8', 'Safety and Security Tent Card', '2017-10-24 23:31:32'),
('781fd8f1-b913-11e7-906f-5cf9389ce0eb', 135, 'S', 'WritingTable', '5', '8', 'S-WritingTable-5-9', 'Coffee tray with 3 coffee sticks, 3 creamer, 3 white sugar, 3 brown sugar, 1 Equal/sweetener, 3 Lipton tea, 2 mineral water, 3 cocktail napkin ', '2017-10-24 23:31:32'),
('781fd94c-b913-11e7-906f-5cf9389ce0eb', 136, 'S', 'WritingTable', '5', '9', 'S-WritingTable-5-10', '2 mugs overturned with coaster (for Lake Wing)', '2017-10-24 23:31:32'),
('781fd9a8-b913-11e7-906f-5cf9389ce0eb', 137, 'S', 'WritingTable', '5', '10', 'S-WritingTable-5-11', '2 cups and saucers (for Mountain Wing', '2017-10-24 23:31:32'),
('781fd9fe-b913-11e7-906f-5cf9389ce0eb', 138, 'S', 'WritingTable', '5', '11', 'S-WritingTable-5-12', 'Kettle', '2017-10-24 23:31:32'),
('781fda4f-b913-11e7-906f-5cf9389ce0eb', 139, 'S', 'WritingTable', '5', '12', 'S-WritingTable-6-0', 'Magazine', '2017-10-24 23:31:32'),
('781fdaa0-b913-11e7-906f-5cf9389ce0eb', 140, 'S', 'WritingTable', '6', '0', 'S-WritingTable-7-0', 'Welcome fruits – check on freshness', '2017-10-24 23:31:32'),
('781fdaf6-b913-11e7-906f-5cf9389ce0eb', 141, 'S', 'WritingTable', '7', '0', 'S-WritingTable-8-0', 'TV rim no finger marks', '2017-10-24 23:31:32'),
('781fdb41-b913-11e7-906f-5cf9389ce0eb', 142, 'S', 'WritingTable', '8', '0', 'S-WritingTable-9-0', 'TV channel all correct and clear', '2017-10-24 23:31:32'),
('781fdb8d-b913-11e7-906f-5cf9389ce0eb', 143, 'S', 'WritingTable', '9', '0', 'S-CenterTable-1-0', 'Arrangement of the sofa & table  in order.', '2017-10-24 23:31:32'),
('781fdbde-b913-11e7-906f-5cf9389ce0eb', 144, 'S', 'CenterTable', '1', '0', 'S-CenterTable-2-0', 'Check underneath cushion ', '2017-10-24 23:31:32'),
('781fdc2e-b913-11e7-906f-5cf9389ce0eb', 145, 'S', 'CenterTable', '2', '0', 'S-CenterTable-3-0', 'Fruit plate, napkin and 2 sets cutleries - clean.', '2017-10-24 23:31:32'),
('781fdc7a-b913-11e7-906f-5cf9389ce0eb', 146, 'S', 'CenterTable', '3', '0', 'S-Window-1-0', 'Check appearance of the glass – clean', '2017-10-24 23:31:32'),
('781fdcc5-b913-11e7-906f-5cf9389ce0eb', 147, 'S', 'Window', '1', '0', 'S-Window-2-0', 'Curtains are neat, presentable with hooks all intact and curtain rod', '2017-10-24 23:31:32'),
('781fdd16-b913-11e7-906f-5cf9389ce0eb', 148, 'S', 'Window', '2', '0', 'S-Window-3-0', 'Pull the curtains to test if they are working', '2017-10-24 23:31:32'),
('781fdd67-b913-11e7-906f-5cf9389ce0eb', 149, 'S', 'Window', '3', '0', 'S-BedsideTable-1-0', 'Surface free from stains/sticky stains.', '2017-10-24 23:31:32'),
('781fddb3-b913-11e7-906f-5cf9389ce0eb', 150, 'S', 'BedsideTable', '1', '0', 'S-BedsideTable-2-0', 'Torch light - working', '2017-10-24 23:31:32'),
('781fde03-b913-11e7-906f-5cf9389ce0eb', 151, 'S', 'BedsideTable', '2', '0', 'S-BedsideTable-3-0', 'Behind table - dust', '2017-10-24 23:31:32'),
('781fde4f-b913-11e7-906f-5cf9389ce0eb', 152, 'S', 'BedsideTable', '3', '0', 'S-BedsideTable-4-0', 'All switches and lights – working.', '2017-10-24 23:31:32'),
('781fde9a-b913-11e7-906f-5cf9389ce0eb', 153, 'S', 'BedsideTable', '4', '0', 'S-BedsideTable-5-0', 'Telephone & template – working ', '2017-10-24 23:31:32'),
('781fdee6-b913-11e7-906f-5cf9389ce0eb', 154, 'S', 'BedsideTable', '5', '0', 'S-BedsideTable-6-0', 'Items on bedside table:', '2017-10-24 23:31:32'),
('781fdf2c-b913-11e7-906f-5cf9389ce0eb', 155, 'S', 'BedsideTable', '6', '0', 'S-BedsideTable-6-1', '1 Bible, Environment Card, Telephone Directory,  Amenity Card, Room Attendant’s Card,  Asmara Spa Tent Card, TV remote', '2017-10-24 23:31:32'),
('781fdf87-b913-11e7-906f-5cf9389ce0eb', 156, 'S', 'BedsideTable', '6', '1', 'S-Bed-1-0', 'Appearance of the bed – neat and sheet tightened.', '2017-10-24 23:31:32'),
('781fdfe3-b913-11e7-906f-5cf9389ce0eb', 157, 'S', 'Bed', '1', '0', 'S-Bed-2-0', 'Bedsheet and pillow cases clean.', '2017-10-24 23:31:32'),
('781fe03f-b913-11e7-906f-5cf9389ce0eb', 158, 'S', 'Bed', '2', '0', 'S-Bed-3-0', 'Free from rubbish under the bed.', '2017-10-24 23:31:32'),
('781fe095-b913-11e7-906f-5cf9389ce0eb', 159, 'S', 'Bed', '3', '0', 'S-Bed-4-0', 'Bedhead free from dust', '2017-10-24 23:31:32'),
('781fe0eb-b913-11e7-906f-5cf9389ce0eb', 160, 'S', 'Bed', '4', '0', 'S-Bathroom-1-0', 'Door surface – clean.', '2017-10-24 23:31:32'),
('781fe13c-b913-11e7-906f-5cf9389ce0eb', 161, 'S', 'Bathroom', '1', '0', 'S-Bathroom-2-0', 'Dust bin with liner', '2017-10-24 23:31:32'),
('781fe18d-b913-11e7-906f-5cf9389ce0eb', 162, 'S', 'Bathroom', '2', '0', 'S-Bathroom-3-0', 'Tub  – clean. Bath soap available', '2017-10-24 23:31:32'),
('781fe1de-b913-11e7-906f-5cf9389ce0eb', 163, 'S', 'Bathroom', '3', '0', 'S-Bathroom-4-0', 'Toilet bowl - clean. Flush in working order.', '2017-10-24 23:31:32'),
('781fe234-b913-11e7-906f-5cf9389ce0eb', 164, 'S', 'Bathroom', '4', '0', 'S-Bathroom-5-0', 'Shower room and shower glass – clean.', '2017-10-24 23:31:32'),
('781fe28a-b913-11e7-906f-5cf9389ce0eb', 165, 'S', 'Bathroom', '5', '0', 'S-Bathroom-6-0', 'Handbasin, vanity counter, vanity mirror and shaving mirror – clean.', '2017-10-24 23:31:32'),
('781fe2db-b913-11e7-906f-5cf9389ce0eb', 166, 'S', 'Bathroom', '6', '0', 'S-Bathroom-7-0', 'Rubbermat', '2017-10-24 23:31:32'),
('781fe326-b913-11e7-906f-5cf9389ce0eb', 167, 'S', 'Bathroom', '7', '0', 'S-Bathroom-8-0', 'Towel Reminder', '2017-10-24 23:31:32'),
('781fe36c-b913-11e7-906f-5cf9389ce0eb', 168, 'S', 'Bathroom', '8', '0', 'S-Bathroom-9-0', 'Towel supplies:', '2017-10-24 23:31:32'),
('781fe3c3-b913-11e7-906f-5cf9389ce0eb', 169, 'S', 'Bathroom', '9', '0', 'S-Bathroom-9-1', '2 bath towels - on the towel rack.', '2017-10-24 23:31:32'),
('781fe409-b913-11e7-906f-5cf9389ce0eb', 170, 'S', 'Bathroom', '9', '1', 'S-Bathroom-9-2', '2 hand towels ', '2017-10-24 23:31:32'),
('781fe44f-b913-11e7-906f-5cf9389ce0eb', 171, 'S', 'Bathroom', '9', '2', 'S-Bathroom-9-3', '2 face towels – on vanity counter (For suites, premier and VIPs)', '2017-10-24 23:31:32'),
('781fe4a0-b913-11e7-906f-5cf9389ce0eb', 172, 'S', 'Bathroom', '9', '3', 'S-Bathroom-9-4', '1 bath mat hanging on shower glass door handle ', '2017-10-24 23:31:32'),
('781fe4e6-b913-11e7-906f-5cf9389ce0eb', 173, 'S', 'Bathroom', '9', '4', 'S-Bathroom-10-0', 'Amenities set-up:', '2017-10-24 23:31:32'),
('781fe531-b913-11e7-906f-5cf9389ce0eb', 174, 'S', 'Bathroom', '10', '0', 'S-Bathroom-10-1', '1 bath gel', '2017-10-24 23:31:32'),
('781fe57d-b913-11e7-906f-5cf9389ce0eb', 175, 'S', 'Bathroom', '10', '1', 'S-Bathroom-10-2', '1 shampoo', '2017-10-24 23:31:32'),
('781fe5c8-b913-11e7-906f-5cf9389ce0eb', 176, 'S', 'Bathroom', '10', '2', 'S-Bathroom-10-3', '1 lotion ', '2017-10-24 23:31:32'),
('781fe60e-b913-11e7-906f-5cf9389ce0eb', 177, 'S', 'Bathroom', '10', '3', 'S-Bathroom-10-4', '1 vanity kit', '2017-10-24 23:31:32'),
('781fe65a-b913-11e7-906f-5cf9389ce0eb', 178, 'S', 'Bathroom', '10', '4', 'S-Bathroom-10-5', '1 bath soap', '2017-10-24 23:31:32'),
('781ff895-b913-11e7-906f-5cf9389ce0eb', 179, 'S', 'Bathroom', '10', '5', 'S-Bathroom-10-6', '1 sanitary bag', '2017-10-24 23:31:32'),
('781ff937-b913-11e7-906f-5cf9389ce0eb', 180, 'S', 'Bathroom', '10', '6', 'S-Bathroom-10-7', '1 shower cap', '2017-10-24 23:31:32'),
('781ff987-b913-11e7-906f-5cf9389ce0eb', 181, 'S', 'Bathroom', '10', '7', 'S-Bathroom-10-8', '2 dental kit', '2017-10-24 23:31:32'),
('781ff9de-b913-11e7-906f-5cf9389ce0eb', 182, 'S', 'Bathroom', '10', '8', 'S-Bathroom-10-9', '1 facial tissue in a tissue box', '2017-10-24 23:31:32'),
('781ffa29-b913-11e7-906f-5cf9389ce0eb', 183, 'S', 'Bathroom', '10', '9', 'S-Bathroom-11-0', '2 Tumbler overturned with coaster', '2017-10-24 23:31:32'),
('781ffa7a-b913-11e7-906f-5cf9389ce0eb', 184, 'S', 'Bathroom', '11', '0', 'S-Veranda-1-0', 'Appearance door surface- in good condition.', '2017-10-24 23:31:32'),
('781ffaf6-b913-11e7-906f-5cf9389ce0eb', 185, 'S', 'Veranda', '1', '0', 'S-Veranda-2-0', 'Glass panel and door -clean', '2017-10-24 23:31:32'),
('781ffb82-b913-11e7-906f-5cf9389ce0eb', 186, 'S', 'Veranda', '2', '0', 'S-Veranda-3-0', 'Door lock functioning well', '2017-10-24 23:31:32'),
('781ffc09-b913-11e7-906f-5cf9389ce0eb', 187, 'S', 'Veranda', '3', '0', 'S-Veranda-4-0', 'Lamp/light/diffuser clean and working', '2017-10-24 23:31:32'),
('781ffc85-b913-11e7-906f-5cf9389ce0eb', 188, 'S', 'Veranda', '4', '0', 'S-Veranda-5-0', 'Table and chairs clean', '2017-10-24 23:31:32'),
('781ffd41-b913-11e7-906f-5cf9389ce0eb', 189, 'S', 'Veranda', '5', '0', 'S-PowderRoom-1-0', 'Appearance door surface- in good condition.', '2017-10-24 23:31:32'),
('781ffda2-b913-11e7-906f-5cf9389ce0eb', 190, 'S', 'PowderRoom', '1', '0', 'S-PowderRoom-2-0', 'Light switches working correctly.', '2017-10-24 23:31:32'),
('781ffdf3-b913-11e7-906f-5cf9389ce0eb', 191, 'S', 'PowderRoom', '2', '0', 'S-PowderRoom-3-0', 'Vanity mirror clean', '2017-10-24 23:31:32'),
('781ffe49-b913-11e7-906f-5cf9389ce0eb', 192, 'S', 'PowderRoom', '3', '0', 'S-PowderRoom-4-0', 'Amenities set-up:', '2017-10-24 23:31:32'),
('781ffe9a-b913-11e7-906f-5cf9389ce0eb', 193, 'S', 'PowderRoom', '4', '0', 'S-PowderRoom-4-1', '1 bath soap', '2017-10-24 23:31:32'),
('781ffeeb-b913-11e7-906f-5cf9389ce0eb', 194, 'S', 'PowderRoom', '4', '1', 'S-PowderRoom-4-2', '1 lotion', '2017-10-24 23:31:32'),
('781fff31-b913-11e7-906f-5cf9389ce0eb', 195, 'S', 'PowderRoom', '4', '2', 'S-PowderRoom-4-3', '1 facial tissue in a tissue box', '2017-10-24 23:31:32'),
('781fff7d-b913-11e7-906f-5cf9389ce0eb', 196, 'S', 'PowderRoom', '4', '3', 'S-PowderRoom-4-4', '2 face towel', '2017-10-24 23:31:32'),
('781fffc3-b913-11e7-906f-5cf9389ce0eb', 197, 'S', 'PowderRoom', '4', '4', 'S-PowderRoom-5-0', 'Dust bin with liner', '2017-10-24 23:31:32'),
('78200009-b913-11e7-906f-5cf9389ce0eb', 198, 'S', 'PowderRoom', '5', '0', 'S-PowderRoom-6-0', 'Toilet bowl - clean. Flush in working order.', '2017-10-24 23:31:32'),
('7820004f-b913-11e7-906f-5cf9389ce0eb', 199, 'S', 'PowderRoom', '6', '0', 'S-LivingRoom-1-0', 'Light switches working correctly.', '2017-10-24 23:31:32'),
('782000a0-b913-11e7-906f-5cf9389ce0eb', 200, 'S', 'LivingRoom', '1', '0', 'S-LivingRoom-2-0', 'Check appearance of the glass – clean.', '2017-10-24 23:31:32'),
('782000eb-b913-11e7-906f-5cf9389ce0eb', 201, 'S', 'LivingRoom', '2', '0', 'S-LivingRoom-3-0', 'Curtains are neat, presentable with hooks all intact and curtain rod.', '2017-10-24 23:31:32'),
('7820013c-b913-11e7-906f-5cf9389ce0eb', 202, 'S', 'LivingRoom', '3', '0', 'S-LivingRoom-4-0', 'Pull the curtains to test if they are working.', '2017-10-24 23:31:32'),
('78200187-b913-11e7-906f-5cf9389ce0eb', 203, 'S', 'LivingRoom', '4', '0', 'S-LivingRoom-5-0', 'Arrangement of the sofa & table  in order.', '2017-10-24 23:31:32'),
('782001d8-b913-11e7-906f-5cf9389ce0eb', 204, 'S', 'LivingRoom', '5', '0', 'S-LivingRoom-6-0', 'TV', '2017-10-24 23:31:32'),
('7820027a-b913-11e7-906f-5cf9389ce0eb', 205, 'S', 'LivingRoom', '6', '0', 'S-LivingRoom-6-1', 'TV rim no finger marks', '2017-10-24 23:31:32'),
('782002c5-b913-11e7-906f-5cf9389ce0eb', 206, 'S', 'LivingRoom', '6', '1', 'S-LivingRoom-6-2', 'TV channel all correct and clear', '2017-10-24 23:31:32'),
('78200331-b913-11e7-906f-5cf9389ce0eb', 207, 'S', 'LivingRoom', '6', '2', 'S-LivingRoom-6-3', 'TV remote working', '2017-10-24 23:31:32'),
('7820038d-b913-11e7-906f-5cf9389ce0eb', 208, 'S', 'LivingRoom', '6', '3', 'S-LivingRoom-7-0', 'Fridge is cold and clean', '2017-10-24 23:31:32'),
('782003e8-b913-11e7-906f-5cf9389ce0eb', 209, 'S', 'LivingRoom', '7', '0', 'S-Dining-1-0', 'Arrangement of the dining chairs & table in order.', '2017-10-24 23:31:32'),
('78200444-b913-11e7-906f-5cf9389ce0eb', 210, 'S', 'Dining', '1', '0', 'S-Overall-1-0', 'Air conditioning temperature/in good working condition.  Set at 17o C, low speed.', '2017-10-24 23:31:32'),
('7820049a-b913-11e7-906f-5cf9389ce0eb', 211, 'S', 'Overall', '1', '0', 'S-Overall-2-0', 'Floor vacuumed and stain free.', '2017-10-24 23:31:32'),
('782004e6-b913-11e7-906f-5cf9389ce0eb', 212, 'S', 'Overall', '2', '0', 'S-Overall-3-0', 'Wall - stains. Wood works - scratches', '2017-10-24 23:31:32'),
('7820052c-b913-11e7-906f-5cf9389ce0eb', 213, 'S', 'Overall', '3', '0', 'S-Overall-4-0', 'Room free from bad smell.', '2017-10-24 23:31:32'),
('7820057d-b913-11e7-906f-5cf9389ce0eb', 214, 'S', 'Overall', '4', '0', 'S-Overall-5-0', 'Ceiling – no cobweb, water marks and crack lines.', '2017-10-24 23:31:32');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `RecId` varchar(36) NOT NULL,
  `RoomNo` int(250) NOT NULL,
  `RoomTypeCode` varchar(50) NOT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`RecId`, `RoomNo`, `RoomTypeCode`, `DateCreated`) VALUES
('19d3a413-b8d6-11e7-906f-5cf9389ce0eb', 1, 'S', '2017-10-24 16:12:15'),
('1ca15003-b8d6-11e7-906f-5cf9389ce0eb', 2, 'S', '2017-10-24 16:12:20'),
('1e555cc2-b8d6-11e7-906f-5cf9389ce0eb', 3, 'S', '2017-10-24 16:12:22'),
('201bde5d-b8d6-11e7-906f-5cf9389ce0eb', 4, 'S', '2017-10-24 16:12:25'),
('22e2faba-b8d6-11e7-906f-5cf9389ce0eb', 5, 'S', '2017-10-24 16:12:30'),
('26836005-b8d6-11e7-906f-5cf9389ce0eb', 6, 'S', '2017-10-24 16:12:36'),
('2859b6fe-b8d6-11e7-906f-5cf9389ce0eb', 7, 'S', '2017-10-24 16:12:39'),
('2a17d6ea-b8d6-11e7-906f-5cf9389ce0eb', 8, 'S', '2017-10-24 16:12:42'),
('2be54c13-b8d6-11e7-906f-5cf9389ce0eb', 9, 'S', '2017-10-24 16:12:45'),
('2e006d5a-b8d6-11e7-906f-5cf9389ce0eb', 10, 'S', '2017-10-24 16:12:49'),
('3651a1f9-b8d6-11e7-906f-5cf9389ce0eb', 11, 'NS', '2017-10-24 16:13:03'),
('3853e1b7-b8d6-11e7-906f-5cf9389ce0eb', 12, 'NS', '2017-10-24 16:13:06'),
('39ee0806-b8d6-11e7-906f-5cf9389ce0eb', 13, 'NS', '2017-10-24 16:13:09'),
('3b853ec7-b8d6-11e7-906f-5cf9389ce0eb', 14, 'NS', '2017-10-24 16:13:11'),
('3d0c6cc5-b8d6-11e7-906f-5cf9389ce0eb', 15, 'NS', '2017-10-24 16:13:14'),
('4143ea55-b8d6-11e7-906f-5cf9389ce0eb', 16, 'NS', '2017-10-24 16:13:21'),
('446072b3-b8d6-11e7-906f-5cf9389ce0eb', 17, 'NS', '2017-10-24 16:13:26'),
('45f8ea15-b8d6-11e7-906f-5cf9389ce0eb', 18, 'NS', '2017-10-24 16:13:29'),
('482b5422-b8d6-11e7-906f-5cf9389ce0eb', 19, 'NS', '2017-10-24 16:13:33'),
('49dced3d-b8d6-11e7-906f-5cf9389ce0eb', 20, 'NS', '2017-10-24 16:13:35');

-- --------------------------------------------------------

--
-- Table structure for table `room_type`
--

CREATE TABLE `room_type` (
  `RecId` varchar(35) NOT NULL,
  `RoonTypeNo` int(250) NOT NULL,
  `RoomTypeCode` varchar(10) NOT NULL,
  `RoomTypeDesc` varchar(250) NOT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room_type`
--

INSERT INTO `room_type` (`RecId`, `RoonTypeNo`, `RoomTypeCode`, `RoomTypeDesc`, `DateCreated`) VALUES
('52048a6b-b8d7-11e7-906f-5cf9389ce0e', 1, 'S', 'Suite', '2017-10-24 16:20:59'),
('580e0a92-b8d7-11e7-906f-5cf9389ce0e', 2, 'NS', 'Non-Suite', '2017-10-24 16:21:09');

-- --------------------------------------------------------

--
-- Table structure for table `sessionchecklist`
--

CREATE TABLE `sessionchecklist` (
  `RecId` varchar(36) NOT NULL,
  `SessionChecklistNo` int(250) NOT NULL,
  `SessinNo` int(250) NOT NULL,
  `ChecklistCode` varchar(250) NOT NULL,
  `Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Remarks` varchar(250) NOT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sessions`
--

CREATE TABLE `sessions` (
  `RecId` varchar(36) NOT NULL,
  `SessionNo` int(250) NOT NULL,
  `HK_UserNo` varchar(50) NOT NULL,
  `INSP_UserNo` varchar(50) NOT NULL,
  `RoomNo` int(250) NOT NULL,
  `HK_START` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `HK_END` datetime DEFAULT NULL,
  `INSP_START` datetime DEFAULT NULL,
  `INSP_END` datetime DEFAULT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userdtr`
--

CREATE TABLE `userdtr` (
  `RecId` varchar(36) NOT NULL,
  `Username` varchar(250) NOT NULL,
  `Log` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UserDTRNo` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `RecId` varchar(36) NOT NULL,
  `UserNo` int(11) NOT NULL,
  `UserType` varchar(50) NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `FirstName` varchar(250) NOT NULL,
  `MiddleName` varchar(250) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`RecId`, `UserNo`, `UserType`, `LastName`, `FirstName`, `MiddleName`, `username`, `password`, `DateCreated`) VALUES
('c04c3ee8-b8d4-11e7-906f-5cf9389ce0eb', 1, 'INSP', 'Specter', 'Harvey', NULL, 'hspecter', '1234', '2017-10-24 16:02:35'),
('dd519a6d-b8d4-11e7-906f-5cf9389ce0eb', 2, 'INSP', 'Pearson', 'Jessica', '', 'jpearson', '1234', '2017-10-24 16:03:24'),
('e37d90e4-b8d4-11e7-906f-5cf9389ce0eb', 3, 'INSP', 'Litt', 'Luis', '', 'lliit', '1234', '2017-10-24 16:03:34'),
('ef45e1cd-b8d4-11e7-906f-5cf9389ce0eb', 4, 'INSP', 'Paulsen', 'Donna', NULL, 'dpaulsen', '1234', '2017-10-24 16:03:54'),
('f6be12c2-b8d4-11e7-906f-5cf9389ce0eb', 5, 'INSP', 'Ross', 'Mike', NULL, 'mross', '1234', '2017-10-24 16:04:07'),
('3ae52006-b8d5-11e7-906f-5cf9389ce0eb', 6, 'HK', 'Grey', 'Meredith', NULL, 'mgrey', '1234', '2017-10-24 16:06:01'),
('3fd3f6fc-b8d5-11e7-906f-5cf9389ce0eb', 7, 'HK', 'Torres', 'Callie', NULL, 'ctorres', '1234', '2017-10-24 16:06:09'),
('47c7bed2-b8d5-11e7-906f-5cf9389ce0eb', 8, 'HK', 'Robbins', 'Arizona', NULL, 'arobbins', '1234', '2017-10-24 16:06:22'),
('4c942c30-b8d5-11e7-906f-5cf9389ce0eb', 9, 'HK', 'Sloan', 'Mark', NULL, 'msloan', '1234', '2017-10-24 16:06:31'),
('55c4ec24-b8d5-11e7-906f-5cf9389ce0eb', 10, 'HK', 'Baley', 'Miranda', NULL, 'mbaley', '1234', '2017-10-24 16:06:46');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inspectionchecklist`
--
ALTER TABLE `inspectionchecklist`
  ADD PRIMARY KEY (`ChecklistNo`),
  ADD UNIQUE KEY `ChecklistCode` (`ChecklistCode`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`RoomNo`);

--
-- Indexes for table `room_type`
--
ALTER TABLE `room_type`
  ADD PRIMARY KEY (`RoonTypeNo`);

--
-- Indexes for table `sessionchecklist`
--
ALTER TABLE `sessionchecklist`
  ADD PRIMARY KEY (`SessionChecklistNo`);

--
-- Indexes for table `sessions`
--
ALTER TABLE `sessions`
  ADD PRIMARY KEY (`SessionNo`);

--
-- Indexes for table `userdtr`
--
ALTER TABLE `userdtr`
  ADD PRIMARY KEY (`UserDTRNo`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inspectionchecklist`
--
ALTER TABLE `inspectionchecklist`
  MODIFY `ChecklistNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=215;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `RoomNo` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `room_type`
--
ALTER TABLE `room_type`
  MODIFY `RoonTypeNo` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sessionchecklist`
--
ALTER TABLE `sessionchecklist`
  MODIFY `SessionChecklistNo` int(250) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sessions`
--
ALTER TABLE `sessions`
  MODIFY `SessionNo` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `userdtr`
--
ALTER TABLE `userdtr`
  MODIFY `UserDTRNo` int(250) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
