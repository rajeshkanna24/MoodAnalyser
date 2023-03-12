package com.moodanalyser;
 import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
    public class HappyMood {
        class MoodAnalyserTest {

            @Test
            void testanalyserMood() {
                String actual;
                MoodAnalyser moodanalyser = new MoodAnalyser("happy");
                actual = moodanalyser.analyserMood();
                assertEquals("happy", actual);
            }

            public class MoodAnalyser {

                private String mood;

                // defalut constuctor
                MoodAnalyser() {
                }

                //parameterised constuctor
                MoodAnalyser(String mood) {
                    this.mood = mood;
                }

                String analyserMood() {
                    if (mood.contains("sad"))
                        return "sad";
                    else
                        return "happy";

                }
            }

            public class Main {

                public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Mood: ");
                    String mood = sc.nextLine();
                    String moodCase = mood.toLowerCase();
                    MoodAnalyser moodanalyser = new MoodAnalyser(moodCase);
                    System.out.println(moodanalyser.analyserMood());

                }
            }
        }
    }

