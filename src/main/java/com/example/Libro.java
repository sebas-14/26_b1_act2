package com.example;

public class Libro {
    
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(){
        this.titulo= "desconocido";
        this.autor = "anonimo";
        this.paginas = 0;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }
     public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

     public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void mostrarDetalles(){
        System.out.println("libro" + titulo + "autor" + autor + "paginas" + paginas);
    }

    

    

    

    

   

   
   
    

   

    

   

}
