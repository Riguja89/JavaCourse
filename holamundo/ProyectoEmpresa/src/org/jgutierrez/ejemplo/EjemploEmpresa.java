package org.jgutierrez.ejemplo;

import org.jgutierrez.empresa.Empleado;
import org.jgutierrez.empresa.Gerente;

public class EjemploEmpresa {
    public static void main(String[] args) {
        Empleado trabajador = new Empleado("Juanito","Perez", "33fr","Cra 18# 21-57",5439000.0,1 );
        Gerente jefe=new Gerente("Lupita", "Gutierrez", "334rf","Crar no exite 123",3500000.0,45,900456858.3);
        System.out.println("jefe = " + jefe);
    }
}
