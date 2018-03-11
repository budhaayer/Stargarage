package narmada_infosys.hero.stargarage.PupUpMenu;

/**
 * Created by hero on 2/19/18.
 */

public class Contents {
    private int img;
    private String title;
    private String desc;
    private int backgroud_color;

    public Contents(int img, String title, String desc, int backgroud_color) {
        this.img = img;
        this.title = title;
        this.desc = desc;
        this.backgroud_color = backgroud_color;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getBackgroud_color() {
        return backgroud_color;
    }

    public void setBackgroud_color(int backgroud_color) {
        this.backgroud_color = backgroud_color;
    }


}
