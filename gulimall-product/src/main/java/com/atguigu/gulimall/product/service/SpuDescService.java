package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-13 14:41:24
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

