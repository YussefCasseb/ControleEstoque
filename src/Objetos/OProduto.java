package Objetos;

public class OProduto {
    
    private String nome, fornecedor, data, nimg;
    private int cod_prod, qtde;
    private double valor;
    private byte[] img;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    public String getNimg() {
        return nimg;
    }

    /**
     * @param nimg the nimg to set
     */
    public void setNimg(String nimg) {
        this.nimg = nimg;
    }

    /**
     * @return the cod_prod
     */
    public int getCod_prod() {
        return cod_prod;
    }

    /**
     * @param cod_prod the cod_prod to set
     */
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    /**
     * @return the qtde
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the img
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

}
