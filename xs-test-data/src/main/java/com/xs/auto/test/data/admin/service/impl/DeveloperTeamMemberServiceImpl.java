package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.DeveloperTeamMemberDao;
import com.xs.auto.test.data.admin.entity.DeveloperTeamMemberEntity;
import com.xs.auto.test.data.admin.service.DeveloperTeamMemberService;


@Service("developerTeamMemberService")
public class DeveloperTeamMemberServiceImpl extends ServiceImpl<DeveloperTeamMemberDao, DeveloperTeamMemberEntity> implements DeveloperTeamMemberService {


}