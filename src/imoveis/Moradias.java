
package imoveis;


public class Moradias extends ImoveisTeste{
    
    
    private int tipoMoradias; 
    private double areaImpla;
    private double areaTotalCoberta; 
    private double areaTerrenoEnvolvente;
    private int quartos; 
    private int wc;
    private int numeroPorta;
    
    
    public Moradias () {
    super ();
    this.tipoMoradias = 0;
    this.areaImpla = 0.0;
    this.areaTotalCoberta = 0.0;  
    this.areaTerrenoEnvolvente = 0.0; 
    this.numeroPorta = 0;
    this.quartos = 0; 
    this.wc = 0;
        
    }

    public Moradias(String endereco, boolean cidade, double precoMin, int tipoMoradias, double areaImpla, double areaTotalCoberta, double areaTerrenoEnvolvente, int quartos, int wc, int numeroPorta) {
        super(endereco , cidade , precoMin);
        this.tipoMoradias = tipoMoradias;
        this.areaImpla = areaImpla;
        this.areaTotalCoberta = areaTotalCoberta;
        this.areaTerrenoEnvolvente = areaTerrenoEnvolvente;
        this.quartos = quartos;
        this.wc = wc;
        this.numeroPorta = numeroPorta;
        
        
    }

    public Moradias(Moradias mr) {
        super(mr.getEndereco(), mr.getCidade(), mr.getPrecoMin());
        this.tipoMoradias = 0;
        this.areaImpla = 0.0;
        this.areaTotalCoberta = 0.0;  
        this.areaTerrenoEnvolvente = 0.0; 
        this.numeroPorta = 0;
        this.quartos = 0; 
        this.wc = 0;
    }

    public int getTipoMoradias() {
        return tipoMoradias;
    }

    public void setTipoMoradias(int tipoMoradias) {
        this.tipoMoradias = tipoMoradias;
    }

    public double getAreaImpla() {
        return areaImpla;
    }

    public void setAreaImpla(double areaImpla) {
        this.areaImpla = areaImpla;
    }

    public double getAreaTotalCoberta() {
        return areaTotalCoberta;
    }

    public void setAreaTotalCoberta(double areaTotalCoberta) {
        this.areaTotalCoberta = areaTotalCoberta;
    }

    public double getAreaTerrenoEnvolvente() {
        return areaTerrenoEnvolvente;
    }

    public void setAreaTerrenoEnvolvente(double areaTerrenoEnvolvente) {
        this.areaTerrenoEnvolvente = areaTerrenoEnvolvente;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getWc() {
        return wc;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }
  
    
  
    
    public double valorMoradia() {
        double valorTipoMoradias = 0;
        double valorAreaImpla = 0;
        double valorAreaTotalCoberta = 0 ;
        double valorAreaTerrenoEnvolvente = 0;
        double valorQuartos = 0;
        double valorWcMoradias = 0;
        double valorMoradia = 0; 
        
        switch(tipoMoradias) {
        case 1: //isolada
          valorTipoMoradias=4000;
          break;
        case 2:   //geminada
          valorTipoMoradias=3000;
          break;
          case 3:       //banda
          valorTipoMoradias=2000;
          break;
          case 4:        //gaveto
          valorTipoMoradias=1000;
          break;
        default:
          // code block
      }
        
        valorAreaImpla = this.areaImpla * 120;
        
        valorAreaTotalCoberta = this.areaTotalCoberta * 650;
        
        valorAreaTerrenoEnvolvente = this.areaTerrenoEnvolvente * 221; 
        
        valorQuartos = this.quartos * 1250;
        
        valorWcMoradias = this.wc * 1003; 
        
        
        valorMoradia = valorTipoMoradias + valorAreaImpla + valorAreaTotalCoberta + valorAreaTerrenoEnvolvente + valorQuartos + valorWcMoradias; 
        
        if (this.getCidade()==true) {
        valorMoradia += valorMoradia * 0.5;  
        }
        
        return valorMoradia;
        
        
    
    }
    

    @Override
    public Moradias clone() {
        return new Moradias (this);
    }
}
