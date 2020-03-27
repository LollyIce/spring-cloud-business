package springcloudbusiness.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Supports {

    //优惠类型
    @JsonProperty("type")
    private int supportsType;

    //描述
    @JsonProperty("description")
    private String supportsDescription;
}
