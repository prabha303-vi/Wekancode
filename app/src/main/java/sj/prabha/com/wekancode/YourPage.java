package sj.prabha.com.wekancode;

import android.graphics.drawable.Drawable;

/**
 * Created by prabha on 20/4/17.
 */
public class YourPage {

    String  id;
    String  name;
    String  dateTime;
    String  personStatus;
    String  active;
    String  photoComment;
    int photo;

    public int getLikedImage() {
        return likedImage;
    }

    public void setLikedImage(int likedImage) {
        this.likedImage = likedImage;
    }

    int likedImage;



    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getPhotoComment() {
        return photoComment;
    }
    public void setPhotoComment(String photoComment) {
        this.photoComment = photoComment;
    }
    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }



}
