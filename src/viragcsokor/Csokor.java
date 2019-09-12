/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viragcsokor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Verosffy
 */
public class Csokor {

    ArrayList<Virag> viragok;

    double teljesAr;
    double kedvezmenyesAr;

    public void teljesArSzamolo() {

        teljesAr = 0;
        for (int i = 0; i < viragok.size(); i++) {
            teljesAr += viragok.get(i).getAr();
        }
    }

    public int fajtaszamlalo() {
//        Set<Virag> fajtafelsorolas = new HashSet<>(viragok);
//        return fajtafelsorolas.size();
        int fajtaszam = 0;
        for (int i = 0; i < viragok.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (!viragok.get(i).getFajta().equals(viragok.get(j))) {
                    fajtaszam++;
                }
            }
        }return fajtaszam;
    }


    public void viragvalogato() {

    }

    public void kedvezmenyesArSzamolo() {
        int fajtaszam = fajtaszamlalo();
        Set<Virag> fajtafelsorolas = new HashSet<>(viragok);
        Virag[] megszamoltViragok = new Virag[fajtaszam];
        for (int i = 0; i < fajtaszam; i++) {

        }
    }

}
