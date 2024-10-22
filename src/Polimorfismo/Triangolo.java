package Polimorfismo;

public class Triangolo extends Forma{

    //richiamo del costruttore e ultilizzo del super con parentesi
    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }

    //richiamo del metodo calcolaArea tramite Ovveride, qui il super si utilizza con il punto
    @Override
    public void calcolaArea(){
        super.calcolaArea();
        int area = (getBase() * getAltezza())/2;

        System.out.println(" triangolo è: " + area);
    }

}
