
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Cliente;

public class Aplicacion {
      public static void main(String[] args){
          Cliente c = new Cliente ();
          Persona p1 = new Persona ();
          
          c.setTelefono("0988201850");
          p1.setNombre("Jhardel");
          p1.setEdad(23);
           
          System.out.println(p1.toString());
          System.out.println(c.toString());
      }
    }
    

