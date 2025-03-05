package com.aeroparker.parkerform.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "registered", nullable = false)
    private LocalDateTime registered;

    @NotBlank(message = "Email address is required")
    @Email(message = "Email address is invalid")
    @Column(name = "email_address", nullable = false, unique = true, length = 255)
    private String emailAddress;

    @NotBlank(message = "Title is required")
    @Column(name = "title", nullable = false, length = 5)
    private String title;

    @NotBlank(message = "First name is required")
    @Size(min = 2, message = "Needs to have at least 2 characters")
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @NotBlank(message = "First line of address is required")
    @Column(name = "address_line_1", nullable = false, length = 255)
    private String addressLine1;

    @Column(name = "address_line_2", length = 255)
    private String addressLine2;

    @Column(name = "city", length = 255)
    private String city;

    @NotBlank(message = "Postcode is required")
    @Column(name = "postcode", nullable = false, length = 10)
    private String postcode;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
}
