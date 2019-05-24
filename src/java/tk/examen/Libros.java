/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.examen;

/**
 *
 * @author cice
 */
public class Libros {
    
      
    private String titulo;
    private String autor;
    private String ISBN;
    private float pvp;

    public Libros(String titulo, String autor, String ISBN, float pvp) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.pvp = pvp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
}
