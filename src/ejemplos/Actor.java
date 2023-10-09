package ejemplos;

import ejemplos.Dwarf;
import ejemplos.Elf;
import java.util.ArrayList;
public class Actor {
    String name;
    String raza;
    public Actor(String _name) {
        name = _name;
    }
    public void talk() {
        System.out.println("Hola, soy " + name + " yo soy un " + raza);
    }
}
