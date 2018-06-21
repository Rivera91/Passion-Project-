package nyc.c4q.recipe.models;

public class WinePairing {

    private String pairedWines;
    private String pairingText;
    private String productMatches;
    private int id;
    private String title;
    private String description;
    private String price;
    private String imageUrl;
    private String link;

    public WinePairing(String pairedWines, String pairingText, String productMatches, int id, String title, String description, String price, String imageUrl, String link) {
        this.pairedWines = pairedWines;
        this.pairingText = pairingText;
        this.productMatches = productMatches;
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.link = link;
    }

    public String getPairedWines() {
        return pairedWines;
    }

    public void setPairedWines(String pairedWines) {
        this.pairedWines = pairedWines;
    }

    public String getPairingText() {
        return pairingText;
    }

    public void setPairingText(String pairingText) {
        this.pairingText = pairingText;
    }

    public String getProductMatches() {
        return productMatches;
    }

    public void setProductMatches(String productMatches) {
        this.productMatches = productMatches;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
