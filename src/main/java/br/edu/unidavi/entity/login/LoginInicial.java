package br.edu.unidavi.entity.login;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;

public class LoginInicial {

    private static ArrayList<Login> logins = new ArrayList<>();

    public static ArrayList<Login> geraListaInicial() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        Login login = new Login();
        String token = now.format(formatter);
        login.setUsuario("usuario001");
        login.setSenha("123456");
        token = login.getUsuario().trim() + login.getSenha().trim() + token.trim();
        try {
            login.setToken(Base64.getEncoder().encodeToString(token.getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logins.add(login);

        login = new Login();
        token = now.format(formatter);
        login.setUsuario("usuario002");
        login.setSenha("654321");
        token = login.getUsuario().trim() + login.getSenha().trim() + token.trim();
        try {
            login.setToken(Base64.getEncoder().encodeToString(token.getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logins.add(login);

        return logins;
    }

}
