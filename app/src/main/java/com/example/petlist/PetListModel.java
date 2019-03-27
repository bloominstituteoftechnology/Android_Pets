package com.example.petlist;

import android.net.Uri;

import java.io.Serializable;

public class PetListModel implements Serializable {

    private String name, petEntry, petPicture;
    private int age, id;

    public PetListModel(String name, String petEntry, String petPicture, int age, int id) {
        this.name = name;
        this.petEntry = petEntry;
        this.petPicture = petPicture;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetEntry() {
        return petEntry;
    }

    public void setPetEntry(Uri petEntry) {
        this.petEntry = petEntry.toString();
    }

    public Uri getPetPicture() {
        return Uri.parse(petPicture);
    }

    public void setPetPicture(String petPicture) {
        this.petPicture = petPicture;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
