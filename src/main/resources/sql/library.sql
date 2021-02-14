DROP
DATABASE IF EXISTS library;
CREATE
DATABASE library DEFAULT CHARACTER SET utf8;
USE
library;


SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`
(
    `admin_id` int(11) NOT NULL,
    `password` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin`
VALUES (20160001, '111111');

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info`
(
    `book_id`      bigint(20) NOT NULL AUTO_INCREMENT,
    `name`         varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `author`       varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `publish`      varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `ISBN`         varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `introduction` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
    `language`     varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `price`        decimal(10, 2)                                         NOT NULL,
    `pubdate`      date NULL DEFAULT NULL,
    `class_id`     int(11) NULL DEFAULT NULL,
    `pressmark`    int(11) NULL DEFAULT NULL,
    `state`        smallint(6) NULL DEFAULT NULL,
    PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50000011 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info`
VALUES (10000010, '经济学原理（上下）', '[美] 曼昆 ', '机械工业出版社', '9787111126768',
        '此《经济学原理》的第3版把较多篇幅用于应用与政策，较少篇幅用于正规的经济理论。书中主要从供给与需求、企业行为与消费者选择理论、长期经济增长与短期经济波动以及宏观经济政策等角度深入浅出地剖析了经济学家们的世界观。',
        '英文', 88.00, '2003-08-05', 6, 5, 1);
INSERT INTO `book_info`
VALUES (50000004, '方向', '马克-安托万·马修 ', '后浪丨北京联合出版公司', '9787020125265',
        '《方向》即便在马修的作品中也算得最独特的：不着一字，尽得风流。原作本无一字，标题只是一个→，出版时才加了个书名Sens——既可以指“方向”，也可以指“意义”。 《方向》没有“字”，但有自己的语言——请读者在尽情释放想象力和独立思考之余，破解作者的密码，听听作者对荒诞的看法。',
        '中文', 99.80, '2017-04-01', 9, 13, 1);
INSERT INTO `book_info`
VALUES (50000005, '画的秘密', '马克-安托万·马修 ', '北京联合出版公司·后浪出版公司', '9787550265608',
        '一本关于友情的疗伤图像小说，直击人内心最为隐秘的情感。 一部追寻艺术的纸上悬疑电影，揭示命运宇宙中奇诡的真相。 ★ 《画的秘密》荣获欧洲第二大漫画节“瑞士谢尔漫画节最佳作品奖”。 作者曾两度夺得安古兰国际漫画节重要奖项。 ★ 《画的秘密》是一部罕见的、结合了拼贴、镜像、3D等叙事手法的实验型漫画作品。作者巧妙地调度光线、纬度、时间、记忆，在一个悬念重重又温情治愈的故事中，注入了一个有关命运的哲学议题。',
        '中文', 60.00, '2016-01-01', 9, 13, 0);
INSERT INTO `book_info`
VALUES (50000009, '少有人走的路', 'M·斯科特·派克 ', '吉林文史出版社', '9787807023777',
        '这本书处处透露出沟通与理解的意味，它跨越时代限制，帮助我们探索爱的本质，引导我们过上崭新，宁静而丰富的生活；它帮助我们学习爱，也学习独立；它教诲我们成为更称职的、更有理解心的父母。归根到底，它告诉我们怎样找到真正的自我。 正如开篇所言：人生苦难重重。M·斯科特·派克让我们更加清楚：人生是一场艰辛之旅，心智成熟的旅程相当漫长。但是，他没有让我们感到恐惧，相反，他带领我们去经历一系列艰难乃至痛苦的转变，最终达到自我认知的更高境界。',
        '中文', 26.00, '2007-01-01', 9, 12, 1);
INSERT INTO `book_info`
VALUES (50000010, '追寻生命的意义', '[奥] 维克多·弗兰克 ', '新华出版社', '9787501162734',
        '《追寻生命的意义》是一个人面对巨大的苦难时，用来拯救自己的内在世界，同时也是一个关于每个人存在的价值和能者多劳们生存的社会所应担负职责的思考。本书对于每一个想要了解我们这个时代的人来说，都是一部必不可少的读物。这是一部令人鼓舞的杰作……他是一个不可思议的人，任何人都可以从他无比痛苦的经历中，获得拯救自己的经验……高度推荐。',
        '中文', 12.00, '2003-01-01', 9, 16, 0);


-- ----------------------------
-- Table structure for lend_list
-- ----------------------------
DROP TABLE IF EXISTS `lend_list`;
CREATE TABLE `lend_list`
(
    `sernum`    bigint(20) NOT NULL AUTO_INCREMENT,
    `book_id`   bigint(20) NOT NULL,
    `reader_id` int(11) NOT NULL,
    `lend_date` date NULL DEFAULT NULL,
    `back_date` date NULL DEFAULT NULL,
    PRIMARY KEY (`sernum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2016040143 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lend_list
-- ----------------------------
INSERT INTO `lend_list`
VALUES (2016040139, 10000001, 1501014101, '2020-01-15', '2020-02-16');
INSERT INTO `lend_list`
VALUES (2016040142, 50000004, 1501014101, '2020-01-15', '2020-02-20');

-- ----------------------------
-- Table structure for reader_card
-- ----------------------------
DROP TABLE IF EXISTS `reader_card`;
CREATE TABLE `reader_card`
(
    `reader_id`  int(11) NOT NULL,
    `name`       varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `passwd`     varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '111111',
    `card_state` tinyint(4) NULL DEFAULT 1,
    PRIMARY KEY (`reader_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reader_card
-- ----------------------------
INSERT INTO `reader_card`
VALUES (20160803, '孙思慧', '111111', 1);
INSERT INTO `reader_card`
VALUES (20160809, '张楠', '111111', 1);
DROP
DATABASE IF EXISTS library;
CREATE
DATABASE library DEFAULT CHARACTER SET utf8;
USE
library;


-- ----------------------------
-- Table structure for reader_info
-- ----------------------------
DROP TABLE IF EXISTS `reader_info`;
CREATE TABLE `reader_info`
(
    `reader_id` int(11) NOT NULL,
    `name`      varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `sex`       varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `birth`     date NULL DEFAULT NULL,
    `address`   varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `telcode`   varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    PRIMARY KEY (`reader_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reader_info
-- ----------------------------
INSERT INTO `reader_info`
VALUES (20160803, '孙思慧', '男', '1997-12-26', '中原工学院', '1573677312');
INSERT INTO `reader_info`
VALUES (20160809, '张楠', '女', '1999-06-10', '郑州大学', '12345678900');

SET
FOREIGN_KEY_CHECKS = 1;
