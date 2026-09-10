package com.devsuperior.desafio1.services;

import com.devsuperior.desafio1.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double frete;
        if (order.getBasic() < 100.00) {
            frete = 20.00;
        } else if (order.getBasic() >= 100.00 & order.getBasic() < 200.00) {
            frete = 12.00;
        } else {
            frete = 0.0;
        }
        return frete;
    }
}
