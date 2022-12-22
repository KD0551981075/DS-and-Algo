package Interview;


public class childClass implements SampleClass
{


    @Override
    public String getInternalDetails() {
        return null;
    }

    public static void main(String args[]){

       SampleClass sample = ()->{

           return "";
        };

        sample.getInternalDetails();
    }
}