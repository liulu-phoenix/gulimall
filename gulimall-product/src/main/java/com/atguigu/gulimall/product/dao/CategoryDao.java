package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-13 14:41:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
