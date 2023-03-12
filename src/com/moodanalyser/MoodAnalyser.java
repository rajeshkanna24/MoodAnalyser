package com.moodanalyser;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
class SadMood {

        @Test
        void  testanalyserMood() {
            MoodAnalyser moodanalyser=new MoodAnalyser();
            String mood="sad";
            String actual=moodanalyser.analyserMood(mood);
            assertEquals("sad", actual);
        }
}
public class MoodAnalyser {
    public MoodAnalyser(String moodCase) {
    }

    String analyserMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        else
            return "happy";

    }

    public static void main(String[] args) {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mood: ");
        String mood = sc.nextLine();
        String moodCase = mood.toLowerCase();
        System.out.println(moodanalyser.analyserMood(moodCase));

    }
}