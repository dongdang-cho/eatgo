package kr.co.dongdang.eatgo.domain;

public class Restaurant {
    
    private final String name;
    private final String address;
    private final Long id;

    public Restaurant(String name) {
        this.name = name;
        this.address = "";
        this.id = 0L;
    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = 0L;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public String getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }
}
