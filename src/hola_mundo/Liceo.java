package hola_mundo;
import java.util.ArrayList;


public class Liceo 
{
    private final ArrayList<Persona> personas;
    
    Liceo () {
        this.personas = new ArrayList<> ();
    }
    
    public void addPersona(Persona persona)
    {
        this.personas.add(persona);
    }
}
