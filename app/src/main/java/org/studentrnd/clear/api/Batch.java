package org.studentrnd.clear.api;

import java.util.ArrayList;
import java.util.List;

import flexjson.JSON;

/**
 * Created by tj on 2/21/15.
 */
public class Batch {
    public String id = "toaehnaoteh";
    public String name = "Winter 2015";
    @JSON(name = "starts_at")
    public String startsAt = "2014-11-08";
    @JSON(name = "ends_at")
    public String endsAt = "2014-11-09";
    @JSON(name = "is_loaded")
    public Boolean isLoaded = false;
    public List events = new ArrayList<Event>();
}
