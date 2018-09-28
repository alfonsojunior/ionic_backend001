package br.edu.unidavi.controller;

import br.edu.unidavi.entity.contato.Contato;
import br.edu.unidavi.entity.contato.ContatoInicial;
import br.edu.unidavi.entity.contato.ContatoResource;
import br.edu.unidavi.entity.contato.ContatoResourceAssembler;
import br.edu.unidavi.entity.login.Login;
import br.edu.unidavi.entity.login.LoginInicial;
import br.edu.unidavi.entity.login.LoginResource;
import br.edu.unidavi.entity.login.LoginResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/ionic")
public class Trabalho001ControllerREST {

    private ArrayList<Login> logins = new ArrayList<>();
    private List<Contato> contatos = new ArrayList<>();

    private LoginResourceAssembler assembler = new LoginResourceAssembler();
    private ContatoResourceAssembler assemblerContato = new ContatoResourceAssembler();

    public Trabalho001ControllerREST() {
        logins = LoginInicial.geraListaInicial();
        contatos = ContatoInicial.geraListaInicial();
    }

    @CrossOrigin
    @PostMapping(value="/login")
    public ResponseEntity<LoginResource> getLogin(@RequestBody Login login) {

//        System.out.println(login.getUsuario());

        Login loginRet = logins.stream().filter(x -> x.getUsuario().equals(login.getUsuario()) && x.getSenha().equals(login.getSenha())).findFirst().orElse(null);
        if (loginRet == null) {
            return new ResponseEntity<>(assembler.toResource(login), HttpStatus.UNAUTHORIZED);
        } else {
            return new ResponseEntity<>(assembler.toResource(loginRet), HttpStatus.OK);
        }
    }

    public ResponseEntity<ContatoResource> getContato(@PathVariable String id) {

        Contato contato = contatos.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        if (contato == null) {
            contato = new Contato();
            return new ResponseEntity<>(assemblerContato.toResource(contato), HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(assemblerContato.toResource(contato), HttpStatus.OK);
        }
    }

    @CrossOrigin
    @GetMapping(value="/contato/{id}/{token}")
    public ResponseEntity<ContatoResource> getContato(@PathVariable String id, @PathVariable String token) {

        Contato contato = new Contato();
        Login loginRet = logins.stream().filter(x -> x.getToken().equals(token)).findFirst().orElse(null);
        if (loginRet == null) {
            return new ResponseEntity<>(assemblerContato.toResource(contato, token), HttpStatus.UNAUTHORIZED);
        } else {
            contato = contatos.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
            if (contato == null) {
                contato = new Contato();
                return new ResponseEntity<>(assemblerContato.toResource(contato, token), HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(assemblerContato.toResource(contato, token), HttpStatus.OK);
            }
        }
    }

    @CrossOrigin
    @GetMapping(value="/contatos/{token}")
    public ResponseEntity<List<ContatoResource>> getContatos(@PathVariable String token) {
        Login loginRet = logins.stream().filter(x -> x.getToken().equals(token)).findFirst().orElse(null);
        if (loginRet == null) {
            List<Contato> cts = new ArrayList<Contato>();
            return new ResponseEntity<>(assemblerContato.toResource(cts, token), HttpStatus.UNAUTHORIZED);
        } else {
            return new ResponseEntity<>(assemblerContato.toResource(contatos, token), HttpStatus.OK);
        }
    }

}
