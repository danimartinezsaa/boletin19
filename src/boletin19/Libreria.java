/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Libreria{
    ArrayList<Libro> libros=new ArrayList();
    
    public void añadirLibro(){
        String titulo=JOptionPane.showInputDialog("Inserte el título del libro: ");
        String autor=JOptionPane.showInputDialog("Inserte el autor:");
        String isbn=JOptionPane.showInputDialog("Inserte ISBN:");
        Float precio=Float.parseFloat(JOptionPane.showInputDialog("Inserte precio:"));
        Float unidades=Float.parseFloat(JOptionPane.showInputDialog("Inserte número de unidades: "));
        Libro libro=new Libro(titulo,autor,isbn,precio,unidades);
        libros.add(libro);
    }
    
    public void venderLibro(){
        String vendido=JOptionPane.showInputDialog("Inserte nombre del libro vendido:");
        for(Libro elemento: libros)
            if(elemento.getTitulo().equals(vendido)){
                if(elemento.getUnidades()>=1){
                elemento.setUnidades(elemento.getUnidades()-1);
                JOptionPane.showMessageDialog(null,"Libro vendido.");
                }else
                   JOptionPane.showMessageDialog(null,"No quedan libros con ese título.");
            break;
            }
    }
    
    public void mostrarLibros(){
        for(Libro elemento: libros)
            System.out.println(elemento.toString());
    }
    
    public void eliminarLibrosSinUnidades(){
        for(Libro elemento: libros)
            if(elemento.getUnidades()==0){
                libros.remove(elemento);
                JOptionPane.showMessageDialog(null,"Libros sin unidades eliminados.");
            }
    }
    
    public void mostrarLibro(){
        String titulo=JOptionPane.showInputDialog("Inserte título del libro: ");
        for(Libro elemento: libros)
            if(elemento.getTitulo().equals(titulo))
                JOptionPane.showMessageDialog(null,elemento.toString());
    }
}
