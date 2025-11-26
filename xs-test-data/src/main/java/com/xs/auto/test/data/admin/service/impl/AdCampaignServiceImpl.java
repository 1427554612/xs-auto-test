package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.AdCampaignDao;
import com.xs.auto.test.data.admin.entity.AdCampaignEntity;
import com.xs.auto.test.data.admin.service.AdCampaignService;


@Service("adCampaignService")
public class AdCampaignServiceImpl extends ServiceImpl<AdCampaignDao, AdCampaignEntity> implements AdCampaignService {


}