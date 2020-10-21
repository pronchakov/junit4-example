package edu.transform;

public class Transformer {

    public Long transform(String num) {
        double d = Double.parseDouble(num);
        if (d % 1 == 0) {
            return (long) d;
        } else {
            throw new RuntimeException();
        }
//        return (long) Double.parseDouble(num);
    }

}
