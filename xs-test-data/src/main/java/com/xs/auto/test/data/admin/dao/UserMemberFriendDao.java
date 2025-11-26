package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.UserMemberFriendEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 好友关系表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Mapper
public interface UserMemberFriendDao extends BaseMapper<UserMemberFriendEntity> {

    /**
     * 查询好友列表
     * @return
     */
    List<UserMemberFriendEntity> friendList();
}
