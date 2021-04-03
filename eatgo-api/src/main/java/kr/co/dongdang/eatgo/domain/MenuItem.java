package kr.co.dongdang.eatgo.domain;

public class MenuItem {
    private String name;
    private Long id;
    public MenuItem(String name) {
        this.name = name;
    }

    public MenuItem(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
