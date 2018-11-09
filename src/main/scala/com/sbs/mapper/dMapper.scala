package com.sbs.mapper

import com.sbs.po.D
import org.springframework.data.repository.CrudRepository

trait dMapper extends CrudRepository[D, Integer] {

}
