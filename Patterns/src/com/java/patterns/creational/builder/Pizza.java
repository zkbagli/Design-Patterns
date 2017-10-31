package com.java.patterns.creational.builder;

public class Pizza {
    private final int size;
    private final boolean paperoni;
    private final boolean cheese;
    private final boolean bacon;

    private Pizza(final Builder builder) {
        this.size = builder.size;
        this.paperoni = builder.paperoni;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza:\n" + "\tsize=" + this.size + "\n\tpaperone=" + this.paperoni + "\n\tcheese=" + this.cheese + "\n\tbacon=" + this.bacon;
    }

    public static class Builder {
        // required
        private final int size;

        // optional
        private boolean paperoni;
        private boolean cheese;
        private boolean bacon;

        public Builder(final int size) {
            this.size = size;
        }

        public Builder paperoni(final boolean value) {
            this.paperoni = value;
            return this;
        }

        public Builder cheese(final boolean value) {
            this.cheese = value;
            return this;
        }

        public Builder bacon(final boolean value) {
            this.bacon = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
