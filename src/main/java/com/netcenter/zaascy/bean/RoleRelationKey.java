package com.netcenter.zaascy.bean;

import java.math.BigDecimal;

public class RoleRelationKey {
    private BigDecimal yonghId;

    private BigDecimal juesId;

    public RoleRelationKey(BigDecimal yonghId, BigDecimal juesId) {
        this.yonghId = yonghId;
        this.juesId = juesId;
    }

    public RoleRelationKey() {
        super();
    }

    public BigDecimal getYonghId() {
        return yonghId;
    }

    public void setYonghId(BigDecimal yonghId) {
        this.yonghId = yonghId;
    }

    public BigDecimal getJuesId() {
        return juesId;
    }

    public void setJuesId(BigDecimal juesId) {
        this.juesId = juesId;
    }
}