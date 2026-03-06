package se.lexicon;

public class ConverterLogic {

    //Data Storage Logic

    public static double kbToMb(double kb) {
        return kb / 1024.0;
    }
    public static double mbToGb(double mb){
        return mb / 1024.0;
    }
    public static double gbToMb(double gb){
        return gb * 1024.0;
    }
    public static double mbToKb(double mb) {
        return mb * 1024.0;
    }

    //Length Logic
    public static double tokm(double m){
        return m / 1000.0;
    }
    public static double tom(double km){
        return km * 1000.0;
    }

    //BMI Logic
    public static double calculateBMI(double weigh, double height) {
        return weigh / (height * height);
    }

    //Weight Logic
    public static double tokg(double g){ return g / 1000.0; }
    public static double tog(double kg){ return kg * 1000.0; }
}

