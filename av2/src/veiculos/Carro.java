package veiculos;

import enums.StatusVeiculo;
import interfaces.Avaliavel;

public class Carro extends Veiculo implements Avaliavel{
    private int qtdPortas;

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
            StatusVeiculo status, int qtdPortas) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.println("Valor diária: " + getValorDiaria());
        System.out.println("Quilometragem: " + getQuilometragem());
        System.out.println("Status: " + getStatus());
        System.out.println("Quantidade de portas: " + getQtdPortas());
        System.out.println("Pode receber avaliação");
        System.out.println("Não precisa de inspeção");
    }

    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }

    @Override
    public void avaliar(int nota){
        
    }
}
