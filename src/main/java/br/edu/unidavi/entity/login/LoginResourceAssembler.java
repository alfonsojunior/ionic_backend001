package br.edu.unidavi.entity.login;

import br.edu.unidavi.controller.Trabalho001ControllerREST;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class LoginResourceAssembler extends ResourceAssemblerSupport<Login, LoginResource> {

    public LoginResourceAssembler() {
        super(Login.class, LoginResource.class);
    }

    @Override
    public LoginResource toResource(Login login) {
        return new LoginResource(login,
                linkTo(methodOn(Trabalho001ControllerREST.class).getLogin(login)).withSelfRel());
    }

    @Override
    protected LoginResource instantiateResource(Login chave) {
        return new LoginResource(chave);
    }
}
