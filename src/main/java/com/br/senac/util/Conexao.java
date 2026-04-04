package com.br.senac.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tecnica",
                "root",
                "abcd1234"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}