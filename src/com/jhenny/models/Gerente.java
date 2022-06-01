package com.jhenny.models;

public class Gerente extends FuncionarioPJ implements CalcularBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao / 100.0)) + 100;
    }

    @Override
    public Double calcularSalarioFinal() {
        return this.valorSalario + this.valorBonificacao;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                ", salarioFinal =" + this.calcularSalarioFinal() +
                '}';
    }

}
