package io.welldev.app.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BoopService {
    List<Boop> boopList = new ArrayList<>(Arrays.asList(new Boop(1L, "Dog Boop", "Nose Boop"),
            new Boop(2L, "Cat Boop", "Nose Boop"),
            new Boop(3L, "Hooman Boop", "Finger Boop"),
            new Boop(4L, "Lucio Boop", "Spotify Premium Boop"))
            );

    public List<Boop> getBoopList() {
        return boopList;
    }

    public Boop getBoop(Long id) {
        return boopList.stream().filter(e -> e.getId() == id).findFirst().get();
    }

    public void addBoop(Boop boop) {
        boopList.add(boop);
    }

    public void updateBoop(Boop Boop, Long id){
        for(int i=0;i<boopList.size();i++){
            Boop e=boopList.get(i);
            if(e.getId() == id) {
                boopList.set(i, Boop);
                break;
            }
        }
    }
    public void deleteBoop(Long id){
        boopList.removeIf(e->e.getId() == id);
    }
}
