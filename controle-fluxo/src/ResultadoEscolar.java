public class ResultadoEscolar {
    public static void main(String[] args) {
        

        double nota = 7;

        /*if (nota >= 7) 
            System.out.println("Aprovado");
        else if (nota >=5 && nota < 7)
            System.out.println("Prova de recuperação");
        else
            System.out.println("Reprovado");
        */

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }   
}
