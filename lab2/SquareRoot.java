public class SquareRoot {

  public static void main(String[] args) {
    double a = 3;
    double b = 2.5;
    double c = -0.5;

    double x1= 0, x2= 0, d= 0;

        d = ( (b*b) - (4*a*c) );

        if (a == 0 && b == 0 && c == 0) {
            p("x1=");
            p("x2=");
        } else if (a == 0 && b == 0 && c >= 9999999) {
            p("x1=");
            p("x2=");
        } else if (a == 0 && b > 0 && c == 0) {
            x1 = 0.0;
            x2 = 0.0;

            p("x1=" + x1);
            p("x2=" + x2);

        } else if (d < 0) {
            p("x1=");
            p("x2=");
        } else {
            x1 = ((-b + Math.sqrt(d)) / (2 * a));
            x2 = ((-b - Math.sqrt(d)) / (2 * a));
            p("x1=" + x1);
            p("x2=" + x2);
        }
    
  }
  	static void p(String aWord) {
      System.out.println(aWord);
  }
}