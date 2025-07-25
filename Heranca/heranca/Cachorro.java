// Classe Derivada
public class Cachorro extends Animal {
    public void abanarRabo() {
        System.out.println("O cachorro esta abanando o rabo.");
    }

    // Sobrescrevendo o metodo emitirSom
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au au!");
    }
}
