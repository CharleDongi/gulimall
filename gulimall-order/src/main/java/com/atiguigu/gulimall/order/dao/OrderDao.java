package com.atiguigu.gulimall.order.dao;

import com.atiguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dong
 * @email 992653164@qq.com
 * @date 2022-04-22 10:28:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
