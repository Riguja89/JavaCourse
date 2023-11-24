package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    // invertir una cadena
    private void m1InvertString(String text){
       /* String[] array =text.split("");
        StringBuilder newText= new StringBuilder();
        for (int i= array.length;i>0;i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);*/

        String newText=new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }
    // determinar si un numero es capicua igual ivirtiendolo y comparandolo con el original

    private  void  m2IsCapicua(int number){
        String numberText= String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if(numberText.equals(reverseNumber)){
            System.out.println("es Capicua");
        }else {
            System.out.println("no es capicua");
        }
    }

    // contar cuantas veces se repite cada caracter
    private void  m3CountCharacterTimes(String text){
        int i, length, counter[]=new int[256];

        length=text.length();

        for (i=0; i<length; i++){
            counter[text.charAt(i)]++;
        }

        for (i=0; i<256; i++){
            if(counter[i]!=0){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    // encontrar los caracteres repetidos.

    private  void m4RepeatersCharacters(String text){
        int i, length, counter[]=new int[256];

        length=text.length();

        for (i=0; i<length; i++){
            counter[text.charAt(i)]++;
        }

        for (i=0; i<256; i++){
            if(counter[i]>1){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    // saber si un numero es multiplo de 3

    private void m5IsMultipleOf3(int number){
        if(number%3==0){
            System.out.println(number + " es multiple de 3");
        }else {
            System.out.println(number + " no es multiple de 3");
        }
    }

    // determina si el año es visiesto o no

    private void m6IsLeapYear(int year){
        boolean isLeap= LocalDate.of(year, 1,1).isLeapYear();
        System.out.println(isLeap);
    }

// desordenar una cadena de strings
    private  void m7RamdomOrderString(String text){
        String[] array=text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        App app= new App();
       // app.m1InvertString( "mitocode");
       // app.m2IsCapicua(52);
        // app.m3CountCharacterTimes("jaime Jaime");
       // app.m4RepeatersCharacters("miticodiniii");
        //app.m5IsMultipleOf3(254);
        //app.m6IsLeapYear(2024);
        app.m7RamdomOrderString("saguapela");
    }
}
