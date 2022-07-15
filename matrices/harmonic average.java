class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (double number : numbers) {
            double a = 1 / number;
            sum += a;


        }

        System.out.println(numbers.length/sum);

    }
}