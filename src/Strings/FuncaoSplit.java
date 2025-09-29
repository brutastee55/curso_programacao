package Strings;

public class FuncaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vector = s.split(" ");
        String sword1 = vector[0];
        String sword2 = vector[1];
        String sword3 = vector[2];

        System.out.printf("%s - %s - %s", sword1, sword2, sword3);
    }
}
