package com.ch2.string;

/**
 * Convert a sentence into its equivalent mobile numeric keypad sequence
 *
 * Difficulty Level : Easy
 * Last Updated : 02 Aug, 2022
 * Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.
 *
 *
 * Mobile-keypad
 *
 * that is for z-store
 * Pause
 *
 * Unmute
 * Remaining Time-1:07
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * Examples :
 *
 * Input : GEEKSFORGEEKS
 * Output : 4333355777733366677743333557777
 * For obtaining a number, we need to press a
 * number corresponding to that character for
 * number of times equal to position of the
 * character. For example, for character C,
 * we press number 2 three times and accordingly.
 *
 * Input : HELLO WORLD
 * Output : 4433555555666096667775553
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 *
 * Follow the steps given below to convert a sentence into its equivalent mobile numeric keypad sequence.
 *
 * For each character, store the sequence which should be obtained at its respective position in an array, i.e. for Z, store 9999. For Y, store 999. For K, store 55 and so on.
 * For each character, subtract ASCII value of ‘A’ and obtain the position in the array pointed
 * by that character and add the sequence stored in that array to a string.
 * If the character is a space, store 0
 * Print the overall sequence.
 * Below is the implementation of above method :
 */
public class SentenceNumericKeyBoard {
}
