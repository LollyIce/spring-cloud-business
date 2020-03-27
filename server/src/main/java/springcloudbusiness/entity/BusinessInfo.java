package springcloudbusiness.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@ToString
@Entity
public class BusinessInfo {

    //主键
    @Id
    private String businessId;

    //商家名称
    private String businessName;

    //描述
    private String businessDescription;

    //送达时间
    private Integer businessDeliveryTime;

    //综合评分
    private float businessScore;

    //服务态度
    private float businessServiceScore;

    //商品评分
    private float businessFoodScore;

    //高于商家
    private float businessRankRate;

    //起送价
    private BigDecimal businessMinPrice;

    //商家配送费
    private BigDecimal businessDeliveryPrice;

    //额定值
    private Integer businessRatingCount;

    //月售额
    private Integer businessSellCount;

    //公告
    private String businessBulletin;

    //店铺头像
    private String businessAvatar;

    //商家实景
    private String businessPics;

    //商家信息
    private String businessInfos;
}
