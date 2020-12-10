package generics;

class Statistics<T extends Number> {
    private T[] numbers;

    public Statistics(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers.clone();
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index].doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean compareAverages(Statistics<? extends Double> statistics) {
        return this.calculateAverage() == statistics.calculateAverage();
    }
}

class Main5 {
    public static void main(String[] args) {
        Integer[] integerNumbers = {1, 2, 3, 4, 5, 6};
        Statistics<Integer> integerStatistics =
                new Statistics<>(integerNumbers);
        System.out.println(integerStatistics.calculateAverage());
        Double[] doubleNumbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Statistics<Double> doubleStatistics =
                new Statistics<>(doubleNumbers);
        System.out.println(doubleStatistics.calculateAverage());
        if (integerStatistics.compareAverages(doubleStatistics)) {
        }
    }
}
