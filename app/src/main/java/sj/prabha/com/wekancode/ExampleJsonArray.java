package sj.prabha.com.wekancode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by prabha on 20/4/17.
 */

public class ExampleJsonArray {

    public static JSONArray getFollowingList() {
        JSONArray jsonArray = new JSONArray();
        try {
            JSONObject you1 = new JSONObject();
            JSONObject you2 = new JSONObject();
            JSONObject you3 = new JSONObject();
            JSONObject you4 = new JSONObject();
            JSONObject you5 = new JSONObject();
            JSONObject you6 = new JSONObject();

            you1.put("id", "3");
            you1.put("name", "Siva Shive");
            you1.put("dateTime", "Today 8:10");
            you1.put("personStatus", "Liked 4 photos");
            you1.put("active", "N");
            you1.put("photoComment", "");
            you1.put("photo", R.drawable.tiger);
            you1.put("likedImage", 0);

            you2.put("id", "3");
            you2.put("name", "Siva Shive");
            you2.put("dateTime", "Today 8:10");
            you2.put("personStatus", "Liked 4 photos");
            you2.put("active", "N");
            you2.put("photoComment", "");
            you2.put("photo", R.drawable.tiger);
            you2.put("likedImage", 0);

            you3.put("id", "3");
            you3.put("name", "Siva Shive");
            you3.put("dateTime", "Today 8:10");
            you3.put("personStatus", "Liked 4 photos");
            you3.put("active", "N");
            you3.put("photoComment", "");
            you3.put("photo", R.drawable.tiger);
            you3.put("likedImage", 0);

            you4.put("id", "3");
            you4.put("name", "Siva Shive");
            you4.put("dateTime", "Today 8:10");
            you4.put("personStatus", "Liked 4 photos");
            you4.put("active", "N");
            you4.put("photoComment", "");
            you4.put("photo", R.drawable.tiger);
            you4.put("likedImage", 0);

            you5.put("id", "3");
            you5.put("name", "Siva Shive");
            you5.put("dateTime", "Today 8:10");
            you5.put("personStatus", "Liked 4 photos");
            you5.put("active", "N");
            you5.put("photoComment", "");
            you5.put("photo", R.drawable.tiger);
            you5.put("likedImage", 0);

            you6.put("id", "3");
            you6.put("name", "Siva Shive");
            you6.put("dateTime", "Today 8:10");
            you6.put("personStatus", "Liked 4 photos");
            you6.put("active", "N");
            you6.put("photoComment", "");
            you6.put("photo", R.drawable.tiger);
            you6.put("likedImage", 0);

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

    public static JSONArray getYouList() {
        JSONArray jsonArray = new JSONArray();
        try {
            JSONObject you1 = new JSONObject();
            JSONObject you2 = new JSONObject();
            JSONObject you3 = new JSONObject();
            JSONObject you4 = new JSONObject();
            JSONObject you5 = new JSONObject();
            JSONObject you6 = new JSONObject();

            you1.put("id", "3");
            you1.put("name", "Siva Shive");
            you1.put("dateTime", "Today 8:10");
            you1.put("personStatus", "Liked your photo");
            you1.put("active", "N");
            you1.put("photoComment", "");
            you1.put("photo", R.drawable.tiger);
            you1.put("likedImage", 0);

            you2.put("id", "3");
            you2.put("name", "Sathish kumar");
            you2.put("dateTime", "Today 6:10");
            you2.put("personStatus", "Liked your photo");
            you2.put("active", "Y");
            you2.put("photoComment", "good look!");
            you2.put("photo", R.drawable.myprofile);
            you2.put("likedImage", R.drawable.cat);

            you3.put("id", "3");
            you3.put("name", "Prabhagaran");
            you3.put("dateTime", "Today 8:10");
            you3.put("personStatus", "Liked your photo");
            you3.put("active", "Y");
            you3.put("photoComment", "");
            you3.put("photo", R.drawable.cat);
            you3.put("likedImage", R.drawable.tiger);

            you4.put("id", "3");
            you4.put("name", "mike_krag");
            you4.put("dateTime", "Today 8:10");
            you4.put("personStatus", "Liked your photo");
            you4.put("active", "Y");
            you4.put("photoComment", "too smart!");
            you4.put("photo", R.drawable.lion);
            you4.put("likedImage", R.drawable.tiger);

            you5.put("id", "5");
            you5.put("name", "chir.marina");
            you5.put("dateTime", "Today 8:10");
            you5.put("personStatus", "Started following You");
            you5.put("active", "N");
            you5.put("photoComment", "");
            you5.put("photo", R.drawable.myprofile);
            you5.put("likedImage", 0);

            you6.put("id", "3");
            you6.put("name", "Santhosh");
            you6.put("dateTime", "Today 8:10");
            you6.put("personStatus", "Started following..");
            you6.put("active", "N");
            you6.put("photoComment", "");
            you6.put("photo", R.drawable.dog);
            you6.put("likedImage", 0);


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
