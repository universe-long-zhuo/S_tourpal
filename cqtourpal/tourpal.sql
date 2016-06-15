/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : tourpal

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2015-10-11 14:13:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_number` varchar(50) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('admin', '张小三', '1234', '管理员');
INSERT INTO `user_info` VALUES ('admin1', '张大大三', '123456', '普通用户');
INSERT INTO `user_info` VALUES ('dengjie', '邓小捷', '321', '普通用户');
INSERT INTO `user_info` VALUES ('zhangsan', '张三', '123', '普通用户');
INSERT INTO `user_info` VALUES ('zhangsan1', '张三', '123', '普通用户');

-- ----------------------------
-- Table structure for view_info
-- ----------------------------
DROP TABLE IF EXISTS `view_info`;
CREATE TABLE `view_info` (
  `view_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_number` varchar(50) DEFAULT NULL,
  `view_name` varchar(200) DEFAULT NULL,
  `view_time` datetime DEFAULT NULL,
  `view_photo` varchar(200) DEFAULT NULL,
  `view_desc` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`view_id`),
  KEY `FK_Reference_1` (`user_number`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`user_number`) REFERENCES `user_info` (`user_number`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of view_info
-- ----------------------------
INSERT INTO `view_info` VALUES ('2', 'admin', '九寨沟', '2015-10-08 16:31:25', 'f67cdd06-d17e-4db7-a010-1b32a6c40d2c2.jpg', '九寨沟很好看哦');
INSERT INTO `view_info` VALUES ('3', 'admin', '九寨沟', '2015-10-08 16:31:50', 'e85da7c6-3d2b-4514-ae68-45dc11ae38292.jpg', '九寨沟很好看哦');
INSERT INTO `view_info` VALUES ('4', 'admin', '九寨沟2', '2015-10-08 17:30:47', '8932eca3-956a-48a8-804a-0d3cd2587c214.jpg', '九寨沟2九寨沟2九寨沟2九寨沟2九寨沟2九寨沟2九寨沟2');
INSERT INTO `view_info` VALUES ('5', 'admin', '酆都鬼城', '2015-10-09 10:44:39', 'e4cc8c32-92cd-4af9-8777-ec3fb41753c21.gif', '酆都鬼城的天堂山酆都鬼城的天堂山酆都鬼城的天堂山酆都鬼城的天堂山酆都鬼城的天堂山');
INSERT INTO `view_info` VALUES ('6', 'admin', '剑桥大学', '2015-10-09 10:46:02', '0cbb4f89-6dc6-4191-8b5b-2d4d9d7f3c7f5.jpg', '剑桥大学（英文：University of Cambridge；勋衔：Cantab）为一所坐落于英国剑桥市的研究型书院联邦制大学，是英国也是全世界最顶尖的大学之一。剑桥为英语世界中历史第二悠久的大学，前身是一个于1209年成立的学者协会。这些学者本为牛津大学的一员，但后因与牛津镇民发生冲突而移居至此。');
