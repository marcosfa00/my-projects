import com.sun.source.tree.SwitchExpressionTree;

import java.util.Scanner;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // JOptionPane.showMessageDialog(null,"BIENVENIDO AL MEJOR PROGRAMA GEOMETRICO DE LA HISTORIA DE LA HUMANIDAD");
        Metodos figuras = new Metodos();
        System.out.println("CREANDO FIGURAS GEOMETRICAS CON JAVA");
        System.out.println("hay 10 figuras geometricas creadas con bulces, cual desea ver?");
        System.out.println("1. TRIANGULO BOCA ABAJO");
        System.out.println("2. TRIANGULO DERECHO");
        System.out.println("3. RECTANGULO");
        System.out.println("4. CUADRADO CONTANDO NUMERO DE FILAS CON MATRICES SIMPLES");
        System.out.println("5. TRIANGULO CON MATRICES 2D");
        System.out.println("6. CUADRADOS EN MISMA FILA");
        System.out.println("7. CONTORNO DE UN CUADRADO");
        System.out.println("8. TRIANGULO CON BORDE A LA DERECHA");
        System.out.println("9. TRIANGULO EQUILATERO");
        System.out.println("10.TRAPECIO");
        System.out.println("11. ESTRELLA SIN TERMINAR");
        System.out.println("12. COPO DE NIEVE VECTORES");
        int ejercicios;

        do {
            ejercicios=sc.nextInt();
            switch(ejercicios){
           case 1:
               System.out.println("TRIANGULO RECTANGULO AL REVES");
               System.out.println();
               System.out.println("INTRODUZCA LA ALTURA DEL TRIANGULO RECTANGULO CON CATETOS IGUALES");
               int altura_triangulo = sc.nextInt();
               figuras.mostrarTrianguloReves(altura_triangulo);

            break;
           case 2:
        System.out.println("TRIANGULO RECTANGULO A DERECHO");
               System.out.println("INTRODUZCA LA ALTURA DEL TRIANGULO RECTANGULO DE 2 CATETOS IGUALES");
               altura_triangulo = sc.nextInt();
               figuras.mostrarTrianguloDerecho(altura_triangulo);


               break;
           case 3:
        System.out.println("RECTANGULO");

        for(int j =0;j<=5;j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

               break;
           case 4:
               System.out.println("CUADRADO CONTANDO NUMERO DE FILAS CON MATRICES SIMPLES");


        int [] base = new int[12];
        int [] altura= new int[5];
               System.out.println("AÑADO VALORES DE '1' A EL ARRAY BASE QUE ES DE TAMAÑO 12 Y VALORES DEL 0 AL .LENGTH DEL ARRAY ALTURA");
        for(int j =0;j< base.length;j++){
            base[j] += 1;
        }
        for(int j =0;j< altura.length;j++){
            altura[j] += j;
        }

        for(int i = 0;i< altura.length;i++){

            for(int j =0;j< base.length;j++){
                System.out.print(base[j]);
            }
            System.out.println(altura[i]);

        }
            break;
           case 5:
        System.out.println("CREO DOS TRIANGULOS EMPLEANDO MATRICES 2D Y ADEMAS AÑADO OTRO BUCLE QUE AÑADE EL NUMERO DE DIMENSIONES (COMO UNA MATRIZ 3D)");


        int [][] matriz2d = new int[5][12];

        for (int z = 0;z<2;z++){
            for(int j = 0;j<=7;j++){
                for (int i = 0;i<j;i++){
                    System.out.print("R");
                }
                System.out.println();

            }
            System.out.println();

        }
            break;
           case 6:


        System.out.println("CREO VARIOS CUADRADOS EN LA MISMA FILA");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("3");
            }
            System.out.print("  ");
            for (int x = 0; x < 9; x++) {
                System.out.print("9");
            }
            System.out.print("  ");
            for (int x = 0; x < 9; x++) {
                System.out.print("8");
            }
            System.out.print("  ");
            for (int x = 0; x < 9; x++) {
                System.out.print("6");
            }
            System.out.println();
        }
                break;

           case 7:
        System.out.println("CREO SOLO EL CONTORNO DE UN CUADRADO");

        //TAPA
        for (int i = 0; i < 9; i++) {
            System.out.print("*");
        }
        System.out.println();
        //MEDIO
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < 6; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");

        }

        //FINAL
        for (int i = 0; i < 9; i++) {
            System.out.print("*");
        }




            break;
           case 8:

               System.out.println("CREO UN TRIANGULO CON UN BORDE A LA DERECHA");

        //TRIANGULO
        for (int i = 0; i < 9; i++) {
            System.out.print("  +");
            for (int j = 0; j <i ; j++) {
                System.out.print("+");
            }
            System.out.println("  *");
        }

        break;

           case 9:
               System.out.println(" CREO UN TRIANGULO EQUILATERO");
        System.out.println();

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20 -i ; j++) {  //se calculan los espacios que hay q poner por columna empezando en 20 porque i vale 0 la primera vez
                System.out.print(" ");
            }

            for (int j = 0; j <2*i -1; j++) { //se calcula el numero de asterscos que se tiene que poner por fila en este caso el doble pero se pone -1 para que empiece en 1 solo punto
                System.out.print("*");
            }


            System.out.println();
        }

            case 10:
                System.out.println("TRAPECIO");
                for (int i = 10; i < 16; i++) {
                    for (int j = 0; j < 20 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int z = 0; z <2 * i - 1 ; z++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


                break;

                case 11:
                    System.out.println("ESTRELLA");
                    //PRIMERO UN TRIANGULO, DESPUES UN TRAPECIO AL REVÉS, Y DESPUÉS DOS TRIANGULOS AL REVES EN LA MISMA LINEA
                    //TRIANGULO
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 20 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z <2 * i - 1 ; z++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    //TRAPECIO AL REVES
                    for (int i = 16; i > 10; i--) {
                        for (int j = 0; j < 20 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z <2 * i - 1 ; z++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    //DOS TRIANGULOS AL REVES
                    for (int i = 6; i > 0; i--) {
                        for (int j = 2; j > 0 - i; j--) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z <2 * i - 1 ; z++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }



            break;
                case 12:
                    System.out.println("INTRODUCE UN NÚMERO IMPAR");
                    int n = sc.nextInt();
                    String [][] array = new String[n][n];

                    for (int i= 0; i <n ; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == j) {
                                array[i][j] = "*"; //diagonal 1 si es la posicion 00 * si es la posicion 1 1 * etc.
                            } else if (j == n / 2) {
                                array[i][j] = "*"; //vertical si la posicion de J es igual a la mitad del ancho de la figura entonces *

                            } else if (i == n / 2) {
                                array[i][j] = "*"; //orizontal, si la posicion de I es igual a la mitad del alto de la figura entonces *

                            }else if (i +j == n -1){
                                array[i][j] = "*";
                            }else {
                                array[i][j] = ".";
                            }
                        }

                    }

                    if (array[6][3]  == ".") {
                        array[6][3] = "*";
                    }
                    for (int i= 0; i <n ; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                    }



                    break;

                case 13:
                    System.out.println("Tratando de hacer un Circulo");  //Area del circulo es Pi*r^2
                    System.out.println("Introduce en radio");
                    int radio = sc.nextInt();
                    int diametro = radio * 2;
                    for (int j = 0; j <radio ; j++) {
                        for (int i = diametro; i > 0 ; i--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }


                     break;

       }

                }while(ejercicios != 13);








        }







    }


