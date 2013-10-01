package expr;

import java.io.IOException;

public class TestExpr {
    public static void main(String[] args) {
        ExprParser parser = new ExprParser();
        try {
            Expr expr = parser.build("1+1*3-1/2+2");
            System.out.println(expr.getClass().toString());
            System.out.println(expr);
            System.out.println(expr.value(null));
           
            Expr B1 = new Variable("Hejsan");
            expr = parser.build("A1*B1");
            System.out.println(expr.getClass().toString());
            Environment env = new Environment() {
                public double value(String name) {
                    if (name.equals("A3"))
                        return 1;
                    if (name.equals("A2"))
                        return 2;
                    if (name.equals("A1"))
                        return 3;
                    System.out.println(name + " is undefined");
                    return 0;
                }
            };
            System.out.println(expr);
            System.out.println(expr.value(env));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}