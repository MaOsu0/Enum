package Zadanie11;

public enum Pizza {

    MARGHERITA("sos pomidorowy", "ser"),
    CAPRICIOSA("sos pomidorowy", "ser", "pieczarki"),
    PROSCIUTTO("sos pomidorowy", "ser", "szynka");

    String ingredient;
    String ingredient1;
    String ingredient2;

    Pizza(String ingredient, String ingredient1) {
        this.ingredient = ingredient;
        this.ingredient1 = ingredient1;
    }

    Pizza(String ingredient, String ingredient1, String ingredient2) {
        this.ingredient = ingredient;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    public static void getPizzas() {
        Pizza[] values = Pizza.values();
        for (Pizza value : values) {
            System.out.println(value.toString());
        }
    }

    @Override
    public String toString() {
        if (ingredient2 == null) {
            return name() + " posiada składniki " + ingredient + " i " + ingredient1;
        } else {
            return name() + " posiada składniki " + ingredient + ", " + ingredient1 + " i "
                    + ingredient2;
        }
    }
}
