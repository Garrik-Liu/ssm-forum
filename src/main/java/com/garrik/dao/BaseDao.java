package com.garrik.dao;

// DAO 基类，其他的 DAO 可以直接继承这个 DAO
// 基类里面定义了通用的方法，也可以通过基类获取泛型的好处

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao<T> {
  private JdbcTemplate jdbcTemplate;

  @Autowired
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }
}
