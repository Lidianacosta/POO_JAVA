package aula.implementacao;

import aula.modelo.RegistroAcademico;

public class MainRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico("michael", "12345", 3, 0.75);

        System.out.println(michael);
        System.out.println(michael.calculaMensalidade());

        RegistroAcademico roberto = new RegistroAcademico("Roberto", "122345", 1, 5);
        System.out.println(roberto);
        System.out.println(roberto.calculaMensalidade());
        
    }
}
