package com.example.recyclerview;

/**
 * Created by songmho on 2015-07-11.
 */
public class Recycler_item {
    int image;
    String title;

    int getImage(){
        return this.image;
    }
    String getTitle(){
        return this.title;
    }

    Recycler_item(int image, String title){
        this.image=image;
        this.title=title;
    }
}
