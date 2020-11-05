package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        Integer tValue = 0;
        Boolean expected = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                tValue += 1;
            } else {
                tValue += 0;
            }
        }

        if (tValue > 0) {
            expected = true;
        } else {
            expected = false;
        }

        return expected;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

    public static String[] reverse(String[] array) {

        Integer revIt = 0;
        String[] revArr = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            revArr[revIt] = array[i];
            revIt++;
        }

        return revArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        Integer palin = 0;

        for (int i = 0; i <= array.length / 2 && array.length != 0; i++) {
            if (array[i] != array[array.length - i - 1]) {
                palin = 1;
                break;
            }
        }

        if (palin == 1) {
            return false;
        }else {
            return true;
        }

    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        boolean panTrueFalse = false;
        Integer panCount = 0;
        String joined2 = String.join("", array).toLowerCase();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String alphaNew : alphabet)
            if (joined2.contains(alphaNew)) {

            } else {
                panCount += 1;
            }

        if (panCount > 0) {
            panTrueFalse = false;
        } else {
            panTrueFalse = true;
        }

        return panTrueFalse;
    }




    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        Integer iterateOccur = 0;

            for (int i = 0; i < array.length; i++) {
                if (value.equals(array[i])) {
                    iterateOccur += 1;
                } else {
                    iterateOccur += 0;
                }
            }
        return iterateOccur;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String[] removeArr = new String[array.length - 1];
        Integer remVal = 0;

        for (int i = 0; i < array.length; i++) {
            if (valueToRemove.equals(array[i])) {

            } else {
                removeArr[remVal] = array[i];
                remVal++;
            }
        }
        return removeArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String remStr = "";

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || !array[i].equals(array[i - 1])) {
                remStr += array[i] + " ";
            }
        }

        String[] remArr = remStr.split(" ");

        return remArr;
    }
    //

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String packStr = "";

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                packStr += array[i];
            } else if (array[i] == array[i - 1]) {
                packStr += array[i];
            } else {
                packStr += " " + array[i];
            }
        }

        String[] packArr = packStr.split(" ");

        return packArr;
    }
}
