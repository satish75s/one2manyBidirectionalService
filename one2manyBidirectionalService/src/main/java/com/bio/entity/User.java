package com.bio.entity;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USER1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Address> addresses = new ArrayList<>();

    

    // Helper method to add a single address
   /* public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }*/

    // Helper method to remove a single address
   /* public void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(null);
    }*/
}
