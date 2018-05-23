package com.hzp.authority.mapper;


import com.hzp.authority.entity.Client;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ClientMapper extends Mapper<Client> {
//    @Select(" SELECT\n" +
//            "        client.CODE\n" +
//            "      FROM\n" +
//            "          auth_client client\n" +
//            "      INNER JOIN auth_client_service gcs ON gcs.client_id = client.id\n" +
//            "    WHERE\n" +
//            "        gcs.service_id = #{serviceId}")
//    @ResultType(String.class)
    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);

    Client selectOne(Client client);
}