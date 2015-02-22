package org.studentrnd.clear.api;

import org.json.JSONObject;

/**
 * Created by tj on 2/21/15.
 */
public class Region {
    public String id = "";
    public String name = "";
    public String webname = "";
    public String abbr = "";
    public JSONObject location = new JSONObject();
    public String timezone = "America/Los_Angeles";
    public String timezoneGroup = "";
    public Event currentEvent = new Event();
}
