package com.netcenter.zaascy.bean;

import java.util.Date;

public class LoginToken {
    private Long id;

    private String username;

    private String token;

    private Integer userId;

    private Date date;

    /**
     * 1 正常访问 2 访问超时 3 非法访问 4 未访问
     */
    private Integer requestState;

    public LoginToken(Long id, String username, String token, Integer userId, Date date, Integer requestState) {
        this.id = id;
        this.username = username;
        this.token = token;
        this.userId = userId;
        this.date = date;
        this.requestState = requestState;
    }

    public LoginToken() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 1 正常访问 2 访问超时 3 非法访问 4 未访问
     * @return
     */
    public Integer getRequestState() {
        return requestState;
    }

    /**
     * 1 正常访问 2 访问超时 3 非法访问 4 未访问
     * @param requestState
     */
    public void setRequestState(Integer requestState) {
        this.requestState = requestState;
    }
}