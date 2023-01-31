package study;

public class Calculator {

    public Calculator() { }

    public int input(String value) {
        String[] values = value.split(" ");
        return cal(values);
    }

    private int cal(String[] values) {

        int output = 0;
        int number = 0;
        for(int idx = 0; idx<values.length; idx++) {
            String value = values[idx];
            if(idx == 0) {
                output = Integer.parseInt(value);
                continue;
            }

            if(idx < values.length && !isNumber(value)) {
                number = Integer.parseInt(values[idx + 1]);
            }

            switch (value) {
                case "+" :
                    output = sum(output, number);
                    break;
                case "-" :
                    output = minus(output, number);
                    break;
                case "*" :
                    output = multiply(output, number);
                    break;
                case "/" :
                    output = division(output, number);
                    break;
            }
        }

        return output;
    }

    private boolean isNumber(String value) {

        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public int sum(int i, int j) {
        return i + j;
    }

    public int minus(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int division(int i, int j) {
        return i / j;
    }
}
