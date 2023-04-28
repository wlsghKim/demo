package com.kh.demo.dao;

import com.kh.demo.web.form.Customer;

public interface MemberDAO {

  //회원가입
  void joinMember(Customer customer);
}
