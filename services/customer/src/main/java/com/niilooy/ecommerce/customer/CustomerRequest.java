package com.niilooy.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
    String id,
    @NotNull(message = "Customer firstName is required")
    String firstName,
    @NotNull(message = "Customer firstName is required")
    String lastName,
    @NotNull(message = "Customer Email is required")
    @Email(message = "Customer Email is not a valid email address")
    String email,
    Address address
) {

}
