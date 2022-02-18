package com.hyd.showcase.core2.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.hyd.showcase.facade.IACMgr;
import org.springframework.stereotype.Service;

@Service
@SofaService
public class ACMgr implements IACMgr {

    @Override
    public String getAC() {
        return "我就是AC";
    }
}
