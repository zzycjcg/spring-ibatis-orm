package com.brave.zhu.orm;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

@SuppressWarnings("deprecation")
public class BaseDaoImpl extends SqlMapClientDaoSupport
{
    public void insert(Object object)
    {
        String sqlId = ".insert";
        getSqlMapClientTemplate().insert(sqlId, object);
    }
}
