package com.project.demo.logic.entity.product;


import com.project.demo.logic.entity.category.Category;
import jakarta.persistence.*;

@Entity
@Table(name= "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private int price;

    private int stockQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category Category;

    public Product(Long Id, String name, String description, int price, int stockQuantity, Category Category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.Category = Category;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public com.project.demo.logic.entity.category.Category getCategory() {
        return Category;
    }

    public void setCategory(com.project.demo.logic.entity.category.Category Category) {
        this.Category = Category;
    }

}
