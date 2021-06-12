
package imoveis;


public abstract class ImoveisTeste {
    
    
    private String endereco;
    private boolean cidade;
    private double precoMin;
    
    
    
    public ImoveisTeste(String endereco, boolean cidade, double precoMin) {
    
    this.endereco = endereco;
    this.cidade = cidade;
    this.precoMin = precoMin;
    
    } 
    
    public ImoveisTeste(){
    
    this.endereco = "";
    this.cidade = false;
    this.precoMin = 0.0;
    
    
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean getCidade() {
        return cidade;
    }

    public void setCidade(boolean cidade) {
        this.cidade = cidade;
    }

    public double getPrecoMin() {
        return precoMin;
    }

    public void setPrecoMin(double precoMin) {
        this.precoMin = precoMin;
    }

   
    
    
        public abstract ImoveisTeste clone();
}
