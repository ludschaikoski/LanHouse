/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author felipe
 */
public class VerificaDados {
    /*
    Classe para fazer as verificações dos dados    
    */
    
    /*
    método que verifica se ficou algum campo sem preenchimento - campo em branco
    */
    public void verificaCampoVazio(JTextField j){
        JTextField TxtField;
        TxtField = j;
            if (TxtField.getText().equals("")) {         
            JOptionPane.showMessageDialog(null, "Campo vazio!!!!!");
            return;  //dou return para nao salvar no banco de dados
        }
        return;
    }
    
    /*
    método que verifica se existe número em campos onde não é permitido
    */
    public void verificaCampoComNumero(JTextField j){
        String nomeT = j.getText();
            for (char ch : nomeT.toCharArray()) {
                if (!Character.isLetter(ch)) {
                    JOptionPane.showMessageDialog(null, "O campo deve conter somente letras!");
                    return; //dou return para nao salvar no banco de dados
                }
            }
    }
    
     public void verificaCampoComLetra(JTextField j){
        String nomeT = j.getText();
            for (char ch : nomeT.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    JOptionPane.showMessageDialog(null, "O campo deve conter somente numeros!");
                    return; //dou return para nao salvar no banco de dados
                }
            }
    }
}

