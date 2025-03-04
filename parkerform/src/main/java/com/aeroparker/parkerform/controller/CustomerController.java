package com.aeroparker.parkerform.controller;

import com.aeroparker.parkerform.model.Customer;
import com.aeroparker.parkerform.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Controller // To return HTML views
@RequestMapping("/registration")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // Display the form page
    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "registration";  // Ensure registration.html exists in templates
    }

    // Handle form submission
    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer) {
        customer.setRegistered(LocalDateTime.now());
        customerRepository.save(customer);
        return "redirect:/success";  // Redirects to success page
    }

    // Show success page after form submission
    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";  // Ensure success.html exists in templates
    }
}
