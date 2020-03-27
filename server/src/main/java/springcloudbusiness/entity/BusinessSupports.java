package springcloudbusiness.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@ToString
public class BusinessSupports {
    //主键
    @Id
    private String supportsId;

    //店铺ID
    private String businessId;

    //优惠类型
    private int supportsType;

    //描述
    private String supportsDescription;
}
