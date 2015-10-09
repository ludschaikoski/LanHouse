/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Welington
 */
public class Usuario {

    private String nome;
    private Integer id;//Gerada automaticamente pelo banco
    private String apelido;
    private char cpf;
    private int telefone;
    private Endereco endereco = new Endereco();
    private String senha;

    public Usuario(String nome, String apelido, String cpf, String telefone, Endereco endereco, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public String getApelido() {
        return apelido;
    }

    public char getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }

    public int getTelefone() {
        return telefone;
    }
    // para consultar e alterar o endereco
        public String getRua() {
        return endereco.getRua();
    }

    public void setRua(String rua) {
        endereco.setRua(rua);
    }

    public int getNumero() {
        return endereco.getNumero();
    }

    public void setNumero(int numero) {
        endereco.setNumero(numero);
    }

    public String getComplemento() {
        return endereco.getComplemento();
    }

    public void setComplemento(String complemento) {
        endereco.setComplemento(complemento);
    }

    public String getBairro() {
        return endereco.getBairro();
    }

    public void setBairro(String bairro) {
        endereco.setBairro(bairro);
    }

    public String getCidade() {
        return endereco.getCidade();
    }

    public void setCidade(String cidade) {
        endereco.setCidade(cidade);
    }

    public int getCep() {
        return endereco.getCep();
    }

    public void setCep(int cep) {
        endereco.setCep(cep);
    }
    
} //fim da classe usuario sem endereco aninhada

class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private int cep;
    
    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }
    public Endereco() {
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
}//fim da classe Endereco
