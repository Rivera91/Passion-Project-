package nyc.c4q.recipe.models;

public class SeafoodRecipe {
    private int id;
    private String title;
    private String image;
    private String imageType;
    private int likes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public SeafoodRecipe(int id, String title, String image, String imageType, int likes) {

        this.id = id;
        this.title = title;
        this.image = image;
        this.imageType = imageType;
        this.likes = likes;
    }
}
