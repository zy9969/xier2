import java.util.Calendar;

public interface shop {
    public static void input(Ingredient ingredient)
    {
        if (ingredient instanceof Bubble)
            Teashop.bubbleArrayList.add((Bubble) ingredient);
        else if (ingredient instanceof Coconut)
            Teashop.coconutArrayList.add((Coconut)ingredient);
    };

    static void sell(MilkTea milkTea, Ingredient ingredient, Calendar calendar) {

    }
}
