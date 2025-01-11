import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        // instanciando a data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // instanciando o objeto comment
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

        //instanciando o objeto post
        Post p1 = new Post(
                sdf.parse("11/01/2025 09:23:01"),"Travelling to New Zealand",
                "I going to visit this wonderful country",12);
        Post p2 = new Post();

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}