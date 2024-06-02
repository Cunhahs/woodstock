package br.com.senac.woodstock.woodstock.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "User")
public class User {

    @Id
    String id;
    String username;
    String cnpj ;
    String email;
    String password;
    String address;
    int cellPhone;
    String adm;
    
    public User(){}
    
    public User(String username, String cnpj, String email, String password, int cellPhone, String adm) {
        this.username = username;
        this.cnpj = cnpj;
        this.email = email;
        this.password = password;
        this.cellPhone = cellPhone;
        this.adm = adm;
    }

}
