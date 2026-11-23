package tiposAluguel;

import enums.StatusAluguel;

public class PlanoExecutivo extends Aluguel{
    public PlanoExecutivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    }

    //como em teoria o executivo é melhor que o Premium e na atividade 
    // não deixa claro se possui ou não seguro, assumi que possui

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Quantidade de dias: " + getQuantidadeDias());
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Possui quilometragem ilimitada");
        System.out.println("Possui seguro incluso");
        System.out.println("Oferece motorista particular");
        System.out.println("Pode receber avaliação");
    }
}
