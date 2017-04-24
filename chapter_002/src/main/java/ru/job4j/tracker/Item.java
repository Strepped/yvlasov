package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Date;

public class Item {
    private String id;
    private String name;
    private String desc;
    private Date created;
    private String[] comments;

    public Item() {}

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", key='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", created=" + created +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }

    public Item(String name, String desc, Date created) {
        this.name = name;
        this.desc = desc;
        this.created = created;
    }

    public Item(String id, String name, String desc, Date created) {
        this(name, desc, created);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return this.desc;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getCreated() {
        return this.created;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }
    public String[] getComments() {
        return this.comments;
    }
}