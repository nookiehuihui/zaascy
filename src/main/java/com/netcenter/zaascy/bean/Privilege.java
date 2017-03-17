package com.netcenter.zaascy.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Privilege {
    private BigDecimal quanxId;

    private String quanxbh;

    private String quanxmc;

    private BigDecimal mokId;

    private String shifkxg;

    private BigDecimal juesId;

    private String quanxsm;

    private BigDecimal jilcjz;

    private Date jilcjsj;

    private BigDecimal jilxgz;

    private Date jilxgsj;

    private BigDecimal yonghId;

    private BigDecimal juesjb;

    public Privilege(BigDecimal quanxId, String quanxbh, String quanxmc, BigDecimal mokId, String shifkxg, BigDecimal juesId, String quanxsm, BigDecimal jilcjz, Date jilcjsj, BigDecimal jilxgz, Date jilxgsj, BigDecimal yonghId, BigDecimal juesjb) {
        this.quanxId = quanxId;
        this.quanxbh = quanxbh;
        this.quanxmc = quanxmc;
        this.mokId = mokId;
        this.shifkxg = shifkxg;
        this.juesId = juesId;
        this.quanxsm = quanxsm;
        this.jilcjz = jilcjz;
        this.jilcjsj = jilcjsj;
        this.jilxgz = jilxgz;
        this.jilxgsj = jilxgsj;
        this.yonghId = yonghId;
        this.juesjb = juesjb;
    }

    public Privilege() {
        super();
    }

    public BigDecimal getQuanxId() {
        return quanxId;
    }

    public void setQuanxId(BigDecimal quanxId) {
        this.quanxId = quanxId;
    }

    public String getQuanxbh() {
        return quanxbh;
    }

    public void setQuanxbh(String quanxbh) {
        this.quanxbh = quanxbh == null ? null : quanxbh.trim();
    }

    public String getQuanxmc() {
        return quanxmc;
    }

    public void setQuanxmc(String quanxmc) {
        this.quanxmc = quanxmc == null ? null : quanxmc.trim();
    }

    public BigDecimal getMokId() {
        return mokId;
    }

    public void setMokId(BigDecimal mokId) {
        this.mokId = mokId;
    }

    public String getShifkxg() {
        return shifkxg;
    }

    public void setShifkxg(String shifkxg) {
        this.shifkxg = shifkxg == null ? null : shifkxg.trim();
    }

    public BigDecimal getJuesId() {
        return juesId;
    }

    public void setJuesId(BigDecimal juesId) {
        this.juesId = juesId;
    }

    public String getQuanxsm() {
        return quanxsm;
    }

    public void setQuanxsm(String quanxsm) {
        this.quanxsm = quanxsm == null ? null : quanxsm.trim();
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

    public BigDecimal getYonghId() {
        return yonghId;
    }

    public void setYonghId(BigDecimal yonghId) {
        this.yonghId = yonghId;
    }

    public BigDecimal getJuesjb() {
        return juesjb;
    }

    public void setJuesjb(BigDecimal juesjb) {
        this.juesjb = juesjb;
    }
}