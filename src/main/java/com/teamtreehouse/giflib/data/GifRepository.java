package com.teamtreehouse.giflib.data;


import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion",1, "2015-2-13", "Chris Ramacciotti", false),
            new Gif("ben-and-mike",2, "2015-2-13", "Ben Jakuben", true),
            new Gif("book-dominos",3, "2015-2-13", "Craig Dennis", false),
            new Gif("compiler-bot", 4,"2015-2-13", "Ada Lovelace", true),
            new Gif("cowboy-coder",5, "2015-2-13", "Grace Hopper", false),
            new Gif("infinite-andrew",6, "2015-2-13", "Marissa Mayer", true)
    );

    public Gif findByName(String name){
        for (Gif gif: ALL_GIFS){
            if (gif.getName().equals(name)){
                return gif;
            }

        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs  = new ArrayList<Gif>();
        for (Gif gif : ALL_GIFS){
            if (gif.getCategoryId()== id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

}
