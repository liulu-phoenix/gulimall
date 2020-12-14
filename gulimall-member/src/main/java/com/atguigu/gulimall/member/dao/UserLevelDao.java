package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.UserLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-14 14:55:40
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}
