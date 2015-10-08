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
    private Integer id;
    private String apelido;
    private char cpf;
    private char endereco;
    private String senha;

    public Usuario(String nome, String apelido, String cpf, String telefone, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void setEndereco(char endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(double telefone) {
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

    public char getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }

    public double getTelefone() {
        return telefone;
    }
    private double telefone;

    public Usuario() {

    }
}
