package com.leon.demo.service.impl;

import com.leon.demo.dao.AccountMapper;
import com.leon.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The type Account service.
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    @Transactional
    public void transfer() throws RuntimeException {
        accountMapper.update(90,1);
        /*int i = 1/0;*/
        accountMapper.update(110,2);
    }
}
