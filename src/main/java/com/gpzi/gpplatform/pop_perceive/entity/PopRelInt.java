package com.gpzi.gpplatform.pop_perceive.entity;

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
public class PopRelInt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String ocode;

    private String o;

    private Double olon;

    private Double olng;

    private String dcode;

    private String d;

    private Double dlon;

    private Double dlng;

    private Long sum;

    private String ocity;

    private String dcity;


}
