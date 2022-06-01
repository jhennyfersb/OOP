package com.jhenny;

import com.jhenny.models.Endereco;
import com.jhenny.models.Gerente;
import com.jhenny.models.OperadorDeCaixa;
import com.jhenny.models.Vendedor;

public class Main {
    private double valorBonificacao;

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua X ");
        endereco.setBairro("Bairro X ");
        endereco.setComplemento("Perto de X ");
        System.out.println(endereco.getRua() + endereco.getBairro() + endereco.getComplemento());

        Vendedor vendedor=new Vendedor();
        vendedor.setNome("Vendedor Y");
        vendedor.setDocumento("12346789-25");
        vendedor.setValorSalario(1000);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("----");

        OperadorDeCaixa operadorDeCaixa=
                new OperadorDeCaixa("Vendedor Y","12346789-25",1050,endereco);
                System.out.println(operadorDeCaixa);
                System.out.println("----");

        Gerente gerente= new Gerente();
        gerente.setNome("Gerente Z");
        gerente.setDocumento("987654321-01");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100.0);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);
        System.out.println("----");





    }
}
