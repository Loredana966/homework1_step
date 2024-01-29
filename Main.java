public class Main {
    public static void main(String[] args) {
 
        //Declarați o variabilă de tip int și atribuiți-i o valoare.
        System.out.println("1. Declarați o variabilă de tip int și atribuiți-i o valoare.");
        int numarIntreg = 10;  
        System.out.println("Variabila int: "+numarIntreg);
        System.out.println();

        //Declarați o variabilă de tip double și atribuiți-i o valoare.  
        System.out.println("2. Declarați o variabilă de tip double și atribuiți-i o valoare. ");        
        double numarZecimal = 3.14;
        System.out.println("Variabila double: "+numarZecimal);
        System.out.println();

        //Declarați o variabilă de tip boolean și atribuiți-i o valoare.  
        System.out.println("3. Declarați o variabilă de tip boolean și atribuiți-i o valoare. ");               
        boolean isTrue = true;
        System.out.println("Variabila boolean: "+isTrue); 
        System.out.println();

        //Declarați o variabilă de tip String și atribuiți-i o valoare.
        System.out.println("4. Declarați o variabilă de tip String și atribuiți-i o valoare.");
        String text = "Hello world";
        System.out.println("Variabila string: "+text);
        System.out.println();


        //Declarați două variabile int și efectuați adunarea, scaderea, inmultirea, impartirea între ele.
        System.out.println("5. Declarați două variabile int și efectuați adunarea, scaderea, inmultirea, impartirea între ele.");
        int nr1 = 8;
        int nr2 = 4;

        //Adunarea
        int suma = nr1+nr2;
        System.out.println("Suma int: "+suma);
        //Scaderea
        int diferenta = nr1-nr2;
        System.out.println("Diferenta int: "+diferenta);
        //Inmultirea
        int produs = nr1*nr2;
        System.out.println("Produs int: "+produs);
        //Impartirea
        int cat = nr1/nr2;
        System.out.println("Impartire int: "+cat);
        System.out.println();


        //Declarați o variabilă int și o variabilă double și efectuați o conversie de la int la double.
        System.out.println("6. Declarați o variabilă int și o variabilă double și efectuați o conversie de la int la double.");
        int nrInt1 = 9;
        double nrDouble1;

        nrDouble1=(double)nrInt1;
        System.out.println("Variabila int: "+nrInt1);
        System.out.println("Variabila double: "+nrDouble1);
        System.out.println();


        //Declarați o variabilă double și efectuați o conversie de la double la int.
        System.out.println("7. Declarați o variabilă double și efectuați o conversie de la double la int.");
        double nrDouble2=9.45;

        int nrInt2=(int)nrDouble2;
        System.out.println("Variabila double: "+nrDouble2);
        System.out.println("Variabila int: "+nrInt2);
        System.out.println();


        //Declarați o variabilă de tip int și efectuați incrementarea cu 1.
        System.out.println("8. Declarați o variabilă de tip int și efectuați incrementarea cu 1.");
        int nrInt3 = 6;
        System.out.println("Variabila int inainte de incrementarea cu 1: "+nrInt3);
        nrInt3++;
        System.out.println("Variabila int dupa inrementarea cu 1: "+nrInt3);
        System.out.println();


        //Declarați o variabilă de tip int și efectuați decrementarea cu 1.
        System.out.println("9. Declarați o variabilă de tip int și efectuați decrementarea cu 1.");
        int nrInt4 = 8;
        System.out.println("Variabila int inainte de decrementarea cu 1: "+nrInt4);
        nrInt4--;
        System.out.println("Variabila int dupa decrementarea cu 1: "+nrInt4);
        System.out.println();


        //Declarați o variabilă de tip double și efectuați rotunjirea la întreg.
        System.out.println("10. Declarați o variabilă de tip double și efectuați rotunjirea la întreg.");
        double nrDouble3=9.75;
        long nrRotunjit=Math.round(nrDouble3);
        System.out.println("Variabila double: "+nrDouble3);
        System.out.println("Variabila double dupa rotunjire: "+nrRotunjit);
        System.out.println();


        //Declarați o variabilă de tip double și efectuați extragerea părții întregi in alta variabila.
        System.out.println("11. Declarați o variabilă de tip double și efectuați extragerea părții întregi in alta variabila.");
        double nrDouble4=10.75;
        long parteaIntraga=(long)nrDouble4;
        System.out.println("Variabila double: "+nrDouble4);
        System.out.println("Partea intraga a variabilei double: "+parteaIntraga);
        System.out.println();


        //Declarați o variabilă de tip int și verificați dacă este pară sau impară.
        System.out.println("12. Declarați o variabilă de tip int și verificați dacă este pară sau impară.");
        int nrInt5=15;

        if(nrInt5 %2 == 0){
            System.out.println("Numarul "+nrInt5+" este par");
        }else{
            System.out.println("Numarul "+nrInt5+" este impar");
        }











             
            
    }
}

