package com.atiguigu.gulimall.product.service.impl;

import com.atiguigu.gulimall.common.utils.PageUtils;
import com.atiguigu.gulimall.common.utils.Query;
import com.atiguigu.gulimall.product.dao.SpuInfoDescDao;
import com.atiguigu.gulimall.product.entity.SpuInfoDescEntity;
import com.atiguigu.gulimall.product.service.SpuInfoDescService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}