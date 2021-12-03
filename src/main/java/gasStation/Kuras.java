package gasStation;

public class Kuras {

    private String benzinas;
    private String dyzelis;
    private String dujos;
    private float benzinoKaina;
    private float dyzelioKaina;
    private float dujuKaina;

    public Kuras(String benzinas, String dyzelis, String dujos, float benzinoKaina, float dyzelioKaina, float dujuKaina) {
        this.benzinas = benzinas;
        this.dyzelis = dyzelis;
        this.dujos = dujos;
        this.benzinoKaina = benzinoKaina;
        this.dyzelioKaina = dyzelioKaina;
        this.dujuKaina = dujuKaina;


    }

    public Kuras() {
    }

    public String getBenzinas() {
        return benzinas;
    }

    public void setBenzinas(String benzinas) {
        this.benzinas = benzinas;
    }

    public String getDyzelis() {
        return dyzelis;
    }

    public void setDyzelis(String dyzelis) {
        this.dyzelis = dyzelis;
    }

    public String getDujos() {
        return dujos;
    }

    public void setDujos(String dujos) {
        this.dujos = dujos;
    }

    public float getBenzinoKaina() {
        return benzinoKaina;
    }

    public void setBenzinoKaina(float benzinoKaina) {
        this.benzinoKaina = benzinoKaina;
    }

    public float getDyzelioKaina() {
        return dyzelioKaina;
    }

    public void setDyzelioKaina(float dyzelioKaina) {
        this.dyzelioKaina = dyzelioKaina;
    }

    public float getDujuKaina() {
        return dujuKaina;
    }

    public void setDujuKaina(float dujuKaina) {
        this.dujuKaina = dujuKaina;
    }
}


