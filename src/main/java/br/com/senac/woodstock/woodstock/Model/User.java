package br.com.senac.woodstock.woodstock.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Entity
//@Table(name = "user")
public class User {
    
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
