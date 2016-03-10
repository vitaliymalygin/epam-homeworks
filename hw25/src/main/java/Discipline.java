import java.util.ArrayList;

/**
 * Created by vitaliy on 08.03.16.
 */
public enum Discipline
{
    MATH, LITERATURE, PHYSICS, INFORMATICS, ENGLISH, RUSSIAN;



    private  ArrayList<Integer> integerValues;
    private  ArrayList<Float> floatValues;
    Discipline(){
        floatValues=new ArrayList<>();
        integerValues=new ArrayList<>();
    }
    //Как дисциплина должна определять, вещественные или целые значения должны в ней быть?

    public void setIntValue(int intValue){
        integerValues.add(intValue);
    }
    public void setFloatValue(float floatValue){
        floatValues.add(floatValue);
    }
    public ArrayList<Integer> getIntegerValues() {
        return integerValues;
    }
    public ArrayList<Float> getFloatValues() {
        return floatValues;
    }


}
