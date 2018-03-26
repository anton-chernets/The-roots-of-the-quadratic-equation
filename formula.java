/**
 * Function for economical calculation of the roots of the quadratic equation
 *
 * @author Anton Chernets
 */
 
public static double[] quadraticEquation(double a, double b, double c) {

        double squareRoot[];
        double d;
        
        d = b * b - 4 * a * c;
        
        if (d > 0) {
        
            squareRoot = new double[2];
            squareRoot[0] = (-b - Math.sqrt(d)) / (2 * a);
            squareRoot[1] = (-b + Math.sqrt(d)) / (2 * a);
            return squareRoot;
        } else if (d == 0) {
        
            squareRoot = new double[1];
            squareRoot[0] = -b / (2 * a);
            return squareRoot;
        } else {
        
            squareRoot = new double[0];
            return squareRoot;
        }
    }
}
