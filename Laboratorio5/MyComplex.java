/*
    L'insieme C dei numeri complessi e' l'insieme delle coppie ordinate (x,y) 
    con x e y appartenenti a R (insieme dei numeri reali).
    Dato il numero complesso z = x + i *y,  i numeri reali x e y sono detti
    parte reale e parte immaginaria di z.
    Nei commenti che seguono, facciamo riferimento ai numeri complessi
        z = x + i*y, z1 = x1 + i*y1, z2 = x2 + i*y2
*/

public class MyComplex
{
	private double realPart;
	private double imagPart;
	
    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplex() {
    	realPart = 0;
    	imagPart = 0;
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplex(double realPart, double imagPart) {
    	this.realPart = realPart;
    	this.imagPart = imagPart;
    }

    //Somma a questo numero complesso il numero complesso z
    //somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplex add(MyComplex z) {
    	return new MyComplex(z.realPart+realPart, z.imagPart+imagPart);
    }

    //Sottrae a questo numero complesso il numero complesso z
    //sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplex sub(MyComplex z) {
    	return new MyComplex(z.realPart-realPart, z.imagPart-imagPart);
    }

    //Moltiplica questo numero complesso per il numero complesso z
    //prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplex mult(MyComplex z){
    	return new MyComplex(z.realPart*realPart - z.imagPart*imagPart, z.realPart*imagPart + z.realPart*imagPart);
    }

    //Divide questo numero complesso per il numero complesso z
    //divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplex div(MyComplex z) {
    	return inv().mult(z);
    }
          
    //Calcola il coniugato di questo numero complesso
    //coniugato del complesso z:  z^= x - i*y
    public MyComplex conj() {
    	return new MyComplex(realPart, -imagPart);
    }
          
    //Calcola l'inverso rispetto al prodotto di un numero complesso
    //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplex inv() {
    	if (realPart == 0 && imagPart == 0) throw new IllegalArgumentException();
    	return new MyComplex(realPart / (mod() * mod()), imagPart/(mod()*mod()));
    }

    //Calcola il modulo di questo numero complesso
    //modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod() {
    	return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imagPart, 2));
    }
           
    //Confronta con tolleranza due numeri complessi.
    public boolean approxEquals(MyComplex z) {
    	return approxEquals(realPart, z.realPart) && approxEquals(imagPart, z.imagPart);  //completare
    }
    
    private boolean approxEquals(double x1, double x2) {
    	return Math.abs(x1 - x2) < 1E-14 * Math.max(x1, x2);
    }

    //Crea una stringa che rappresenta questo numero complesso
    //Formato stringa: parte reale + i*parte immaginaria
    public String toString() {
    	return realPart + " +i "+imagPart;
    }


    //-------- metodi di accesso ----------
          
    //Restituisce la parte complessa di un numero complesso
    public double getIm() {
    	return imagPart;
    }
    //Restituisce la parte reale di un numero complesso
    public double getRe() {
    	return realPart;
    }
}

