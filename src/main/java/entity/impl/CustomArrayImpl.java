package entity.impl;

import java.util.Arrays;
import java.util.UUID;

public class CustomArrayImpl implements entity.CustomArray {

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
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
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
