package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> Chusla = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            Chusla.add(i);

        }

        System.out.println(Chusla);


        List<Integer> Chusla2= new ArrayList<>();
        Integer c =0;
        for (int i=0; i<Chusla.size(); i++) {
            c = Chusla.get(i);
            if (c%2==0) {
                Chusla2.add(c);
            };
        }
        System.out.println(Chusla2);
        }

    }
