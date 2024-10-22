package Polimorfismo;

public class Rettangolo extends Forma{

    //richiamo del costruttore e ultilizzo del super con parentesi
    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    //richiamo del metodo calcolaArea(sovrascrive) tramite Ovveride, qui il super si utilizza con il punto
    @Override
    public void calcolaArea(){
        super.calcolaArea();
        int area = getBase() * getAltezza();


        System.out.println(" rettangolo è: " + area);
    }

}
