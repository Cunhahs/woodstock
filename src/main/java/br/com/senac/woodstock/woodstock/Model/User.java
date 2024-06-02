package br.com.senac.woodstock.woodstock.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String username;
    String cnpj ;
    String email;
    String password;
    @Column(name = "address")
    String address;
    String cell_phone;
    @Column(name = "adm")
    String adm;
    
    public User(){}
    
    public User(String username, String cnpj, String address, String email, String password, String cell_phone, String adm) {
        this.username = username;
        this.address = address;
        this.cnpj = cnpj;
        this.email = email;
        this.password = password;
        this.cell_phone = cell_phone;
        this.adm = "N";
    }

}
