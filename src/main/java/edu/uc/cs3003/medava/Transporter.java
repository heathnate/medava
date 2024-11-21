package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;

public class Transporter {
    private String mTransporterName;
    private List<Medicine> goods;
    private double mLowTemperature, mHighTemperature;

    // Instance initializer
    {
        goods = new ArrayList<Medicine>();
    }

    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    public String getTransporterName() {
        return mTransporterName;
    }

    public boolean load(Medicine itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    public Medicine unload() {
        return goods.remove(0);
    }
    public boolean isEmpty() {
        return goods.isEmpty();
    }

    public void ship() {
        // Do some shipping!
      }
}