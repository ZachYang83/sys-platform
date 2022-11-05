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
public class Od1000 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long sum;

    private Double oLon1;

    private Double oLat1;

    private Double dLon1;

    private Double dLat1;

    private Double oLon2;

    private Double oLat2;

    private Double dLon2;

    private Double dLat2;

    private Double oLon3;

    private Double oLat3;

    private Double dLon3;

    private Double dLat3;

    private Double oLon4;

    private Double oLat4;

    private Double dLon4;

    private Double dLat4;


}
