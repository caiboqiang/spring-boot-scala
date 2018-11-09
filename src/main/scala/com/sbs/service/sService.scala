package com.sbs.service

import java.lang
import java.util.function.Consumer

import com.sbs.mapper.dMapper
import com.sbs.po.D
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class sService @Autowired()(dMapper: dMapper) {

  def save(): Unit = {
    val d = new D()
    d.setAge(51)
    d.setNames("熊大1")
    dMapper.save(d)
  }

  def getList() = {
    dMapper.findAll().iterator()
  }

}
