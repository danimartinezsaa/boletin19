/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin19{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Libreria l=new Libreria();
        boolean encendido=true;
        
        while(encendido==true){
            int opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n"+
                    "1 - Añadir libro\n"+
                    "2 - Vender libro\n"+
                    "3 - Mostrar libros\n"+
                    "4 - Eliminar libros sin unidades\n"+
                    "5 - Consultar un libro\n"+
                    "6 - Salir"));
            
            switch (opcion){
                case 1:
                    l.añadirLibro();
                    break;
                case 2:
                    l.venderLibro();
                    break;
                case 3:
                    l.mostrarLibros();
                    break;
                case 4:
                    l.eliminarLibrosSinUnidades();
                    break;
                case 5:
                    l.mostrarLibro();
                    break;
                case 6:
                    encendido=false;
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Valor no válido, vuelva a introducir:");
            }
        }
    }
    
}
