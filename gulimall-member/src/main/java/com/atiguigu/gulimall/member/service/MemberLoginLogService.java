package com.atiguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atiguigu.gulimall.common.utils.PageUtils;
import com.atiguigu.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author dong
 * @email 992653164@qq.com
 * @date 2022-04-22 10:31:54
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

