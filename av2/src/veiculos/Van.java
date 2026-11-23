package veiculos;

import enums.StatusVeiculo;
import interfaces.Avaliavel;
import interfaces.Inspecionavel;

public class Van extends Veiculo implements Inspecionavel, Avaliavel{
    private int qtdMaxPassageiros;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
            StatusVeiculo status, int qtdMaxPassageiros) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }

    public int getQtdMaxPassageiros() {
        return qtdMaxPassageiros;
    }

    public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    } 

    @Override
    public void exibirDetalhes(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.println("Valor diária: " + getValorDiaria());
        System.out.println("Quilometragem: " + getQuilometragem());
        System.out.println("Status: " + getStatus());
        System.out.println("Quantidade máxima de passageiros: " + getQtdMaxPassageiros());
        System.out.println("Pode receber avaliação");
        System.out.println("Pode ser inspecionado");
    }

    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }

    @Override
    public void realizarInspecao(){

    }

    @Override
    public void avaliar(int nota){

    }
}
