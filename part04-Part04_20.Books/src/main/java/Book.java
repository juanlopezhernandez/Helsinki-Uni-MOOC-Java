/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book (String titulo, int paginas, int anio){
        this.title = titulo;
        this.pages = paginas;
        this.year = anio;
    }
    @Override
    public String toString(){
        return this.title +", "+ this.pages  +" pages, "+ this.year;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
}
