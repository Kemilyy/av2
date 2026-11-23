package tiposAluguel;

import enums.StatusAluguel;

public class PlanoPremium extends Aluguel{
    public PlanoPremium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Quantidade de dias: " + getQuantidadeDias());
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Possui quilometragem ilimitada");
        System.out.println("Possui seguro incluso");
    }
}
