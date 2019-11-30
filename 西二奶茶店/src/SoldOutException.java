import java.util.ArrayList;
import java.util.Calendar;

public class SoldOutException {
    public boolean exam(Calendar calendar,Ingredient ingredient, ArrayList<Bubble> bubbleArrayList,ArrayList<Coconut> coconutArrayList)
    {
        if (ingredient instanceof Bubble){
            calendar.add(calendar.DAY_OF_MONTH,-((Bubble) ingredient).getExpdate());
            if (((Bubble) ingredient).getC().before(calendar) ){
                System.out.println("珍珠已过期，不能使用");
                bubbleArrayList.remove(bubbleArrayList.size()-1);
                return false;
            }
            else
            {
                System.out.println("珍珠奶茶已做好，放心食用");
                bubbleArrayList.remove(bubbleArrayList.size()-1);
            }
        }
        else if (ingredient instanceof Coconut){
            calendar.add(calendar.DAY_OF_MONTH,-((Coconut) ingredient).getExpdate());
            if (((Coconut) ingredient).getC().before(calendar) ){
                System.out.println("椰果已过期，不能使用");
                coconutArrayList.remove(coconutArrayList.size()-1);
                return false;
            }
            else
            {
                System.out.println("椰果奶茶已做好，放心食用");
                coconutArrayList.remove(coconutArrayList.size()-1);
            }
        }
        return true;
    }

}
