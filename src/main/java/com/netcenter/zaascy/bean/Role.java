package com.netcenter.zaascy.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Role {
    private BigDecimal juesId;

    private String juesmc;

    private String juessm;

    private String juesbh;

    private Integer mokId;

    private String juesbz;

    private BigDecimal jilcjz;

    private Date jilcjsj;

    private BigDecimal jilxgz;

    private Date jilxgsj;

    private BigDecimal juesjb;

    public Role(BigDecimal juesId, String juesmc, String juessm, String juesbh, Integer mokId, String juesbz, BigDecimal jilcjz, Date jilcjsj, BigDecimal jilxgz, Date jilxgsj, BigDecimal juesjb) {
        this.juesId = juesId;
        this.juesmc = juesmc;
        this.juessm = juessm;
        this.juesbh = juesbh;
        this.mokId = mokId;
        this.juesbz = juesbz;
        this.jilcjz = jilcjz;
        this.jilcjsj = jilcjsj;
        this.jilxgz = jilxgz;
        this.jilxgsj = jilxgsj;
        this.juesjb = juesjb;
    }

    public Role() {
        super();
    }

    public BigDecimal getJuesId() {
        return juesId;
    }

    public void setJuesId(BigDecimal juesId) {
        this.juesId = juesId;
    }

    public String getJuesmc() {
        return juesmc;
    }

    public void setJuesmc(String juesmc) {
        this.juesmc = juesmc == null ? null : juesmc.trim();
    }

    public String getJuessm() {
        return juessm;
    }

    public void setJuessm(String juessm) {
        this.juessm = juessm == null ? null : juessm.trim();
    }

    public String getJuesbh() {
        return juesbh;
    }

    public void setJuesbh(String juesbh) {
        this.juesbh = juesbh == null ? null : juesbh.trim();
    }

    public Integer getMokId() {
        return mokId;
    }

    public void setMokId(Integer mokId) {
        this.mokId = mokId;
    }

    public String getJuesbz() {
        return juesbz;
    }

    public void setJuesbz(String juesbz) {
        this.juesbz = juesbz == null ? null : juesbz.trim();
    }

    public BigDecimal getJilcjz() {
        return jilcjz;
    }

    public void setJilcjz(BigDecimal jilcjz) {
        this.jilcjz = jilcjz;
    }

    public Date getJilcjsj() {
        return jilcjsj;
    }

    public void setJilcjsj(Date jilcjsj) {
        this.jilcjsj = jilcjsj;
    }

    public BigDecimal getJilxgz() {
        return jilxgz;
    }

    public void setJilxgz(BigDecimal jilxgz) {
        this.jilxgz = jilxgz;
    }

    public Date getJilxgsj() {
        return jilxgsj;
    }

    public void setJilxgsj(Date jilxgsj) {
        this.jilxgsj = jilxgsj;
    }

    public BigDecimal getJuesjb() {
        return juesjb;
    }

    public void setJuesjb(BigDecimal juesjb) {
        this.juesjb = juesjb;
    }
}