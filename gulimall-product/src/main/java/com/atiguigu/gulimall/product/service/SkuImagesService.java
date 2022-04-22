package com.atiguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.gulimall.common.utils.PageUtils;
import com.atiguigu.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author dong
 * @email 992653164@qq.com
 * @date 2022-04-21 19:57:17
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

