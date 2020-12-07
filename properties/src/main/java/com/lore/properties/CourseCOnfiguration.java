package com.lore.properties;

public class CourseCOnfiguration {
    private String name;
    private int chapterCount;
    private int rating;
    private  String author;

    public CourseCOnfiguration(String name, int chapterCount, int rating, String author) {
        this.name = name;
        this.chapterCount = chapterCount;
        this.rating = rating;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
