package org.qsoft.tdd;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/4/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {

    private static String processString(String numbers) {
//        System.out.println("   beforProcessString:" + numbers);

        numbers = numbers.replace("\n", ",").replace("!",",").replace("~", ",").replace("@", ",").replace("#", ",").replace("$", ",").replace("%", ",").replace("^", ",").replace("&", ",").replace("*", ",").replace("(", ",").replace(")", ",").replace("_", ",").replace("+", ",").replace("=", ",").replace(">", ",").replace("/", ",").replace("?", ",").replace(";", ",").replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",").replace("`", ",").replace(",", ",").replace(".", ",").replace("<", ",").replace("^", ",").replace("&", ",").replace("*", ",").replace("(", ",").replace(")", ",").replace("_", ",").replace("+", ",").replace("=", ",");

//        System.out.println("   afterProcessString:" + numbers);

//        numbers = numbers.replace("!", ",");
//        numbers = numbers.replace("~", ",");
//        numbers = numbers.replace("@", ",");
//        numbers = numbers.replace("#", ",");
//        numbers = numbers.replace("$", ",");
//        numbers = numbers.replace("%", ",");
//        numbers = numbers.replace("^", ",").replace("&", ",").replace("*", ",").replace("(", ",").replace(")", ",").replace("_", ",").replace("+", ",").replace("=", ",");
//        numbers = numbers.replace("&", ",");
//        numbers = numbers.replace("*", ",");
//        numbers = numbers.replace("(", ",");
//        numbers = numbers.replace(")", ",");
//        numbers = numbers.replace("_", ",");
//        numbers = numbers.replace("+", ",");
//        numbers = numbers.replace("=", ",");
//        numbers = numbers.replace("|", ",");
//        numbers = numbers.replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace(";", ",").replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("?", ",").replace(";", ",").replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace("/", ",").replace("?", ",").replace(";", ",").replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",");
//        numbers = numbers.replace(">", ",").replace("/", ",").replace("?", ",").replace(";", ",").replace(":", ",").replace("'", ",").replace("\"", ",").replace("[", ",").replace("{", ",").replace("]", ",").replace("}", ",").replace("\\", ",").replace("|", ",").replace("`", ",").replace(",", ",").replace(".", ",").replace("<", ",");
//        numbers = numbers.replace("<", ",");
//        numbers = numbers.replace(".", ",").replace("<", ",");
//        numbers = numbers.replace(",", ",").replace(".", ",").replace("<", ",");
//        numbers = numbers.replace("`", ",").replace(",", ",").replace(".", ",").replace("<", ",");

        return numbers;
    }

    public static int methodAdd(String numbers) throws Exception {
        int numberReturn = 0;
        if (numbers == null || numbers.equals("")) {
            numberReturn = 0;
        } else {
            numbers = processString(numbers);
            String[] arrayString = numbers.split(",");
            int index = arrayString.length;
            for (int i = 0; i < index; i++) {
                if (!arrayString[i].equals("")) {
                    int intAdd = Integer.valueOf(arrayString[i]);
                    if (intAdd < 0) {
                        System.out.println();
                        throw new Exception("Negatives not allowed");
                    }
                    if (intAdd < 1000) {
                        numberReturn += intAdd;
                    }
                }
            }
        }
        return numberReturn;
    }
}
