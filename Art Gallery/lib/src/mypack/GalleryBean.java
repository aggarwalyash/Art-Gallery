package mypack;

public class GalleryBean {
    private int id;
    private String title;
    private String username;
    private String destination;
    private int likes;
    private String categoryId;
    private String description;

    public GalleryBean(){}

    public GalleryBean(int id, String title, String username,String destination,int likes, String categoryId,String description){
        this.id = id;
        this.title = title;
        this.username = username;
        this.destination = destination;
        this.likes = likes;
        this.categoryId = categoryId;
        this.description = description;
    }

    public String toString(){
        return title + " " + id + " " + username + " " + description + " " + destination ;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getDestination(){
        return destination;
    }

    public int getLikes(){
        return likes;
    }

    public String getCategoryId(){
        return categoryId;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

}
