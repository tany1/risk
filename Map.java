import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Country> countries;

    /**
     * Constructor.
     */
    public Map() {
        this.countries = new ArrayList<Country>(20);

        for (int i = 0; i < 20; i++) {
            this.countries.add(i, new Country(i + 1));
        }
    }

    /**
     * Return the countries.
     *
     * @return List<Country>
     */
    public List<Country> getCountries() {
        return this.countries;
    }

    /**
     * To string implementation.
     *
     * @return String
     */
    public String toString() {
        this.countries.forEach(country -> System.out.println(country.toString()));
        return "";
    }
}