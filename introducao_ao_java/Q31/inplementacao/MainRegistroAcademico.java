package Q31.inplementacao;

import Q31.modelo.RegistroAcademico;

public class MainRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico registroAcademico = new RegistroAcademico("Lucas", 2, 2.2);
        RegistroAcademico registroAcademico2 = new RegistroAcademico("Ana", 2, 2.2);
        RegistroAcademico registroAcademico3 = new RegistroAcademico("Diane", 2, 2.2);
        
        System.out.println("Total de Registros: " + RegistroAcademico.numeroDeMatriculas);
        System.out.println();
        System.out.println(registroAcademico);
        System.out.println();
        System.out.println(registroAcademico2);
        System.out.println();
        System.out.println(registroAcademico3);
    }
}