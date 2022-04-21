package ch.juventus.se.problemstofix.bird;

import java.util.*;


public class BirdController {

    private List<Bird> birds;

    public BirdController(){
        birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public int getBirdsCount () {
        return birds.size();
    }

}
