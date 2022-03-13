package jsonModel;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coord {

    @SerializedName("lon")
    private double lon;

    @SerializedName("lat")
    private double lat;
}
