package com.gpzi.gpplatform.tra_monitor.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PopOd1000 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long sum;

    private Double oLon;

    private Double oLat;

    private Double dLon;

    private Double dLat;

    private Double shapeLeng;

    private Double shapeLength;


}
