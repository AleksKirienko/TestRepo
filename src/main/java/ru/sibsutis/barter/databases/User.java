package ru.sibsutis.barter.databases;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String number;
    private String email;
    private boolean isInteractionPost;
    private String address;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER, mappedBy = "products")
    private List<Product> given;
    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER, mappedBy = "products")
    private List<Product> gotten;
    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER, mappedBy = "products")
    private List<Product> favorites;

    private boolean isPrivileged;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER, mappedBy = "products")
    private List<Product> offers;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isInteractionPost() {
        return isInteractionPost;
    }

    public void setInteractionPost(boolean interactionPost) {
        isInteractionPost = interactionPost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getGiven() {
        return given;
    }

    public void setGiven(List<Product> given) {
        this.given = given;
    }

    public List<Product> getGotten() {
        return gotten;
    }

    public void setGotten(List<Product> gotten) {
        this.gotten = gotten;
    }

    public List<Product> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Product> favorites) {
        this.favorites = favorites;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public List<Product> getOffers() {
        return offers;
    }

    public void setOffers(List<Product> offers) {
        this.offers = offers;
    }
}
