package android.itesm.edu.pokemon.model;

import java.io.Serializable;

public class PokeCard implements Serializable {

    private String id, name, imageURL, artist;

    public PokeCard() {
    }

    public PokeCard(String id, String name, String imageUrl, String artist) {
        this.id = id;
        this.name = name;
        this.imageURL = imageUrl;
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageUrl() {
        return imageURL;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
