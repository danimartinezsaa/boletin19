/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author dani
 */
public class Libro implements Comparable{
    private String titulo,autor,isbn;
    private float precio,unidades;

    public Libro(){
    }

    public Libro(String titulo, String autor, String isbn, float precio, float unidades){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.precio=precio;
        this.unidades=unidades;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }

    public float getUnidades(){
        return unidades;
    }

    public void setUnidades(float unidades){
        this.unidades=unidades;
    }

    @Override
    public String toString(){
        return "titulo: "+titulo+", autor: "+autor+", isbn: "+isbn+", precio: "+precio+", unidades: "+unidades;
    }
    
    @Override
    public int compareTo(Object t) {
        Libro l=(Libro) t;
        if(titulo.compareToIgnoreCase(l.getTitulo())>0)
            return 1;
        else if(titulo.compareToIgnoreCase(l.getTitulo())==0)
            return 0;
        else
            return -1;
    }
    
}
