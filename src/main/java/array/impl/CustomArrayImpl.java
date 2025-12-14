package array.impl;

import array.CustomArray;
import observer.CustomObservable;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class CustomArrayImpl implements CustomArray, CustomObservable {

    private final UUID id;
    private int currentSize;
    private int[] numbers;

    private CustomArrayImpl(Builder builder){
        this.id = builder.id;
        this.numbers = builder.numbers;
        this.currentSize = builder.currentSize;
    }

    @Override
    public CustomArrayImpl addNumber(int number) {
        int[] new_numbers = Arrays.copyOf(numbers, currentSize + 1);
        new_numbers[currentSize++] = number;
        numbers = new_numbers;
        return this;
    }

    @Override
    public CustomArrayImpl deleteNumber(int position) {
        if (position < currentSize) {
            for (int i = position; i < currentSize - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            currentSize--;
        }
        return this;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public int getNumber(int position) {
        return numbers[position];
    }

    @Override
    public int[] getNumbers() {
        return Arrays.copyOf(this.numbers, currentSize);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CustomArrayImpl that = (CustomArrayImpl) obj;

        if (!id.equals(that.id)) return false;
        if (currentSize != that.currentSize) return false;

        return Arrays.equals(numbers, 0, currentSize,
                that.numbers, 0, that.currentSize);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, currentSize);

        for (int i = 0; i < currentSize; i++) {
            result = 31 * result + numbers[i];
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder performance = new StringBuilder(id.toString()
                + "\n");
        for (int i = 0; i < currentSize; i++) {
            performance.append(numbers[i]).append(" ");
        }
        return performance.toString();
    }

    public static class Builder {

        private static final int MAX_SIZE = 100;
        private UUID id = UUID.fromString("00000000-0000-0000-0000-000000000000");
        private int currentSize = 0;
        private int[] numbers = new int[MAX_SIZE];

        public Builder setNumbers(int[] numbers) {
            this.currentSize = numbers.length;
            this.numbers = numbers;
            return this;
        }

        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public CustomArrayImpl build(){
            return new CustomArrayImpl(this);
        }

    }

}
