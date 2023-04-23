public class Operadores {

    public static void main(String[] args) {
       double nota1 = 9.8;
       double nota2 = 10;
       double nota3 = 10;
       double media = nota1 + nota2 + nota3 / 3;
       System.out.println(media);

       if (media == 15) {
            System.out.println("Passou, porém ESTUDE UM POPUCO MAIS!");
       }
       else if (media > 15 && media <= 21) {
            System.out.println("PARABÉNS!");
       }
       else if (media > 21) {
            System.out.println("ARRASOU NOS ESTUDOS! PARABÉNS!");
       }
       else if (media < 15) {
            System.out.println("REPROVADO! VAMOS ESTUDAR ?!");
       }
    }

}
    

