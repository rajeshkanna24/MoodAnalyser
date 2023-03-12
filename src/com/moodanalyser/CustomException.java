package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
public class CustomException {
    class MoodAnalyserTest {

        @Test
        void testanalyserMood() {

            MoodAnalyser moodanalyser = new MoodAnalyser();
            String mood = " ";
            String actual;
            try {
                actual = moodanalyser.analyserMood(mood);
                assertEquals("happy", actual);
            } catch (MoodAnalyseException e) {

            }

        }

        public class MoodAnalyser {


            String analyserMood(String mood) throws MoodAnalyseException {

                if (mood.contains("sad")) {
                    return "sad";
                } else {
                    throw new MoodAnalyseException(mood);
                }
            }

            public class MoodAnalyser {


                String analyserMood(String mood) throws MoodAnalyseException {

                    if (mood.contains("sad")) {
                        return "sad";
                    } else {
                        throw new MoodAnalyseException(mood);
                    }
                }
            }

            public class Main {

                public static void main(String[] args) throws MoodAnalyseException {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Mood: ");
                    String mood = sc.nextLine();
                    String moodCase = mood.toLowerCase();
                    MoodAnalyser moodanalyser = new MoodAnalyser();
                    try {
                        System.out.println(moodanalyser.analyserMood(moodCase));
                    } catch (MoodAnalyseException e) {
                        System.out.println("This is a customException block");
                        System.out.println("happy");
                    }
                }
            }
        }
    }
}