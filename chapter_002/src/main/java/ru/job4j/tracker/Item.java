package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Date;

/**
 * Class Item.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Item {
    /**
     * id.
     */
    private String id;
    /**
     * Имя.
     */
    private String name;
    /**
     * что-то там.
     */
    private String desc;
    /**
     * Дата создания.
     */
    private Date created;
    /**
     * Комментарий.
     */
    private String[] comments;
    /**
     * Дефолт консруктор.
     */
    public Item() {

    }

    @Override
    public String toString() {
        return "Item{"
                + "id='" + id + '\''
                + ", key='" + name + '\''
                + ", desc='" + desc + '\''
                + ", created=" + created
                + ", comments=" + Arrays.toString(comments)
                + '}';
    }

    /**
     * Конструктор.
     * @param name - первая переменная.
     * @param desc - первая переменная.
     * @param created - первая переменная.
     */
    public Item(String name, String desc, Date created) {
        this.name = name;
        this.desc = desc;
        this.created = created;
    }

    /**
     * Еще консруктор.
     * @param id - первая переменная.
     * @param name - первая переменная.
     * @param desc - первая переменная.
     * @param created - первая переменная.
     */
    public Item(String id, String name, String desc, Date created) {
        this(name, desc, created);
        this.id = id;
    }

    /**
     * записывает id.
     * @param id - первая переменная.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Метод производит сложение.
     * @param name - первая переменная.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод производит сложение.
     * @param desc - первая переменная.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * Метод производит сложение.
     * @param created - первая переменная.
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Метод производит сложение.
     * @param comments - первая переменная.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String[] getComments() {
        return this.comments;
    }
}