package com.kodilla.good.patterns.challenges.firstChallenge;

public class SupplyOrderProcessor {
    private InfoService infoService;
    private NewOrderProcessor newOrderProcessor;
    private OrderChecker orderChecker;

    public SupplyOrderProcessor(InfoService infoService,
                                NewOrderProcessor newOrderProcessor,
                                OrderChecker orderChecker) {
        this.infoService = infoService;
        this.newOrderProcessor = newOrderProcessor;
        this.orderChecker = orderChecker;
    }

    public void placeTheOrder(SupplyOrderRequest supplyOrderRequest) {
        infoService.show(supplyOrderRequest.getSupplier());
        SupplyOrderDto currentSupplyOrderDto = newOrderProcessor.process(supplyOrderRequest);
        orderChecker.check(currentSupplyOrderDto);
    }
}
