package br.edu.unidavi.entity.contato;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Contato.class})
public class ContatoResource extends Resource<Contato> {

    public ContatoResource() {
        this(new Contato());
    }

    public ContatoResource(Contato contato, Link... links) {
        super(contato, links);
    }
}
