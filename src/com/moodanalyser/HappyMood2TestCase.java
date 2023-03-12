package com.moodanalyser;

 import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
public class HappyMood2TestCase {

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
                return "happy";
        }
    }

    public class Main {

        public static void main(String[] args) {
            MoodAnalyser moodanalyser = new MoodAnalyser();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Mood: ");
            String mood = sc.nextLine();
            String moodCase = mood.toLowerCase();
            System.out.println(moodanalyser.analyserMood(moodCase));

        }
    }

}