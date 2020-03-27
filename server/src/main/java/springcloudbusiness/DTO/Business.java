package springcloudbusiness.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import springcloudbusiness.entity.BusinessSupports;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class Business {

    //商家名称
    @JsonProperty("name")
    private String businessName;

    //描述
    @JsonProperty("description")
    private String businessDescription;

    //送达时间
    @JsonProperty("deliveryTime")
    private Integer businessDeliveryTime;

    //综合评分
    @JsonProperty("score")
    private float businessScore;

    //服务态度
    @JsonProperty("serviceScore")
    private float businessServiceScore;

    //商品评分
    @JsonProperty("foodScore")
    private float businessFoodScore;

    //高于商家
    @JsonProperty("rankRate")
    private float businessRankRate;

    //起送价
    @JsonProperty("minPrice")
    private BigDecimal businessMinPrice;

    //商家配送费
    @JsonProperty("deliveryPrice")
    private BigDecimal businessDeliveryPrice;

    //额定值
    @JsonProperty("ratingCount")
    private Integer businessRatingCount;

    //月售额
    @JsonProperty("sellCount")
    private Integer businessSellCount;

    //公告
    @JsonProperty("bulletin")
    private String businessBulletin;

    //店铺头像
    @JsonProperty("avatar")
    private String businessAvatar;

    //商家实景
    @JsonProperty("pics")
    private String[] businessPicsArray;

    //商家信息
    @JsonProperty("infos")
    private String[] businessInfosArray;

    //优惠
    @JsonProperty("supports")
    private List<Supports> supports;
}
