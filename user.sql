/*
 Navicat Premium Data Transfer

 Source Server         : Dwk
 Source Server Type    : MariaDB
 Source Server Version : 100406
 Source Host           : localhost:3306
 Source Schema         : day17

 Target Server Type    : MariaDB
 Target Server Version : 100406
 File Encoding         : 65001

 Date: 06/04/2020 20:11:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '女', 23, '陕西', '12345', 'zhangsan@163.com', 'zhangsan', '123');
INSERT INTO `user` VALUES (2, '李四', '男', 17, '河南', '67893', 'lisi@126.com', 'lisi', '234');
INSERT INTO `user` VALUES (3, '王五', '男', 21, '北京', '45623', 'wangwu@163.com', NULL, NULL);
INSERT INTO `user` VALUES (5, '赵六', '女', 27, '北京', '12789739', 'zhaoliu@126.com', NULL, NULL);
INSERT INTO `user` VALUES (6, '陈琦', '女', 19, '上海', '1098274356', 'chenqi@qq.com', NULL, NULL);
INSERT INTO `user` VALUES (8, '刘一', '女', 36, '上海', '23451213243', 'liuyi@qq.com', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
