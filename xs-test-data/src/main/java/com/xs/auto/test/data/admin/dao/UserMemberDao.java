package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.UserMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户会员表(核心数据，安全设置请查询user_security_settings表)
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface UserMemberDao extends BaseMapper<UserMemberEntity> {
	
}
