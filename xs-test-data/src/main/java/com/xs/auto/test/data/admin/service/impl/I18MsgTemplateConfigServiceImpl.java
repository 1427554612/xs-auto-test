package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.I18MsgTemplateConfigDao;
import com.xs.auto.test.data.admin.entity.I18MsgTemplateConfigEntity;
import com.xs.auto.test.data.admin.service.I18MsgTemplateConfigService;


@Service("i18MsgTemplateConfigService")
public class I18MsgTemplateConfigServiceImpl extends ServiceImpl<I18MsgTemplateConfigDao, I18MsgTemplateConfigEntity> implements I18MsgTemplateConfigService {


}