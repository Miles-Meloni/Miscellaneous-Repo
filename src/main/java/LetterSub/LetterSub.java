/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: MILES MELONI
 * Section: 9:00
 * Date: 10/1/23
 * Time: 1:44 PM
 *
 * Project: Personal
 * Package: LetterSub
 * Class: LetterSub
 *
 * Description:
 *
 * ****************************************
 */
package LetterSub;

import java.util.LinkedList;
import java.util.Scanner;

public class LetterSub {

    //The primary string that will be modified
    private String mainString;

    //The list of substitutions, as a linked list of tuples
    private LinkedList<Character[]> subList;

    //Scanner of inputs
    private Scanner scan = new Scanner(System.in);

    public LetterSub(){

    }

    /**
     * Gets string from input.
     */
    public void getStringFromUser() {
        System.out.println("Please input a string to be modified.");
        String rawInput = scan.next();
        putString( rawInput.strip() );
    }

    /**
     *Gets two characters, then puts them into an array.
     * Array is then returned as new swap.
     */
    public void getSwapFromUser() {
        Character chOne;
        Character chTwo;

        chOne = getCharFromUser();
        chTwo = getCharFromUser();

        Character[] charTuple = new Character[2];
        charTuple[0] = chOne;
        charTuple[1] = chTwo;

        putSwap(charTuple);
    }

    private char getCharFromUser() {
        char chOne = ' ';
        boolean isDone = false;
        String stOne;
        while (!isDone){
            System.out.print("Please input a character that will be replaced: ");
            stOne = scan.next().strip();
            if (stOne.toCharArray().length == 1){
                chOne = stOne.toCharArray()[0];
                isDone = true;
            }
            else{
                System.out.println("INVALID INPUT.");
            }
        }
        return chOne;
    }

    /**
     * Assigns string to an input value
     * @param mainString new value of mainString
     */
    public void putString(String mainString){
        this.mainString = mainString;
    }

    /**
     * Adds new swap pair to the swap list
     * @param newSwap is new pair to be added
     */
    public void putSwap(Character[] newSwap){
        subList.add(newSwap);
    }

    /**
     * Clears list of swaps
     */
    public void clearSwap(){
        subList.clear();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the typing style generator.");
        LetterSub testSub = new LetterSub();

    }
}