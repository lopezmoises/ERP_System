package ads.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class Product {

    private int id;
    private double prices_amountMax;
    private double prices_amountMin;
    private String prices_availability;
    private String prices_condition;
    private String prices_currency;
    private String prices_dateSeen;
    private boolean prices_isSale;
    private String prices_merchant;
    private String prices_shipping;
    private String prices_sourceURLs;
    private String asins;
    private String brand;
    private String categories;
    private LocalDateTime dateAdded;
    private LocalDateTime dateUpdated;
    private String ean;
    private String imageURLs;
    private String keys;
    private String manufacturer;
    private String manufacturerNumber;
    private String name;
    private String primaryCategories;
    private String sourceURLs;
    private String upc;
    private String weight;
    private String Column1;
    private String _1;
    private String _2;
    private String _3;
    private String _4;
    private Queue<Stock> stock = new LinkedList<Stock>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm");

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    /**
     * @return double return the prices_amountMax
     */
    public double getPrices_amountMax() {
        return prices_amountMax;
    }

    /**
     * @param prices_amountMax the prices_amountMax to set
     */
    public void setPrices_amountMax(String prices_amountMax) {
        this.prices_amountMax = Double.parseDouble(prices_amountMax);
    }

    /**
     * @return double return the prices_amountMin
     */
    public double getPrices_amountMin() {
        return prices_amountMin;
    }

    /**
     * @param prices_amountMin the prices_amountMin to set
     */
    public void setPrices_amountMin(String prices_amountMin) {
        this.prices_amountMin = Double.parseDouble(prices_amountMin);
    }

    /**
     * @return String return the prices_availability
     */
    public String getPrices_availability() {
        return prices_availability;
    }

    /**
     * @param prices_availability the prices_availability to set
     */
    public void setPrices_availability(String prices_availability) {
        this.prices_availability = prices_availability;
    }

    /**
     * @return String return the prices_condition
     */
    public String getPrices_condition() {
        return prices_condition;
    }

    /**
     * @param prices_condition the prices_condition to set
     */
    public void setPrices_condition(String prices_condition) {
        this.prices_condition = prices_condition;
    }

    /**
     * @return String return the prices_currency
     */
    public String getPrices_currency() {
        return prices_currency;
    }

    /**
     * @param prices_currency the prices_currency to set
     */
    public void setPrices_currency(String prices_currency) {
        this.prices_currency = prices_currency;
    }

    /**
     * @return String return the prices_dateSeen
     */
    public String getPrices_dateSeen() {
        return prices_dateSeen;
    }

    /**
     * @param prices_dateSeen the prices_dateSeen to set
     */
    public void setPrices_dateSeen(String prices_dateSeen) {
        this.prices_dateSeen = prices_dateSeen;
    }

    /**
     * @return boolean return the prices_isSale
     */
    public boolean isPrices_isSale() {
        return prices_isSale;
    }

    /**
     * @param prices_isSale the prices_isSale to set
     */
    public void setPrices_isSale(String prices_isSale) {
        this.prices_isSale = Boolean.parseBoolean(prices_isSale);
    }

    /**
     * @return String return the prices_merchant
     */
    public String getPrices_merchant() {
        return prices_merchant;
    }

    /**
     * @param prices_merchant the prices_merchant to set
     */
    public void setPrices_merchant(String prices_merchant) {
        this.prices_merchant = prices_merchant;
    }

    /**
     * @return String return the prices_shipping
     */
    public String getPrices_shipping() {
        return prices_shipping;
    }

    /**
     * @param prices_shipping the prices_shipping to set
     */
    public void setPrices_shipping(String prices_shipping) {
        this.prices_shipping = prices_shipping;
    }

    /**
     * @return String return the prices_sourceURLs
     */
    public String getPrices_sourceURLs() {
        return prices_sourceURLs;
    }

    /**
     * @param prices_sourceURLs the prices_sourceURLs to set
     */
    public void setPrices_sourceURLs(String prices_sourceURLs) {
        this.prices_sourceURLs = prices_sourceURLs;
    }

    /**
     * @return String return the asins
     */
    public String getAsins() {
        return asins;
    }

    /**
     * @param asins the asins to set
     */
    public void setAsins(String asins) {
        this.asins = asins;
    }

    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return String return the categories
     */
    public String getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(String categories) {
        this.categories = categories;
    }

    /**
     * @return LocalDateTime return the dateAdded
     */
    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(String dateAdded) {
        this.dateAdded = LocalDateTime.parse(dateAdded, formatter);
    }

    /**
     * @return LocalDateTime return the dateUpdated
     */
    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param dateUpdated the dateUpdated to set
     */
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = LocalDateTime.parse(dateUpdated, formatter);
    }

    /**
     * @return String return the ean
     */
    public String getEan() {
        return ean;
    }

    /**
     * @param ean the ean to set
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    /**
     * @return String return the imageURLs
     */
    public String getImageURLs() {
        return imageURLs;
    }

    /**
     * @param imageURLs the imageURLs to set
     */
    public void setImageURLs(String imageURLs) {
        this.imageURLs = imageURLs;
    }

    /**
     * @return String return the keys
     */
    public String getKeys() {
        return keys;
    }

    /**
     * @param keys the keys to set
     */
    public void setKeys(String keys) {
        this.keys = keys;
    }

    /**
     * @return String return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return String return the manufacturerNumber
     */
    public String getManufacturerNumber() {
        return manufacturerNumber;
    }

    /**
     * @param manufacturerNumber the manufacturerNumber to set
     */
    public void setManufacturerNumber(String manufacturerNumber) {
        this.manufacturerNumber = manufacturerNumber;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the primaryCategories
     */
    public String getPrimaryCategories() {
        return primaryCategories;
    }

    /**
     * @param primaryCategories the primaryCategories to set
     */
    public void setPrimaryCategories(String primaryCategories) {
        this.primaryCategories = primaryCategories;
    }

    /**
     * @return String return the sourceURLs
     */
    public String getSourceURLs() {
        return sourceURLs;
    }

    /**
     * @param sourceURLs the sourceURLs to set
     */
    public void setSourceURLs(String sourceURLs) {
        this.sourceURLs = sourceURLs;
    }

    /**
     * @return String return the upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * @param upc the upc to set
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * @return String return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return String return the Column1
     */
    public String getColumn1() {
        return Column1;
    }

    /**
     * @param Column1 the Column1 to set
     */
    public void setColumn1(String Column1) {
        this.Column1 = Column1;
    }

    /**
     * @return String return the _1
     */
    public String get_1() {
        return _1;
    }

    /**
     * @param _1 the _1 to set
     */
    public void set_1(String _1) {
        this._1 = _1;
    }

    /**
     * @return String return the _2
     */
    public String get_2() {
        return _2;
    }

    /**
     * @param _2 the _2 to set
     */
    public void set_2(String _2) {
        this._2 = _2;
    }

    /**
     * @return String return the _3
     */
    public String get_3() {
        return _3;
    }

    /**
     * @param _3 the _3 to set
     */
    public void set_3(String _3) {
        this._3 = _3;
    }

    /**
     * @return String return the _4
     */
    public String get_4() {
        return _4;
    }

    /**
     * @param _4 the _4 to set
     */
    public void set_4(String _4) {
        this._4 = _4;
    }

    /**
     * @return String return the _4
     */
    public Queue<Stock> getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Queue<Stock> stock) {
        this.stock = stock;
    }

    public String printStock() {
        int stockAll = 0;
        for (Stock st : stock) {
            stockAll += st.getQuantity();
            // System.out.print(st. getDate() + "\t");
        }
        return "Stock: " + stockAll;
    }

}
