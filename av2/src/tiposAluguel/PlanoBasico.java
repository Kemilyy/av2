package tiposAluguel;

import enums.StatusAluguel;

public class PlanoBasico extends Aluguel{

    public PlanoBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Quantidade de dias: " + getQuantidadeDias());
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Permite até 100 km por dia");
        System.out.println("Não possui seguro incluso");
    }
}
