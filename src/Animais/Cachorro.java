package Animais;

public class Cachorro {
   public String nome;
   public String cor;
   public int altura;
   public double peso;
   public int tamanhoDoRabo;
   public String estadoDeEspirito;

   public void comer(){}

   public void latir(){
      System.out.println("AUAUAUA");
   }

   public String pegar(){
      return "bolinha";
   }

   public String interagir(String acao){
      switch (acao){
         case "carinho": this.estadoDeEspirito = "feliz";
         case "vai dormir": this.estadoDeEspirito = "fica bravo";
         case "pisar na batinha ": this.estadoDeEspirito = "triste";
         default: this.estadoDeEspirito = "neutro";
      }


      //      if (acao.equals("carinho")){
//         this.estadoDeEspirito = "Feliz";
//      }else{
//         this.estadoDeEspirito = "neutro";
//      }
//      return estadoDeEspirito;
   }
}
