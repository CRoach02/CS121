package weekFourteen.MangHan;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Simple Hangman game that picks a random word from the dictionary (or any text file given as an argument) and displays an ASCII Hangman when the player guesses wrong.
//Written by Sam Whelan.

public class Game
{
    static Hangman hangman = null;
    static Word word = null;
    static boolean running = true;
    static String input = null;
    static BufferedReader reader = null;
    static BufferedReader wordList = null;

    public static void main(String[] args)
    {
        //if a file is given as an argument, use that as a word list, else use the dictionary
        if (args.length == 0)
            try
            {
                wordList = new BufferedReader(new FileReader("C:\\Users\\cvr2n\\OneDrive\\Desktop\\CS 121\\CS121\\src\\weekFourteen\\MangHan\\balls.txt"));
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        else
            try
            {
                wordList = new BufferedReader(new FileReader(args[0]));
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }

        hangman = new Hangman();
        word = new Word(wordList);
        reader = new BufferedReader(new InputStreamReader(System.in));

        //wait for character input, check if it's in the word and display the output
        while (running)
        {
            try
            {
                input = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if (input != null && !input.trim().equals(""))
            {
                if (word.compare(input) == false)
                    hangman.next();
                hangman.draw();
                word.display();
                word.winCheck();
                hangman.gameOverCheck();
            }
        }
    }

    public static void gameOver()
    {
        running = false;
        hangman.draw();
        word.reveal();
    }

    public static void win()
    {
        running = false;
        System.out.println("Congratulations! You Won!");
    }

}
class Hangman
{
    private int lives = 6;
    private String image = " _____\n" +
            " |/\n" +
            " |\n" +
            " |\n" +
            " |\n" +
            " |\n" +
            " |\n" +
            "========\n";

    //take a life and update the hangman image
    public void next()
    {
        lives--;
        switch (lives)
        {
            case 0:	image = " _____\n" +
                    " |/  |\n" +
                    " |   0\n" +
                    " |  -O-\n" +
                    " |   \" \n" +
                    " |\n" +
                    " |\n" +

                    "========\n";
                break;

            case 1:	image = " _____\n" +
                    " |/  |\n" +
                    " |   0\n" +
                    " |  -O-\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    "========\n";
                break;

            case 2:	image = " _____\n" +
                    " |/  |\n" +
                    " |   0\n" +
                    " |  -O\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    "========\n";
                break;

            case 3: image = " _____\n" +
                    " |/  |\n" +
                    " |   0\n" +
                    " |   O\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    "========\n";
                break;

            case 4: image = " _____\n" +
                    " |/  |\n" +
                    " |   0\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    "========\n";
                break;

            case 5: image = " _____\n" +
                    " |/  |\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    " |\n" +
                    "========\n";
                break;
        }
    }

    public void draw()
    {
        System.out.println(image);
    }

    public void gameOverCheck()
    {
        if (lives == 0)
            Game.gameOver();
    }

}
class Word
{
    String chosenWord;
    char[] letters;
    char[] currentLetters;
    char[] wrongLetters;
    int wrongLettersCount = 0;

    Word(BufferedReader wordList)
    {
        //add all the words from the wordList into an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String word = null;
        try
        {
            word = wordList.readLine();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }

        while (word != null)
        {
            words.add(word);
            try
            {
                word = wordList.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        //choose a random word from the ArrayList and obfuscate it
        Random r = new Random();
        String chosenWord = words.get(r.nextInt(words.size()));
        letters = chosenWord.toCharArray();
        currentLetters = new char[letters.length];
        obfuscate(letters);
        System.out.println(currentLetters);
    }

    //make an char array of the same length as the word and fill it with blanks
    public void obfuscate(char[] letters)
    {
        for (int i = 0; i < letters.length; i++)
            currentLetters[i] = '#';
    }

    //show the final answer
    public void reveal()
    {
        System.out.println("The word is " + new String(letters));
    }

    //return true if the input letter is in the word
    public boolean compare(String input)
    {
        char[] inputChar = input.toCharArray();
        boolean correctLetter = false;
        for (int i = 0; i < letters.length; i++)
        {
            if (inputChar[0] == letters[i])
            {
                currentLetters[i] = inputChar[0];
                correctLetter = true;
            }
        }

        return correctLetter;
    }

    public void display()
    {
        System.out.println(currentLetters);
    }

    public void winCheck()
    {
        if (Arrays.equals(letters, currentLetters))
            Game.win();
    }

}