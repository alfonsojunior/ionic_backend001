package br.edu.unidavi.entity.contato;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Contato {

    private String id;
    private String nome;
    private String curriculo;

    public Contato() {
        super();
    }
}
