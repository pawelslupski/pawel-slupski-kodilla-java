package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if (bun.equals("SESAME") || bun.equals("NO SESAME")) {
                this.bun = bun;
                } else {
                    throw new IllegalStateException("Type of bun should be SESAME or NO SESAME");
                }
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauce.equals("BARBECUE") || sauce.equals("100 ISLANDS") || sauce.equals("STANDARD")) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Type of sauce should be BARBECUE, 100 ISLANDS OR STANDARD");
            }
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            if (ingredient.equals("LETTUCE") || ingredient.equals("ONION") || ingredient.equals("CUCUMBER")
                    || ingredient.equals("BACON") || ingredient.equals("CHILI") || ingredient.equals("MUSHROOMS")
                    || ingredient.equals("PRAWNS") || ingredient.equals("CHEESE")) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Type of ingredient should be one of these: ONION, BACON, CUCUMBER, " +
                        "CHILI, MUSHROOMS, PRAWNS, CHEESE");
            }
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
