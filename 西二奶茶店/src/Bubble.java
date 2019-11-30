import java.util.Calendar;
public class Bubble extends Ingredient{
    protected int expdate=7;
    protected String name="Bubble";

    public Bubble(int expdate, String name) {
        this.expdate = expdate;
        this.name = name;
    }
    public Bubble(){}

    @Override
    public void setName(String n ) {
        this.name=n;
    }
    public String getName() {
        return this.name;
    }

    public int getExpdate() {
        return this.expdate;
    }
    public void setExpdate(int x) {
        this.expdate=x;
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
