package com.audit;

import java.lang.reflect.Field;

public class Inspector {
    public void analizar(Object obj) {
        System.out.println("Analizando: " + obj);
        for(Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.getName());
            try {
                System.out.println("Valor: " + f.get(obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
