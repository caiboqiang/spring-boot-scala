package com.sbs.service;

import com.sbs.po.C;
import com.sbs.repository.aRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class aService {

    @Autowired
    private aRepository arepository;

    @Transactional
    public void save(C a) {
        arepository.save(a);
    }

    public Iterable<C> getA() {
        return arepository.findAll();
    }
}
