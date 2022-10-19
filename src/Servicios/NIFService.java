package Servicios;

import Entidad.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    String letras[]= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    
    public NIF crearNIF(){
        NIF nDNI = new NIF();
        System.out.println("Ingrese el número de 8 dígitos del DNI");
        nDNI.setDNI(leer.nextLong());
        int resto = (int)nDNI.getDNI()%23;
        System.out.println("El resto es "+resto);
        nDNI.setLetra(letras[resto]); 
        return nDNI;
    }
    
    public void mostrar(NIF x){
        System.out.println(x.toString());
    }
}
    

