public class Ejercicio {

    public static int factorial (int n){
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;
        }else{
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }


    /*
    Maximo comun divisor (mcd), algoritmo de euclides
    a = 412 y b = 184
    * */

    public static int mcd(int a, int b){
        int mcd;

        if (a == b){
            //caso base
            mcd = b;
        }else{
            if (a > b){
                a = a - b;
            }else{
                b = b - a;
            }

            mcd = mcd(a, b);
        }

        return mcd;
    }



    public static int sumaVector(int[] vector, int indice){
        int suma;

        if(indice == vector.length - 1){
            suma = vector[indice];
        }else {
            suma = vector[indice] + sumaVector(vector, indice +1);
        }
        return suma;
    }


    /*
     * Metodo recursivo para calcular el maximo valor de un vector
     *
     * vector = {2, 9, 6, 7, 6, 3, 4, 3}*/


    public static int maximoVector(int[] vector, int indice,int maximo){

        if (indice == vector.length - 1){//caso base
            if (vector[indice] > maximo){
                maximo = vector[indice];
            }
        }else {//llamada a la recursividad

            if (vector[indice] > maximo){
                maximo = vector[indice];
            }


            maximo = maximoVector(vector,indice + 1, maximo);

        }




        return maximo;
    }




    public static int maximoVector(int[] vector){
        return maximoVector(vector,0,0);
    }
}
