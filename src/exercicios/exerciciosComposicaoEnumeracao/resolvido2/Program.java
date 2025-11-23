package exercicios.exerciciosComposicaoEnumeracao.resolvido2;

import exercicios.exerciciosComposicaoEnumeracao.resolvido2.entities.Comment;
import exercicios.exerciciosComposicaoEnumeracao.resolvido2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ;

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new Zealend", "I'm coing to visit this wonderful country!", 12);

        post1.addComment(comment1);
        post1.addComment(comment2);



        Post post2 = new Post(sdf.parse("28/07/2018 23:15:19"), "Good night guys", "See you tomorrow", 5);
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println(post2);
    }
}
