package com.moodanalyser;

import java.util.Scanner;
    import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
public class NullTryCatch {
    class MoodAnalyserTest {

        @Test
        void testanalyserMood() {

            MoodAnalyser moodanalyser = new MoodAnalyser();
            String mood = "happy";
            String actual = moodanalyser.analyserMood(mood);
            assertEquals("happy", actual);
        }

    }

    public class MoodAnalyser {


        String analyserMood(String mood) {

            if (mood.contains("sad"))
                return "sad";
            else
                try {
                    if (mood.contains("sad"))
                        return "sad";
                    else
                        return "happy";
                } catch (NullPointerException e) {
                    return "happy";
                }
            public class Main {

                public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Mood: ");
                    String mood = sc.nextLine();
                    String moodCase = mood.toLowerCase();
                    MoodAnalyser moodanalyser = new MoodAnalyser();
                    System.out.println(moodanalyser.analyserMood(moodCase));

                }
            }
        }
    }
}