/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD:src/DAO/ConectaBanco.java
package DAO;
=======
package UsuarioDAO;
>>>>>>> f362c034151461637a42e39bf244419452e194e1:src/UsuarioDAO/ConectaBanco.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Welington
 */
public class ConectaBanco {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    public Connection getConnection(String user, String password) {
        try {
            Class.forName("org.postgresql.Driver");
<<<<<<< HEAD:src/DAO/ConectaBanco.java
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/lanhouse", user, password);
=======
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Endo", user, password);
>>>>>>> f362c034151461637a42e39bf244419452e194e1:src/UsuarioDAO/ConectaBanco.java
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
