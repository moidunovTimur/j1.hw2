public class Main {
    public static void main(String[] args) {
        System.out.println(Stedent(20,28));
        System.out.println(Stedent(25,-30));
        System.out.println(Stedent(30,20));
        System.out.println(Stedent(15,25));
        System.out.println(Stedent(29,15));

    }

    private static String Stedent(int age ,int temperature) {
        String home =("можно идти гулять");
        String home1 =("home");
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35){
            return home;
        }else if (age < 20 && temperature >= 0 && temperature <= 28 ){
            return home;
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            return home;
            //gg
        }else
            return home1;
    }
}