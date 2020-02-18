package com.eureka.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by FireCode on 2020/2/18.
 */
@Table(name="T_PRODUCT")
public class ProductVo implements Serializable {
    private static  final long serialVersionUID=983234245L;
    @Id
    @GeneratedValue(generator="JDBC")
    private Long id;
    @Column(name = "product_name")
    private String productName;
    private int stock;
    private double price;
    private int version;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductVo{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", version=" + version +
                ", note='" + note + '\'' +
                '}';
    }
}
