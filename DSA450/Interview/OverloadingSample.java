package Interview;

public class OverloadingSample {

    String getDetails(){

        return "";
    };

//    String getDetails(String input1){
//
//        System.out.println(input1);
//        return input1;
//    };

    String getDetails(String input1,String input2){

        return "";
    };

    String getDetails(String input1){

        return "retuning Obj";
    };

    String getDetails(Integer input1){

        System.out.println("Integer");
        return "retuning Obj";
    };

    public static void main(String args[]){

        OverloadingSample internalObj = new OverloadingSample();

        internalObj.getDetails("null");

    }






}
