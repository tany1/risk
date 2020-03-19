import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
    private Integer id;
    private List<Country> neighbors;

    /**
     * Constructor.
     *
     * @param id
     */
    public Country(Integer id) {
        this.id = id;
        this.neighbors = new ArrayList<Country>();
    }
    
    /**
     * Constructor.
     *
     * @param id
     * @param neighbors
     */
    public Country(Integer id, List<Country> neighbors) {
        this.id = id;
        this.neighbors= neighbors;
    }
    
    /**
     * Return country's id.
     *
     * @return int
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Return neighobors list.
     *
     * @return void
     */
    public List<Country> getNeighbors() {
        return this.neighbors;
    }

    /**
     * Add a neighbor to the list.
     *
     * @param neighbor
     * @return void
     */
    public void addNeighbor(Country neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    /**
     * Implement to string.
     *
     * @return String
     */
    public String toString() {
        String string = "Id: " + this.getId() + "\nNeighbors:\n";
        Iterator<Country> iterator = this.neighbors.iterator();
        
        while (iterator.hasNext()) {
            string += this.neighborToString(iterator.next());
        }
        
        return string;
    }

    /**
     * Stringify neighbor.
     *
     * @param neighbor
     * @return String
     */
    public String neighborToString(Country neighbor) {
        return "\tId: " + neighbor.getId() + "\n";
    }
}