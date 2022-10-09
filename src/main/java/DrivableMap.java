/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    public boolean addDrivable(String key, Drivable value)   {
        if (!drivable_map.containsKey(key))  {
            drivable_map.put(key, value);
            return true;
        }
        return false;
    }



    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        for ( String key : drivable_map.keySet())   {
            Drivable value = drivable_map.get(key);
            if ( value.getMaxSpeed() >= speed)
                return true;
        }
        return false;
    }




    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public ArrayList<Tradable> getTradable()   {
        ArrayList<Tradable> ar1 = new ArrayList<Tradable>();
        for (String key : drivable_map.keySet())    {
            Drivable value = drivable_map.get(key);
            if (value instanceof Tradable)  {
                ar1.add((Tradable) value);
            }
        }
        return ar1;
    }


    
}