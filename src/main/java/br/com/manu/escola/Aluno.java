package br.com.manu.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Long cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

}
