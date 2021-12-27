package com.zl.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.dubbo.orderapi.model.RpcResult;
import com.zl.dubbo.orderapi.service.OrderDubboService;

/**
 *
 * @author zl
 * @date 2021/12/20
 */
@RestController()
@RequestMapping("/consumer")
public class ConsumerController {
    @Reference
    OrderDubboService orderDubboService;

    @GetMapping("getOrder")
    public RpcResult getOrder() {
        return orderDubboService.getHelloWord();
    }
}
