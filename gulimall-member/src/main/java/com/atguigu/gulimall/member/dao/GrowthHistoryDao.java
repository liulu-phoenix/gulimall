package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.GrowthHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长积分记录表
 * 
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-14 14:55:40
 */
@Mapper
public interface GrowthHistoryDao extends BaseMapper<GrowthHistoryEntity> {
	
}
