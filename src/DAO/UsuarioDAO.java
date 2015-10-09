/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Welington
 */
public class UsuarioDAO {

    //Aqui são os dados para a conexão com o banco de dados
    //alterações de login no banco devem ser feitas APENAS nestas variáveis
    //para facilitar a legibilidade.
//    static final String nomeDoBanco = "Endo";
    //static final String usuarioBanco = "postgres";
    //static final String senhaBanco = "padoka92";
    static final String nomeDoBanco = "lanhouse";
    static final String usuarioBanco = "postgres";
    static final String senhaBanco = "1234";

    Usuario usuario = new Usuario();
    Usuario usuarioNovo = new Usuario();//este usuario é apenas para para atualizar um usuario
    ConectaBanco conexao = new ConectaBanco();
    Connection c = conexao.getConnection(usuarioBanco, senhaBanco);


    //Read
    public boolean consulta() {
        try {
            PreparedStatement p = c.prepareStatement("Select * from" + nomeDoBanco + ".usuario;");
            ResultSet r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public ResultSet consultaNome(String nome) {
        
        try {
            //PreparedStatement p = c.prepareStatement("Select * from " + nomeDoBanco + " where nome=\"{"+nome+"}\"+;");
            PreparedStatement p = c.prepareStatement("Select * from "+nomeDoBanco+".usuario where nome like \'"+nome+"%\';");
            
            //System.out.println(""+);
           ResultSet r = p.executeQuery();
           while (r.next()){
               System.out.println(""+r.getString("nome"));
           }
            /* if (!r.isBeforeFirst() ) {    
                System.out.println("No data"); 
                return r;
            } */
            return r;
        } catch (SQLException ex) {
            System.out.println("Erro UsuarioDAO consultaNome");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
           // return false;
        }
        return null;
    }
    
    //create
    public boolean criarUsuario(Usuario usuario) {
        PreparedStatement p = null;
        try {
            p = c.prepareStatement("Insert into " + nomeDoBanco + " Values (?,?,?,?,?,?,?,?,?,?,?)");
            p.setString(1, usuario.getNome());
            p.setString(2, usuario.getApelido());
            p.setInt(3, usuario.getCpf());
            p.setInt(4, usuario.getTelefone());
            p.setString(5,usuario.getSenha());
            //Endereco
            p.setString(6, usuario.getRua());
            p.setInt(7,usuario.getNumero());
            p.setString(8,usuario.getComplemento());
            p.setString(9,usuario.getBairro());
            p.setString(10,usuario.getCidade());
            p.setInt(11,usuario.getCep());
            p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }
//delete

    public boolean apagarUsuario() {
        PreparedStatement p = null;

        try {
            p = c.prepareStatement("Delete from" + nomeDoBanco + "where usuario = Value(?)");
            p.setString(1, usuario.getNome());
            p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    //update
    public boolean atualizaUsuario() {
        PreparedStatement p = null;
        usuarioNovo = usuario;//tentativa de igualar os atributos do usuario novo com o usuario
        //se não funcionar "copiar" à mão cada atributo...
        try {
            p = c.prepareStatement("UPDATE" + nomeDoBanco + "SET "
                    + "nome=" + usuarioNovo.getNome()
                    + "id=" + usuarioNovo.getId()
                    + "apelido=" + usuarioNovo.getApelido()
                    + "cpf=" + usuarioNovo.getCpf()
                    + "endereco=" + usuarioNovo.getEndereco()
                    + "senha=" + usuarioNovo.getSenha()
                    + "telefone=" + usuarioNovo.getTelefone()
                    + "WHERE id=" + usuarioNovo.getNome()
            );
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }
    //selecionar
}
