package com.jhenny.models;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao / 100.0);

    }

    @Override
    public Double calcularSalarioFinal() {
       return this.valorSalario + this.valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome = " + nome + '\'' +
                ", documento =  " + documento + '\'' +
                ", valorSalario = " + valorSalario +
                ", endereco = " + endereco +
                ", ValorBonificacao = " + this.valorBonificacao +
                ", salarioFinal = " +calcularSalarioFinal() +
                '}';
    }


}
