package com.xs.auto.test.data.admin.service.impl;

import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.common.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xs.auto.test.data.admin.dao.TbMultilingualResponseMessageDao;
import com.xs.auto.test.data.admin.entity.TbMultilingualResponseMessageEntity;
import com.xs.auto.test.data.admin.service.TbMultilingualResponseMessageService;


@Service("tbMultilingualResponseMessageService")
public class TbMultilingualResponseMessageServiceImpl extends ServiceImpl<TbMultilingualResponseMessageDao, TbMultilingualResponseMessageEntity> implements TbMultilingualResponseMessageService {


}