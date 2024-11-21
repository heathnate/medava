package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;

public class Transporter {
    // Instance initializer
    {
        goods = new ArrayList<Medicine>();
    }

    private String mTransporterName;
    public List<Medicine> goods;
    

    public String getTransporterName() {
        return mTransporterName;
    }

    public void ship() {
        // Do some shipping!
      }
}