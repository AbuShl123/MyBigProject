package MyOwn.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class EarthMap {
    private static EarthMap earthMap; // final means we cannot change the reference to point to another object , but we can still do manipulations with its state (using setters e.g.)

    private final int length;
    private final int width;
    private String country;

    // object initializing
    private EarthMap(int length, int width) {
        this.length = length;
        this.width = width;
        openMap();
    }

    public static EarthMap getInstance(int length, int width) {
        if (earthMap == null)
            earthMap = new EarthMap(length, width);

        return earthMap;
    }

    public void openMap() {
        System.out.println("You opened Earth Map, and its properties: " +
                "\nlength: " + length + ",\twidth: " + width);
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getCountry() {
        if (country == null) {
            throw new RuntimeException("You didn't point any country");
        }
        return country;
    }

    // setters:
    public void setCountry(String country) {
        this.country = country;
    }

    public void unsetCountry() {
        this.country = null;
    }


}


class Store {
    public static void main(String[] args) throws IOException {
        EarthMap map = EarthMap.getInstance(4, 5);

        map.setCountry("USA");

        System.out.println("my pointed country is " + map.getCountry());

        URL url = new URL("https://en.wikipedia.org/wiki/" + map.getCountry());

        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        try {
            String line;

            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
