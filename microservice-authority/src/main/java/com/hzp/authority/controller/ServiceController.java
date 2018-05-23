package com.hzp.authority.controller;

import com.hzp.authority.biz.ClientBiz;
import com.hzp.authority.entity.ClientService;
import com.hzp.common.msg.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ace
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController{

    @Autowired
    ClientBiz clientBiz;

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        clientBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(clientBiz.getClientServices(id));
    }
}
