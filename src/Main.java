import Animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            byte variavelByte = 120;
            // short -32768 a 32767
            // char 0 a 65535
        System.out.println(variavelByte);

        Cachorro cachorro1 = new Cachorro();
        System.out.println(cachorro1.get);
        Cachorro cachorro2 = new Cachorro("Pupy", "marron" , 5, 5.5, 1, "nada");


        cachorro1.setAltura(2);
        cachorro1.setCor("Marrom");
        cachorro1.setNome("jack");
        cachorro1.setPeso(2.52);
        cachorro1.setTamanhoDoRabo(5);

        System.out.println(cachorro1);



        cachorro1.latir();
        cachorro1.comer();
        System.out.println(cachorro1.pegar());
        System.out.println(cachorro1.interagir("pisar na batinha"));
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        }
    }
