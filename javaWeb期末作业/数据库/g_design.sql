/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : g_design

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2021-06-27 17:44:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `studentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `studentId` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(255) DEFAULT NULL,
  `clazz` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('300103902', '莫文蔚', '女', '22', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103903', '毛不易', '男', '21', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103904', '王俊凯', '男', '23', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103905', '王燕', '女', '21', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103906', '王一博', '男', '23', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103907', '王凯', '男', '22', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103908', '薛之谦', '男', '21', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103909', '肖战', '男', '22', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103910', '李斯', '女', '19', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103911', '杨幂', '男', '18', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103912', '杨洋', '女', '19', 'web2班');
INSERT INTO `studentinfo` VALUES ('300103913', '周杰伦', '男', '22', 'web2班');

-- ----------------------------
-- Table structure for `s_admin`
-- ----------------------------
DROP TABLE IF EXISTS `s_admin`;
CREATE TABLE `s_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_admin
-- ----------------------------
INSERT INTO `s_admin` VALUES ('1', 'admin', '123456');

-- ----------------------------
-- Table structure for `teacherinfo`
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo` (
  `teacherId` varchar(255) NOT NULL,
  `tname` varchar(255) DEFAULT NULL,
  `tage` int(255) DEFAULT NULL,
  `tsex` varchar(255) DEFAULT NULL,
  `tdept` varchar(255) DEFAULT NULL,
  `tel` int(255) DEFAULT NULL,
  `QQ` int(255) DEFAULT NULL,
  `professional` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacherinfo
-- ----------------------------
INSERT INTO `teacherinfo` VALUES ('1', '张三', '33', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('10', '张三', '33', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('11', '李四', '34', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('12', '小红', '27', '女', '计算机', '123', '123', '讲师');
INSERT INTO `teacherinfo` VALUES ('13', '张三', '33', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('14', '李四', '34', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('15', '小红', '27', '女', '计算机', '123', '123', '教师');
INSERT INTO `teacherinfo` VALUES ('2', '李四', '34', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('3', '小红', '27', '女', '计算机', '123', '123', '讲师');
INSERT INTO `teacherinfo` VALUES ('4', '张三', '33', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('5', '李四', '34', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('6', '小红', '27', '女', '计算机', '123', '123', '讲师');
INSERT INTO `teacherinfo` VALUES ('7', '张三', '33', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('8', '李四', '34', '男', '计算机', '123', '123', '副教授');
INSERT INTO `teacherinfo` VALUES ('9', '小红', '27', '女', '计算机', '123', '123', '讲师');
