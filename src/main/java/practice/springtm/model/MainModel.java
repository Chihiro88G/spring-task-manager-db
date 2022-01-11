package practice.springtm.model;

import java.util.ArrayList;
import java.util.List;

public class MainModel {

    public List<String> nullToEmptyString(String value1, String value2, String value3, String value4, String value5){
        
        // Put parameter values into a list
        List<String> listForVc = new ArrayList<String>();
        listForVc.add(value1);
        listForVc.add(value2);
        listForVc.add(value3);
        listForVc.add(value4);
        listForVc.add(value5);

        // If there is null, change it into empty string
        for (String value : listForVc) {
            if(value == null){
                value = "";
                listForVc.add(value);
            }
        }    
        return listForVc;
    }

    public List<String> saveData(List<String> inputList){

        List<String> listAgain = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            listAgain.add(inputList.get(i));        
        }
        return listAgain;
    }
}
