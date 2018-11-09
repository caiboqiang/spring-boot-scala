package com.sbs.crontroller

import java.util

import com.sbs.po.D
import com.sbs.service.sService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class dCrontroller @Autowired()(dService: sService) {
  @RequestMapping(value = Array("/sAdd"))
  def add(): Unit = {

    dService.save()
    "-----------"
  }

  @RequestMapping(value = Array("/sList"))
  def getList(): String = {
    val list = dService.getList()
    var n: String = null
    val a = new util.ArrayList[D]();
    while (list.hasNext) {
      val d = list.next()
      val id = d.getId
      val name = d.getNames
      val age = d.getAge
      var dd = new D()

      dd.setAge(age)
      dd.setId(id)
      dd.setNames(name)
      a.add(dd)
      n = s"$id|$name|$age"
      println(s"$id|$name|$age")

    }
    println(a.toString)
    s"****************** $n  " + a.toString
  }

}
