package com.atiguigu.gulimall.member.dao;

import com.atiguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dong
 * @email 992653164@qq.com
 * @date 2022-04-22 10:31:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
