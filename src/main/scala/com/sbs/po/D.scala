package com.sbs.po

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

@Entity
@Table
class D {
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var names: String = _
  @BeanProperty
  var age: Integer = _

}
