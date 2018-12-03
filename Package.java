/**
 * <h1>Package</h1> Represents a package
 */
public class Package {
    private String id;
    private String product;
    private double weight;
    private double price;
    private ShippingAddress destination;

    /**
     * Default Constructor
     */
    //============================================================================
    public Package() {
        new Package("", "", 0, 0, new ShippingAddress());
    }

    //============================================================================
    /**
     * Constructor
     *
     * @param id          id number of product
     * @param product     name of product in package
     * @param weight      weight of package
     * @param price       price of product
     * @param destination the destination of the package
     *
     */
    //============================================================================
    public Package(String id, String product, double weight, double price, ShippingAddress destination) {
        this.id = id;
        this.product = product;
        this.weight = weight;
        this.price = price;
        this.destination = destination;
    }

    //============================================================================

    /**
     * @return id of package
     */
    public String getID() {
        return id;
    }



    /**
     * @return Name of product in package
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product name to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return price of product in package
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * @return Package weight
     */
    public double getWeight() {
        return weight;
    }


    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }



    /**
     * @return The shipping address of package
     */
    public ShippingAddress getDestination() {
        return destination;
    }




    /**
     * @param destination the shipping address to set
     */
    public void setDestination(ShippingAddress destination) {
        this.destination = destination;
    }



    /**
     * @return The package's shipping label.
     */
    public String shippingLabel() {
        return  "=======================\n" +
                "TO: " + destination.getName() + "\n" +
                destination.getAddress() + "\n" +
                destination.getCity() + ", " + destination.getState() + ", " + destination.getZipCode() + "\n" +
                "Weight:        " + weight + "\n" +
                "Price:         " + price + "\n" +
                "Product:       " + product + "\n" +
                "=======================" + "\n";

    }

}