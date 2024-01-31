package AltKlausur.RunlengthEncoding;

public class RunLenghEncuding {

    public static String encuding(String s){
        if (s.length() <= 2){
            String s1 = s;
            return s1;
        }
        else {
            int count =1;
            String encString = "" ;
            String encString1 = "" ;
            for (int i = 0 ; i< s.length()-1; i++){
                for(int j = i+1; j< s.length() ;j++)
                {
                    if (s.charAt(i)== s.charAt(j)){
                        count++;
                        i++;
                    }
                }

                encString1 = "Z"+count+ s.charAt(i);
                count=1;
                encString+=encString1;
            }
            return encString ;
        }
    }

    public static void main ( String[] args ){
        System.out.println(encuding("CCCAAABBBBBcc"));
    }
}
