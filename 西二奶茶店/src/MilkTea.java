public class MilkTea {
    private String name;
    private Ingredient ingredient;

    public MilkTea(String name, Ingredient ingredient) {
        this.name = name;
        this.ingredient = ingredient;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        if (ingredient instanceof Bubble)
        {
            return "BubbleMilkTea{" + "name='" + name + '\'' + ", ingredient='" + ingredient.toString();
        }
        else if (ingredient instanceof Coconut)
        {
            return "CoconutMilkTea{" + "name='" + name + '\'' + ", ingredient='" + ingredient.toString();
        }
        return "Error";
    }
}
