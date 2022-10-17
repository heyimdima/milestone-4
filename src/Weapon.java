/**
 * Weapon Class that comes from Salable Product, has SalableProduct properties + damage property
 */
public class Weapon extends SalableProduct implements Comparable<SalableProduct> {
    private int damage;

    /**
     * Parameterized Constructor for the Weapon class
     * Inherits properties from Salable Product and adds a property of damage
     * @param name
     * @param description
     * @param price
     * @param quantity
     * @param damage
     */
    Weapon(String name, String description, double price, int quantity, int damage) {
        super(name, description, price, quantity);
        this.damage = damage;
    }

    /**
     * Override the compare to function based on the name of the item and alphabetical ordering rules that ignore case
     * @param o the object to be compared.
     * @return comparison
     */
    @Override
    public int compareTo(SalableProduct o) {
        return this.getName().compareTo(o.getName());
    }
}
