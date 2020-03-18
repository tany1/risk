import java.util.List;

public class Country {
    private int id;
    private List<Country> neighbors;
    
    /**
     * Return country's id.
     *
     * @return int
     */
    public int getId() {
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
}