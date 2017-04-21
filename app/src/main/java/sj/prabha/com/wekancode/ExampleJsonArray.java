package sj.prabha.com.wekancode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by prabha on 20/4/17.
 */

public class ExampleJsonArray {

    // TODO getting JsonArray Following List
    public static JSONArray getFollowingList() {
        JSONArray jsonArray = new JSONArray();
        try {
            JSONObject you1 = new JSONObject();
            JSONObject you2 = new JSONObject();
            JSONObject you3 = new JSONObject();
            JSONObject you4 = new JSONObject();
            JSONObject you5 = new JSONObject();
            JSONObject you6 = new JSONObject();

            you1.put("id", "1");
            you1.put("name", "Virat Kohli");
            you1.put("dateTime", "Today 10:10");
            you1.put("personStatus", "Liked 4 photos");
            you1.put("photoComment", "#good collections");
            you1.put("photoCouunt",4);
            you1.put("photo", R.drawable.elephant);

            you2.put("id", "2");
            you2.put("name", "AB de_villiers");
            you2.put("dateTime", "Yesterday 8:10");
            you2.put("personStatus", "good text");
            you2.put("photoComment", "#amazing");
            you2.put("photoCouunt",0);
            you2.put("photo", R.drawable.cat);

            you3.put("id", "3");
            you3.put("name", "buttler_eng");
            you3.put("dateTime", "Today 09:10");
            you3.put("personStatus", "Liked 1 photos");
            you3.put("photoComment", "#nice");
            you3.put("photoCouunt",1);
            you3.put("photo", R.drawable.lion);

            you4.put("id", "4");
            you4.put("name", "eion morgan");
            you4.put("dateTime", "Yesterday 8:10");
            you4.put("personStatus", "Liked 3 photos");
            you4.put("photoComment", "");
            you4.put("photoCouunt",4);
            you4.put("photo", R.drawable.myprofile);

            you5.put("id", "5");
            you5.put("name", "parthiv patel");
            you5.put("dateTime", "Today 8:10");
            you5.put("personStatus", "Liked 4 photos");
            you5.put("photoComment", "");
            you5.put("photoCouunt",0);
            you5.put("photo", R.drawable.pro_sj1);

            you6.put("id", "6");
            you6.put("name", "Samuel_badree");
            you6.put("dateTime", "Yesterday 8:10");
            you6.put("personStatus", "Liked 3 photos");
            you6.put("photoComment", "");
            you6.put("photoCouunt",1);
            you6.put("photo", R.drawable.myprofile);

            jsonArray.put(you1);
            jsonArray.put(you2);
            jsonArray.put(you3);
            jsonArray.put(you4);
            jsonArray.put(you5);
            jsonArray.put(you6);
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonArray;
    }
    // TODO getting JsonArray Following List
    public static JSONArray getYouList() {
        JSONArray jsonArray = new JSONArray();
        try {
            JSONObject you1 = new JSONObject();
            JSONObject you2 = new JSONObject();
            JSONObject you3 = new JSONObject();
            JSONObject you4 = new JSONObject();
            JSONObject you5 = new JSONObject();
            JSONObject you6 = new JSONObject();
            JSONObject you7 = new JSONObject();

            you1.put("id", "1");
            you1.put("name", "gautam_gambhir");
            you1.put("dateTime", "Today 10:10");
            you1.put("personStatus", "Started following You");
            you1.put("active", "N");
            you1.put("photoComment", "");
            you1.put("photo", R.drawable.pro_sj1);
            you1.put("likedImage", R.drawable.cat);

            you2.put("id", "2");
            you2.put("name", "Manish pandey");
            you2.put("dateTime", "Yesterday 6:10");
            you2.put("personStatus", "Liked your photo");
            you2.put("active", "Y");
            you2.put("photoComment", "good look!");
            you2.put("photo", R.drawable.myprofile);
            you2.put("likedImage", R.drawable.dog);

            you3.put("id", "3");
            you3.put("name", "Robin uthappa");
            you3.put("dateTime", "Yesterday 8:10");
            you3.put("personStatus", "Liked your photo");
            you3.put("active", "Y");
            you3.put("photoComment", "");
            you3.put("photo", R.drawable.cat);
            you3.put("likedImage", R.drawable.pro_sj1);

            you4.put("id", "4");
            you4.put("name", "Suryakumar_yadav");
            you4.put("dateTime", "Yesterday 8:10");
            you4.put("personStatus", "Liked your photo");
            you4.put("active", "Y");
            you4.put("photoComment", "nice move!");
            you4.put("photo", R.drawable.lion);
            you4.put("likedImage", R.drawable.elephant);

            you5.put("id", "5");
            you5.put("name", "Yusuf_pathan");
            you5.put("dateTime", "Yesterday 8:10");
            you5.put("personStatus", "Started following You");
            you5.put("active", "N");
            you5.put("photoComment", "");
            you5.put("photo", R.drawable.myprofile);
            you5.put("likedImage", 0);

            you6.put("id", "6");
            you6.put("name", "Ishank_jaggi");
            you6.put("dateTime", "Yesterday 8:10");
            you6.put("personStatus", "Started following You");
            you6.put("active", "N");
            you6.put("photoComment", "");
            you6.put("photo", R.drawable.dog);
            you6.put("likedImage", 0);


            you7.put("id", "7");
            you7.put("name", "Magesh_puvi");
            you7.put("dateTime", "Yesterday 8:10");
            you7.put("personStatus", "Started following..");
            you7.put("active", "Y");
            you7.put("photoComment", "looking nice!");
            you7.put("photo", R.drawable.lion);
            you7.put("likedImage", R.drawable.dog);

            jsonArray.put(you7);
            jsonArray.put(you1);
            jsonArray.put(you2);
            jsonArray.put(you3);
            jsonArray.put(you4);
            jsonArray.put(you5);
            jsonArray.put(you6);

        }catch (Exception e){
            e.printStackTrace();
        }


        return jsonArray;
    }
}
