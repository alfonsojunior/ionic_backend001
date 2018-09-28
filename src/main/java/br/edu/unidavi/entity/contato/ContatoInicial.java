package br.edu.unidavi.entity.contato;

import java.util.ArrayList;

public class ContatoInicial {

    private static ArrayList<Contato> contatos = new ArrayList<>();

    public static ArrayList<Contato> geraListaInicial() {
        Contato contato = new Contato();
        contato.setId("alfonso");
        contato.setNome("Alfonso Noerenberg Junior");
        contato.setCurriculo(
                "Este é um campo que pode ser usado para informar um texto maior. \n"
                        + "O texto pode incluir o ENTER."
        );
        contatos.add(contato);

        contato = new Contato();
        contato.setId("cristhiane");
        contato.setNome("Cristhiane Suzan Boeving Wachholz Noerenberg");
        contato.setCurriculo(
                "Phasellus scelerisque tellus elit, eu luctus ligula rutrum suscipit. Nunc mollis nibh elit, in sagittis ligula maximus vel. Nam iaculis nisi quis sapien pellentesque lacinia. Duis interdum quam leo, et mollis nisi scelerisque nec. Donec volutpat eros sit amet ex vestibulum, scelerisque suscipit diam accumsan. Etiam auctor nisi dolor, vitae congue est feugiat nec. Fusce lacus elit, molestie sed varius vitae, molestie in dui."
        );
        contatos.add(contato);

        contato = new Contato();
        contato.setId("thiago");
        contato.setNome("Thiago Hencke");
        contato.setCurriculo(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean scelerisque risus id nulla volutpat, eu maximus mauris dignissim. Sed vitae volutpat tellus. Morbi a fringilla neque. Sed efficitur tortor sed venenatis lacinia. Morbi risus nulla, ornare a augue iaculis, dapibus pretium tellus. Nullam dignissim dictum aliquet. Curabitur eu elit vitae magna ultrices venenatis. Maecenas egestas urna neque, id sodales ligula suscipit vitae. Pellentesque rhoncus quam sed turpis interdum, et dictum eros aliquet. Integer vestibulum arcu sodales, lacinia eros sed, sagittis nulla. Ut tristique magna vel nunc porttitor varius. Donec porttitor, dolor at mollis cursus, enim ipsum euismod erat, non pulvinar leo velit ut nisi. Etiam eleifend ultricies turpis ac vehicula. Vivamus quis quam non felis rutrum pulvinar. Mauris dictum semper nisi quis egestas."
        );
        contatos.add(contato);

        contato = new Contato();
        contato.setId("jessica");
        contato.setNome("Jessica Peixe");
        contato.setCurriculo(
                "Cras sollicitudin hendrerit tortor quis ornare. Etiam nec dui rhoncus, blandit justo eu, posuere erat. Duis elementum, est non mattis placerat, lacus nibh tristique ex, et scelerisque nisl lectus sed quam. Sed consectetur venenatis tortor ac hendrerit. Vestibulum sit amet libero tincidunt, tempus nisl a, sollicitudin purus. Morbi imperdiet elit ut tortor venenatis, egestas faucibus quam ullamcorper. Etiam fermentum facilisis dolor sed molestie. Fusce tristique pretium nibh a malesuada. Vivamus faucibus consequat lacus vitae aliquet. Vivamus sit amet ipsum blandit, blandit augue ultricies, dictum eros. Maecenas euismod gravida consectetur. In vulputate sed odio ut ullamcorper. Aliquam at dui nisl. Vestibulum at turpis ultricies, dapibus massa ac, imperdiet sem."
        );
        contatos.add(contato);

        return contatos;
    }

}
