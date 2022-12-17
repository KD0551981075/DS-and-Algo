package array;

public class SingleTonClass {

   private static SingleTonClass singleTonClass ;
    private SingleTonClass(){}

    public static SingleTonClass getSingleTonClassInstance()
    {
        singleTonClass = new SingleTonClass();
        return singleTonClass;
    }
 }
