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
 * @since 2021-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PubinfoDist implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String xzq;

    private Long sumEdu;

    private Long sumMed;

    private Long sumCiv;

    private Long sumPal;

    private Long sumCul;

    private Long sumSpo;


}
