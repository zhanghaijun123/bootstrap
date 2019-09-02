/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50625
Source Host           : 127.0.0.1:3306
Source Database       : zhj

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2019-09-02 17:52:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `code_value` int(11) DEFAULT NULL COMMENT '值(0不开启 1开启）',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `sorted` bigint(8) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统配置表';

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES ('402883596bj82jei016bb17153a50001', '服务器输出模式', '1', '服务器输出模式', 'outType', '1');
INSERT INTO `sys_config` VALUES ('402883596bj82jei016bb17153a50002', '水印生成位置', '3', '水印生成位置', 'waterPosition', '2');
INSERT INTO `sys_config` VALUES ('402883596bj82jei016bb17153a50003', '默认卡类型', '0', '默认卡类型', 'cardType', '3');
INSERT INTO `sys_config` VALUES ('402883596bj82jei016bb17153a50004', '需要定密的密级(密级相加)', null, '需要定密的密级(密级相加)', 'denseLevel', '4');
INSERT INTO `sys_config` VALUES ('402883596bj82jei016bb17153a50005', '是否开启二审', null, '是否开启二审', 'sencondReview', '5');

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `department_name` varchar(64) DEFAULT NULL COMMENT '部门名称',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '上级id',
  `department_ups` varchar(64) DEFAULT NULL COMMENT '上级部门名称',
  `department_charge` varchar(64) DEFAULT NULL COMMENT '部门负责人',
  `department_code` varchar(64) DEFAULT NULL COMMENT '部门代码',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记(0删除  1正常)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- ----------------------------
-- Records of sys_department
-- ----------------------------
INSERT INTO `sys_department` VALUES ('402883596b9c2da6016b9c52889b0000', '中船重工第七一四研究所', '0', '0', '李宝杰', 'ACZG', 'admin', '2019-06-28 12:23:03', null, null, '1');
INSERT INTO `sys_department` VALUES ('402883596b9c999a016b9c9e1fe40000', '十室', '402883596b9c2da6016b9c52889b0000', '中船重工第七一四研究所', '刘向阳', 'SS', 'admin', '2019-06-28 13:56:29', null, null, '1');
INSERT INTO `sys_department` VALUES ('402883596bb0b8d2016bb0bd5b880000', '蓝波今朝', '402883596b9c2da6016b9c52889b0000', '中船重工第七一四研究所', '康正太', 'AJG', 'admin', '2019-07-02 11:32:08', null, null, '1');
INSERT INTO `sys_department` VALUES ('402883596bb0b8d2016bb0c423e80001', '智慧应用事业部', '402883596bb0b8d2016bb0bd5b880000', 'A机构', '丁达', 'ZHSY', 'admin', '2019-07-02 11:39:33', null, null, '1');
INSERT INTO `sys_department` VALUES ('402883596bb6fa16016bb720c0b60002', '714研究所', '0', '', '郑达康', '714YJS', 'admin', '2019-07-03 17:18:25', null, null, '1');
INSERT INTO `sys_department` VALUES ('402883596bb6fa16016bb727590f0003', '保密研究部门', '402883596bb6fa16016bb720c0b60002', '714研究所', '逍遥', 'BMYJBM', 'admin', '2019-07-03 17:25:38', 'admin', '2019-07-03 18:12:24', '1');

-- ----------------------------
-- Table structure for sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_data`;
CREATE TABLE `sys_dict_data` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `dict_label` varchar(32) DEFAULT NULL COMMENT '字典标签',
  `dict_value` varchar(32) DEFAULT NULL COMMENT '字典键值',
  `dict_type` varchar(20) DEFAULT NULL COMMENT '所属字典类型',
  `description` varchar(500) DEFAULT NULL COMMENT '字典描述',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `tree_sort` tinyint(4) DEFAULT NULL COMMENT '本级排序号（升序）',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态（0删除 1启用  2停用）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典表';

-- ----------------------------
-- Records of sys_dict_data
-- ----------------------------
INSERT INTO `sys_dict_data` VALUES ('402848016bd96c72016bd993b5990001', '非密', '1', 'user_secrecy', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:51:01', null, null, '0', '1');
INSERT INTO `sys_dict_data` VALUES ('402848016bd96c72016bd993f8b10002', '一般', '2', 'user_secrecy', '', '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:51:22', '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:51:42', '2', '1');
INSERT INTO `sys_dict_data` VALUES ('402848016bd96c72016bd994bc380003', '重要', '3', 'user_secrecy', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:52:12', null, null, '3', '1');
INSERT INTO `sys_dict_data` VALUES ('402848016bd96c72016bd994d2870004', '核心', '4', 'user_secrecy', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:52:17', null, null, '4', '1');

-- ----------------------------
-- Table structure for sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_type`;
CREATE TABLE `sys_dict_type` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `dict_name` varchar(20) DEFAULT NULL COMMENT '字典名称',
  `dict_type` varchar(20) DEFAULT NULL COMMENT '字典类型',
  `is_sys` bit(1) DEFAULT NULL COMMENT '是否系统字典(false=0 否  true=1是)',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态(0删除   1启用   2停用 ）',
  PRIMARY KEY (`id`),
  KEY `index_dict_type` (`dict_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类型表';

-- ----------------------------
-- Records of sys_dict_type
-- ----------------------------
INSERT INTO `sys_dict_type` VALUES ('402848016bd96c72016bd99300eb0000', '用户密级', 'user_secrecy', '', '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 09:50:18', null, null, '1');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `parent_name` varchar(64) DEFAULT NULL COMMENT '父级名称',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父级编号',
  `name` varchar(32) DEFAULT NULL COMMENT '菜单名称',
  `component` varchar(50) DEFAULT NULL COMMENT '组件',
  `title` varchar(64) DEFAULT NULL COMMENT '主标题',
  `path` varchar(128) DEFAULT NULL COMMENT '链接',
  `target` varchar(64) DEFAULT NULL COMMENT '目标',
  `icon` varchar(128) DEFAULT NULL COMMENT '图标',
  `menu_floor` tinyint(4) DEFAULT NULL COMMENT '层级',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `menu_terminal` tinyint(1) DEFAULT NULL COMMENT '菜单所属终端 0 手机菜单 1 电脑菜单',
  `menu_type` tinyint(1) DEFAULT NULL COMMENT '菜单类型(0菜单 1按钮)',
  `permission` varchar(50) DEFAULT NULL COMMENT '权限标识',
  `sort` int(11) DEFAULT NULL COMMENT '排序(升序)',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记(0删除  1正常)',
  `is_addrouter` bit(1) DEFAULT NULL COMMENT '是否给按钮添加到路由  0不添加  1添加',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '', '0', '首页', null, null, '/main', null, 'el-icon-s-home', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:46:25', '1', '0', '', '1', '1', null);
INSERT INTO `sys_menu` VALUES ('2', '', '0', '系统设置', null, null, '', null, 'fa fa-fw fa-cogs', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:47:48', '1', '0', '', '2', '1', null);
INSERT INTO `sys_menu` VALUES ('3', '系统设置', '2', '角色设置', 'RoleManage', null, '/roleManage', null, 'fa fa-fw fa-user-secret', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:48:17', '1', '0', '', '2', '1', null);
INSERT INTO `sys_menu` VALUES ('4', '系统设置', '2', '菜单管理', 'MenuManage', null, '/menuManage', null, 'fa fa-fw fa-tree', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:48:48', '1', '0', '', '1', '1', null);
INSERT INTO `sys_menu` VALUES ('5', '系统设置', '2', '用户管理', 'UserManage', null, '/userManage', null, 'fa fa-fw fa-user', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:49:27', '1', '0', '', '3', '1', null);
INSERT INTO `sys_menu` VALUES ('6', '系统设置', '2', '部门管理', 'DepartmentManage', null, '/departmentManage', null, 'fa fa-fw fa-group', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:49:52', '1', '0', '', '4', '1', null);
INSERT INTO `sys_menu` VALUES ('7', '系统设置', '2', '字典管理', 'DictionaryManage', null, '/dictionaryManage', null, 'fa fa-fw fa-book', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-04 13:50:14', '1', '0', '', '5', '1', null);
INSERT INTO `sys_menu` VALUES ('8', '字典管理', '7', '字典数据', 'dictManage', null, '/dictManage', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-09 15:32:14', '0', '0', 'sys:dic:data', '3', '1', '');
INSERT INTO `sys_menu` VALUES ('9', '角色设置', '3', '权限配置', 'configRole', null, '/configRole', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-05 15:13:26', '1', '0', 'sys:role:config', '6', '1', '');
INSERT INTO `sys_menu` VALUES ('10', '用户管理', '5', '会员用户', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('11', '用户管理', '5', '普通用户', '', null, '', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-10 16:57:02', '0', '0', 'sys:user:status', '6', '1', '\0');
INSERT INTO `sys_menu` VALUES ('12', '会员用户', '10', '编辑', '', null, '', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-05 15:09:24', '1', '1', 'sys:role:edit', '2', '1', '\0');
INSERT INTO `sys_menu` VALUES ('13', '普通用户', '11', '新增', '', null, '', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-09 15:29:28', '0', '1', 'sys:dic:save', '1', '1', '\0');
INSERT INTO `sys_menu` VALUES ('14', '字典管理', '7', '编辑', '', null, '', null, '', null, '402848016b9c99b8016b9ca36b3e0000', '2019-07-09 15:29:54', '0', '1', 'sys:dic:edit', '2', '1', '\0');

-- ----------------------------
-- Table structure for sys_operate_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_operate_log`;
CREATE TABLE `sys_operate_log` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `user_id` varchar(32) DEFAULT NULL COMMENT '操作人主键',
  `operate_type` varchar(20) DEFAULT NULL COMMENT '操作类型',
  `module` varchar(50) DEFAULT NULL COMMENT '操作模块',
  `content` text COMMENT '内容',
  `ip` varchar(50) DEFAULT NULL COMMENT '操作人ip',
  `obj_pk` varchar(32) DEFAULT NULL COMMENT '操作对象主键',
  `operate_date` datetime DEFAULT NULL COMMENT '创建时间',
  `result` varchar(50) DEFAULT NULL COMMENT '操作结果',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记(0删除  1正常)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志表';

-- ----------------------------
-- Records of sys_operate_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin', '管理员');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色编号',
  `menu_id` varchar(32) DEFAULT NULL COMMENT '菜单编号',
  `checked_status` tinyint(1) DEFAULT NULL COMMENT '全选标识(0 半选 1全选）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='菜单角色关联表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1', '1', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '1', '2', '1');
INSERT INTO `sys_role_menu` VALUES ('3', '1', '3', '1');
INSERT INTO `sys_role_menu` VALUES ('4', '1', '4', '1');
INSERT INTO `sys_role_menu` VALUES ('5', '1', '5', '1');
INSERT INTO `sys_role_menu` VALUES ('6', '1', '6', '1');
INSERT INTO `sys_role_menu` VALUES ('7', '1', '7', '1');
INSERT INTO `sys_role_menu` VALUES ('8', '1', '8', '1');
INSERT INTO `sys_role_menu` VALUES ('9', '1', '9', '1');
INSERT INTO `sys_role_menu` VALUES ('10', '1', '10', '1');
INSERT INTO `sys_role_menu` VALUES ('11', '1', '11', null);
INSERT INTO `sys_role_menu` VALUES ('12', '1', '12', null);
INSERT INTO `sys_role_menu` VALUES ('13', '1', '13', null);
INSERT INTO `sys_role_menu` VALUES ('14', '1', '14', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `login` varchar(255) DEFAULT NULL COMMENT '登录名',
  `pass_word` varchar(255) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `job` varchar(255) DEFAULT NULL COMMENT '职务',
  `group_id` int(11) unsigned zerofill DEFAULT NULL COMMENT '部门id',
  `birth_date` datetime DEFAULT NULL COMMENT '生日',
  `city` varchar(255) DEFAULT NULL COMMENT '城市',
  `district` varchar(255) DEFAULT NULL COMMENT '地区',
  `province` varchar(255) DEFAULT NULL COMMENT '省',
  `street_address` varchar(255) DEFAULT NULL COMMENT '街道地址',
  `state` varchar(10) DEFAULT NULL COMMENT '状态',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登录日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'zhj', '83cec71c1d93a39b315da764265200e2', 'zhj', null, null, null, null, null, null, null, null, '1', null, null);
INSERT INTO `sys_user` VALUES ('2', 'admin', 'admin', 'admin', '北京市海淀区六道口', '开发工程师', '00000000001', '1991-02-18 00:00:00', '北京市', '北京市', '北京市', '北京市通渭路', '1', '2', '2019-08-29 00:00:00');
INSERT INTO `sys_user` VALUES ('3', 'sysadmin', 'bcc325d248ddcf4939d777a85dd226f3', 'sysadmin', '山西大同', '工程师', '00000000002', '1991-09-18 00:00:00', '山西', '北京市', '山西', '山西省大同市', '1', '2', '2019-08-29 00:00:00');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '1');
INSERT INTO `sys_user_role` VALUES ('3', '1');
