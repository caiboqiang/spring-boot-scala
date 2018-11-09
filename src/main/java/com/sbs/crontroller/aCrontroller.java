package com.sbs.crontroller;

import com.sbs.po.C;
import com.sbs.service.aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aCrontroller {
    @Autowired
    private aService aService;

    @RequestMapping(value = "/add" )
    public String add() {
        C a = new C();
        a.setId(55);
        a.setName("熊大" );
        a.setAge(50);
        aService.save(a);
        return "添加数据" ;
    }

    @RequestMapping(value = "getList" )
    public String getList() {
        Iterable<C> iterable = aService.getA();
        for (C c : iterable) {
            System.out.println(c.getId());
            System.out.println(c.getName());
            System.out.println(c.getAge());
        }
        return "查询数据 " ;
    }
}
