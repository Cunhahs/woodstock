package br.com.senac.woodstock.woodstock.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Entity
//@Table(name = "user")
public class User {
    
    String nome;
    String cnpj ;
    String email;
    String password;
    String endereco;
    int telefone;
    String adm;
    
    public User(){}
    
    public User(String nome, String cnpj, String email, String password, int telefone, String adm) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.password = password;
        this.telefone = telefone;
        this.adm = adm;
    }

}
