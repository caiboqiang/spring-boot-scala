package com.sbs.crontroller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}


@RestController
class HelloScala {
  /**
    * 测试Scala 开发demo
    *
    * @return
    */
  @RequestMapping(value = Array("/helloBootScala"), method = Array(RequestMethod.GET, RequestMethod.POST))
  def hello(): String = {
    "Hello String Boot Java - Scala"
  }

  //添加
  def add(): String = {
    "---------"
  }
}
