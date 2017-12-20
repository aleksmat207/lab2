import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by student on 2017-12-20.
 */

public class Place  {
    private String placeName;
    private int temperature;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    private String information;

    public Place(String placeName, int temperature, String information) {
        this.placeName = placeName;
        this.temperature = temperature;
        this.information = information;
    }


    }

