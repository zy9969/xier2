import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Teashop implements shop
{
    static ArrayList<Bubble> bubbleArrayList=new ArrayList<>();
    static ArrayList<Coconut> coconutArrayList=new ArrayList<>();
    public static void sell(MilkTea milkTea, Ingredient ingredient, Calendar calendar) {
        SoldOutException exception=new SoldOutException();
        if(exception.exam(calendar,ingredient,bubbleArrayList,coconutArrayList)==true)
            System.out.println(milkTea.toString());
    }

    public static void main(String[] args) {
        //-----------------------------------静态---------------------------------
        Calendar c=Calendar.getInstance();
        ArrayList<MilkTea> milkTeaArrayList=new ArrayList<>();
        Bubble bubble1=new Bubble();
        Bubble bubble2=new Bubble();
        Coconut coconut1=new Coconut();
        Coconut coconut2=new Coconut();
        shop.input(bubble1);
        shop.input(bubble2);
        shop.input(coconut1);
        shop.input(coconut2);
        bubble1.setC(c);
        coconut1.setC(c);
        Calendar d=Calendar.getInstance();
        d.set(1900,1,1);
        bubble2.setC(d);
        coconut2.setC(d);
        MilkTea milkTea1=new MilkTea("珍珠奶茶1",bubble1);
        MilkTea milkTea2=new MilkTea("珍珠奶茶2",bubble2);
        MilkTea milkTea3=new MilkTea("椰果奶茶1",coconut1);
        MilkTea milkTea4=new MilkTea("椰果奶茶2",coconut2);
        milkTeaArrayList.add(milkTea1);
        milkTeaArrayList.add(milkTea2);
        milkTeaArrayList.add(milkTea3);
        milkTeaArrayList.add(milkTea4);
        Calendar now =Calendar.getInstance();
        sell(milkTea1,milkTea1.getIngredient(),now);
        sell(milkTea2,milkTea2.getIngredient(),now);
        sell(milkTea3,milkTea3.getIngredient(),now);
//------------------------------------------------------------------动态输入
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            c.set(in.nextInt(),in.nextInt(),in.nextInt());//输入生产日期
            if(in.next()=="Bubble")
            {
                Bubble b=new Bubble();
                b.setC(c);
                shop.input(b);
            }
            else if(in.next()=="Coconut")
            {
                Coconut coconut=new Coconut();
                coconut.setC(c);
                shop.input(coconut);
            }
        }
        System.out.println("配料进货完成");
        //-----------------------------------------------------配料已进货完成
        Teashop teashop=new Teashop();
        if(in.next()=="Bubblemilk") {
            MilkTea milkTea01= new MilkTea("珍珠奶茶A",bubbleArrayList.get(bubbleArrayList.size()-1));
            Calendar cc=Calendar.getInstance();
            teashop.sell(milkTea01,milkTea01.getIngredient(),cc);
        }
        if(in.next()=="Coconutmilk") {
            MilkTea milkTea02= new MilkTea("椰果奶茶A",bubbleArrayList.get(bubbleArrayList.size()-1));
            Calendar cc=Calendar.getInstance();
            teashop.sell(milkTea02,milkTea02.getIngredient(),cc);
        }
    }
}
