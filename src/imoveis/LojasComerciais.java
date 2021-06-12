
package imoveis;


public class LojasComerciais extends ImoveisTeste {
    
    private double area;
    private boolean wcLojas; 
    private int numeroporta; 
    
    
    public LojasComerciais () {
    
    super();
    this.area =0.00; 
    this.numeroporta = 0;
    this.wcLojas = false; 
    
    }

    public LojasComerciais(String endereco, boolean cidade, double precoMin,  double area, boolean wcLojas, int numeroporta) {
        super(endereco , cidade , precoMin);
        this.area = area;
        this.wcLojas = wcLojas;
        this.numeroporta = numeroporta;
        
    }

    public LojasComerciais(LojasComerciais lc) {
        super(lc.getEndereco(), lc.getCidade(), lc.getPrecoMin());
        this.area =0.00; 
        this.numeroporta = 0;
        this.wcLojas = false;
    }

    public double getArea() {
        return area;
    }

    public boolean isWcLojas() {
        return wcLojas;
    }

    public int getNumeroporta() {
        return numeroporta;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setWc(boolean wcLojas) {
        this.wcLojas = wcLojas;
    }

    public void setNumeroporta(int numeroporta) {
        this.numeroporta = numeroporta;
    }

    
    
    
    public double valorLojasComerciais () {
        
        double valorArea = 0;
        double valorWcLojas = 0;
        double valorCidade = 0;
        double valorLojasComerciais = 0; 
        
        
        valorArea = this.area * 826;
        
        if (this.wcLojas==true) {
         valorWcLojas = 5000;  
        }
        
        valorLojasComerciais = valorArea + valorWcLojas;
        
    if (this.getCidade()==true) {
        valorLojasComerciais += valorLojasComerciais * 0.5;  
        }
    
    
        return valorLojasComerciais;
    
    }
    
    
    @Override
    public LojasComerciais clone() {
        return new LojasComerciais(this);
    }
}
