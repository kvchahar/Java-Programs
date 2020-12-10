package exercise;

public class Exercise1 {
    private static final int OFFSET = 1;

    public static void main(String[] args) {
        int[] numbers = {22, 1, 96, 24};
        int index = getRandomIndex(numbers);
        try {
            display(numbers, index);
        } catch (ArrayIndexOutOfBoundsException exception) {
            display(numbers, index - 1);
        }
    }

    private static void display(int[] numbers, int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Number at index (" + index + ") is " + numbers[index]);
    }

    private static int getRandomIndex(int[] numbers) {
        return (int) (Math.random() * numbers.length + OFFSET);
    }
}
