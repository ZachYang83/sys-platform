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
 * @since 2021-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TraCarod implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer sum;

    private String ocode;

    private String odis;

    private String ostr;

    private Double olng;

    private Double olat;

    private String dcode;

    private String ddis;

    private String dstr;

    private Double dlng;

    private Double dlat;


}
