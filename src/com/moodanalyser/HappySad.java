package com.moodanalyser;
import java.util.Scanner;
public class HappySad {
    String analyserMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        else if (mood.contains("happy"))
            return "happy";
        else
            return "Plese enter valid mood";
    }

    public static void main(String[] args) {
        HappySad happysad = new HappySad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mood: ");
        String mood = sc.nextLine();
        String moodCase = mood.toLowerCase();
        System.out.println(happysad.analyserMood(moodCase));

    }
}