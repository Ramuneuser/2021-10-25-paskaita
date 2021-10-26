package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //scanner
        //i++
//        int skaicius = 17;
//        skaicius = skaicius + 1;
//        skaicius += 1;
//        skaicius += 20;
//        skaicius -= 20;
//        skaicius++;
//        skaicius--;
//        ++skaicius;
//        --skaicius;
//        int a = 10;
        //10 + 10  jau po laiko
//        System.out.println(a + a++);
        //10 + padidinam(11)
//        System.out.println(a + ++a);
//        for (int i = 1; i < 10;i++) { //i=1
//            System.out.println(i);
//            if(i % 5 == 0) {
//                break;
//            }
//            System.out.println(i);
//        }
        int[] randomNumbers = {618,5,57,51,586,498,489,9,948,49,49,49,94384,816,16};

//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0; i < randomNumbers.length; i++) {
//            randomNumbers[i] = 17;
//        }
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
//        System.out.println();
//        int[] newArr = new int[5];
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            newArr[i] = (int) (Math.random() * 16) + 5;
//        }
//
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+ " ");
//        }
//        System.out.println();


        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }

        int count = 0;
        for (int a = 0; a < randomNumbers.length; a++) {
            for (int i = 0; i < randomNumbers.length - 1; i++) {
                if (randomNumbers[i] > randomNumbers[ i + 1 ]) {
                    int tmp = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = tmp;
                }
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }


        count = 0;
        for (int a = 0; a < randomNumbers.length; a++) {//10
            for (int i = a+1; i < randomNumbers.length; i++) { //11-15
                if (randomNumbers[a] > randomNumbers[ i  ]) {
                    int tmp = randomNumbers[a];
                    randomNumbers[a] = randomNumbers[i];
                    randomNumbers[i ] = tmp;
                }
                count++;
            }
        }

        System.out.println();
        System.out.println(count);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }

        int [] arr = {5,3,10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("labas vakaras...");

        int skaicius = 17; // saugoti skaicius
        double skaiciusSuKableliu = 12.4; // saugoti skaiciams su kableliu
        String tekstas = "tekstas"; //sougoti tekstui
        boolean isitTrue = true; // saugoti teiginiui (true/false)

        //uzduotis - atspausdinti sveika skaiciu
        int skaicius2 = 15;
        System.out.println("skaicius yra " + skaicius2);

        //uzduotis - atspausdinti "As esu vardas ir pavarde. Man xx metu"

        String name = "Ramune";
        String surname = "Drebulyte";
        int age = 1989;
        int year = 2021;

        System.out.println("As esu "+name+" " +surname+".Man yra "+ (year-age));

        //uzduotis - sukurti kintamaji su merginos pavarde ir pakeisti i moters pavarde
        String surname1 = "Jonaityte";
        surname1 = "Jonaitiene";

        //uzduotis - naudoti Math.random funkcija. Sukurti du kintamuosius ir pasinaudojus funkcija math.random() jiems priskirti atsiriktines reiksmes nuo 0 iki 4. Didesne reiksme padalinti is mazesnes. Atspausdinti rezultata ji suapvalinus iki 2 skaiciu po kablelio.
        double sk1 = Math.random() * 4;
        double sk2 = Math.random() * 4;
        sk1 = Math.round(sk1 * 100.0)/ 100.0;
        sk2 = Math.round(sk2 * 100.0)/ 100.0;
        System.out.println(sk1);
        System.out.println(sk2);
        if (sk1<sk2){
            System.out.println(sk2/sk1);
            System.out.println("daugiau");
        }else{
            System.out.println(sk1/sk2);
            System.out.println("maziau");
        }

        //1.Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29), kurių reikšmės yra atsitiktiniai skaičiai nuo 5 iki 25. Atsispausdinate, pasižiūrite ką gavote.
    }
}