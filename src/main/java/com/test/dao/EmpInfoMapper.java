package com.test.dao;

import com.test.model.EmpInfo;

public interface EmpInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmpInfo record);

    int insertSelective(EmpInfo record);

    EmpInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmpInfo record);

    int updateByPrimaryKey(EmpInfo record);
}