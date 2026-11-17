package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {

        Address address = new Address("No. 05, Kalidasa Road, Matara", "Matara", "81000");

        return new Customer(id, "yenul",
                "yenul@yahoo.com", address);
    }
}