package org.studentrnd.clear.api;

import org.json.JSONObject;

import flexjson.JSON;

/**
 * Created by tj on 2/21/15.
 */
public class Event {
    public String id = "q01pkMQc0dwb";
    public String name = "CodeDay Seattle Fall 2014";
    @JSON(name = "region_name")
    public String regionName = "Seattle";
    public String webname = "seattle";
    @JSON(name = "starts_at")
    public String startsAt = "1415476800";
    @JSON(name = "ends_at")
    public String endsAt = "1415563200";
    public Venue venue = new Venue();
    public User manager = new User();
    public User evangelist = new User();
    @JSON(name = "registration_info")
    public JSONObject registrationInfo = new JSONObject();
    @JSON(name = "emergency_phone")
    public String emergencyPhone = "15551231234";
    public String waiver = null;
    @JSON(name = "stripe_public_key")
    public String stripePublicKey = "pk_dSWdf9Dxb8nrKUroTF0kHrwNoSNor";
    @JSON(name = "is_early_bird_pricing")
    public Boolean isEarlyBirdPricing = true;
    public JSONObject schedule = new JSONObject();
    public JSONObject sponsors = new JSONObject();
    @JSON(name = "custom_css")
    public String customCss = "";
    public String cost = "";
    public String notice = null;
    public Region region = new Region();
    public Batch batch = new Batch();
    @JSON(name = "overflow_event")
    public Event overflowEvent = null;

}
