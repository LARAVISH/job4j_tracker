package ru.job4j.set;



public class Isogram {

        public static boolean checkString(String s){

            for (int i = 0; i < s.length(); i++) {
                for (int j = i+ 1; j <s.length() ; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                            return false;

                    }
                }

            }

            return true;
        }
}
