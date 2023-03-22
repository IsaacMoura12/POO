package utils;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


// Enumeração e Descrição das Funções: (TODO)


public class User_input {


    // validações testadas por verdade (se condição se verifica sai do ciclo)
        private static Scanner sc = new Scanner(System.in);

        // read double:
        public static double readDouble(String msg){
            double v;
            while(true) {
                System.out.print(msg);
                v = Double.parseDouble(sc.nextLine());
                if (v > 0) break;
                System.err.println("TEM DE SER POSITIVO!");


            }
            return v;
        }

        public static int readInt(String msg){
            int v;
            while(true) {
                System.out.print(msg);
                v = Integer.parseInt(sc.nextLine());
                if (v > 0) break;
                System.err.println("TEM DE SER POSITIVO!");
            }
            return v;
        }

    
    // input intervalo double
    public static double input_interval(String msg, double min, double max) {
        double v;
        while(true){
            System.out.print(msg);
            v = Double.parseDouble(sc.nextLine());
            if ( v >= min && v <= max) break;
            System.err.println("TEM DE ESTAR NO INTERVALO!!");

        }
        return v;
    }

    // input intervalo int
    public static int input_interval_int(String msg, int min, int max) {
        int v;
        while(true){
            System.out.print(msg);
            v = Integer.parseInt(sc.nextLine());
            if ( v >= min && v <= max) break;
            System.err.println("TEM DE ESTAR NO INTERVALO!!");

        }
        return v;
    }

    // input min com multiplo
    public static double input_mul(String msg, double min, double mul) {
        double v;
        
        while(true){
            System.out.print(msg);
            v = Double.parseDouble(sc.nextLine());
            if(v%mul==0 && v >0)break; 
            System.err.println("TEM DE SER MÚLTIPLO DE:" + mul);
        
        }
        return v;
    }

    // input string 
    public static String input_str(String msg){
        String v;
        while(true){
            System.out.print(msg);
            v = sc.nextLine();
            if(v.isEmpty()== false) break;
                System.out.println("String Vazia!");
        }
        return v;
    }

    // contador de numeros numa string
    public static int countDigits(String s){
        int count = 0;
        for (int i = 0; i <= s.length()-1; i++) {
            if (Character.isDigit(s.charAt(i)))
                count = count +1;
        }
        return count;
    }


    // contador de espaços numa String
    public static int countSpaces(String s){
        int count = 0;
        String tmp = s;
        char ch[] = tmp.toCharArray();
        for (int i = 0; i <= ch.length-1; i++) {
            if(ch[i] == ' ')
            count = count +1;
        }
        return count;
    }

    //verifica se String só tem minúsculas
    public static boolean is_allLower(String s){
        boolean status;
        int count = 0;
        String tmp = s;
        char ch[] = tmp.toCharArray();
        for (int i = 0; i <= ch.length-1; i++) {
            if(Character.isUpperCase(ch[i]))
            count = count +1;
        }
        if(count>0){
            status = false;

        }else{
            status = true;
        }
        return status;
    }


    // verifica se String só tem maiúsculas
    public static boolean is_allUpper(String s){
        boolean status;
        int count = 0;
        String tmp = s;
        char ch[] = tmp.toCharArray();
        for (int i = 0; i <= ch.length-1; i++) {
            if(Character.isLowerCase(ch[i]))
            count = count +1;
        }
        if(count>0){
            status = false;

        }else{
            status = true;
        }
        return status;
    }

    // junta os espaços numa String
    public static String removeSpaces(String s){
        String new_s = s.replace(" ", "");
        return new_s;
    }

    // verifica se String é Palindromo
    public static boolean isPalindrome(String s){
        String s_reverse = "";
        for (int i = s.length()-1; i >= 0; i--) {
            s_reverse = s_reverse + s.charAt(i);   
        }
        if(s.toLowerCase().equals(s_reverse.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }

    // transforma string em Acronimo
    public static String toAcronym(String s){
        String tmp = "";
        String[] splited = s.split(" ");
        for (int i = 0; i <= splited.length-1; i++) {
            String a = splited[i];
            int b = a.length();
            

            if(b>3){
                String inicial = splited[i].substring(0,1);
                tmp = tmp+inicial;
            }
        }
        String acr = tmp.toUpperCase();
        return acr;

    }



    public static boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
   
    public static boolean isTelemovelPT(int tel){
        String tmp = String.valueOf(tel);
        char first = tmp.charAt(0);
        if(tmp.length() == 9){
            if(first == '9'){
                return true;
            }
        }
        return false;
    }


    // manipulação de datas (DateYMD)
    public static boolean validDateYMD(int day, int month, int year){
        if(year<= 0) return false;
        if(month< 1 || month>12) return false;
        if(day< 1 || day > monthDaysYMD(month, year)) return false;
        return true;
    }

    public static boolean isLeapYearYMD(int year){
        return ((year%4==0) && (year % 100 != 0)) || (year % 400 ==0);
    }

    public static int monthDaysYMD(int month, int year){
        if(month == 2){
            if(isLeapYearYMD(year)){
                return 29;
            }else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
                return 30;
        } else {
            return 31;
        }
    }
    



    



}
