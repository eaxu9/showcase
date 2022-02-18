package com.hyd.showcase.core.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.hyd.showcase.facade.ICoreMgr;
import org.springframework.stereotype.Service;

@Service
@SofaService
public class CoreMgr implements ICoreMgr {
    @Override
    public String getCore() {
        return "改进款";
    }
}
