package com.mycompany.projetotestegithub;
import com.mycompany.usuarios.Aluno;

public class ProjetoTesteGithub {
    public static void main(String[] args) {
        Aluno Ludson = new Aluno("Ludson Moreira", 25);
        System.out.printf("%s", Ludson.apresentar());
    }
}
