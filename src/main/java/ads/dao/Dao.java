package ads.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import ads.model.Product;
import ads.model.Stock;

public class Dao {

    private final Random random = new Random();
    public ArrayList<Product> products = new ArrayList<Product>();
    public Node node;

    public Dao() {
        readCSV();
        entriesStock();
        loadNode();
    }

    private void readCSV() {
        int i = 0;
        try (Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/Products.csv"));
                CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
            for (CSVRecord csvRecord : csvParser) {

                Product product = new Product();
                product.setId(csvRecord.get("﻿id"));
                product.setPrices_amountMax(csvRecord.get("prices.amountMax"));
                product.setPrices_amountMin(csvRecord.get("prices.amountMin"));
                // product.setPrices_availability(csvRecord.get("prices.availability"));
                // product.setPrices_condition(csvRecord.get("prices.condition"));
                product.setPrices_currency(csvRecord.get("prices.currency"));
                // product.setPrices_dateSeen(csvRecord.get("prices.dateSeen"));
                // product.setPrices_isSale(csvRecord.get("prices.isSale"));
                // product.setPrices_merchant(csvRecord.get("prices.merchant"));
                // product.setPrices_shipping(csvRecord.get("prices.shipping"));
                // product.setPrices_sourceURLs(csvRecord.get("prices.sourceURLs"));
                // product.setPrices_sourceURLs(csvRecord.get("prices.sourceURLs"));
                // product.setAsins(csvRecord.get("asins"));
                // product.setBrand(csvRecord.get("brand"));
                // product.setCategories(csvRecord.get("categories"));
                // product.setDateAdded(csvRecord.get("dateAdded"));
                // product.setDateUpdated(csvRecord.get("dateUpdated"));
                // product.setEan(csvRecord.get("ean"));
                // product.setImageURLs(csvRecord.get("imageURLs"));
                // product.setKeys(csvRecord.get("keys"));
                // product.setManufacturer(csvRecord.get("manufacturer"));
                // product.setManufacturerNumber(csvRecord.get("manufacturerNumber"));
                product.setName(csvRecord.get("name"));
                // product.setPrimaryCategories(csvRecord.get("primaryCategories"));
                // product.setSourceURLs(csvRecord.get("sourceURLs"));
                // product.setUpc(csvRecord.get("upc"));
                // product.setWeight(csvRecord.get("weight"));
                // product.setColumn1(csvRecord.get("Column1"));
                // product.set_1(csvRecord.get("_1"));
                // product.set_2(csvRecord.get("_2"));
                // product.set_3(csvRecord.get("_3"));
                // product.set_4(csvRecord.get("_4"));
                product.setStock(entriesStock());

                products.add(product);
                i++;
                if (i > 100)
                    break;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Queue<Stock> entriesStock() {

        Queue<Stock> stock = new LinkedList<Stock>();
        int day = 1;
        int month = 1;
        int year = 2010;
        for (Product product : products) {
            for (int i = 0; i < random.nextInt(20) + 1; i++) {

                Stock entry = new Stock();

                entry.setIdProduct(product.getId());
                entry.setQuantity(random.nextInt(100) + 1);

                entry.setDate(LocalDateTime.of(year, month, day, random.nextInt(23) + 1, random.nextInt(59) + 1,
                        random.nextInt(59) + 1));
                stock.add(entry);

                if (day < 28) {
                    day++;
                } else {
                    day = 1;
                    if (month < 12) {
                        month++;
                    } else {
                        month = 1;
                        year++;
                    }
                }
            }
        }
        return stock;
    }

    private void loadNode() {

        node = new Node(1, products.get(0));

        for (int i = 2; i < products.size(); i++) {
            node.add(i, products.get(i - 1));
        }
    }

}
