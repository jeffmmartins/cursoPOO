import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            byte variavelByte = 120;
            // short -32768 a 32767
            // char 0 a 65535
        System.out.println(variavelByte);

        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato("Felix", "marrom",22.0);
        Passaro passaro1 = new Passaro("cleiton", "amarelo", 22.0);

        gato1.soar();
        passaro1.soar();
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Pupy", "marron" , 5, 5.5, 1, "nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

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
