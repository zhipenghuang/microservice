package com.hzp.authority.biz;

import com.hzp.authority.entity.Client;
import com.hzp.authority.entity.ClientService;
import com.hzp.authority.mapper.ClientMapper;
import com.hzp.authority.mapper.ClientServiceMapper;
import com.hzp.common.biz.BaseBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 *
 *
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-12-26 19:43:46
 */
@Service
public class ClientBiz extends BaseBiz<ClientMapper,Client> {
    @Autowired
    private ClientServiceMapper clientServiceMapper;
    @Autowired
    private ClientServiceBiz clientServiceBiz;

    public List<Client> getClientServices(int id) {
        return mapper.selectAuthorityServiceInfo(id);
    }

    public void modifyClientServices(int id, String clients) {
        clientServiceMapper.deleteByServiceId(id);
        if (!StringUtils.isEmpty(clients)) {
            String[] mem = clients.split(",");
            for (String m : mem) {
                ClientService clientService = new ClientService();
                clientService.setServiceId(m);
                clientService.setClientId(id+"");
                clientServiceBiz.insertSelective(clientService);
            }
        }
    }
}