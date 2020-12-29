package com.shopping.demo.dto;


public enum QueueEnum {
    QUEUE_ORDER_CANCEL("plaza.order.direct","plaza.order.cancel","plaza.order.cancel"),
    QUEUE_TTL_ORDER_CANCEL("plaza.order.direct.ttl","plaza.order.cancel.ttl","plaza.order.cancel.ttl");

    private String exchange;
    private String name;
    private String routeKey;
    QueueEnum(String exchange, String name, String routeKey){
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }

    public String getExchange() {
        return exchange;
    }

    public String getName() {
        return name;
    }

    public String getRouteKey() {
        return routeKey;
    }
}
