import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //treemap ele ordena pela chave
        Map<String,String> cokies = new TreeMap<>();
        //armazenando chave e o valor;
        cokies.put("username", "maria");
        cokies.put("email", "maria@gmail.com");
        cokies.put("phone", "997933189");

        //removendo do map cuja a chave é o e-mail
        cokies.remove("email");

        System.out.println("All cokies");
        //keyset retorna um set com as chaves do map.
        for (String key : cokies.keySet()){
            System.out.println(key + " :" + cokies.get(key));
        }
    }
}