import com.google.gson.annotations.SerializedName;
import java.util.List;

public class RickAndMortyCharacter {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private Location location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;

    @Override
    public String toString() {
        return "RickAndMortyCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public RickAndMortyCharacter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public Location getLocation() {
        return location;
    }

    public String getImage() {
        return image;
    }

    public List<String> getEpisode() {
        return episode;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated() {
        return created;
    }

    public static class Origin {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class Location {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }
}
