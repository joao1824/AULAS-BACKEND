package com.lista.Fatura;

public class Fatura {
    
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double preco;

    Fatura(String numero, String descricao, Integer quantidade, Double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setQuantidade(Integer quantidade){
        this.setQuantidade(quantidade);
    }
    public void setPreco(Double preco){
        this.setPreco(preco);
    }
    
    public String getNumero() {
        return numero;
    }
    public String getDescricao() { 
        return descricao;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public Double getPreco(){
        return preco;
    }
    
    public Double getTotalFatura(){
        if (this.preco * this.quantidade < 0){
            return 0.0;
        }
        return this.preco * this.quantidade;
    }
}
