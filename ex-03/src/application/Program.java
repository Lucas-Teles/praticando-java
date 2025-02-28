package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
                sdf.parse("21/03/2024 14:07:41"),
                "Traveling to new Zealand",
                "I'm going to visist this wonderful country !",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
