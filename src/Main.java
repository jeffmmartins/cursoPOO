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
        cachorro1.altura = 2;
        cachorro1.cor = "Marrom";
        cachorro1.nome = "jack";
        cachorro1.peso = 2.52;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);
        }
    }
