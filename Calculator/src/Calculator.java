public class Calculator {


    public int sum(int... values) {
        return values[0];
    }

    public double addingNumbers(double... values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double substractingNumbers(double... values) {
        double substractionResoult = values[0];
        for (int i = 1; i < values.length; i++) {

            substractionResoult -= values[i];
        }
        return substractionResoult;
    }

    public double multipliingNumbers(double... values){
        double multiplyingResoult = 1;
        for (int i =0; i < values.length; i++){
            multiplyingResoult *= values[i];
        }
        return multiplyingResoult;
    }

    public double dividingNumbers(double... values){
        double dividingResoult = values[0];
        for (int i =1; i < values.length; i++){
            dividingResoult /= values[i];
        }
        return dividingResoult;
    }

}
