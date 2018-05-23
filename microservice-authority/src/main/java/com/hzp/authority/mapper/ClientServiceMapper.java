package com.hzp.authority.mapper;

import com.hzp.authority.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}