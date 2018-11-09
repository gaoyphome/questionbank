package cn.com.online.questionbank.service.impl;

import cn.com.online.questionbank.mapper.TestMapper;
import cn.com.online.questionbank.entity.Test;
import cn.com.online.questionbank.service.TestService;
import cn.com.online.questionbank.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/06.
 */
@Service
@Transactional
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;

}
