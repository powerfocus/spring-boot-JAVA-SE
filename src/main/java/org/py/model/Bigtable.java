package org.py.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Bigtable implements Serializable {
    private static final long serialVersionUID = 9091144996604066944L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double num;

    public Bigtable() {
    }

    public Bigtable(Long id, String title, Double num) {
        this.id = id;
        this.title = title;
        this.num = num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bigtable{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                '}';
    }
}
