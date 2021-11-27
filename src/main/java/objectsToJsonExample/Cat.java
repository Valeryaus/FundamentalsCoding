package objectsToJsonExample;

public class Cat {
    private String catName;
    private String catBreed;

    public Cat(String catName, String catBreed) {
        this.catName = catName;
        this.catBreed = catBreed;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }
}
