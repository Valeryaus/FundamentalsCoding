package objectsToJsonExample;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ObjectToJsonMain {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("firstName", "Dainius");
        jsonObject.put("lastName", "Pilypas");
        System.out.println(jsonObject.toJSONString());

        JSONObject dogJson = new JSONObject();
        Dog dog = new Dog("Rexas", "Vokieciu aviganis");
        //Json objektas yra kaip mapas, i ji dedam RAKTA ir REIKSME
        dogJson.put("sunsVardas", dog.getName());
        dogJson.put("sunsVeisle", dog.getBreed());

        FileWriter file = new FileWriter("src/main/resources/dog.json");
        file.write(dogJson.toString());
        file.close();

        JSONObject catJson = new JSONObject();
        Cat cat = new Cat("Nigela", "British Short Hear");
        //Json objektas yra kaip mapas, i ji dedam RAKTA ir REIKSME
        catJson.put("katesVardas", cat.getCatName());
        catJson.put("katesVeisle", cat.getCatBreed());

        FileWriter secondFile = new FileWriter("src/main/resources/cat.json");
        secondFile.write(catJson.toString());
        secondFile.close();

    }
}
