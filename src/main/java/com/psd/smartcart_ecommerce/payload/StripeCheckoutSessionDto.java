package com.psd.smartcart_ecommerce.payload;


import lombok.Data;

import java.util.Map;

@Data
public class StripeCheckoutSessionDto {
    private Long amount;          // in cents
    private String currency;
    private String email;
    private String name;
    private String description;
    private String successUrl;   // must include {CHECKOUT_SESSION_ID}
    private String cancelUrl;
    private Map<String, String> metadata; // optional

    // getters/setters...

}
