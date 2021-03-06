package com.zl.dubbo.service;

import org.apache.dubbo.config.annotation.Service;

import com.zl.dubbo.orderapi.model.RpcResult;
import com.zl.dubbo.orderapi.service.OrderDubboService;

/**
 *
 * @author zl
 * @date 2021/12/20
 */
@Service()
public class OrderDubboSericeImpl implements OrderDubboService {

    @Override
    public RpcResult<String> getHelloWord() {
        return RpcResult.success("hello world");
    }
}
