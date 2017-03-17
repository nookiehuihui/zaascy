package com.netcenter.zaascy.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Module {
    private BigDecimal mokId;

    private String mokmc;

    private BigDecimal danwId;

    private String moklj;

    private String mokzt;

    private BigDecimal fumkid;

    private String shuom;

    private String beiz;

    private BigDecimal jilcjz;

    private Date jilcjsj;

    private BigDecimal jilxgz;

    private Date jilxgsj;

    private String tijrId;

    private String shenghrId;

    private String jiaoyrId;

    public Module(BigDecimal mokId, String mokmc, BigDecimal danwId, String moklj, String mokzt, BigDecimal fumkid, String shuom, String beiz, BigDecimal jilcjz, Date jilcjsj, BigDecimal jilxgz, Date jilxgsj, String tijrId, String shenghrId, String jiaoyrId) {
        this.mokId = mokId;
        this.mokmc = mokmc;
        this.danwId = danwId;
        this.moklj = moklj;
        this.mokzt = mokzt;
        this.fumkid = fumkid;
        this.shuom = shuom;
        this.beiz = beiz;
        this.jilcjz = jilcjz;
        this.jilcjsj = jilcjsj;
        this.jilxgz = jilxgz;
        this.jilxgsj = jilxgsj;
        this.tijrId = tijrId;
        this.shenghrId = shenghrId;
        this.jiaoyrId = jiaoyrId;
    }

    public Module() {
        super();
    }

    public BigDecimal getMokId() {
        return mokId;
    }

    public void setMokId(BigDecimal mokId) {
        this.mokId = mokId;
    }

    public String getMokmc() {
        return mokmc;
    }

    public void setMokmc(String mokmc) {
        this.mokmc = mokmc == null ? null : mokmc.trim();
    }

    public BigDecimal getDanwId() {
        return danwId;
    }

    public void setDanwId(BigDecimal danwId) {
        this.danwId = danwId;
    }

    public String getMoklj() {
        return moklj;
    }

    public void setMoklj(String moklj) {
        this.moklj = moklj == null ? null : moklj.trim();
    }

    public String getMokzt() {
        return mokzt;
    }

    public void setMokzt(String mokzt) {
        this.mokzt = mokzt == null ? null : mokzt.trim();
    }

    public BigDecimal getFumkid() {
        return fumkid;
    }

    public void setFumkid(BigDecimal fumkid) {
        this.fumkid = fumkid;
    }

    public String getShuom() {
        return shuom;
    }

    public void setShuom(String shuom) {
        this.shuom = shuom == null ? null : shuom.trim();
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz == null ? null : beiz.trim();
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

    public String getTijrId() {
        return tijrId;
    }

    public void setTijrId(String tijrId) {
        this.tijrId = tijrId == null ? null : tijrId.trim();
    }

    public String getShenghrId() {
        return shenghrId;
    }

    public void setShenghrId(String shenghrId) {
        this.shenghrId = shenghrId == null ? null : shenghrId.trim();
    }

    public String getJiaoyrId() {
        return jiaoyrId;
    }

    public void setJiaoyrId(String jiaoyrId) {
        this.jiaoyrId = jiaoyrId == null ? null : jiaoyrId.trim();
    }
}