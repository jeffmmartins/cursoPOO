package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    // constante
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer like;

    // contructor padrão
    public Post(){}

    private List<Comment> comments = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer like) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.like = like;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // metodo para adicionar um comentário
    public void addComment(Comment coment){
        comments.add(coment);
    }

    //  metodo para remover um comentário
    public void removeComment (Comment coment){
        comments.remove(coment);
    }

    // utilizando a class stringbuilder;
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // append - acresscentar no final;
        sb.append(title + "\n");
        sb.append(like + "likes " +sdf.format(moment) +" \n");
        sb.append(content + "\n");
        sb.append("Comments: ");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
