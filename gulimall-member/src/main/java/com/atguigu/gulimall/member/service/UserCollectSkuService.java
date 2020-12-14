package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author liulu
 * @email 84387811@qq.com
 * @date 2020-12-14 14:55:40
 */
public interface UserCollectSkuService extends IService<UserCollectSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

