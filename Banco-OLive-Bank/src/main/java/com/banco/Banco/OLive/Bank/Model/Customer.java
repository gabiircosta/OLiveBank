package com.banco.Banco.OLive.Bank.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "customer_tb")
@Data
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "customer_id")
    private Long id;

    @Column (name = "customer_name")
    private String name;

    @Column (name = "customer_cpf")
    private String cpf;

    @OneToMany (mappedBy = "customer")
    @JsonIgnoreProperties ("customer")
    private List<Account> balance;

}
