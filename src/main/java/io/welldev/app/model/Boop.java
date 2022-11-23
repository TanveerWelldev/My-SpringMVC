package io.welldev.app.model;

public class Boop {
    private Long id;
    private String name;
    private String type;

    public Boop() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boop(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
