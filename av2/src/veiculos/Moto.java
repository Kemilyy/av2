package veiculos;

import enums.StatusVeiculo;
import interfaces.Inspecionavel;

public class Moto extends Veiculo implements Inspecionavel{
    private int cilindrada;

    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
            StatusVeiculo status, int cilindrada) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.println("Valor diária: " + getValorDiaria());
        System.out.println("Quilometragem: " + getQuilometragem());
        System.out.println("Status: " + getStatus());
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println("Não recebe avaliação");
        System.out.println("Pode ser inspecionado");
    }

    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    }

    @Override
    public void realizarInspecao(){

    }
}
