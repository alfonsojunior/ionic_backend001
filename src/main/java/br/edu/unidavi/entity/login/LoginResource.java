package br.edu.unidavi.entity.login;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Login.class})
public class LoginResource extends Resource<Login> {

    public LoginResource() {
        this(new Login());
    }

    public LoginResource(Login login, Link... links) {
        super(login, links);
    }

}
