package com.hyd.showcase.app.ctrl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.hyd.showcase.facade.IACMgr;
import com.hyd.showcase.facade.ICoreMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @SofaReference
    private IACMgr acMgr;

    @SofaReference
    private ICoreMgr coreMgr;

    @RequestMapping("/")
    public String index() {
        return acMgr.getAC().concat(" | ").concat(coreMgr.getCore());
    }
}
