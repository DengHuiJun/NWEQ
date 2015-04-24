package zero.com.nweq.beans;

/**
 * Created by luowei on 15/4/21.
 */
public class House {
    private String houseName;
    private String housePlace;
    private String theme;
    private String houseInfo;
    private String time;
    private int imageId;

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHousePlace(String housePlace) {
        this.housePlace = housePlace;
    }

    public String getHousePlace() {
        return housePlace;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setHouseInfo(String houseInfo) {
        this.houseInfo = houseInfo;
    }

    public String getHouseInfo() {
        return houseInfo;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }
}
