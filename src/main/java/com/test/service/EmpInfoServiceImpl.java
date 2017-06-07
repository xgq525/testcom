package com.test.service;

import com.test.dao.EmpInfoMapper;
import com.test.model.EmpInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by HFZY_JR_70 on 2017/6/2.
 */
@Service("EmpInfoService")
public class EmpInfoServiceImpl implements  EmpInfoService {

    @Resource
    EmpInfoMapper empInfoMapper;

    public EmpInfo getEmpInfoById(Long id) {
        return this.empInfoMapper.selectByPrimaryKey(id);
    }
}
