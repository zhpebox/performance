/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50148
Source Host           : localhost:3306
Source Database       : generatordb

Target Server Type    : MYSQL
Target Server Version : 50148
File Encoding         : 65001

Date: 2017-10-16 11:10:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_generator
-- ----------------------------
DROP TABLE IF EXISTS `t_generator`;
CREATE TABLE `t_generator` (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT '造数记录主键',
  `moduleId` int(11) NOT NULL COMMENT '使用模板id',
  `moduleName` varchar(255) DEFAULT '' COMMENT '模板名称',
  `startOrg` varchar(255) NOT NULL DEFAULT '' COMMENT '起始机构标识',
  `endOrg` varchar(255) NOT NULL DEFAULT '' COMMENT '终止机构标识',
  `fileNum` int(11) NOT NULL DEFAULT '3' COMMENT '每个机构产生的文件数',
  `fileSize` int(11) NOT NULL DEFAULT '3' COMMENT '每个文件的记录数量',
  `fileBasePath` varchar(255) NOT NULL DEFAULT '' COMMENT '生成文件的路径',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_generator
-- ----------------------------
INSERT INTO `t_generator` VALUES ('1', '2', 'sourceStr_21', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('2', '2', 'sourceStr_2', '1', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('3', '3', 's', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('4', '4', 'a', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('5', '5', 'd', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('6', '6', 'f', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('7', '7', 'g', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('8', '8', 'h', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('9', '9', 'j', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('10', '10', 'k', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('11', '11', 'l', '', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('12', '2', 'sourceStr_2', '123', '456', '5', '6', '7');
INSERT INTO `t_generator` VALUES ('13', '2', 'sourceStr_2', '123', '456', '5', '6', '7');
INSERT INTO `t_generator` VALUES ('14', '2', 'sourceStr_2', '1', '2', '3', '3', '3');
INSERT INTO `t_generator` VALUES ('15', '2', 'sourceStr_2', '1', '2', '3', '3', '3');
INSERT INTO `t_generator` VALUES ('16', '2', 'sourceStr_2', '1', '34', '3', '3', '4');
INSERT INTO `t_generator` VALUES ('17', '2', 'sourceStr_2', '1', '', '3', '3', '');
INSERT INTO `t_generator` VALUES ('18', '2', 'sourceStr_2', '1', '', '3', '3', '');

-- ----------------------------
-- Table structure for t_module
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `module_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `module_name` varchar(50) NOT NULL COMMENT '模板名字',
  `module_text` varchar(255) DEFAULT '' COMMENT '模板内容',
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_module
-- ----------------------------
INSERT INTO `t_module` VALUES ('1', 'sourceStr_1', '<Document><a>$</a><b>$</b><c>$</c></Document>');
INSERT INTO `t_module` VALUES ('2', 'sourceStr_2', '<person>\n   <name>$</name>\n             <age>$</age>\n</person>');
INSERT INTO `t_module` VALUES ('3', '模板名称', 'asdfasdfasdfas');
INSERT INTO `t_module` VALUES ('4', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('5', '模板名称a', '模板内容a');
INSERT INTO `t_module` VALUES ('6', '模板名称a', '模板内容a');
INSERT INTO `t_module` VALUES ('7', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('8', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('9', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('10', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('11', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('12', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('13', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('14', '模板名称we', '模板内容we');
INSERT INTO `t_module` VALUES ('15', '模板名称we', '模板内容we');
INSERT INTO `t_module` VALUES ('16', '模板名称qq', '模板内容qq');
INSERT INTO `t_module` VALUES ('17', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('18', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('19', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('20', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('21', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('22', '模板名称s', '模板内容ss');
INSERT INTO `t_module` VALUES ('23', '模板名称', '模板内容');
INSERT INTO `t_module` VALUES ('24', '模板名称q', '模板内容q');
INSERT INTO `t_module` VALUES ('25', '模板名称ASS', '<Document><a>$</a><b>$</b><c>$</c></Document>');
INSERT INTO `t_module` VALUES ('26', '模板名称', '<Document>\n     <a>$</a>\n         <b>$</b>\n     <c>$</c>  <d>$</d>\n</Document>');
INSERT INTO `t_module` VALUES ('27', '模板名称MMMM', '模板内容MAMAMA');
INSERT INTO `t_module` VALUES ('28', '模板1', '<Document><a>$</a><b>$</b><c>$</c></Document>');
INSERT INTO `t_module` VALUES ('29', '模板名称A', '模板内容A');
INSERT INTO `t_module` VALUES ('30', '模板名称C', '模板内容CC');
INSERT INTO `t_module` VALUES ('31', '模板名称S', '模板内容S');

-- ----------------------------
-- Table structure for t_module_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_module_rule`;
CREATE TABLE `t_module_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `module_key` int(11) DEFAULT NULL COMMENT 'T_module表主键',
  `param_index` int(3) DEFAULT NULL,
  `rule_key` int(11) DEFAULT NULL COMMENT 'T_rule主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_module_rule
-- ----------------------------
INSERT INTO `t_module_rule` VALUES ('18', '2', '0', '2');
INSERT INTO `t_module_rule` VALUES ('19', '2', '1', '1');
INSERT INTO `t_module_rule` VALUES ('20', '2', '0', '1');
INSERT INTO `t_module_rule` VALUES ('21', '2', '1', '4');

-- ----------------------------
-- Table structure for t_rule
-- ----------------------------
DROP TABLE IF EXISTS `t_rule`;
CREATE TABLE `t_rule` (
  `rule_id` int(11) NOT NULL AUTO_INCREMENT,
  `rule_name` varchar(50) NOT NULL DEFAULT '' COMMENT '规则名称',
  `rule_source` int(1) NOT NULL COMMENT '参数文件来源：1参数文件；2生成程序',
  `param_file` varchar(200) DEFAULT NULL,
  `class_name` varchar(200) DEFAULT NULL,
  `method_name` varchar(50) DEFAULT NULL COMMENT '针对参数来源为“生成程序”的情况，标记调用的方法名',
  PRIMARY KEY (`rule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_rule
-- ----------------------------
INSERT INTO `t_rule` VALUES ('1', 'A', '1', 'a.param', '', '');
INSERT INTO `t_rule` VALUES ('2', 'V', '2', '', '', 'getIdCardCode');
INSERT INTO `t_rule` VALUES ('3', 'C', '2', '', '', 'getZUZHIJIGOUName');
INSERT INTO `t_rule` VALUES ('4', 'A1', '2', 'C', 'D1', 'E1');
INSERT INTO `t_rule` VALUES ('5', 'f1', '1', 'f4', 'f2', 'f3');
INSERT INTO `t_rule` VALUES ('6', 'AX', '1', 'CX', '', '');
INSERT INTO `t_rule` VALUES ('7', 'A', '1', 'C', '', '');
INSERT INTO `t_rule` VALUES ('8', '规则参数A', '2', '', '参数ClassA', '参数MethodA');
