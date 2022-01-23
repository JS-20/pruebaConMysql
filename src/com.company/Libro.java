package com.company;

public class Libro {
    private int IDlibro;
    private String titulo;
    private String autor;

    public Libro(int IDlibro, String titulo, String autor) {
        this.IDlibro = IDlibro;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIDlibro() {
        return IDlibro;
    }

    public void setIDlibro(int IDlibro) {
        this.IDlibro = IDlibro;
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

    @Override
    public String toString() {
        return "Libro{" +
                "IDlibro=" + IDlibro +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
