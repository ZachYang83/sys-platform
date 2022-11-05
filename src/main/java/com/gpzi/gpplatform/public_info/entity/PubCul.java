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
public class PubCul implements Serializable {

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

    private String scale;

    private String sscq;

    private Integer hallArea;

    private Integer visitors;

    private Integer books;

    private Integer useTimes;

    private Integer exhibits;

    private Double lon;

    private Double lat;


}
