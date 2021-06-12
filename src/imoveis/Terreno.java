
package imoveis;


public class Terreno extends ImoveisTeste {
    
    private double area; 
    private boolean construcaoHabitacao; 
    private boolean construcaoArmazens; 
    private double canalizacoes;
    private double redeEletrica;
    private boolean esgotos;
     
    public Terreno() {
        super();
        this.area = 0.0;
        this.construcaoHabitacao = false; 
        this.construcaoArmazens = false; 
        this.canalizacoes = 0.0;
        this.redeEletrica = 0.0;
        this.esgotos = false;

    }
    
    
    
    public Terreno(String endereco, boolean cidade, double precoMin, double area, boolean construcaoHabitacao, boolean construcaoArmazens, double canalizacoes, double redeEletrica, boolean esgotos) {
        super(endereco , cidade , precoMin);
        this.area = area;
        this.construcaoHabitacao = construcaoHabitacao;
        this.construcaoArmazens = construcaoArmazens;
        this.canalizacoes = canalizacoes;
        this.redeEletrica = redeEletrica;
        this.esgotos = esgotos;
       
    }
    
    public Terreno(Terreno tr) {
        super(tr.getEndereco(), tr.getCidade(), tr.getPrecoMin());
        this.area = 0.0;
        this.construcaoHabitacao = false; 
        this.construcaoArmazens = false; 
        this.canalizacoes = 0.0;
        this.redeEletrica = 0.0;
        this.esgotos = false;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isConstrucaoHabitacao() {
        return construcaoHabitacao;
    }

    public void setConstrucaoHabitacao(boolean construcaoHabitacao) {
        this.construcaoHabitacao = construcaoHabitacao;
    }

    public boolean isConstrucaoArmazens() {
        return construcaoArmazens;
    }

    public void setConstrucaoArmazens(boolean construcaoArmazens) {
        this.construcaoArmazens = construcaoArmazens;
    }

    public double getCanalizacoes() {
        return canalizacoes;
    }

    public void setCanalizacoes(double canalizacoes) {
        this.canalizacoes = canalizacoes;
    }

    public double getRedeEletrica() {
        return redeEletrica;
    }

    public void setRedeEletrica(double redeEletrica) {
        this.redeEletrica = redeEletrica;
    }

    public boolean isEsgotos() {
        return esgotos;
    }

    public void setEsgotos(boolean esgotos) {
        this.esgotos = esgotos;
    }

    
    
    public double valorTerreno () {
    
        double valorArea = 0; 
        double valorConstrucaoHabitacao = 0 ; 
        double valorConstrucaoArmazens = 0 ; 
        double valorCanalizacoes = 0;
        double valorRedeEletrica = 0;
        double valorEsgotos = 0;
        double valorTerreno = 0;
    
        valorArea = this.area * 98; 
        
        if (this.construcaoHabitacao == true) {
        valorConstrucaoHabitacao = 40000;
        }
        
        if (this.construcaoArmazens == true) {
        valorConstrucaoArmazens = 35000;
        }
        
        valorCanalizacoes = this.canalizacoes * 256;
        
        valorRedeEletrica = this.redeEletrica * 120;
        
        if (this.esgotos == true) {
        valorEsgotos = 5423;
        }
        
        valorTerreno = valorArea + valorConstrucaoHabitacao + valorConstrucaoArmazens + valorCanalizacoes + valorRedeEletrica + valorEsgotos;  
        
        if (this.getCidade()==true) {
        valorTerreno += valorTerreno * 0.5;  
        }
        return valorTerreno; 
    }
    
    @Override
    public Terreno clone() {
        return new Terreno (this);
    }
}
