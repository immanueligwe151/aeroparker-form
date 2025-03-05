package com.aeroparker.parkerform.controller;

import com.aeroparker.parkerform.model.Customer;
import com.aeroparker.parkerform.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "registration";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/registration";
    }

    @PostMapping("/register")
    public String registerCustomer(@ModelAttribute Customer customer) {
        customer.setRegistered(LocalDateTime.now());
        customerRepository.save(customer);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }
}


/*package com.aeroparker.parkerform.controller;

import com.aeroparker.parkerform.model.Customer;
import com.aeroparker.parkerform.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller  // Handles HTML views
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // Show registration form template
    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "registration";
    }

    // Handles form submission and redirection to form submission
    @PostMapping("/register")
    public String registerCustomer(@ModelAttribute Customer customer) {
        customer.setRegistered(LocalDateTime.now());
        customerRepository.save(customer);
        return "redirect:/success";  // Redirects to success page
    }

    // ✅ Show success page
    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }
}*/
