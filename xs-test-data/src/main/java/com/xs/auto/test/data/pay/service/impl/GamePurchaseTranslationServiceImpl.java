package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.GamePurchaseTranslationDao;
import com.xs.auto.test.data.pay.entity.GamePurchaseTranslationEntity;
import com.xs.auto.test.data.pay.service.GamePurchaseTranslationService;


@Service("gamePurchaseTranslationService")
public class GamePurchaseTranslationServiceImpl extends ServiceImpl<GamePurchaseTranslationDao, GamePurchaseTranslationEntity> implements GamePurchaseTranslationService {


}