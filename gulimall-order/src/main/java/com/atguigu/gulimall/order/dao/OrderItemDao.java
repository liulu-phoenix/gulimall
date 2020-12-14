package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-14 15:18:43
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
