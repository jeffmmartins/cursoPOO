package Loja;

import Animais.Cachorro;
import Animais.animal;

public class PetShop {
    public void darBanho(animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosar");
    }

    public void deixarNoHotel(animal animal){
        animal.setEstadoDeEspirito("Estou com saudades");
    }
}
