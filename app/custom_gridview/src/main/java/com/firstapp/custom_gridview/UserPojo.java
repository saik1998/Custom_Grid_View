package com.firstapp.custom_gridview;

public class UserPojo {
    int image;
    String name,price,weight,age;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserPojo(int image, String name, String price, String weight, String age) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.age = age;
    }
}
