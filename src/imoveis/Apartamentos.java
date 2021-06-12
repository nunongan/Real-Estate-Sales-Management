
package imoveis;


public class Apartamentos  extends ImoveisTeste{
    
    private int tipoApart;
    private double areaTotalApart; 
    private int quartos; 
    private int wc;
    private int numeroporta;
    private int andarApart;
    private boolean garagemApart;
    
    
    

//contrutor

    public Apartamentos() {
        super();
        this.tipoApart=0;
        this.areaTotalApart = 0.0; 
        this.quartos = 0; 
        this.wc = 0;
        this.numeroporta = 0;
        this.andarApart = 0;
        this.garagemApart = false;
        
        
    }
    
    public Apartamentos(String endereco, boolean cidade, double precoMin, int tipoApart, double areaTotalApart, int quartos,int wc,int numeroporta,int andarApart, boolean garagemApart ) {
        super(endereco , cidade , precoMin);
        this.tipoApart = tipoApart;     
        this.areaTotalApart = areaTotalApart;
        this.quartos = quartos;
        this.wc = wc;
        this.numeroporta = numeroporta;
        this.andarApart = andarApart ;
        this.garagemApart = garagemApart;
        
        
    }

    
    public Apartamentos(Apartamentos ap) {
        super(ap.getEndereco(), ap.getCidade(), ap.getPrecoMin());
        this.tipoApart= 0;
        this.areaTotalApart = 0.0; 
        this.quartos = 0; 
        this.wc = 0;
        this.numeroporta = 0;
        this.andarApart = 0;
        this.garagemApart = false;
    }
    
    public int getTipoApart() {
        return tipoApart;
    }

    public void setTipoApart(int tipoApart) {
        this.tipoApart = tipoApart;
    }

    public double getAreaTotalApart() {
        return areaTotalApart;
    }

    public void setAreaTotalApart(double areaTotalApart) {
        this.areaTotalApart = areaTotalApart;
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

    public int getNumeroporta() {
        return numeroporta;
    }

    public void setNumeroporta(int numeroporta) {
        this.numeroporta = numeroporta;
    }

    public int getAndarApart() {
        return andarApart;
    }

    public void setAndarApart(int andarApart) {
        this.andarApart = andarApart;
    }


    public boolean isGaragemApart() {
        return garagemApart;
    }

    public void setGaragemApart(boolean garagemApart) {
        this.garagemApart = garagemApart;
    }

    
    
    public double valorApart() {
        double valorTipo = 0;
        double valorArea = 0;
        double valorQuartos = 0;
        double valorWc = 0;
        double valorGaragem = 0;
        double valorApart = 0; 
        
        switch(tipoApart) {
        case 1:     //simples
          valorTipo=1000;
          break;
        case 2:     //duplex
          valorTipo=2500;
          break;
          case 3:   //triplex
          valorTipo=5450;
          break;
        default:
          // code block
      }
        
        
        valorArea = this.areaTotalApart * 584; 
        
        valorQuartos = this.quartos * 1004;
        
        valorWc = this.wc * 835; 
        
        if (this.garagemApart==true) {
        valorGaragem = valorApart +5000;  
        }
        
        
        
        valorApart = valorTipo + valorArea + valorQuartos + valorWc + valorGaragem; 
        
    
        
        if (this.getCidade()==true) {
        valorApart += valorApart * 0.5;  
        }
        
        return valorApart ;
  
    }
    
    /*public String avaliaNegocio(double totalAPagar , double precoMin)
    {
        String classificacaoImovel = "";
        
        if(this.getTotalAPagar >= (this.getPrecoMin * 0.15) + this.getPrecoMin) && (this.getTotalAPagar < (this.getPrecoMin * 0.35) + this.getPrecoMin)) {
            classificacaoImovel = "é um Bom";}
        else if((this.getTotalAPagar >= ((this.precoMinimo * 0.35) + this.precoMinimo)) && (this.getTotalAPagar < (this.precoMinimo * 0.5) + this.precoMinimo)) {
            classificacaoImovel = "é um Ótimo"; }
        else if(this.getTotalAPagar >= ((this.precoMinimo * 0.5) + this.precoMinimo)){
            classificacaoImovel = "é um Excelente";}
                else {
            classificacaoImovel = "Não é um bom";
                }
        return classificacaoImovel;
    }*/
    
    public String avaliaNegocio (){
       String classificaImovel ="";
       
       if(this.valorApart() >= (this.getPrecoMin() * 0.5) + this.getPrecoMin() ) {
       
       classificaImovel = "É um excelente negócio";
       }
       else {
       classificaImovel = "É um mau negocio";
       }
        return classificaImovel;
    
        
    }
    
    @Override
    public Apartamentos clone() {
        return new Apartamentos (this);
    }
}
