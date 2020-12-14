package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-14 13:43:08
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
