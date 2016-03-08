import java.util.ArrayList;

/**
 * Created by vitaliy on 08.03.16.
 */
public enum Discipline
{
    MATH, LITERATURE, PHYSICS, INFORMATICS, ENGLISH, RUSSIAN;



    private ArrayList<Integer> integerValues;
    private ArrayList<Float> floatValues;

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
