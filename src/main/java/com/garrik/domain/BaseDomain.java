package com.garrik.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

// 所有的实体类都继承自 BaseDomain 类

public class BaseDomain implements Serializable {
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
