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
 * @since 2021-05-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TraRelInt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String o;

    private String ocode;

    private String d;

    private String dcode;

    private Double olon;

    private Double olng;

    private Double dlon;

    private Double dlng;

    private Long sum;

    private String ocity;

    private String dcity;


}
