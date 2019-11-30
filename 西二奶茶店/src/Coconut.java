import java.util.Calendar;
public class Coconut extends Ingredient{
    protected int expdate=5;
    protected String name="Coconut";
    @Override
    public void setName(String n ) {
        this.name=n;
    }

    public String getName() {
        return "Coconut";
    }

    public int getExpdate() {
        return this.expdate;
    }

    @Override
    public void setExpdate(int expdate) {
        this.expdate=expdate;
    }

    public Calendar getC() {
        return this.c;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", 保质期：" + expdate +
                ", 生产日期：" + c +
                '}';
    }
}
