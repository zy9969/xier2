import java.util.Calendar;

abstract class Ingredient {
    protected String name;
    protected int expdate;//保质期
    protected Calendar c;

    public abstract void setName(String name);
    public abstract void setExpdate(int expdate);
    public void setC(Calendar c) {
        this.c=c;
    }
    @Override
    public abstract String toString();
}
