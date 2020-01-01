package tluck.raj.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class beerExpert {

    List<String> getBrands(String color){

        List<String> brands =new ArrayList<String>();

        if(color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");

        }else{
            brands.add("Jail pale ale");
            brands.add("Gaout stout");

        }

        return brands;



    }




}
