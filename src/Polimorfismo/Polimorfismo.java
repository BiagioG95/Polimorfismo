package Polimorfismo;
/*
Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */
public class Polimorfismo {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5,10);

        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo(6,8);

        triangolo.calcolaArea();

    }





}
