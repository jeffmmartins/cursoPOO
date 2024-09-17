package Animais;

public class Cachorro {
   private String nome;
   private String cor;
   private int altura;
   private double peso;
   private int tamanhoDoRabo;
   private String estadoDeEspirito;

   public String getNome(){
      return this.nome;
   }

   public void comer(){}

   public void latir(){
      System.out.println("AUAUAUA");
   }

   public String pegar(){
      return "bolinha";
   }

   public String interagir(String acao){
      switch (acao){
         case "carinho": this.estadoDeEspirito = "feliz"; break;
         case "vai dormir": this.estadoDeEspirito = "fica bravo"; break;
         case "pisar na batinha": this.estadoDeEspirito = "triste";break;
         default: this.estadoDeEspirito = "neutro";
      }


      //      if (acao.equals("carinho")){
//         this.estadoDeEspirito = "Feliz";
//      }else{
//         this.estadoDeEspirito = "neutro";
//      }
//      return estadoDeEspirito;
      return estadoDeEspirito;
   }
}
