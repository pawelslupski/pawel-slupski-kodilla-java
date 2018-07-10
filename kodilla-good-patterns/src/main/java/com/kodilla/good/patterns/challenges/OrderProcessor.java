package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final ProductOrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getTimeOfOrder(), orderRequest.getTimeOfDelivery());
        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.recordOrder(orderRequest.getUser(),
                            orderRequest.getTimeOfOrder(),
                            orderRequest.getTimeOfDelivery());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
