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
      if (acao.equals("carinho")){
         this.estadoDeEspirito = "Feliz";
      }else{
         this.estadoDeEspirito = "neutro";
      }
      return estadoDeEspirito;
   }
}
