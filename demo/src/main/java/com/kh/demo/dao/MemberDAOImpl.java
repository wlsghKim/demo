package com.kh.demo.dao;

import com.kh.demo.web.form.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

  private final JdbcTemplate jdbcTemplate;

  public MemberDAOImpl(JdbcTemplate jdbcTemplate) {

    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void joinMember(Customer customer) {
    String sql = "insert into customer values(?, ?, ?, ?)";
    jdbcTemplate.update(sql, customer.getId(), customer.getName(), customer.getAddress(), customer.getPhone());
  }
}
