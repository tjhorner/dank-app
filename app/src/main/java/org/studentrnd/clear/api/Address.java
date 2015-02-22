package org.studentrnd.clear.api;

import flexjson.JSON;

/**
 * Created by tj on 2/21/15.
 */
public class Address {
    @JSON(name = "line_1")
    public String line1 = "";
    @JSON(name = "line_2")
    public String line2 = "";
    public String city = "";
    public String state = "";
    public String postal = "";
    public String country = "";
}
