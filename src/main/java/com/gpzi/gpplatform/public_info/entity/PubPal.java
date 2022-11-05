package com.gpzi.gpplatform.public_info.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-04-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PubPal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String ssbh;

    private String ssdl;

    private String ssxl;

    private String name;

    private String zt;

    private String adress;

    private String area;

    private String sscq;

    private Integer card;

    private Integer citizen;

    private Integer manager;

    private Integer allPeople;

    private Integer judge;

    private Integer servers;

    private Integer prosecutor;

    private Integer crowdSize;

    private Integer cases;

    private Integer accept;

    private Double lon;

    private Double lat;


}
