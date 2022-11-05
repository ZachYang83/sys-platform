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
public class PubCiv implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String ssbh;

    private String ssdl;

    private String ssxl;

    private String name;

    private String zt;

    private String adress;

    private Double area;

    private String ssjb;

    private String sscq;

    private String nature;

    private Integer providor;

    private Integer server;

    private Double lon;

    private Double lat;


}
