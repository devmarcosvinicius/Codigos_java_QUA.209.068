package com.marcosviniciusdev.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (Contato contato: contatos) {
            System.out.println(contato.toString());
        }
    }

}
