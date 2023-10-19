package com.marcosviniciusdev.atividade03;

public class Atividade03 {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato contatoMarcos = new Contato("Marcos Vinicius", "99999-99999", "contato@marcosvinicisudev.com");
        Contato contatoJulia = new Contato("Julia Lelis", "98888-8888", "julialelis08@gmail.com");
        Contato contatoCinthia = new Contato("Cinthia Bello", "97777-7777", "cinthiabh@gmail.com");
        Contato contatoVanessa = new Contato("Vanessa Avelar", "96666-6666", "vanessaavelar@gmail.com");
        Contato contatoJoselia = new Contato("Joselia", "95555-5555", "joselia@gmail.com");

        agenda.adicionarContato(contatoMarcos);
        agenda.adicionarContato(contatoJulia);
        agenda.adicionarContato(contatoCinthia);
        agenda.adicionarContato(contatoVanessa);
        agenda.adicionarContato(contatoJoselia);

        agenda.listarContatos();

    }

}
