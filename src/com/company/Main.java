package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String fcla = args[0];
        String scla = args[1];

        // finding index of where the element begins
        int index_sec = fcla.indexOf(scla);
        // select the characters from where the element starts to where it ends
        String toReplace = fcla.substring(index_sec, (fcla.length() - 1 - index_sec));
        // replace the element for " "
        String replaced = toReplace.replace(scla, " ");

        System.out.println(replaced);

        // trying to get rid of the spaces

        // I have to create a StringBuffer to use the .delete method to delete the spaces in the beginning and end
        StringBuffer last = new StringBuffer();
        last.append(replaced);

        if (last.substring(0, 1).equals(" "))
            last.delete(0, 1);

        int lLength = last.length();

        if (last.substring(lLength - 2, lLength - 1).equals(" "))
            last.delete(lLength - 2, lLength - 1);

        System.out.println(last);

        // trying to get rid of double spaces

        // finding th index of where the double space begins
        int dbspace = last.indexOf("  ");

        // selecting the part of the double space, replacing it and printing
        last.replace(dbspace, dbspace + 2, " ");
        System.out.println(last);




    }
}
