package com.vladsimonenko.algorithms.strings;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        System.out.println(new ExcelSheetColumnTitle().convertToTitle(
                701
        ));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();


        while (columnNumber != 0) {
            int remainder = columnNumber % 26;

            char toInsert = (char) ('A' + remainder - 1);
            if (remainder == 0) {
                toInsert = 'Z';
                columnNumber--;
            }

            sb.insert(0,toInsert);

            columnNumber /= 26;

        }

        return sb.toString();
    }
}
