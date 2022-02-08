package Zadanie1;

public enum Pizza {
    MARGHERITA("Sos pomidorowy", "Ser"),
    CAPRICIOSA("Sos pomidorowy", "Ser", "pieczarki"),
    PROSCIUTTO("Sos pomidorowy", "ser", "szynka");

    private String ingredient;
    private String ingredient1;
    private String ingredient2;

    Pizza(String ingredient, String ingredient1) {
        this.ingredient = ingredient;
        this.ingredient1 = ingredient1;
    }

    Pizza(String ingredient, String ingredient1, String ingredient2) {
        this.ingredient = ingredient;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(String ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(String ingredient2) {
        this.ingredient2 = ingredient2;
    }



    @Override
    public String toString() {
        if (ingredient2 == null) {
            return name() + " " + ingredient + " " + ingredient1;
        } else {
            return name() + " " + ingredient + " " + ingredient1 + " " + ingredient2;
        }
    }
}
