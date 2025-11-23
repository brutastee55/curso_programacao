package boxUnbox;

public class BoxUnbox {
    public static void main(String[] args) {


        // criado na stack variavel x com valor 20
        int x = 20;

        //criando variavel object que recebe valor de x, ou seja, no stack variavel obj aponta pro head que tem o valor 20 (fazendo boxing)
        Object obj = x;

        System.out.println(obj);

        //criando na stack y recebendo o valor de obj, então no stack temos o valor de 20 na vari..y (unboxing)
        int y = (int) obj;

        System.out.println(y);

    }
}
