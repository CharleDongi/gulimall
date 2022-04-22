package com.atiguigu.gulimall.product.dao;

import com.atiguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dong
 * @email 992653164@qq.com
 * @date 2022-04-21 19:57:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
