/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50148
Source Host           : localhost:3306
Source Database       : generatordb

Target Server Type    : MYSQL
Target Server Version : 50148
File Encoding         : 65001

Date: 2017-10-10 16:50:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_module
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `module_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `module_name` varchar(50) NOT NULL COMMENT '模板名字',
  `module_text` varchar(255) DEFAULT '' COMMENT '模板内容',
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
