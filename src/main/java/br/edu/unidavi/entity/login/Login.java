package br.edu.unidavi.entity.login;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Login {

    private String usuario;
    private String senha;
    private String token;

    public Login() {
        super();
    }

}
