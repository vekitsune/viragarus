/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viragcsokor;

/**
 *
 * @author Verosffy
 */
public class Virag {
private String fajta;
private double ar;
private int kedvezmenyhatar;
private int kedvezmenySzazalek;

    public Virag(String fajta, double ar, int kedvezmenyhatar, int kedvezmenySzazalek) {
        this.fajta = fajta;
        this.ar = ar;
        this.kedvezmenyhatar = kedvezmenyhatar;
        this.kedvezmenySzazalek = kedvezmenySzazalek;
    }

    public int getKedvezmenySzazalek() {
        return kedvezmenySzazalek;
    }

    public void setKedvezmenySzazalek(int kedvezmenySzazalek) {
        this.kedvezmenySzazalek = kedvezmenySzazalek;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public int getKedvezmenyhatar() {
        return kedvezmenyhatar;
    }

    public void setKedvezmenyhatar(int kedvezmenyhatar) {
        this.kedvezmenyhatar = kedvezmenyhatar;
    }
   
}
