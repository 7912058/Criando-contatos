package com.algaworks.algaworkscontatos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ContatosControle {

    private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

    static {
        LISTA_CONTATOS.add(new Contato("01", "Maria", "+55 16 9999 1111"));
        LISTA_CONTATOS.add(new Contato("02", "João", "+55 16 9999 2222"));
        LISTA_CONTATOS.add(new Contato("03", "Thiago", "+55 16 9999 3333"));
        LISTA_CONTATOS.add(new Contato("04", "Normandes", "+55 16 9999 4444"));
        LISTA_CONTATOS.add(new Contato("05", "Alexandre", "+55 16 9999 5555"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contatos")
    public String listar() {
        return "listar";
    }

}



