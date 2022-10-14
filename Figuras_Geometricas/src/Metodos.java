public class Metodos {
    private int base = 0;
    private int altura =0;

    //constructores
    public Metodos (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public Metodos (int base_o_altura){
        base = base_o_altura;
        altura = base_o_altura;
    }
    public Metodos(){

    }



    //Methods
    public void cuadrado(){
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <base ; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

    public void mostrarTrianguloReves(int base){
        this.altura = base;
        base = this.altura;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base -i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
