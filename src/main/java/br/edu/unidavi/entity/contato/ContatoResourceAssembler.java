package br.edu.unidavi.entity.contato;

import br.edu.unidavi.controller.Trabalho001ControllerREST;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class ContatoResourceAssembler extends ResourceAssemblerSupport<Contato, ContatoResource> {

    public ContatoResourceAssembler() {
        super(Contato.class, ContatoResource.class);
    }

    @Override
    public ContatoResource toResource(Contato contato) {
        return new ContatoResource(contato,
                linkTo(methodOn(Trabalho001ControllerREST.class).getContato(contato.getId())).withSelfRel());
    }

    public ContatoResource toResource(Contato contato, String token) {
        return new ContatoResource(contato,
                linkTo(methodOn(Trabalho001ControllerREST.class).getContato(contato.getId(), token)).withSelfRel());
    }


    public List<ContatoResource> toResource(List<Contato> contatos, String token) {

        List<ContatoResource> retorno = new ArrayList<>();
        for (Contato contato : contatos) {
            retorno.add(new ContatoResource(contato,
                            linkTo(methodOn(Trabalho001ControllerREST.class).getContato(contato.getId(), token)).withSelfRel()));
        }
        return retorno;
    }

    @Override
    protected ContatoResource instantiateResource(Contato contato) {
        return new ContatoResource(contato);
    }

}
