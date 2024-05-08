package entities;

public class PessoaFisica extends Contribuintes {

    private Double gastosComSaude;

    public PessoaFisica(){

    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude){
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {
        double taxaBasica;
        if (getRendaAnual() < 20000.0){
            taxaBasica = getRendaAnual() * 0.15;
        } else {
            taxaBasica = getRendaAnual() * 0.25;
        }

        taxaBasica = taxaBasica - (getGastosComSaude() * 0.5);
        if (taxaBasica < 0.0){
            return 0.0;
        } else {
            return taxaBasica;
        }
    }
}
