/*
 Navicat Premium Data Transfer

 Source Server         : AntonyCheng
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : javaee

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 15/01/2023 13:28:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_address
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address`  (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `address_provice` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 69 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES (1, '北京市', '朝阳区');
INSERT INTO `t_address` VALUES (2, '北京市', '东城区');
INSERT INTO `t_address` VALUES (3, '天津市', '南开区');
INSERT INTO `t_address` VALUES (4, '天津市', '东丽区');
INSERT INTO `t_address` VALUES (5, '河北省', '石家庄市');
INSERT INTO `t_address` VALUES (6, '河北省', '邯郸市');
INSERT INTO `t_address` VALUES (7, '山西省', '太原市');
INSERT INTO `t_address` VALUES (8, '山西省', '大同市');
INSERT INTO `t_address` VALUES (9, '内蒙古自治区', '呼和浩特市');
INSERT INTO `t_address` VALUES (10, '内蒙古自治区', '包头市');
INSERT INTO `t_address` VALUES (11, '辽宁省', '沈阳市');
INSERT INTO `t_address` VALUES (12, '辽宁省', '大连市');
INSERT INTO `t_address` VALUES (13, '吉林省', '长春市');
INSERT INTO `t_address` VALUES (14, '吉林省', '四平市');
INSERT INTO `t_address` VALUES (15, '黑龙江省', '哈尔滨市');
INSERT INTO `t_address` VALUES (16, '黑龙江省', '齐齐哈尔市');
INSERT INTO `t_address` VALUES (17, '上海市', '静安区');
INSERT INTO `t_address` VALUES (18, '上海市', '浦东新区');
INSERT INTO `t_address` VALUES (19, '江苏省', '南京市');
INSERT INTO `t_address` VALUES (20, '江苏省', '苏州市');
INSERT INTO `t_address` VALUES (21, '浙江省', '杭州市');
INSERT INTO `t_address` VALUES (22, '浙江省', '宁波市');
INSERT INTO `t_address` VALUES (23, '安徽省', '合肥市');
INSERT INTO `t_address` VALUES (24, '安徽省', '芜湖市');
INSERT INTO `t_address` VALUES (25, '福建省', '福州市');
INSERT INTO `t_address` VALUES (26, '福建省', '厦门市');
INSERT INTO `t_address` VALUES (27, '江西省', '南昌市');
INSERT INTO `t_address` VALUES (28, '江西省', '景德镇市');
INSERT INTO `t_address` VALUES (29, '山东省', '济南市');
INSERT INTO `t_address` VALUES (30, '山东省', '青岛市');
INSERT INTO `t_address` VALUES (31, '河南省', '郑州市');
INSERT INTO `t_address` VALUES (32, '河南省', '洛阳市');
INSERT INTO `t_address` VALUES (33, '湖北省', '武汉市');
INSERT INTO `t_address` VALUES (34, '湖北省', '黄石市');
INSERT INTO `t_address` VALUES (35, '湖南省', '长沙市');
INSERT INTO `t_address` VALUES (36, '湖南省', '张家界市');
INSERT INTO `t_address` VALUES (37, '广东省', '广州市');
INSERT INTO `t_address` VALUES (38, '广东省', '深圳市');
INSERT INTO `t_address` VALUES (39, '广西壮族自治区', '南宁市');
INSERT INTO `t_address` VALUES (40, '广西壮族自治区', '柳州市');
INSERT INTO `t_address` VALUES (41, '海南省', '海口市');
INSERT INTO `t_address` VALUES (42, '海南省', '三亚市');
INSERT INTO `t_address` VALUES (43, '重庆市', '渝中区');
INSERT INTO `t_address` VALUES (44, '重庆市', '渝北区');
INSERT INTO `t_address` VALUES (45, '四川省', '成都市');
INSERT INTO `t_address` VALUES (46, '四川省', '广安市');
INSERT INTO `t_address` VALUES (47, '贵州省', '贵阳市');
INSERT INTO `t_address` VALUES (48, '贵州省', '六盘水市');
INSERT INTO `t_address` VALUES (49, '云南省', '昆明市');
INSERT INTO `t_address` VALUES (50, '云南省', '曲靖市');
INSERT INTO `t_address` VALUES (51, '西藏自治区', '拉萨市');
INSERT INTO `t_address` VALUES (52, '西藏自治区', '日喀则市');
INSERT INTO `t_address` VALUES (53, '陕西省', '西安市');
INSERT INTO `t_address` VALUES (54, '陕西省', '铜川市');
INSERT INTO `t_address` VALUES (55, '甘肃省', '兰州市');
INSERT INTO `t_address` VALUES (56, '甘肃省', '天水市');
INSERT INTO `t_address` VALUES (57, '青海省', '西宁市');
INSERT INTO `t_address` VALUES (58, '青海省', '海东市');
INSERT INTO `t_address` VALUES (59, '宁夏回族自治区', '银川市');
INSERT INTO `t_address` VALUES (60, '宁夏回族自治区', '中卫市');
INSERT INTO `t_address` VALUES (61, '新疆维吾尔族自治区', '乌鲁木齐市');
INSERT INTO `t_address` VALUES (62, '新疆维吾尔族自治区', '吐鲁番市');
INSERT INTO `t_address` VALUES (63, '台湾省', '台北市');
INSERT INTO `t_address` VALUES (64, '台湾省', '高雄市');
INSERT INTO `t_address` VALUES (65, '香港特别行政区', '九龙区');
INSERT INTO `t_address` VALUES (66, '香港特别行政区', '新界区');
INSERT INTO `t_address` VALUES (67, '澳门特别行政区', '澳门半岛');
INSERT INTO `t_address` VALUES (68, '澳门特别行政区', '澳门离岛');
INSERT INTO `t_address` VALUES (69, '四川省', '绵阳市');

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `admin_id` int NOT NULL AUTO_INCREMENT,
  `admin_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES (1, 'admin', '123456');

-- ----------------------------
-- Table structure for t_major
-- ----------------------------
DROP TABLE IF EXISTS `t_major`;
CREATE TABLE `t_major`  (
  `major_id` int NOT NULL AUTO_INCREMENT,
  `major_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `major_college` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`major_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 111 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_major
-- ----------------------------
INSERT INTO `t_major` VALUES (1, '计算机科学与技术', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (2, '经济学', '经济学院');
INSERT INTO `t_major` VALUES (3, '财政学', '财政与公共管理学院');
INSERT INTO `t_major` VALUES (4, '金融学', '金融学院');
INSERT INTO `t_major` VALUES (5, '物流管理', '管理学院');
INSERT INTO `t_major` VALUES (6, '食品科学与工程', '食品工程学院');
INSERT INTO `t_major` VALUES (7, '智能制造工程', '轻工学院');
INSERT INTO `t_major` VALUES (8, '会计学', '会计学院');
INSERT INTO `t_major` VALUES (9, '土木工程', '能源与建筑学院');
INSERT INTO `t_major` VALUES (10, '旅游管理', '旅游烹饪学院');
INSERT INTO `t_major` VALUES (11, '药学院', '中药学');
INSERT INTO `t_major` VALUES (12, '法学', '法学院');
INSERT INTO `t_major` VALUES (13, '外国语言文学类', '外语学院');
INSERT INTO `t_major` VALUES (14, '艺术设计', '设计艺术学院');
INSERT INTO `t_major` VALUES (15, '马克思主义学', '马克思学院');
INSERT INTO `t_major` VALUES (16, '新闻学', '基础科学学院');
INSERT INTO `t_major` VALUES (17, '体育经济与管理', '体育学院');
INSERT INTO `t_major` VALUES (18, '国际教育', '国际教育学院');
INSERT INTO `t_major` VALUES (19, '理工类实验班', '英才学院');
INSERT INTO `t_major` VALUES (20, '旅游管理与服务教育', '职业教育学院');
INSERT INTO `t_major` VALUES (21, '软件工程', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (22, '大数据', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (23, '电子商务', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (24, '电子信息工程', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (25, '制药工程', '药学院');
INSERT INTO `t_major` VALUES (26, '药学', '药学院');
INSERT INTO `t_major` VALUES (27, '物流工程', '管理学院');
INSERT INTO `t_major` VALUES (28, '质量管理工程', '管理学院');
INSERT INTO `t_major` VALUES (29, '物联网工程', '管理学院');
INSERT INTO `t_major` VALUES (30, '宝石材料及工艺学', '管理学院');
INSERT INTO `t_major` VALUES (31, '信息管理与信息系统', '计算机与信息工程学院');
INSERT INTO `t_major` VALUES (32, '国际经济与贸易', '经济学院');
INSERT INTO `t_major` VALUES (33, '统计学', '经济学院');
INSERT INTO `t_major` VALUES (34, '国际经济与贸易', '经济学院');
INSERT INTO `t_major` VALUES (35, '经济统计学', '经济学院');
INSERT INTO `t_major` VALUES (36, '贸易经济', '经济学院');
INSERT INTO `t_major` VALUES (37, '国际经济与贸易', '经济学院');
INSERT INTO `t_major` VALUES (38, '数字经济', '经济学院');
INSERT INTO `t_major` VALUES (39, '商务经济', '经济学院');
INSERT INTO `t_major` VALUES (40, '投资学', '金融学');
INSERT INTO `t_major` VALUES (41, '保险学', '金融学');
INSERT INTO `t_major` VALUES (42, '金融工程', '金融学');
INSERT INTO `t_major` VALUES (43, '行政管理', '财政与公共管理学院');
INSERT INTO `t_major` VALUES (44, '劳动与社会保障', '财政与公共管理学院');
INSERT INTO `t_major` VALUES (45, '税收学', '财政与公共管理学院');
INSERT INTO `t_major` VALUES (46, '公共管理', '财政与公共管理学院');
INSERT INTO `t_major` VALUES (47, '工商管理', '商务学院');
INSERT INTO `t_major` VALUES (48, '市场营销', '商务学院');
INSERT INTO `t_major` VALUES (49, '人力资源管理', '商务学院');
INSERT INTO `t_major` VALUES (50, '会展经济与管理', '商务学院');
INSERT INTO `t_major` VALUES (51, '财务管理', '会计学院');
INSERT INTO `t_major` VALUES (52, '审计学', '会计学院');
INSERT INTO `t_major` VALUES (53, '食品质量与安全', '食品工程学院');
INSERT INTO `t_major` VALUES (54, '生物工程', '食品工程学院');
INSERT INTO `t_major` VALUES (55, '环境工程', '食品工程学院');
INSERT INTO `t_major` VALUES (56, '机械设计制造及其自动化', '轻工学院');
INSERT INTO `t_major` VALUES (57, '包装工程', '轻工学院');
INSERT INTO `t_major` VALUES (58, '印刷工程', '轻工学院');
INSERT INTO `t_major` VALUES (59, '工业工程', '轻工学院');
INSERT INTO `t_major` VALUES (60, '机器人工程', '轻工学院');
INSERT INTO `t_major` VALUES (61, '工程管理', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (62, '热能与动力工程', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (63, '建筑环境与设备工程', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (64, '油气储运工程', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (65, '能源与动力工程', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (66, '建筑环境与能源应用工程', '能源与建筑工程学院');
INSERT INTO `t_major` VALUES (67, '酒店管理', '旅游烹饪学院');
INSERT INTO `t_major` VALUES (68, '烹饪与营养教育', '旅游烹饪学院');
INSERT INTO `t_major` VALUES (69, '社会工作', '法学院');
INSERT INTO `t_major` VALUES (70, '英语', '外语学院');
INSERT INTO `t_major` VALUES (71, '翻译', '外语学院');
INSERT INTO `t_major` VALUES (72, '文学语言学', '外语学院');
INSERT INTO `t_major` VALUES (73, '俄语', '外语学院');
INSERT INTO `t_major` VALUES (74, '商务英语', '外语学院');
INSERT INTO `t_major` VALUES (75, '汉语语言文学', '基础科学学院');
INSERT INTO `t_major` VALUES (76, '数学与应用数学', '基础科学学院');
INSERT INTO `t_major` VALUES (77, '视觉传达设计', '设计艺术学院');
INSERT INTO `t_major` VALUES (78, '环境设计', '设计艺术学院');
INSERT INTO `t_major` VALUES (79, '产品设计', '设计艺术学院');
INSERT INTO `t_major` VALUES (80, '绘画', '设计艺术学院');
INSERT INTO `t_major` VALUES (81, '烹饪与营养教育', '职业教育学院');
INSERT INTO `t_major` VALUES (82, '旅游与酒店管理', '职业教育学院');
INSERT INTO `t_major` VALUES (83, '市场营销教育', '职业教育学院');
INSERT INTO `t_major` VALUES (84, '市场营销', '职业教育学院');
INSERT INTO `t_major` VALUES (85, '会展经济', '职业教育学院');
INSERT INTO `t_major` VALUES (86, '财务会计教育', '职业教育学院');
INSERT INTO `t_major` VALUES (87, '会计学', '职业教育学院');
INSERT INTO `t_major` VALUES (88, '服装设计与工艺教育', '职业教育学院');
INSERT INTO `t_major` VALUES (89, '物流管理', '职业教育学院');
INSERT INTO `t_major` VALUES (90, '财政与税务', '职业教育学院');
INSERT INTO `t_major` VALUES (91, '会计学', '英才学院');
INSERT INTO `t_major` VALUES (92, '金融学', '英才学院');
INSERT INTO `t_major` VALUES (93, '制药工程', '英才学院');
INSERT INTO `t_major` VALUES (94, '食品科学与工程', '英才学院');
INSERT INTO `t_major` VALUES (95, '机器设计制造及其自动化', '英才学院');
INSERT INTO `t_major` VALUES (96, '土木工程', '英才学院');
INSERT INTO `t_major` VALUES (97, '热能与动力工程', '英才学院');
INSERT INTO `t_major` VALUES (98, '药学', '英才学院');
INSERT INTO `t_major` VALUES (99, '能源与动力工程', '英才学院');
INSERT INTO `t_major` VALUES (100, '工学', '英才学院');
INSERT INTO `t_major` VALUES (101, '油气储运', '英才学院');
INSERT INTO `t_major` VALUES (102, '物流工程', '英才学院');
INSERT INTO `t_major` VALUES (103, '国际经济与贸易', '英才学院');
INSERT INTO `t_major` VALUES (104, '金融学', '英才学院');
INSERT INTO `t_major` VALUES (105, '工商管理', '英才学院');
INSERT INTO `t_major` VALUES (106, '经济学', '英才学院');
INSERT INTO `t_major` VALUES (107, '食品科学与工程', '英才学院');
INSERT INTO `t_major` VALUES (108, '投资学', '英才学院');
INSERT INTO `t_major` VALUES (109, '金融工程', '英才学院');
INSERT INTO `t_major` VALUES (110, '计算机科学与技术', '英才学院');
INSERT INTO `t_major` VALUES (111, '区块链', '计算机与信息工程学院');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `student_one` int NOT NULL AUTO_INCREMENT,
  `student_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_birthday` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_college` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_one`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 182 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (158, '202051020123', '伍程成', '男', '2001-11-11', '计算机与信息工程学院', '计算机科学与技术', '2020', '17380271985', '黑龙江省哈尔滨市');
INSERT INTO `t_student` VALUES (160, '20202', '小二零', '男', '2022-12-20', '设计艺术学院', '环境设计', '2018', '17380271985', '四川省成都市');
INSERT INTO `t_student` VALUES (161, '20203', '小三', '男', '2022-12-14', '管理学院', '质量管理工程', '2018', '17380271985', '四川省绵阳市');
INSERT INTO `t_student` VALUES (162, '20204', '小四', '男', '2022-12-27', '外语学院', '俄语', '2018', '19989766372', '贵州省六盘水市');
INSERT INTO `t_student` VALUES (163, '20205', '小五', '男', '2022-12-22', '财政与公共管理学院', '行政管理', '2018', '17380271985', '黑龙江省齐齐哈尔市');
INSERT INTO `t_student` VALUES (164, '20206', '小六', '男', '2022-12-28', '马克思学院', '马克思主义学', '2018', '17380271985', '云南省昆明市');
INSERT INTO `t_student` VALUES (165, '20207', '小七', '男', '2022-12-24', '会计学院', '审计学', '2018', '18177266374', '广东省深圳市');
INSERT INTO `t_student` VALUES (166, '20208', '小八', '男', '2022-12-17', '体育学院', '体育经济与管理', '2018', '16676374873', '山东省济南市');
INSERT INTO `t_student` VALUES (167, '20209', '小九', '男', '2023-01-04', '药学院', '药学', '2018', '17563774827', '山东省济南市');
INSERT INTO `t_student` VALUES (168, '202010', '小十', '男', '2022-12-28', '会计学院', '财务管理', '2018', '13182773647', '浙江省杭州市');
INSERT INTO `t_student` VALUES (170, '202012', '小十二', '男', '2023-01-03', '旅游烹饪学院', '酒店管理', '2018', '17380271985', '四川省成都市');
INSERT INTO `t_student` VALUES (171, '202013', '小十三', '男', '2022-11-28', '轻工学院', '包装工程', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (172, '202014', '小十四', '男', '2022-10-08', '食品工程学院', '食品质量与安全', '2018', '17380271985', '四川省成都市');
INSERT INTO `t_student` VALUES (173, '202015', '小十五', '男', '2022-10-26', '商务学院', '人力资源管理', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (174, '202016', '小十六', '男', '2022-10-26', '会计学院', '财务管理', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (175, '202017', '小十七', '男', '2022-10-21', '能源与建筑学院', '土木工程', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (176, '202018', '小十八', '男', '2022-11-28', '财政与公共管理学院', '财政学', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (178, '202020', '小二十', '男', '2022-12-21', '经济学院', '贸易经济', '2018', '17380271985', '四川省广安市');
INSERT INTO `t_student` VALUES (179, '202051020122', '张三', '女', '2022-09-23', '计算机与信息工程学院', '软件工程', '2020', '18378298394', '广东省广州市');
INSERT INTO `t_student` VALUES (181, '11', '伍程成', '男', '2022-12-07', '经济学院', '国际经济与贸易', '2018', '17380271985', '四川省广安市');

SET FOREIGN_KEY_CHECKS = 1;
